package simulator.src.main.java.br.edu.ufcg.computacao.so.simulator;

import core.src.main.java.br.edu.ufcg.computacao.so.core.api.AlgoritmoSubstituicaoPages;
import core.src.main.java.br.edu.ufcg.computacao.so.core.algoritmos.*;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Simulator {

    //Ordem dos grupos e tamanhos no relatorio
    private static final List<String> ORDEM_TIPO   = List.of("random", "sequential", "locality", "phases");
    private static final List<String> ORDEM_TAMANHO = List.of("xs", "sm", "md", "lg", "xl");
    private static final List<String> ORDEM_ALGOS   = List.of("FIFO", "LRU", "LFU", "Clock", "Random");

    static class ResultadoSimulacao {
        String workload;
        String algoritmo;
        int frames;
        int pageFaults;
        int totalAcessos;

        public ResultadoSimulacao(String workload, String algoritmo, int frames, int pageFaults, int totalAcessos) {
            this.workload     = workload;
            this.algoritmo    = algoritmo;
            this.frames       = frames;
            this.pageFaults   = pageFaults;
            this.totalAcessos = totalAcessos;
        }

        public double getTaxaFalha() {
            return totalAcessos == 0 ? 0.0 : (100.0 * pageFaults) / totalAcessos;
        }

        public String getTipoWorkload() {
            return workload.split("_")[0];
        }

        public String getTamanhoWorkload() {
            String[] partes = workload.split("_");
            return partes.length > 1 ? partes[1] : "?";
        }
    }

    private static Map<String, String> iniciarDescricoes() {
        Map<String, String> d = new HashMap<>();

        // RANDOM
        d.put("random_xs_tight",   "Acesso aleatorio | Minimo (500 refs, 20 pags)");
        d.put("random_sm_tight",   "Acesso aleatorio | Pequeno (2k refs, 20 pags)");
        d.put("random_md_tight",   "Acesso aleatorio | Medio (10k refs, 20 pags)");
        d.put("random_xs_medium",  "Acesso aleatorio | Minimo (500 refs, 100 pags)");
        d.put("random_sm_medium",  "Acesso aleatorio | Pequeno (2k refs, 100 pags)");
        d.put("random_md_medium",  "Acesso aleatorio | Medio (10k refs, 100 pags)");
        d.put("random_lg_medium",  "Acesso aleatorio | Grande (100k refs, 100 pags)");
        d.put("random_sm_wide",    "Acesso aleatorio | Pequeno, universo amplo (2k refs, 500 pags)");
        d.put("random_md_wide",    "Acesso aleatorio | Medio, universo amplo (10k refs, 500 pags)");
        d.put("random_lg_wide",    "Acesso aleatorio | Grande, universo amplo (100k refs, 500 pags)");
        d.put("random_xl_wide",    "Acesso aleatorio | Massivo, universo amplo (1M refs, 500 pags)");
        d.put("random_md_huge",    "Acesso aleatorio | Medio, universo enorme (10k refs, 2000 pags)");
        d.put("random_lg_huge",    "Acesso aleatorio | Grande, universo enorme (100k refs, 2000 pags)");

        // SEQUENTIAL
        d.put("sequential_xs_tight",   "Acesso sequencial | Minimo (500 refs, 20 pags)");
        d.put("sequential_sm_tight",   "Acesso sequencial | Pequeno (2k refs, 20 pags)");
        d.put("sequential_md_medium",  "Acesso sequencial | Medio (10k refs, 100 pags)");
        d.put("sequential_lg_medium",  "Acesso sequencial | Grande (100k refs, 100 pags)");
        d.put("sequential_md_wide",    "Acesso sequencial | Medio, universo amplo (10k refs, 500 pags)");
        d.put("sequential_lg_wide",    "Acesso sequencial | Grande, universo amplo (100k refs, 500 pags)");
        d.put("sequential_xl_wide",    "Acesso sequencial | Massivo, universo amplo (1M refs, 500 pags)");

        // LOCALITY
        d.put("locality_sm_tight_hot90",  "Alta localidade (90% hot) | Pequeno, universo restrito (2k refs, 50 pags, WS=20%)");
        d.put("locality_md_tight_hot90",  "Alta localidade (90% hot) | Medio, universo restrito (10k refs, 50 pags, WS=20%)");
        d.put("locality_lg_tight_hot90",  "Alta localidade (90% hot) | Grande, universo restrito (100k refs, 50 pags, WS=20%)");
        d.put("locality_sm_medium_hot70", "Localidade moderada (70% hot) | Pequeno (2k refs, 200 pags, WS=20%)");
        d.put("locality_md_medium_hot70", "Localidade moderada (70% hot) | Medio (10k refs, 200 pags, WS=20%)");
        d.put("locality_lg_medium_hot70", "Localidade moderada (70% hot) | Grande (100k refs, 200 pags, WS=20%)");
        d.put("locality_md_wide_ws40",    "Localidade moderada (80% hot) | Medio, WS grande (10k refs, 500 pags, WS=40%)");
        d.put("locality_lg_wide_ws40",    "Localidade moderada (80% hot) | Grande, WS grande (100k refs, 500 pags, WS=40%)");
        d.put("locality_md_huge_ws10",    "Alta localidade (85% hot) | Medio, universo enorme (10k refs, 2000 pags, WS=10%)");
        d.put("locality_lg_huge_ws10",    "Alta localidade (85% hot) | Grande, universo enorme (100k refs, 2000 pags, WS=10%)");

        // PHASES
        d.put("phases_sm_tight_p2",   "Fases de acesso | Pequeno, 2 fases (2k refs, 50 pags)");
        d.put("phases_md_tight_p2",   "Fases de acesso | Medio, 2 fases (10k refs, 50 pags)");
        d.put("phases_sm_medium_p4",  "Fases de acesso | Pequeno, 4 fases (2k refs, 200 pags)");
        d.put("phases_md_medium_p4",  "Fases de acesso | Medio, 4 fases (10k refs, 200 pags)");
        d.put("phases_lg_medium_p4",  "Fases de acesso | Grande, 4 fases (100k refs, 200 pags)");
        d.put("phases_md_wide_p8",    "Fases de acesso | Medio, 8 fases, universo amplo (10k refs, 500 pags)");
        d.put("phases_lg_wide_p8",    "Fases de acesso | Grande, 8 fases, universo amplo (100k refs, 500 pags)");
        d.put("phases_xl_wide_p8",    "Fases de acesso | Massivo, 8 fases, universo amplo (1M refs, 500 pags)");
        d.put("phases_md_huge_p4",    "Fases de acesso | Medio, 4 fases, universo enorme (10k refs, 2000 pags)");
        d.put("phases_lg_huge_p8",    "Fases de acesso | Grande, 8 fases, universo enorme (100k refs, 2000 pags)");

        return d;
    }

    public static void main(String[] args) throws Exception {
        Map<String, String> descricoes = iniciarDescricoes();

        File diretorio = new File("data/workloads");
        File[] arquivos = diretorio.listFiles();

        if (arquivos == null || arquivos.length == 0) {
            System.err.println("Nenhum CSV encontrado na pasta data/workloads");
            return;
        }

        List<File> arquivosCsv = new ArrayList<>();
        for (File arquivo : arquivos) {
            if (arquivo.getName().endsWith(".csv")) arquivosCsv.add(arquivo);
        }
        Collections.sort(arquivosCsv);

        System.out.println("Encontrados " + arquivosCsv.size() + " workloads. Iniciando simulacao...\n");

        List<ResultadoSimulacao> resultados = new ArrayList<>();
        int[] tamanhosFrame = {4, 8, 16, 32};
        int totalSimulacoes = arquivosCsv.size() * tamanhosFrame.length;
        int concluidos = 0;

        for (File csv : arquivosCsv) {
            String nomeWorkload = csv.getName().replace(".csv", "");
            List<Integer> referencias = carregarReferencias(csv);

            for (int frames : tamanhosFrame) {
                executarAlgoritmos(nomeWorkload, referencias, frames, resultados);
                concluidos++;
                System.out.printf("  [%3d/%3d] %-45s frames=%d\n", concluidos, totalSimulacoes, nomeWorkload, frames);
            }
        }

        System.out.println("\nGerando relatorios...");
        gerarRelatorioTxt(resultados, descricoes);
        gerarRelatorioCsv(resultados, descricoes);
        System.out.println("Relatorios gerados na pasta results/!");
    }

    private static List<Integer> carregarReferencias(File arquivo) throws Exception {
        List<Integer> sequencia = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(arquivo));
        br.readLine(); // pula cabecalho
        String linha;
        while ((linha = br.readLine()) != null) {
            if (!linha.trim().isEmpty()) sequencia.add(Integer.parseInt(linha.trim()));
        }
        br.close();
        return sequencia;
    }

    private static void executarAlgoritmos(String nomeWorkload, List<Integer> referencias, int frames, List<ResultadoSimulacao> resultados) {
        AlgoritmoOtimo otimo = new AlgoritmoOtimo(frames);
        otimo.carregarReferencias(referencias);

        // Usa LinkedHashMap para manter ordem de insercao
        Map<String, AlgoritmoSubstituicaoPages> algoritmos = new LinkedHashMap<>();
        algoritmos.put("FIFO",   new AlgoritmoFIFO(frames));
        algoritmos.put("LRU",    new AlgoritmoLRU(frames));
        algoritmos.put("LFU",    new AlgoritmoLFU(frames));
        algoritmos.put("Clock",  new AlgoritmoClock(frames));
        algoritmos.put("Random", new AlgoritmoRandom(frames, 42L));
        algoritmos.put("Otimo",  otimo);

        for (Map.Entry<String, AlgoritmoSubstituicaoPages> entry : algoritmos.entrySet()) {
            AlgoritmoSubstituicaoPages algo = entry.getValue();
            algo.reset();
            if (algo instanceof AlgoritmoOtimo) ((AlgoritmoOtimo) algo).carregarReferencias(referencias);
            for (int pagina : referencias) algo.accesso(pagina);
            resultados.add(new ResultadoSimulacao(nomeWorkload, entry.getKey(), frames, algo.getPageFaults(), referencias.size()));
        }
    }

    //Ordenacao

    private static List<String> ordenarWorkloads(List<String> nomes) {
        List<String> copia = new ArrayList<>(nomes);
        copia.sort(Comparator
            .<String, Integer>comparing(k -> {
                int idx = ORDEM_TIPO.indexOf(k.split("_")[0]);
                return idx < 0 ? 99 : idx;
            })
            .thenComparing(k -> {
                String[] p = k.split("_");
                int idx = p.length > 1 ? ORDEM_TAMANHO.indexOf(p[1]) : 99;
                return idx < 0 ? 99 : idx;
            })
            .thenComparing(Comparator.naturalOrder())
        );
        return copia;
    }

    //Relatorio TXT
    private static void gerarRelatorioTxt(List<ResultadoSimulacao> resultados, Map<String, String> descricoes) throws Exception {
        File pastaResults = new File("results");
        if (!pastaResults.exists()) pastaResults.mkdir();

        BufferedWriter bw = new BufferedWriter(new FileWriter("results/simulation_results.txt"));

        String SEP  = "=".repeat(120);
        String SEP2 = "-".repeat(120);
        String SEP3 = "~".repeat(120);

        bw.write(SEP + "\n");
        bw.write("  SIMULACAO DE ALGORITMOS DE SUBSTITUICAO DE PAGINAS\n");
        bw.write(SEP + "\n\n");

        // Agrupa por workload mantendo ordem de insercao
        Map<String, List<ResultadoSimulacao>> agrupado = new LinkedHashMap<>();
        for (ResultadoSimulacao res : resultados)
            agrupado.computeIfAbsent(res.workload, k -> new ArrayList<>()).add(res);

        // Ordena os workloads
        List<String> ordemWorkloads = ordenarWorkloads(new ArrayList<>(agrupado.keySet()));

        // Itera agrupando por tipo para exibir cabecalho de secao
        String tipoAtual = "";
        int numSecao = 0;

        for (String workload : ordemWorkloads) {
            List<ResultadoSimulacao> lista = agrupado.get(workload);
            String tipo = lista.get(0).getTipoWorkload();

            // Cabecalho de secao quando muda o tipo
            if (!tipo.equals(tipoAtual)) {
                tipoAtual = tipo;
                numSecao++;
                String tituloSecao = switch (tipo) {
                    case "random"     -> "SECAO " + numSecao + ": ACESSO ALEATORIO (Random)";
                    case "sequential" -> "SECAO " + numSecao + ": ACESSO SEQUENCIAL (Sequential)";
                    case "locality"   -> "SECAO " + numSecao + ": LOCALIDADE TEMPORAL (Locality)";
                    case "phases"     -> "SECAO " + numSecao + ": FASES DE ACESSO (Phases)";
                    default           -> "SECAO " + numSecao + ": " + tipo.toUpperCase();
                };
                bw.write(SEP3 + "\n");
                bw.write("  " + tituloSecao + "\n");
                bw.write(SEP3 + "\n\n");
            }

            // Cabecalho do workload
            String descricao = descricoes.getOrDefault(workload, workload);
            bw.write(String.format("  [%s]%n", workload));
            bw.write(String.format("  %s%n", descricao));
            bw.write(SEP2 + "\n");

            // Cabecalho das colunas
            bw.write(String.format("  %-8s", "Frames"));
            for (String algo : ORDEM_ALGOS)
                bw.write(String.format("  %-20s", algo));
            bw.write("  | " + String.format("%-20s", "Otimo (ref)") + "\n");

            bw.write(String.format("  %-8s", ""));
            for (String ignored : ORDEM_ALGOS)
                bw.write(String.format("  %-11s%-9s", "faults", "rate%"));
            bw.write("  | " + String.format("%-11s%-9s", "faults", "rate%") + "\n");
            bw.write("  " + "-".repeat(114) + "\n");

            // Agrupa por frames
            Map<Integer, List<ResultadoSimulacao>> porFrames = new LinkedHashMap<>();
            for (ResultadoSimulacao res : lista)
                porFrames.computeIfAbsent(res.frames, k -> new ArrayList<>()).add(res);

            for (Map.Entry<Integer, List<ResultadoSimulacao>> entry : porFrames.entrySet()) {
                List<ResultadoSimulacao> linha = entry.getValue();
                bw.write(String.format("  %-8d", entry.getKey()));

                // Melhor entre os praticos
                int melhorPratico = Integer.MAX_VALUE;
                for (ResultadoSimulacao res : linha) {
                    if (!res.algoritmo.equals("Otimo") && res.pageFaults < melhorPratico)
                        melhorPratico = res.pageFaults;
                }

                for (String algo : ORDEM_ALGOS) {
                    ResultadoSimulacao res = encontrar(linha, algo);
                    if (res == null) { bw.write(String.format("  %-11s%-9s", "-", "-")); continue; }
                    String marca = res.pageFaults == melhorPratico ? "*" : " ";
                    bw.write(String.format("  %-11s%-9s",
                            String.format("%,d%s", res.pageFaults, marca),
                            String.format("%.1f%%", res.getTaxaFalha())));
                }

                // Otimo separado
                ResultadoSimulacao otimo = encontrar(linha, "Otimo");
                if (otimo != null) {
                    bw.write(String.format("  | %-11s%-9s",
                            String.format("%,d", otimo.pageFaults),
                            String.format("%.1f%%", otimo.getTaxaFalha())));
                }
                bw.write("\n");
            }
            bw.write("\n");
        }

        // Resumo geral
        bw.write(SEP + "\n");
        bw.write("  RESUMO GERAL -- media de page faults por algoritmo (todos os workloads e frames)\n");
        bw.write(SEP + "\n\n");

        Map<String, long[]> stats = new LinkedHashMap<>(); // [soma, count, min, max]
        for (ResultadoSimulacao res : resultados) {
            stats.computeIfAbsent(res.algoritmo, k -> new long[]{0, 0, Long.MAX_VALUE, Long.MIN_VALUE});
            long[] s = stats.get(res.algoritmo);
            s[0] += res.pageFaults;
            s[1]++;
            if (res.pageFaults < s[2]) s[2] = res.pageFaults;
            if (res.pageFaults > s[3]) s[3] = res.pageFaults;
        }

        List<String> ordemResumo = new ArrayList<>(stats.keySet());
        ordemResumo.sort(Comparator.comparingDouble(a -> (double) stats.get(a)[0] / stats.get(a)[1]));

        for (String algo : ordemResumo) {
            long[] s = stats.get(algo);
            double media = (double) s[0] / s[1];
            bw.write(String.format("  %-8s  media: %12.1f  min: %,10d  max: %,10d  amostras: %d%n",
                    algo, media, s[2], s[3], s[1]));
        }

        bw.write("\n  * = melhor algoritmo pratico para aquele workload/frames\n");
        bw.write("  Otimo (ref) = limite teorico inferior (algoritmo de Belady)\n");
        bw.write(SEP + "\n");
        bw.close();
    }

    private static ResultadoSimulacao encontrar(List<ResultadoSimulacao> lista, String algoritmo) {
        for (ResultadoSimulacao res : lista)
            if (res.algoritmo.equals(algoritmo)) return res;
        return null;
    }

    //Relatorio CSV

    private static void gerarRelatorioCsv(List<ResultadoSimulacao> resultados, Map<String, String> descricoes) throws Exception {
        BufferedWriter bw = new BufferedWriter(new FileWriter("results/simulation_results.csv"));
        bw.write("workload,workload_type,workload_size,description,algorithm,frames,page_faults,total_accesses,fault_rate_pct\n");

        // Ordena o CSV: tipo > tamanho > workload > algoritmo > frames
        List<ResultadoSimulacao> ordenados = new ArrayList<>(resultados);
        ordenados.sort(Comparator
            .<ResultadoSimulacao, Integer>comparing(r -> {
                int idx = ORDEM_TIPO.indexOf(r.getTipoWorkload());
                return idx < 0 ? 99 : idx;
            })
            .thenComparing(r -> {
                int idx = ORDEM_TAMANHO.indexOf(r.getTamanhoWorkload());
                return idx < 0 ? 99 : idx;
            })
            .thenComparing(r -> r.workload)
            .thenComparing(r -> {
                int idx = ORDEM_ALGOS.indexOf(r.algoritmo);
                return idx < 0 ? 99 : idx;
            })
            .thenComparingInt(r -> r.frames)
        );

        for (ResultadoSimulacao r : ordenados) {
            String descricao = descricoes.getOrDefault(r.workload, r.workload);
            bw.write(r.workload + "," +
                     r.getTipoWorkload() + "," +
                     r.getTamanhoWorkload() + ",\"" +
                     descricao + "\"," +
                     r.algoritmo + "," +
                     r.frames + "," +
                     r.pageFaults + "," +
                     r.totalAcessos + "," +
                     String.format("%.4f", r.getTaxaFalha()).replace(",", ".") + "\n");
        }
        bw.close();
    }
}