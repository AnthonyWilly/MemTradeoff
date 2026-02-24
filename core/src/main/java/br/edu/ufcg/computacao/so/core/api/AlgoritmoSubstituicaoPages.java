package core.src.main.java.br.edu.ufcg.computacao.so.core.api;

public interface AlgoritmoSubstituicaoPages {

    boolean accesso(int page);

    int getPageFaults();

    int getCapacity();

    void reset();
}