# Análise de Trade-off em Algoritmos de Substituição de Páginas

## Visão Geral

Projeto desenvolvido para disciplina de Sistemas Operacionais da UFCG

O objetivo do projeto é analisar quantitativamente o trade-off entre a taxa de page faults e o overhead computacional de algoritmos de substituição de páginas.

Serão comparados diferentes algoritmos sob múltiplos padrões de carga de trabalho e diferentes tamanhos de memória.

## Objetivos

- Implementar algoritmos de substituição de páginas (ex: FIFO, LRU, CLOCK, Random, Bélády) ✔️
- Gerar workloads sintéticas com diferentes padrões de localidade ✔️
- Medir taxa de page faults em diferentes configurações de memória ✔️
- Medir overhead computacional utilizando microbenchmark✔️
- Analisar os resultados em forma de relatório

## Estrutura

- `core/` — Implementação dos algoritmos
- `simulator/` — Execução dos experimentos e coleta de faults
- `benchmarks/` — Microbenchmark de overhead
- `data/` — Arquivos .csv com os workloads
- `results/` — Resultados dos testes
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

Os resultados serão gerados na pasta `results/`.
