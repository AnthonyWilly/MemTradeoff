# Análise de Trade-off em Algoritmos de Substituição de Páginas

## Visão Geral

O objetivo do projeto é analisar quantitativamente o trade-off entre a taxa de page faults e o overhead computacional de algoritmos de substituição de páginas.

Serão comparados diferentes algoritmos sob múltiplos padrões de carga de trabalho e diferentes tamanhos de memória.

## Objetivos

- Implementar algoritmos de substituição de páginas (ex: FIFO, LRU, CLOCK, etc.)
- Gerar workloads sintéticas com diferentes padrões de localidade
- Medir taxa de page faults em diferentes configurações de memória
- Medir overhead computacional utilizando microbenchmark
- Analisar os resultados em forma de relatório

## Estrutura Planejada

- `core/` — Implementação dos algoritmos
- `simulator/` — Execução dos experimentos e coleta de faults
- `benchmarks/` — Microbenchmark de overhead
- `workload-generator/` — Scripts para geração de cargas
- `report/` — Relatório e análises

## Pergunta de Pesquisa

Em que medida a redução na taxa de page faults justifica o aumento no custo computacional do algoritmo de substituição?

## Status

Fase inicial de configuração do projeto.

## Tecnologias Usadas

Em desenvolvimento.
