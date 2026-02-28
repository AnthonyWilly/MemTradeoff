package benchmarks.src.main.java.br.edu.ufcg.computacao.so.benchmarks;

import core.src.main.java.br.edu.ufcg.computacao.so.core.api.AlgoritmoSubstituicaoPages;
import core.src.main.java.br.edu.ufcg.computacao.so.core.algoritmos.AlgoritmoClock;
import core.src.main.java.br.edu.ufcg.computacao.so.core.algoritmos.AlgoritmoFIFO;
import core.src.main.java.br.edu.ufcg.computacao.so.core.algoritmos.AlgoritmoLFU;
import core.src.main.java.br.edu.ufcg.computacao.so.core.algoritmos.AlgoritmoLRU;
import core.src.main.java.br.edu.ufcg.computacao.so.core.algoritmos.AlgoritmoOtimo;
import core.src.main.java.br.edu.ufcg.computacao.so.core.algoritmos.AlgoritmoRandom;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Level;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Param;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Warmup;
import org.openjdk.jmh.infra.Blackhole;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@State(Scope.Thread)
@Fork(value = 5)
@Warmup(iterations = 5, time = 5)
@Measurement(iterations = 10, time = 5)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
public class AlgoritmoBenchmark {

    @Param({
        "random_md_medium",
        "random_lg_wide",
        "locality_md_tight_hot90",
        "locality_lg_medium_hot70",
        "phases_md_medium_p4",
        "phases_lg_wide_p8",
        "sequential_md_medium"
    })
    private String workload;

    @Param({"4", "8", "16", "32"})
    private int frames;

    private int[] sequence;
    private List<Integer> sequenceList;

    @Setup(Level.Iteration)
    public void setup() throws Exception {
        sequenceList = carregarCsv("data/workloads/" + workload + ".csv");
        sequence = new int[sequenceList.size()];
        for (int i = 0; i < sequenceList.size(); i++) {
            sequence[i] = sequenceList.get(i);
        }
        System.gc();
    }

    // ── Benchmarks de tempo (AverageTime)

    @Benchmark
    public void benchFIFO(Blackhole blackhole) {
        AlgoritmoFIFO algo = new AlgoritmoFIFO(frames);
        for (int page : sequence) blackhole.consume(algo.accesso(page));
    }

    @Benchmark
    public void benchLRU(Blackhole blackhole) {
        AlgoritmoLRU algo = new AlgoritmoLRU(frames);
        for (int page : sequence) blackhole.consume(algo.accesso(page));
    }

    @Benchmark
    public void benchLFU(Blackhole blackhole) {
        AlgoritmoLFU algo = new AlgoritmoLFU(frames);
        for (int page : sequence) blackhole.consume(algo.accesso(page));
    }

    @Benchmark
    public void benchClock(Blackhole blackhole) {
        AlgoritmoClock algo = new AlgoritmoClock(frames);
        for (int page : sequence) blackhole.consume(algo.accesso(page));
    }

    @Benchmark
    public void benchRandom(Blackhole blackhole) {
        AlgoritmoRandom algo = new AlgoritmoRandom(frames, 42L);
        for (int page : sequence) blackhole.consume(algo.accesso(page));
    }

    @Benchmark
    public void benchOtimo(Blackhole blackhole) {
        AlgoritmoOtimo algo = new AlgoritmoOtimo(frames);
        algo.carregarReferencias(sequenceList);
        for (int page : sequence) blackhole.consume(algo.accesso(page));
    }

    // ── Benchmarks de memoria (heap alocado por execucao) ────────────────────
    //
    // Estrategia: forca GC antes, mede heap livre, executa, forca GC de novo,
    // mede heap livre novamente. A diferenca e o heap retido pelo algoritmo
    // durante a execucao. Retorna KB para facilitar leitura.
    //
    // Nota: medicao manual de heap nao e tao precisa quanto -prof gc, mas suficiente para comparar a ordem de grandeza entre algoritmos.

    @Benchmark
    @BenchmarkMode(Mode.SingleShotTime)
    @Warmup(iterations = 0)
    @Measurement(iterations = 1)
    public long memFIFO(Blackhole blackhole) {
        return medirMemoria(new AlgoritmoFIFO(frames), blackhole);
    }

    @Benchmark
    @BenchmarkMode(Mode.SingleShotTime)
    @Warmup(iterations = 0)
    @Measurement(iterations = 1)
    public long memLRU(Blackhole blackhole) {
        return medirMemoria(new AlgoritmoLRU(frames), blackhole);
    }

    @Benchmark
    @BenchmarkMode(Mode.SingleShotTime)
    @Warmup(iterations = 0)
    @Measurement(iterations = 1)
    public long memLFU(Blackhole blackhole) {
        return medirMemoria(new AlgoritmoLFU(frames), blackhole);
    }

    @Benchmark
    @BenchmarkMode(Mode.SingleShotTime)
    @Warmup(iterations = 0)
    @Measurement(iterations = 1)
    public long memClock(Blackhole blackhole) {
        return medirMemoria(new AlgoritmoClock(frames), blackhole);
    }

    @Benchmark
    @BenchmarkMode(Mode.SingleShotTime)
    @Warmup(iterations = 0)
    @Measurement(iterations = 1)
    public long memRandom(Blackhole blackhole) {
        return medirMemoria(new AlgoritmoRandom(frames, 42L), blackhole);
    }

    @Benchmark
    @BenchmarkMode(Mode.SingleShotTime)
    @Warmup(iterations = 0)
    @Measurement(iterations = 1)
    public long memOtimo(Blackhole blackhole) {
        AlgoritmoOtimo algo = new AlgoritmoOtimo(frames);
        algo.carregarReferencias(sequenceList);
        return medirMemoria(algo, blackhole);
    }

    private long medirMemoria(AlgoritmoSubstituicaoPages algo, Blackhole blackhole) {
        Runtime rt = Runtime.getRuntime();
        System.gc();
        long antes = rt.totalMemory() - rt.freeMemory();

        for (int page : sequence) blackhole.consume(algo.accesso(page));

        System.gc();
        long depois = rt.totalMemory() - rt.freeMemory();

        // Retorna bytes retidos (pode ser negativo se GC coletou outras coisas — normal)
        return depois - antes;
    }

    private static List<Integer> carregarCsv(String caminho) throws Exception {
        List<Integer> lista = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(new File(caminho)));
        br.readLine(); // pula header
        String linha;
        while ((linha = br.readLine()) != null) {
            linha = linha.trim();
            if (!linha.isEmpty()) lista.add(Integer.parseInt(linha));
        }
        br.close();
        return lista;
    }
}