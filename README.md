# Análise de Trade-off em Algoritmos de Substituição de Páginas

## Visão Geral

Projeto desenvolvido para disciplina de Sistemas Operacionais da UFCG

O objetivo do projeto é analisar quantitativamente o trade-off entre a taxa de page faults e o overhead computacional de algoritmos de substituição de páginas.

Serão comparados diferentes algoritmos sob múltiplos padrões de carga de trabalho e diferentes tamanhos de memória.

## Objetivos

- Implementar algoritmos de substituição de páginas (ex: FIFO, LRU, CLOCK, Random, Bélády) ✔️
- Gerar workloads sintéticas com diferentes padrões de localidade ✔️
- Medir taxa de page faults em diferentes configurações de memória ✔️
- Medir overhead computacional utilizando microbenchmark ✔️
- Limpar e tratar os resultados ✔️
- Analisar os resultados em forma de relatório

## Estrutura

- `core/` — Implementação dos algoritmos
- `simulator/` — Execução dos experimentos e coleta de faults
- `benchmarks/` — Microbenchmark de overhead
- `data/` — Arquivos .csv com os workloads
- `results/` — Resultados dos testes brutos
- `reports/` — Resultados dos testes tratados
- `generate_workloads.py` — Script para geração de cargas
- `update_env.py` — Script para pegar as especificações da máquina

## Pergunta de Pesquisa

Em que medida a redução na taxa de page faults justifica o aumento no custo computacional do algoritmo de substituição?

## Status

Fase de teste dos algoritmos

## Tecnologias Usadas


- Java
- Maven
- Python
- JMH

<!-- ENV_START -->
## Ambiente de Testes

> Gerado automaticamente por `update_env.py` em 2026-02-26 20:55

| Campo        | Valor |
|--------------|-------|
| SO           | Fedora Linux 43 (Workstation Edition) |
| CPU          | AMD Ryzen 3 3200G with Radeon Vega Graphics |
| Núcleos      | 4 lógicos |
| RAM          | 23.4 GB |
| Java         | openjdk version "21.0.10" 2026-01-20 |
| Python       | 3.14.2 |

> Os resultados de benchmark (JMH) e simulação foram obtidos neste ambiente.
> Resultados podem variar em hardware diferente.
<!-- ENV_END -->


## Como Rodar

### 1. Gerar Workloads
```bash
python generate_workloads.py
```

> Se preferir, edite o arquivo `generate_workloads.py` para alterar a **seed**, o **universo** e a **quantidade de workloads**.

---

### 2. Executar o Simulador
```bash
mvn install -pl core && mvn compile exec:java -pl simulator \
  -Dexec.mainClass="simulator.src.main.java.br.edu.ufcg.computacao.so.simulator.Simulator"
```


### 3. Executar o microbenchmarch
```bash
mvn package -pl benchmarks && java -jar benchmarks/target/benchmarks.jar "bench.*" -prof gc -rf json -rff results/jmh.json
```
> Se preferir, edite o arquivo `benchmarks/src/main/java/br/edu/ufcg/computacao/so/benchmarks/AlgoritmoBenchmark.java` para alterar a quantidade ou a forma dos benchmarks

Os resultados serão gerados na pasta `results/`.



## Descrição dos Workloads nos Resultados

Nos resultados, os nomes dos workloads seguem o padrão `padrão_tamanho_distribuição_parâmetro`, onde cada termo representa uma característica da carga de trabalho simulada.

### Padrão de acesso

| Termo | Descrição |
|---|---|
| `localidade` | Acessos com localidade temporal/espacial: certas páginas são acessadas com muito mais frequência que outras |
| `fases` | O padrão de acesso muda ao longo do tempo, simulando fases distintas de execução |
| `aleatorio` | Acessos completamente aleatórios, sem padrão ou localidade |
| `sequencial` | Páginas acessadas em ordem sequencial |

### Tamanho do workload

| Termo | Descrição |
|---|---|
| `extragrande (xl)` | Sequência colossal de acessos (1.000.000 de operações). |
| `grande (lg)` | Sequência longa de acessos (100.000 de operações). |
| `medio (md)` | Sequência de tamanho intermediário (10.000 operações). |
| `pequeno (sm)` | Sequência curta de acessos (2.000 operações) |
| `minimo (xs)` | Sequência curtíssima de acessos (500 operações) |

### Distribuição do espaço de endereçamento

| Termo | Descrição |
|---|---|
| `enorme` | Espaço de páginas massivo (2.000 páginas); probabilidade muito baixa de reutilização no acaso. |
| `amplo` | Espaço de páginas grande (500 páginas); baixa chance de reutilização espontânea. |
| `medio` | Espaço de páginas intermediário (entre 100 e 200 páginas, dependendo do workload). |
| `restrito` | Espaço de páginas bem pequeno (entre 20 e 50 páginas); altíssima chance de reutilização e contenção de memória. |

### Parâmetros específicos

| Termo | Descrição |
|---|---|
| `ws10` / `ws40` | Working Set Ratio,conjunto de páginas quentes corresponde a 10% ou 40% de todo o espaço de endereçamento |
| `frequente70` / `frequente90` | Percentual de acessos concentrados nas páginas frequentes: 70% ou 90% dos acessos vão para um subconjunto pequeno de páginas |
| `f2` / `f4` / `f8` | Número de fases do workload: `f2` tem 2 fases distintas de acesso, `f4` tem 4 e `f8`, 8. |
