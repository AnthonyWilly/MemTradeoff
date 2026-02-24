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
 *
 * Impossível de implementar em SO real (exige conhecimento do futuro),
 * mas serve como baseline para avaliar os outros algoritmos.
 *
 */
public class AlgoritmoOtimo implements AlgoritmoSubstituicaoPages {

    private final int capacity;
    private int pageFaults;
    private int posicaoAtual; // índice da referência sendo processada

    private final Set<Integer> frames;

    /**
     * Índice de usos futuros: page → lista de posições (em ordem crescente)
     * onde a página aparece na sequência de referências.
     * Populado por carregarReferencias().
     */
    private Map<Integer, List<Integer>> usosNextos;

    public AlgoritmoOtimo(int capacity) {
        this.capacity      = capacity;
        this.frames        = new HashSet<>();
        this.usosNextos    = new HashMap<>();
        this.pageFaults    = 0;
        this.posicaoAtual  = 0;
    }

    /**
     * Pré-processa a sequência de referências e monta o índice de usos futuros.
     * Deve ser chamado uma vez antes de iniciar os acessos.
     * É a forma de "prever o futuro"
     *
     * @param referencias sequência completa de referências de páginas
     */
    public void carregarReferencias(List<Integer> referencias) {
        // TODO
        throw new UnsupportedOperationException("Otimo.carregarReferencias() não implementado");
    }

    @Override
    public boolean accesso(int page) {
        // TODO
        throw new UnsupportedOperationException("Otimo.accesso() não implementado");
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
        // TODO
        throw new UnsupportedOperationException("Otimo.reset() não implementado");
    }
}