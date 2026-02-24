package core.src.main.java.br.edu.ufcg.computacao.so.core.algoritmos;

import core.src.main.java.br.edu.ufcg.computacao.so.core.api.AlgoritmoSubstituicaoPages;

import java.util.HashMap;
import java.util.Map;

/**
 * Clock (Segunda Chance) — é como FIFO, mas com bit de "segunda chance", invés de remover direto joga pro fim da fila mudando o bit.
 *
 * Estrutura: buffer circular (array de slots) + ponteiro.
 *   Cada slot guarda: página + bit de referência.
 *
 * Regra de substituição:
 *   1. Se bit do slot atual == 1, zerar o bit, avançar o ponteiro (segunda chance).
 *   2. Se bit do slot atual == 0, este é a vítima; substituir e avançar o ponteiro.
 *
 */
public class AlgoritmoClock implements AlgoritmoSubstituicaoPages {

    private final int capacity;
    private int pageFaults;
    private int hand; // posição atual do ponteiro do relógio

    private final int[]     pages;    // páginas nos frames
    private final boolean[] refBit;   // bits de referência
    private final Map<Integer, Integer> pageToSlot; // page → índice no array

    public AlgoritmoClock(int capacity) {
        this.capacity    = capacity;
        this.pages       = new int[capacity];
        this.refBit      = new boolean[capacity];
        this.pageToSlot  = new HashMap<>();
        this.pageFaults  = 0;
        this.hand        = 0;

        java.util.Arrays.fill(pages, -1);
    }

    @Override
    public boolean accesso(int page) {
        // TODO
        throw new UnsupportedOperationException("Clock.accesso() não implementado");
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
        throw new UnsupportedOperationException("Clock.reset() não implementado");
    }
}