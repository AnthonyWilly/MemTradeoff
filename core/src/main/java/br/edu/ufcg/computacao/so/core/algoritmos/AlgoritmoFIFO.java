package core.src.main.java.br.edu.ufcg.computacao.so.core.algoritmos;

import core.src.main.java.br.edu.ufcg.computacao.so.core.api.AlgoritmoSubstituicaoPages;

import java.util.Arrays;

/**
 * FIFO (First-In, First-Out) — substitui a página mais antiga na memória.
 *
 * Estrutura: array circular simples + ponteiro de cabeça.
 */
public class AlgoritmoFIFO implements AlgoritmoSubstituicaoPages {

    private final int capacity;
    private int pageFaults;
    private int head; // aponta pro slot mais antigo (próxima vítima)

    private final int[] pages; // circular

    public AlgoritmoFIFO(int capacity) {
        this.capacity   = capacity;
        this.pages      = new int[capacity];
        this.pageFaults = 0;
        this.head       = 0;

        Arrays.fill(pages, -1);
    }

    @Override
    public boolean accesso(int page) {
        for (int i = 0; i < capacity; i++) {
            if (pages[i] == page) return false; // HIT
        }

        // FAULT
        pageFaults++;
        pages[head] = page;
        head = (head + 1) % capacity;
        return true;
    }

    @Override
    public int getPageFaults() { return pageFaults; }

    @Override
    public int getCapacity() { return capacity; }

    @Override
    public void reset() {
        Arrays.fill(pages, -1);
        pageFaults = 0;
        head = 0;
    }
}