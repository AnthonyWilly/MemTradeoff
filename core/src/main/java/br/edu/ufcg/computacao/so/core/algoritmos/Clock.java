package core.src.main.java.br.edu.ufcg.computacao.so.core.algoritmos;

import core.src.main.java.br.edu.ufcg.computacao.so.core.api.AlgoritmoSubstituicaoPages;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Clock (Segunda Chance) — é como FIFO, mas com bit de "segunda chance".
 *
 * Estrutura: buffer circular (array de slots) + ponteiro.
 *   Cada slot guarda: página + bit de referência.
 *
 * Regra de substituição:
 *   1. Se bit do slot atual == 1, zerar o bit, avançar o ponteiro (segunda chance).
 *   2. Se bit do slot atual == 0, este é a vítima; substituir e avançar o ponteiro.
 */
public class Clock implements AlgoritmoSubstituicaoPages {

    private final int capacity;
    private int pageFaults;
    private int hand; // posição atual do ponteiro do relógio

    private final int[]     pages;    // páginas nos frames
    private final boolean[] refBit;   // bits de referência
    private final Map<Integer, Integer> pageToSlot; // page → índice no array

    public Clock(int capacity) {
        this.capacity   = capacity;
        this.pages      = new int[capacity];
        this.refBit     = new boolean[capacity];
        this.pageToSlot = new HashMap<>();
        this.pageFaults = 0;
        this.hand       = 0;

        Arrays.fill(pages, -1);
    }

    @Override
    public boolean accesso(int page) {
        if (pageToSlot.containsKey(page)) {
            // HIT, seta o bit de referência
            refBit[pageToSlot.get(page)] = true;
            return false;
        }

        // FAULT
        pageFaults++;

        // Gira o ponteiro até encontrar um com bit == 0
        while (refBit[hand]) {
            refBit[hand] = false; // segunda chance: zera o bit
            hand = (hand + 1) % capacity;
        }

        // se tem bit == 0: é a vítima
        int victim = pages[hand];
        if (victim != -1) {
            pageToSlot.remove(victim);
        }

        pages[hand]  = page;
        refBit[hand] = true;
        pageToSlot.put(page, hand);

        hand = (hand + 1) % capacity;
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
        Arrays.fill(pages, -1);
        Arrays.fill(refBit, false);
        pageToSlot.clear();
        pageFaults = 0;
        hand = 0;
    }
}