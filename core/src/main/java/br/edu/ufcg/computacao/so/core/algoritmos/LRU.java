package core.src.main.java.br.edu.ufcg.computacao.so.core.algoritmos;

import core.src.main.java.br.edu.ufcg.computacao.so.core.api.AlgoritmoSubstituicaoPages;

import java.util.LinkedHashSet;

/**
 * LRU (Least Recently Used) — substitui a página usada há mais tempo.
 *
 * Estrutura: LinkedHashSet em ordem de acesso.
 *   - Primeiro elemento  = LRU (vítima)
 *   - Último elemento    = MRU (mais recente)
 *
 */
public class LRU implements AlgoritmoSubstituicaoPages {

    private final int capacity;
    private int pageFaults;

    private final LinkedHashSet<Integer> frames;

    public AlgoritmoLRU(int capacity) {
        this.capacity   = capacity;
        this.frames     = new LinkedHashSet<>();
        this.pageFaults = 0;
    }

    @Override
    public boolean accesso(int page) {
        // TODO
        throw new UnsupportedOperationException("LRU.accesso() não implementado");
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
        throw new UnsupportedOperationException("LRU.reset() não implementado");
    }
}