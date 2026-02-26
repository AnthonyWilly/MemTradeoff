package core.src.main.java.br.edu.ufcg.computacao.so.core.algoritmos;

import core.src.main.java.br.edu.ufcg.computacao.so.core.api.AlgoritmoSubstituicaoPages;

import java.util.LinkedHashSet;
import java.util.Iterator;

/**
 * LRU (Least Recently Used) — substitui a página usada há mais tempo.
 *
 * Estrutura: LinkedHashSet em ordem de acesso.
 *   - Primeiro elemento  = LRU (vítima)
 *   - Último elemento    = MRU (mais recente)
 */
public class LRU implements AlgoritmoSubstituicaoPages {

    private final int capacity;
    private int pageFaults;

    private final LinkedHashSet<Integer> frames;

    public LRU(int capacity) {
        this.capacity   = capacity;
        this.frames     = new LinkedHashSet<>();
        this.pageFaults = 0;
    }

    @Override
    public boolean accesso(int page) {
        if (frames.contains(page)) {
            // HIT, reposiciona para o final (MRU)
            frames.remove(page);
            frames.add(page);
            return false;
        }

        // FAULT
        pageFaults++;

        if (frames.size() == capacity) {
            // Remove o primeiro elemento (LRU)
            Iterator<Integer> it = frames.iterator();
            frames.remove(it.next());
        }

        frames.add(page);
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
        pageFaults = 0;
    }
}