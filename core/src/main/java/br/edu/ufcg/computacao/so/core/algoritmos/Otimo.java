package core.src.main.java.br.edu.ufcg.computacao.so.core.algoritmos;

import core.src.main.java.br.edu.ufcg.computacao.so.core.api.AlgoritmoSubstituicaoPages;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Ótimo (Algoritmo de Bélády) — limite teórico de implementação prática impossível.
 *
 * Política: ao ocorrer um fault, substituir a página cujo PRÓXIMO uso
 * é o mais distante no futuro (ou que nunca mais será usada).
 */
public class Otimo implements AlgoritmoSubstituicaoPages {

    private final int capacity;
    private int pageFaults;
    private int posicaoAtual; // índice da referência sendo processada

    private final Set<Integer> frames;

    /**
     * Índice de usos futuros: page → lista de posições (em ordem crescente)
     * onde a página aparece na sequência de referências.
     */
    private Map<Integer, List<Integer>> usosNextos;

    public Otimo(int capacity) {
        this.capacity     = capacity;
        this.frames       = new HashSet<>();
        this.usosNextos   = new HashMap<>();
        this.pageFaults   = 0;
        this.posicaoAtual = 0;
    }

    /**
     * Pré-processa a sequência de referências e monta o índice de usos futuros.
     * Deve ser chamado uma vez antes de iniciar os acessos.
     *
     * @param referencias sequência completa de referências de páginas
     */
    public void carregarReferencias(List<Integer> referencias) {
        usosNextos.clear();
        for (int i = 0; i < referencias.size(); i++) {
            int page = referencias.get(i);
            usosNextos.computeIfAbsent(page, k -> new ArrayList<>()).add(i);
        }
    }

    @Override
    public boolean accesso(int page) {
        if (frames.contains(page)) {
            // HIT
            posicaoAtual++;
            return false;
        }

        // FAULT
        pageFaults++;

        if (frames.size() == capacity) {
            // Escolhe a vítima, sendo aquela que tera o maior tempo de distancia para ser usado novamente
            int victim = -1;
            int farthest = -1;

            for (int candidate : frames) {
                int nextUse = nextUse(candidate);
                if (nextUse > farthest) {
                    farthest = nextUse;
                    victim = candidate;
                }
            }

            frames.remove(victim);
        }

        frames.add(page);
        posicaoAtual++;
        return true;
    }

    // Retorna o próximo índice de uso futuro de uma página a partir de posicaoAtual.
    //Se não houver uso futuro, retorna Integer.MAX_VALUE (nunca mais usada = vítima ideal).
    private int nextUse(int page) {
        List<Integer> usos = usosNextos.get(page);
        if (usos == null) return Integer.MAX_VALUE;

        // Busca binária pelo primeiro índice > posicaoAtual (acesso atual já foi consumido)
        int lo = 0, hi = usos.size();
        while (lo < hi) {
            int mid = (lo + hi) >>> 1;
            if (usos.get(mid) <= posicaoAtual) lo = mid + 1;
            else hi = mid;
        }

        return (lo < usos.size()) ? usos.get(lo) : Integer.MAX_VALUE;
    }

    @Override
    public int getPageFaults() {
        return pageFaults;
    }

    @Override
    public int getCapacity() {
        return capacity;
    }

    @Override
    public void reset() {
        frames.clear();
        usosNextos.clear();
        pageFaults = 0;
        posicaoAtual = 0;
    }
}