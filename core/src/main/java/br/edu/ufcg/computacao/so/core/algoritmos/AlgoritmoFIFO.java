package core.src.main.java.br.edu.ufcg.computacao.so.core.algoritmos;

import core.src.main.java.br.edu.ufcg.computacao.so.core.api.AlgoritmoSubstituicaoPages;

import java.util.LinkedList;
import java.util.Queue;
import java.util.HashSet;
import java.util.Set;

/**
 * FIFO (First-In, First-Out) — substitui a página que está há mais tempo na memória.
 *
 * Estrutura: fila de inserção + set para detecção de hit em O(1).
 */
public class AlgoritmoFIFO implements AlgoritmoSubstituicaoPages {

    private final int capacity;
    private int pageFaults;

    private final Set<Integer> frames;
    private final Queue<Integer> queue; // Head sendo a página mais antiga

    public AlgoritmoFIFO(int capacity) {
        this.capacity   = capacity;
        this.frames     = new HashSet<>();
        this.queue      = new LinkedList<>();
        this.pageFaults = 0;
    }

    @Override
    public boolean accesso(int page) {
        if (frames.contains(page)) {
            // HIT
            return false;
        }

        // FAULT
        pageFaults++;

        if (frames.size() == capacity) {
            // Remove a página mais antiga (Head da fila)
            int victim = queue.poll();
            frames.remove(victim);
        }

        frames.add(page);
        queue.add(page);
        return true;
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
        queue.clear();
        pageFaults = 0;
    }
}