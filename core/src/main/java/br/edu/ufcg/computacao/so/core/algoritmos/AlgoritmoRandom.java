package core.src.main.java.br.edu.ufcg.computacao.so.core.algoritmos;

import core.src.main.java.br.edu.ufcg.computacao.so.core.api.AlgoritmoSubstituicaoPages;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 * Random — substitui uma página escolhida aleatoriamente entre as que estão na memória.
 *
 * Algoritmo mais simples, serve para baseline dos piores algortimos
 *
 * Estrutura:
 *   - frames (Set)  : detecção de hit em O(1)
 *   - frameList     : lista para indexação aleatória em O(1)
 */
public class AlgoritmoRandom implements AlgoritmoSubstituicaoPages {

    private final int capacity;
    private int pageFaults;

    private final Set<Integer>  frames;
    private final List<Integer> frameList; // espelho do set para seleção aleatória
    private final Random        random;

    public AlgoritmoRandom(int capacity) {
        this(capacity, new Random());
    }

    //Construtor com seed para testes
    public AlgoritmoRandom(int capacity, long seed) {
        this(capacity, new Random(seed));
    }

    private AlgoritmoRandom(int capacity, Random random) {
        this.capacity  = capacity;
        this.frames    = new HashSet<>();
        this.frameList = new ArrayList<>();
        this.random    = random;
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
            // Escolhe índice aleatório na lista e remove
            int idx    = random.nextInt(frameList.size());
            int victim = frameList.get(idx);

            frames.remove(victim);
            // Swap com o último para remoção
            frameList.set(idx, frameList.get(frameList.size() - 1));
            frameList.remove(frameList.size() - 1);
        }

        frames.add(page);
        frameList.add(page);
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
        frameList.clear();
        pageFaults = 0;
    }
}