package core.src.main.java.br.edu.ufcg.computacao.so.core.algoritmos;

import core.src.main.java.br.edu.ufcg.computacao.so.core.api.AlgoritmoSubstituicaoPages;

import java.util.HashMap;
import java.util.Map;

/**
 * LFU (Least Frequently Used) — substitui a página com menor contagem de acessos.
 *
 * Estrutura:
 *   - frequency  : page → contagem de acessos
 *   - lastAccess : page → instante lógico do último acesso (desempate: remove a menos recente)
 */
public class LFU implements AlgoritmoSubstituicaoPages {

    private final int capacity;
    private int pageFaults;
    private long clock; // instante lógico global

    private final Map<Integer, Integer> frequency;  // page freq
    private final Map<Integer, Long>    lastAccess; // page instante

    public LFU(int capacity) {
        this.capacity   = capacity;
        this.frequency  = new HashMap<>();
        this.lastAccess = new HashMap<>();
        this.pageFaults = 0;
        this.clock      = 0;
    }

    @Override
    public boolean accesso(int page) {
        clock++;

        if (frequency.containsKey(page)) {
            // HIT, incrementa frequência e atualiza instante
            frequency.put(page, frequency.get(page) + 1);
            lastAccess.put(page, clock);
            return false;
        }

        // FAULT
        pageFaults++;

        if (frequency.size() == capacity) {
            // Encontra a vítima
            int victim = -1;
            int minFreq = Integer.MAX_VALUE;
            long minTime = Long.MAX_VALUE;

            for (Map.Entry<Integer, Integer> e : frequency.entrySet()) {
                int p = e.getKey();
                int f = e.getValue();
                long t = lastAccess.get(p);
                if (f < minFreq || (f == minFreq && t < minTime)) {
                    minFreq = f;
                    minTime = t;
                    victim = p;
                }
            }

            frequency.remove(victim);
            lastAccess.remove(victim);
        }

        frequency.put(page, 1);
        lastAccess.put(page, clock);
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
        frequency.clear();
        lastAccess.clear();
        pageFaults = 0;
        clock = 0;
    }
}