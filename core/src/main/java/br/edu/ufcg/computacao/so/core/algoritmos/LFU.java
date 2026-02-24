package core.src.main.java.br.edu.ufcg.computacao.so.core.algoritmos;

import core.src.main.java.br.edu.ufcg.computacao.so.core.api.AlgoritmoSubstituicaoPages;

import java.util.HashMap;
import java.util.Map;

/**
 * LFU (Least Frequently Used) — substitui a página com menor contagem de acessos.
 *
 * Estrutura:
 *   - frequency  : page → contagem de acessos
 *   - lastAccess : page → instante lógico do último acesso (desempate)
 *
 */
public class LFU implements AlgoritmoSubstituicaoPages {

    private final int capacity;
    private int pageFaults;

    private final Map<Integer, Integer> frequency;  // page → freq
    private final Map<Integer, Long>    lastAccess; // page → instante

    public AlgoritmoLFU(int capacity) {
        this.capacity   = capacity;
        this.frequency  = new HashMap<>();
        this.lastAccess = new HashMap<>();
        this.pageFaults = 0;
        this.clock      = 0;
    }

    @Override
    public boolean accesso(int page) {
        // TODO
        throw new UnsupportedOperationException("LFU.accesso() não implementado");
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
        throw new UnsupportedOperationException("LFU.reset() não implementado");
    }
}