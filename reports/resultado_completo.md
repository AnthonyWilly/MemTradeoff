# Análise Completa: Tempo, Memória e Page Faults por Cenário

### Cenário: aleatorio extragrande amplo - 4 frames
- **Tempo:** O melhor foi Clock (38.854 ms / ótimo: 348.658 ms). O pior foi LFU (107.798 ms / random: 48.289 ms).
- **Memória:** O melhor foi LRU (62379.089 KB / ótimo: 148047.185 KB). O pior foi LFU (186030.317 KB / random: 77168.142 KB).
- **Page Faults:** O melhor foi LFU (992065 faltas / ótimo: 918568). O pior foi Clock (992084 faltas / random: 991987).

### Cenário: aleatorio extragrande amplo - 8 frames
- **Tempo:** O melhor foi FIFO (44.139 ms / ótimo: 518.198 ms). O pior foi LFU (170.376 ms / random: 54.761 ms).
- **Memória:** O melhor foi LRU (62474.622 KB / ótimo: 182644.5 KB). O pior foi LFU (216024.159 KB / random: 76631.293 KB).
- **Page Faults:** O melhor foi FIFO (983846 faltas / ótimo: 862828). O pior foi LFU (983959 faltas / random: 983845).

### Cenário: aleatorio extragrande amplo - 16 frames
- **Tempo:** O melhor foi LRU (43.9 ms / ótimo: 807.697 ms). O pior foi LFU (259.81 ms / random: 53.023 ms).
- **Memória:** O melhor foi LRU (62660.59 KB / ótimo: 244882.797 KB). O pior foi LFU (319673.517 KB / random: 75574.868 KB).
- **Page Faults:** O melhor foi FIFO (967808 faltas / ótimo: 788872). O pior foi LFU (967906 faltas / random: 967837).

### Cenário: aleatorio extragrande amplo - 32 frames
- **Tempo:** O melhor foi FIFO (41.287 ms / ótimo: 1386.74 ms). O pior foi LFU (418.087 ms / random: 52.641 ms).
- **Memória:** O melhor foi LRU (63034.294 KB / ótimo: 349095.831 KB). O pior foi LFU (501868.487 KB / random: 73454.353 KB).
- **Page Faults:** O melhor foi Clock (935542 faltas / ótimo: 690133). O pior foi LFU (935834 faltas / random: 935713).

### Cenário: aleatorio grande amplo - 4 frames
- **Tempo:** O melhor foi Clock (3.972 ms / ótimo: 28.611 ms). O pior foi LFU (10.323 ms / random: 4.835 ms).
- **Memória:** O melhor foi LRU (6242.345 KB / ótimo: 14689.871 KB). O pior foi LFU (20136.077 KB / random: 7723.853 KB).
- **Page Faults:** O melhor foi LFU (99172 faltas / ótimo: 91859). O pior foi FIFO (99221 faltas / random: 99176).

### Cenário: aleatorio grande amplo - 8 frames
- **Tempo:** O melhor foi FIFO (4.423 ms / ótimo: 42.839 ms). O pior foi LFU (15.569 ms / random: 5.389 ms).
- **Memória:** O melhor foi LRU (6252.218 KB / ótimo: 18162.399 KB). O pior foi LFU (24679.659 KB / random: 7670.403 KB).
- **Page Faults:** O melhor foi LFU (98374 faltas / ótimo: 86248). O pior foi LRU (98385 faltas / random: 98369).

### Cenário: aleatorio grande amplo - 16 frames
- **Tempo:** O melhor foi FIFO (4.556 ms / ótimo: 65.501 ms). O pior foi LFU (25.408 ms / random: 5.31 ms).
- **Memória:** O melhor foi LRU (6271.697 KB / ótimo: 24453.586 KB). O pior foi LFU (31952.56 KB / random: 7559.676 KB).
- **Page Faults:** O melhor foi FIFO (96727 faltas / ótimo: 78897). O pior foi LFU (96754 faltas / random: 96694).

### Cenário: aleatorio grande amplo - 32 frames
- **Tempo:** O melhor foi FIFO (4.023 ms / ótimo: 113.0 ms). O pior foi LFU (43.222 ms / random: 5.02 ms).
- **Memória:** O melhor foi LRU (6308.833 KB / ótimo: 34782.759 KB). O pior foi LFU (50097.239 KB / random: 7354.229 KB).
- **Page Faults:** O melhor foi LFU (93501 faltas / ótimo: 68929). O pior foi LRU (93557 faltas / random: 93610).

### Cenário: aleatorio grande enorme - 4 frames
- **Tempo:** O melhor foi Clock (3.422 ms / ótimo: 27.117 ms). O pior foi LFU (9.841 ms / random: 4.574 ms).
- **Memória:** O melhor foi LRU (6833.66 KB / ótimo: 17564.002 KB). O pior foi LFU (22023.043 KB / random: 8961.101 KB).
- **Page Faults:** O melhor foi FIFO (99805 faltas / ótimo: 96001). O pior foi LFU (99809 faltas / random: 99823).

### Cenário: aleatorio grande enorme - 8 frames
- **Tempo:** O melhor foi Clock (4.253 ms / ótimo: 43.24 ms). O pior foi LFU (16.788 ms / random: 5.22 ms).
- **Memória:** O melhor foi LRU (6836.315 KB / ótimo: 22691.856 KB). O pior foi LFU (28208.347 KB / random: 8945.559 KB).
- **Page Faults:** O melhor foi LFU (99585 faltas / ótimo: 93174). O pior foi FIFO (99621 faltas / random: 99617).

### Cenário: aleatorio grande enorme - 16 frames
- **Tempo:** O melhor foi FIFO (4.407 ms / ótimo: 64.648 ms). O pior foi LFU (26.281 ms / random: 4.992 ms).
- **Memória:** O melhor foi LRU (6842.024 KB / ótimo: 32487.696 KB). O pior foi LFU (38984.129 KB / random: 8913.612 KB).
- **Page Faults:** O melhor foi LFU (99183 faltas / ótimo: 89359). O pior foi LRU (99234 faltas / random: 99187).

### Cenário: aleatorio grande enorme - 32 frames
- **Tempo:** O melhor foi LRU (4.29 ms / ótimo: 115.999 ms). O pior foi LFU (46.588 ms / random: 4.986 ms).
- **Memória:** O melhor foi LRU (6854.67 KB / ótimo: 50755.039 KB). O pior foi LFU (63308.026 KB / random: 8852.338 KB).
- **Page Faults:** O melhor foi FIFO (98404 faltas / ótimo: 84219). O pior foi LFU (98411 faltas / random: 98378).

### Cenário: aleatorio grande medio - 4 frames
- **Tempo:** O melhor foi FIFO (2.819 ms / ótimo: 25.809 ms). O pior foi LFU (9.333 ms / random: 3.497 ms).
- **Memória:** O melhor foi Clock (2999.801 KB / ótimo: 5575.578 KB). O pior foi LFU (8379.352 KB / random: 2998.438 KB).
- **Page Faults:** O melhor foi LFU (95933 faltas / ótimo: 81355). O pior foi Clock (95986 faltas / random: 95942).

### Cenário: aleatorio grande medio - 8 frames
- **Tempo:** O melhor foi FIFO (3.101 ms / ótimo: 37.159 ms). O pior foi LFU (12.07 ms / random: 3.846 ms).
- **Memória:** O melhor foi Clock (2876.585 KB / ótimo: 5199.499 KB). O pior foi LFU (8186.761 KB / random: 2875.471 KB).
- **Page Faults:** O melhor foi LFU (91998 faltas / ótimo: 69318). O pior foi FIFO (92045 faltas / random: 92007).

### Cenário: aleatorio grande medio - 16 frames
- **Tempo:** O melhor foi FIFO (3.093 ms / ótimo: 51.07 ms). O pior foi LFU (21.252 ms / random: 3.992 ms).
- **Memória:** O melhor foi Clock (2626.233 KB / ótimo: 4721.51 KB). O pior foi LFU (7803.455 KB / random: 2624.621 KB).
- **Page Faults:** O melhor foi Clock (84026 faltas / ótimo: 54015). O pior foi LFU (84146 faltas / random: 83967).

### Cenário: aleatorio grande medio - 32 frames
- **Tempo:** O melhor foi FIFO (2.769 ms / ótimo: 66.757 ms). O pior foi LFU (27.442 ms / random: 3.153 ms).
- **Memória:** O melhor foi Clock (2130.055 KB / ótimo: 4121.128 KB). O pior foi LFU (7020.917 KB / random: 2129.248 KB).
- **Page Faults:** O melhor foi FIFO (67965 faltas / ótimo: 34791). O pior foi Clock (68138 faltas / random: 68102).

### Cenário: aleatorio medio amplo - 4 frames
- **Tempo:** O melhor foi Clock (0.37 ms / ótimo: 2.586 ms). O pior foi LFU (1.151 ms / random: 0.459 ms).
- **Memória:** O melhor foi LRU (623.159 KB / ótimo: 1474.721 KB). O pior foi LFU (1993.461 KB / random: 769.573 KB).
- **Page Faults:** O melhor foi FIFO (9906 faltas / ótimo: 9185). O pior foi LFU (9919 faltas / random: 9914).

### Cenário: aleatorio medio amplo - 8 frames
- **Tempo:** O melhor foi Clock (0.441 ms / ótimo: 3.673 ms). O pior foi LFU (1.679 ms / random: 0.524 ms).
- **Memória:** O melhor foi LRU (623.948 KB / ótimo: 1813.697 KB). O pior foi LFU (2439.785 KB / random: 764.246 KB).
- **Page Faults:** O melhor foi FIFO (9835 faltas / ótimo: 8626). O pior foi LFU (9844 faltas / random: 9834).

### Cenário: aleatorio medio amplo - 16 frames
- **Tempo:** O melhor foi FIFO (0.436 ms / ótimo: 5.672 ms). O pior foi LFU (2.754 ms / random: 0.518 ms).
- **Memória:** O melhor foi LRU (625.769 KB / ótimo: 2423.976 KB). O pior foi LFU (3320.753 KB / random: 753.55 KB).
- **Page Faults:** O melhor foi FIFO (9673 faltas / ótimo: 7874). O pior foi LFU (9686 faltas / random: 9671).

### Cenário: aleatorio medio amplo - 32 frames
- **Tempo:** O melhor foi FIFO (0.426 ms / ótimo: 8.719 ms). O pior foi LFU (4.667 ms / random: 0.492 ms).
- **Memória:** O melhor foi LRU (629.425 KB / ótimo: 3426.402 KB). O pior foi LFU (4942.172 KB / random: 733.933 KB).
- **Page Faults:** O melhor foi LFU (9361 faltas / ótimo: 6889). O pior foi LRU (9370 faltas / random: 9365).

### Cenário: aleatorio medio enorme - 4 frames
- **Tempo:** O melhor foi Clock (0.322 ms / ótimo: 2.409 ms). O pior foi LFU (1.236 ms / random: 0.436 ms).
- **Memória:** O melhor foi LRU (683.94 KB / ótimo: 1845.641 KB). O pior foi LFU (2193.86 KB / random: 896.964 KB).
- **Page Faults:** O melhor foi FIFO (9983 faltas / ótimo: 9600). O pior foi LFU (9984 faltas / random: 9981).

### Cenário: aleatorio medio enorme - 8 frames
- **Tempo:** O melhor foi Clock (0.376 ms / ótimo: 3.441 ms). O pior foi LFU (1.964 ms / random: 0.493 ms).
- **Memória:** O melhor foi LRU (684.136 KB / ótimo: 2349.68 KB). O pior foi LFU (2807.06 KB / random: 895.636 KB).
- **Page Faults:** O melhor foi LFU (9960 faltas / ótimo: 9319). O pior foi FIFO (9969 faltas / random: 9964).

### Cenário: aleatorio medio enorme - 16 frames
- **Tempo:** O melhor foi Clock (0.415 ms / ótimo: 5.175 ms). O pior foi LFU (3.03 ms / random: 0.504 ms).
- **Memória:** O melhor foi LRU (684.819 KB / ótimo: 3338.566 KB). O pior foi LFU (3887.614 KB / random: 892.597 KB).
- **Page Faults:** O melhor foi LFU (9921 faltas / ótimo: 8952). O pior foi FIFO (9932 faltas / random: 9922).

### Cenário: aleatorio medio enorme - 32 frames
- **Tempo:** O melhor foi Clock (0.437 ms / ótimo: 8.725 ms). O pior foi LFU (5.385 ms / random: 0.497 ms).
- **Memória:** O melhor foi LRU (686.46 KB / ótimo: 5159.496 KB). O pior foi LFU (6279.849 KB / random: 886.074 KB).
- **Page Faults:** O melhor foi LRU (9841 faltas / ótimo: 8443). O pior foi FIFO (9844 faltas / random: 9834).

### Cenário: aleatorio medio medio - 4 frames
- **Tempo:** O melhor foi Clock (0.27 ms / ótimo: 2.363 ms). O pior foi LFU (0.921 ms / random: 0.379 ms).
- **Memória:** O melhor foi Clock (301.377 KB / ótimo: 560.547 KB). O pior foi LFU (832.002 KB / random: 301.432 KB).
- **Page Faults:** O melhor foi LFU (9605 faltas / ótimo: 8139). O pior foi FIFO (9637 faltas / random: 9636).

### Cenário: aleatorio medio medio - 8 frames
- **Tempo:** O melhor foi FIFO (0.339 ms / ótimo: 3.188 ms). O pior foi LFU (1.333 ms / random: 0.4 ms).
- **Memória:** O melhor foi Clock (288.862 KB / ótimo: 522.959 KB). O pior foi LFU (805.4 KB / random: 288.37 KB).
- **Page Faults:** O melhor foi LFU (9179 faltas / ótimo: 6936). O pior foi LRU (9237 faltas / random: 9218).

### Cenário: aleatorio medio medio - 16 frames
- **Tempo:** O melhor foi FIFO (0.323 ms / ótimo: 4.261 ms). O pior foi LFU (2.09 ms / random: 0.398 ms).
- **Memória:** O melhor foi Clock (262.916 KB / ótimo: 475.951 KB). O pior foi LFU (754.561 KB / random: 264.096 KB).
- **Page Faults:** O melhor foi LFU (8361 faltas / ótimo: 5427). O pior foi FIFO (8427 faltas / random: 8431).

### Cenário: aleatorio medio medio - 32 frames
- **Tempo:** O melhor foi FIFO (0.278 ms / ótimo: 5.428 ms). O pior foi LFU (2.903 ms / random: 0.311 ms).
- **Memória:** O melhor foi Clock (215.041 KB / ótimo: 417.005 KB). O pior foi LFU (654.91 KB / random: 215.916 KB).
- **Page Faults:** O melhor foi LFU (6758 faltas / ótimo: 3532). O pior foi FIFO (6858 faltas / random: 6876).

### Cenário: aleatorio medio restrito - 4 frames
- **Tempo:** O melhor foi FIFO (0.236 ms / ótimo: 1.772 ms). O pior foi LFU (0.81 ms / random: 0.278 ms).
- **Memória:** O melhor foi Clock (250.595 KB / ótimo: 462.684 KB). O pior foi LFU (747.888 KB / random: 249.33 KB).
- **Page Faults:** O melhor foi LFU (7971 faltas / ótimo: 5610). O pior foi FIFO (8022 faltas / random: 7970).

### Cenário: aleatorio medio restrito - 8 frames
- **Tempo:** O melhor foi FIFO (0.243 ms / ótimo: 1.882 ms). O pior foi LFU (0.985 ms / random: 0.273 ms).
- **Memória:** O melhor foi Clock (189.674 KB / ótimo: 388.81 KB). O pior foi LFU (642.202 KB / random: 187.4 KB).
- **Page Faults:** O melhor foi LFU (5884 faltas / ótimo: 3246). O pior foi Clock (6062 faltas / random: 5987).

### Cenário: aleatorio medio restrito - 16 frames
- **Tempo:** O melhor foi FIFO (0.109 ms / ótimo: 0.795 ms). O pior foi LFU (0.641 ms / random: 0.129 ms).
- **Memória:** O melhor foi Clock (63.509 KB / ótimo: 309.74 KB). O pior foi LFU (442.106 KB / random: 65.876 KB).
- **Page Faults:** O melhor foi LFU (1945 faltas / ótimo: 713). O pior foi LRU (2038 faltas / random: 2088).

### Cenário: aleatorio medio restrito - 32 frames
- **Tempo:** O melhor foi FIFO (0.052 ms / ótimo: 0.22 ms). O pior foi LRU (0.271 ms / random: 0.054 ms).
- **Memória:** O melhor foi Clock (1.118 KB / ótimo: 288.08 KB). O pior foi LRU (390.947 KB / random: 1.221 KB).
- **Page Faults:** O melhor foi FIFO (20 faltas / ótimo: 20). O pior foi FIFO (20 faltas / random: 20).

### Cenário: aleatorio minimo medio - 4 frames
- **Tempo:** O melhor foi Clock (0.012 ms / ótimo: 0.078 ms). O pior foi LFU (0.044 ms / random: 0.02 ms).
- **Memória:** O melhor foi Clock (15.344 KB / ótimo: 31.922 KB). O pior foi LFU (38.797 KB / random: 15.211 KB).
- **Page Faults:** O melhor foi LFU (476 faltas / ótimo: 412). O pior foi FIFO (484 faltas / random: 477).

### Cenário: aleatorio minimo medio - 8 frames
- **Tempo:** O melhor foi Clock (0.013 ms / ótimo: 0.108 ms). O pior foi LFU (0.066 ms / random: 0.018 ms).
- **Memória:** O melhor foi Clock (14.547 KB / ótimo: 30.36 KB). O pior foi LFU (37.61 KB / random: 14.617 KB).
- **Page Faults:** O melhor foi LRU (457 faltas / ótimo: 362). O pior foi FIFO (459 faltas / random: 458).

### Cenário: aleatorio minimo medio - 16 frames
- **Tempo:** O melhor foi Clock (0.012 ms / ótimo: 0.15 ms). O pior foi LFU (0.103 ms / random: 0.015 ms).
- **Memória:** O melhor foi Clock (13.477 KB / ótimo: 28.439 KB). O pior foi LFU (35.704 KB / random: 14.0 KB).
- **Page Faults:** O melhor foi FIFO (416 faltas / ótimo: 296). O pior foi LFU (422 faltas / random: 428).

### Cenário: aleatorio minimo medio - 32 frames
- **Tempo:** O melhor foi Clock (0.011 ms / ótimo: 0.175 ms). O pior foi LFU (0.151 ms / random: 0.013 ms).
- **Memória:** O melhor foi Clock (11.914 KB / ótimo: 26.048 KB). O pior foi LFU (31.985 KB / random: 12.008 KB).
- **Page Faults:** O melhor foi LFU (354 faltas / ótimo: 211). O pior foi LRU (363 faltas / random: 351).

### Cenário: aleatorio minimo restrito - 4 frames
- **Tempo:** O melhor foi Clock (0.011 ms / ótimo: 0.06 ms). O pior foi LFU (0.04 ms / random: 0.014 ms).
- **Memória:** O melhor foi Clock (12.5 KB / ótimo: 23.0 KB). O pior foi LFU (35.654 KB / random: 12.836 KB).
- **Page Faults:** O melhor foi FIFO (391 faltas / ótimo: 282). O pior foi LFU (408 faltas / random: 401).

### Cenário: aleatorio minimo restrito - 8 frames
- **Tempo:** O melhor foi Clock (0.01 ms / ótimo: 0.06 ms). O pior foi LFU (0.046 ms / random: 0.012 ms).
- **Memória:** O melhor foi Clock (9.547 KB / ótimo: 19.375 KB). O pior foi LFU (28.235 KB / random: 10.149 KB).
- **Page Faults:** O melhor foi LRU (296 faltas / ótimo: 166). O pior foi LFU (307 faltas / random: 315).

### Cenário: aleatorio minimo restrito - 16 frames
- **Tempo:** O melhor foi FIFO (0.005 ms / ótimo: 0.027 ms). O pior foi LFU (0.028 ms / random: 0.006 ms).
- **Memória:** O melhor foi Clock (3.57 KB / ótimo: 16.703 KB). O pior foi LRU (19.875 KB / random: 3.719 KB).
- **Page Faults:** O melhor foi FIFO (99 faltas / ótimo: 46). O pior foi LFU (115 faltas / random: 99).

### Cenário: aleatorio minimo restrito - 32 frames
- **Tempo:** O melhor foi FIFO (0.003 ms / ótimo: 0.014 ms). O pior foi LRU (0.014 ms / random: 0.003 ms).
- **Memória:** O melhor foi Clock (1.117 KB / ótimo: 14.938 KB). O pior foi LRU (19.852 KB / random: 1.25 KB).
- **Page Faults:** O melhor foi FIFO (20 faltas / ótimo: 20). O pior foi FIFO (20 faltas / random: 20).

### Cenário: aleatorio pequeno amplo - 4 frames
- **Tempo:** O melhor foi Clock (0.065 ms / ótimo: 0.435 ms). O pior foi LFU (0.262 ms / random: 0.091 ms).
- **Memória:** O melhor foi LRU (124.501 KB / ótimo: 324.034 KB). O pior foi LFU (342.689 KB / random: 153.883 KB).
- **Page Faults:** O melhor foi FIFO (1986 faltas / ótimo: 1837). O pior foi LFU (1991 faltas / random: 1987).

### Cenário: aleatorio pequeno amplo - 8 frames
- **Tempo:** O melhor foi Clock (0.078 ms / ótimo: 0.626 ms). O pior foi LFU (0.421 ms / random: 0.103 ms).
- **Memória:** O melhor foi LRU (124.704 KB / ótimo: 393.77 KB). O pior foi LFU (451.862 KB / random: 152.493 KB).
- **Page Faults:** O melhor foi FIFO (1969 faltas / ótimo: 1726). O pior foi LFU (1975 faltas / random: 1966).

### Cenário: aleatorio pequeno amplo - 16 frames
- **Tempo:** O melhor foi Clock (0.08 ms / ótimo: 0.936 ms). O pior foi LFU (0.734 ms / random: 0.103 ms).
- **Memória:** O melhor foi LRU (125.192 KB / ótimo: 514.381 KB). O pior foi LFU (629.599 KB / random: 151.704 KB).
- **Page Faults:** O melhor foi FIFO (1930 faltas / ótimo: 1576). O pior foi LFU (1944 faltas / random: 1950).

### Cenário: aleatorio pequeno amplo - 32 frames
- **Tempo:** O melhor foi FIFO (0.077 ms / ótimo: 1.399 ms). O pior foi LFU (1.133 ms / random: 0.097 ms).
- **Memória:** O melhor foi LRU (126.141 KB / ótimo: 725.072 KB). O pior foi LFU (974.133 KB / random: 147.04 KB).
- **Page Faults:** O melhor foi LFU (1870 faltas / ótimo: 1395). O pior foi FIFO (1875 faltas / random: 1869).

### Cenário: aleatorio pequeno medio - 4 frames
- **Tempo:** O melhor foi Clock (0.055 ms / ótimo: 0.408 ms). O pior foi LFU (0.171 ms / random: 0.077 ms).
- **Memória:** O melhor foi Clock (60.313 KB / ótimo: 113.503 KB). O pior foi LFU (163.704 KB / random: 60.274 KB).
- **Page Faults:** O melhor foi LFU (1912 faltas / ótimo: 1629). O pior foi FIFO (1923 faltas / random: 1919).

### Cenário: aleatorio pequeno medio - 8 frames
- **Tempo:** O melhor foi Clock (0.06 ms / ótimo: 0.577 ms). O pior foi LFU (0.263 ms / random: 0.08 ms).
- **Memória:** O melhor foi Clock (57.891 KB / ótimo: 106.191 KB). O pior foi LFU (158.767 KB / random: 58.18 KB).
- **Page Faults:** O melhor foi LFU (1833 faltas / ótimo: 1395). O pior foi LRU (1847 faltas / random: 1852).

### Cenário: aleatorio pequeno medio - 16 frames
- **Tempo:** O melhor foi Clock (0.058 ms / ótimo: 0.743 ms). O pior foi LFU (0.401 ms / random: 0.075 ms).
- **Memória:** O melhor foi Clock (53.446 KB / ótimo: 96.864 KB). O pior foi LFU (149.987 KB / random: 53.626 KB).
- **Page Faults:** O melhor foi LFU (1688 faltas / ótimo: 1092). O pior foi FIFO (1698 faltas / random: 1696).

### Cenário: aleatorio pequeno medio - 32 frames
- **Tempo:** O melhor foi Clock (0.051 ms / ótimo: 0.865 ms). O pior foi LFU (0.58 ms / random: 0.057 ms).
- **Memória:** O melhor foi Clock (43.133 KB / ótimo: 96.443 KB). O pior foi LFU (131.52 KB / random: 42.727 KB).
- **Page Faults:** O melhor foi Clock (1356 faltas / ótimo: 724). O pior foi LFU (1384 faltas / random: 1334).

### Cenário: aleatorio pequeno restrito - 4 frames
- **Tempo:** O melhor foi Clock (0.047 ms / ótimo: 0.323 ms). O pior foi LFU (0.183 ms / random: 0.059 ms).
- **Memória:** O melhor foi Clock (50.0 KB / ótimo: 93.893 KB). O pior foi LFU (169.689 KB / random: 50.211 KB).
- **Page Faults:** O melhor foi Clock (1593 faltas / ótimo: 1117). O pior foi LFU (1607 faltas / random: 1597).

### Cenário: aleatorio pequeno restrito - 8 frames
- **Tempo:** O melhor foi FIFO (0.046 ms / ótimo: 0.32 ms). O pior foi LFU (0.184 ms / random: 0.051 ms).
- **Memória:** O melhor foi Clock (37.797 KB / ótimo: 79.424 KB). O pior foi LFU (120.329 KB / random: 37.586 KB).
- **Page Faults:** O melhor foi LRU (1185 faltas / ótimo: 654). O pior foi LFU (1218 faltas / random: 1193).

### Cenário: aleatorio pequeno restrito - 16 frames
- **Tempo:** O melhor foi FIFO (0.022 ms / ótimo: 0.139 ms). O pior foi LFU (0.142 ms / random: 0.025 ms).
- **Memória:** O melhor foi Clock (13.008 KB / ótimo: 68.376 KB). O pior foi LRU (78.469 KB / random: 12.813 KB).
- **Page Faults:** O melhor foi Clock (403 faltas / ótimo: 156). O pior foi LFU (443 faltas / random: 390).

### Cenário: aleatorio pequeno restrito - 32 frames
- **Tempo:** O melhor foi FIFO (0.01 ms / ótimo: 0.048 ms). O pior foi LFU (0.056 ms / random: 0.012 ms).
- **Memória:** O melhor foi Clock (1.098 KB / ótimo: 59.695 KB). O pior foi LRU (78.446 KB / random: 1.149 KB).
- **Page Faults:** O melhor foi FIFO (20 faltas / ótimo: 20). O pior foi FIFO (20 faltas / random: 20).

### Cenário: fases extragrande amplo f8 - 4 frames
- **Tempo:** O melhor foi Clock (32.876 ms / ótimo: 259.905 ms). O pior foi LFU (112.283 ms / random: 40.635 ms).
- **Memória:** O melhor foi LRU (62995.76 KB / ótimo: 131623.236 KB). O pior foi LFU (153798.058 KB / random: 73350.795 KB).
- **Page Faults:** O melhor foi FIFO (935159 faltas / ótimo: 759052). O pior foi LFU (977585 faltas / random: 935223).

### Cenário: fases extragrande amplo f8 - 8 frames
- **Tempo:** O melhor foi FIFO (37.118 ms / ótimo: 353.91 ms). O pior foi LFU (154.839 ms / random: 43.907 ms).
- **Memória:** O melhor foi Clock (60494.217 KB / ótimo: 144874.922 KB). O pior foi LFU (153412.514 KB / random: 69081.27 KB).
- **Page Faults:** O melhor foi Clock (870766 faltas / ótimo: 609861). O pior foi LFU (969520 faltas / random: 870550).

### Cenário: fases extragrande amplo f8 - 16 frames
- **Tempo:** O melhor foi FIFO (32.453 ms / ótimo: 461.285 ms). O pior foi LFU (226.532 ms / random: 40.383 ms).
- **Memória:** O melhor foi Clock (54949.615 KB / ótimo: 156865.25 KB). O pior foi LFU (152644.556 KB / random: 60557.376 KB).
- **Page Faults:** O melhor foi Clock (741317 faltas / ótimo: 424068). O pior foi LFU (953455 faltas / random: 741231).

### Cenário: fases extragrande amplo f8 - 32 frames
- **Tempo:** O melhor foi FIFO (23.107 ms / ótimo: 466.1 ms). O pior foi LFU (378.009 ms / random: 25.683 ms).
- **Memória:** O melhor foi Clock (43898.846 KB / ótimo: 141894.094 KB). O pior foi LFU (151101.44 KB / random: 43590.976 KB).
- **Page Faults:** O melhor foi Clock (483399 faltas / ótimo: 203965). O pior foi LFU (921185 faltas / random: 484507).

### Cenário: fases grande amplo f8 - 4 frames
- **Tempo:** O melhor foi Clock (3.362 ms / ótimo: 22.666 ms). O pior foi LFU (9.479 ms / random: 3.711 ms).
- **Memória:** O melhor foi LRU (6301.994 KB / ótimo: 13041.542 KB). O pior foi LFU (15368.665 KB / random: 7326.486 KB).
- **Page Faults:** O melhor foi Clock (93322 faltas / ótimo: 75927). O pior foi LFU (97701 faltas / random: 93385).

### Cenário: fases grande amplo f8 - 8 frames
- **Tempo:** O melhor foi FIFO (3.911 ms / ótimo: 28.959 ms). O pior foi LFU (14.718 ms / random: 3.92 ms).
- **Memória:** O melhor foi Clock (6046.465 KB / ótimo: 14372.738 KB). O pior foi LFU (15323.001 KB / random: 6903.253 KB).
- **Page Faults:** O melhor foi FIFO (87004 faltas / ótimo: 61089). O pior foi LFU (96893 faltas / random: 86961).

### Cenário: fases grande amplo f8 - 16 frames
- **Tempo:** O melhor foi FIFO (3.405 ms / ótimo: 36.724 ms). O pior foi LFU (20.253 ms / random: 3.928 ms).
- **Memória:** O melhor foi Clock (5494.377 KB / ótimo: 15595.635 KB). O pior foi LFU (15231.799 KB / random: 6057.542 KB).
- **Page Faults:** O melhor foi Clock (74123 faltas / ótimo: 42561). O pior foi LFU (95277 faltas / random: 74156).

### Cenário: fases grande amplo f8 - 32 frames
- **Tempo:** O melhor foi FIFO (2.316 ms / ótimo: 36.916 ms). O pior foi LFU (41.91 ms / random: 2.535 ms).
- **Memória:** O melhor foi Clock (4397.667 KB / ótimo: 14168.883 KB). O pior foi LFU (15050.276 KB / random: 4356.322 KB).
- **Page Faults:** O melhor foi LRU (48510 faltas / ótimo: 20625). O pior foi LFU (92061 faltas / random: 48425).

### Cenário: fases grande enorme f8 - 4 frames
- **Tempo:** O melhor foi Clock (3.384 ms / ótimo: 25.16 ms). O pior foi LFU (9.967 ms / random: 4.373 ms).
- **Memória:** O melhor foi LRU (6856.306 KB / ótimo: 16653.519 KB). O pior foi LFU (20423.012 KB / random: 8857.006 KB).
- **Page Faults:** O melhor foi Clock (98399 faltas / ótimo: 88375). O pior foi LFU (99422 faltas / random: 98401).

### Cenário: fases grande enorme f8 - 8 frames
- **Tempo:** O melhor foi FIFO (4.34 ms / ótimo: 34.034 ms). O pior foi LFU (14.071 ms / random: 5.073 ms).
- **Memória:** O melhor foi LRU (6879.565 KB / ótimo: 20465.938 KB). O pior foi LFU (25043.79 KB / random: 8738.167 KB).
- **Page Faults:** O melhor foi LRU (96810 faltas / ótimo: 80639). O pior foi LFU (99211 faltas / random: 96826).

### Cenário: fases grande enorme f8 - 16 frames
- **Tempo:** O melhor foi FIFO (3.912 ms / ótimo: 52.785 ms). O pior foi LFU (26.693 ms / random: 4.807 ms).
- **Memória:** O melhor foi LRU (6926.6 KB / ótimo: 26908.155 KB). O pior foi LFU (34231.006 KB / random: 8494.22 KB).
- **Page Faults:** O melhor foi LRU (93571 faltas / ótimo: 70422). O pior foi LFU (98806 faltas / random: 93581).

### Cenário: fases grande enorme f8 - 32 frames
- **Tempo:** O melhor foi FIFO (3.508 ms / ótimo: 78.235 ms). O pior foi LFU (41.376 ms / random: 4.365 ms).
- **Memória:** O melhor foi Clock (6930.748 KB / ótimo: 36318.446 KB). O pior foi LFU (47799.852 KB / random: 8019.85 KB).
- **Page Faults:** O melhor foi FIFO (87240 faltas / ótimo: 57120). O pior foi LFU (98016 faltas / random: 87267).

### Cenário: fases grande medio f4 - 4 frames
- **Tempo:** O melhor foi FIFO (3.184 ms / ótimo: 22.617 ms). O pior foi LFU (13.022 ms / random: 3.712 ms).
- **Memória:** O melhor foi Clock (4516.095 KB / ótimo: 8765.987 KB). O pior foi LFU (14759.4 KB / random: 4988.025 KB).
- **Page Faults:** O melhor foi LRU (91949 faltas / ótimo: 72946). O pior foi LFU (96516 faltas / random: 91971).

### Cenário: fases grande medio f4 - 8 frames
- **Tempo:** O melhor foi FIFO (3.569 ms / ótimo: 28.585 ms). O pior foi LFU (17.948 ms / random: 4.327 ms).
- **Memória:** O melhor foi Clock (4214.528 KB / ótimo: 8973.644 KB). O pior foi LFU (14599.401 KB / random: 4599.35 KB).
- **Page Faults:** O melhor foi LRU (83743 faltas / ótimo: 56489). O pior foi LFU (94572 faltas / random: 83944).

### Cenário: fases grande medio f4 - 16 frames
- **Tempo:** O melhor foi FIFO (3.287 ms / ótimo: 33.715 ms). O pior foi LFU (21.771 ms / random: 3.514 ms).
- **Memória:** O melhor foi Clock (3622.202 KB / ótimo: 8852.24 KB). O pior foi LFU (11439.345 KB / random: 3838.282 KB).
- **Page Faults:** O melhor foi Clock (67708 faltas / ótimo: 36424). O pior foi LFU (90526 faltas / random: 67985).

### Cenário: fases grande medio f4 - 32 frames
- **Tempo:** O melhor foi FIFO (1.737 ms / ótimo: 27.193 ms). O pior foi LFU (33.784 ms / random: 2.006 ms).
- **Memória:** O melhor foi Clock (2447.915 KB / ótimo: 7010.696 KB). O pior foi LFU (11031.344 KB / random: 2292.568 KB).
- **Page Faults:** O melhor foi Clock (35863 faltas / ótimo: 13518). O pior foi LFU (82478 faltas / random: 36004).

### Cenário: fases medio amplo f8 - 4 frames
- **Tempo:** O melhor foi Clock (0.295 ms / ótimo: 2.102 ms). O pior foi LFU (0.998 ms / random: 0.408 ms).
- **Memória:** O melhor foi LRU (629.409 KB / ótimo: 1318.803 KB). O pior foi LFU (1533.831 KB / random: 730.823 KB).
- **Page Faults:** O melhor foi FIFO (9349 faltas / ótimo: 7610). O pior foi LFU (9782 faltas / random: 9318).

### Cenário: fases medio amplo f8 - 8 frames
- **Tempo:** O melhor foi FIFO (0.356 ms / ótimo: 2.694 ms). O pior foi LFU (1.414 ms / random: 0.421 ms).
- **Memória:** O melhor foi Clock (604.518 KB / ótimo: 1455.635 KB). O pior foi LFU (1528.814 KB / random: 692.386 KB).
- **Page Faults:** O melhor foi Clock (8707 faltas / ótimo: 6143). O pior foi LFU (9702 faltas / random: 8714).

### Cenário: fases medio amplo f8 - 16 frames
- **Tempo:** O melhor foi FIFO (0.31 ms / ótimo: 3.226 ms). O pior foi LFU (2.1 ms / random: 0.368 ms).
- **Memória:** O melhor foi Clock (549.245 KB / ótimo: 1594.78 KB). O pior foi LFU (1519.245 KB / random: 608.237 KB).
- **Page Faults:** O melhor foi FIFO (7397 faltas / ótimo: 4351). O pior foi LFU (9544 faltas / random: 7434).

### Cenário: fases medio amplo f8 - 32 frames
- **Tempo:** O melhor foi FIFO (0.219 ms / ótimo: 3.058 ms). O pior foi LFU (3.78 ms / random: 0.25 ms).
- **Memória:** O melhor foi Clock (441.275 KB / ótimo: 1508.31 KB). O pior foi LFU (1500.619 KB / random: 447.088 KB).
- **Page Faults:** O melhor foi FIFO (4883 faltas / ótimo: 2263). O pior foi LFU (9237 faltas / random: 5002).

### Cenário: fases medio enorme f4 - 4 frames
- **Tempo:** O melhor foi Clock (0.323 ms / ótimo: 2.33 ms). O pior foi LFU (1.102 ms / random: 0.437 ms).
- **Memória:** O melhor foi LRU (685.018 KB / ótimo: 1795.36 KB). O pior foi LFU (1891.843 KB / random: 894.105 KB).
- **Page Faults:** O melhor foi LRU (9927 faltas / ótimo: 9188). O pior foi LFU (9970 faltas / random: 9934).

### Cenário: fases medio enorme f4 - 8 frames
- **Tempo:** O melhor foi Clock (0.418 ms / ótimo: 3.267 ms). O pior foi LFU (1.637 ms / random: 0.483 ms).
- **Memória:** O melhor foi LRU (686.503 KB / ótimo: 2238.585 KB). O pior foi LFU (2359.745 KB / random: 886.105 KB).
- **Page Faults:** O melhor foi LRU (9828 faltas / ótimo: 8630). O pior foi LFU (9947 faltas / random: 9827).

### Cenário: fases medio enorme f4 - 16 frames
- **Tempo:** O melhor foi FIFO (0.422 ms / ótimo: 4.761 ms). O pior foi LFU (2.65 ms / random: 0.494 ms).
- **Memória:** O melhor foi LRU (688.898 KB / ótimo: 3034.517 KB). O pior foi LFU (3425.721 KB / random: 876.253 KB).
- **Page Faults:** O melhor foi LRU (9678 faltas / ótimo: 7914). O pior foi LFU (9902 faltas / random: 9690).

### Cenário: fases medio enorme f4 - 32 frames
- **Tempo:** O melhor foi FIFO (0.38 ms / ótimo: 7.336 ms). O pior foi LFU (4.58 ms / random: 0.448 ms).
- **Memória:** O melhor foi LRU (693.808 KB / ótimo: 4390.471 KB). O pior foi LFU (5690.234 KB / random: 849.589 KB).
- **Page Faults:** O melhor foi LRU (9360 faltas / ótimo: 6975). O pior foi LFU (9829 faltas / random: 9340).

### Cenário: fases medio medio f4 - 4 frames
- **Tempo:** O melhor foi Clock (0.305 ms / ótimo: 2.097 ms). O pior foi LFU (1.024 ms / random: 0.384 ms).
- **Memória:** O melhor foi Clock (455.705 KB / ótimo: 918.842 KB). O pior foi LFU (1179.425 KB / random: 507.323 KB).
- **Page Faults:** O melhor foi Clock (9199 faltas / ótimo: 7328). O pior foi LFU (9667 faltas / random: 9255).

### Cenário: fases medio medio f4 - 8 frames
- **Tempo:** O melhor foi FIFO (0.359 ms / ótimo: 2.711 ms). O pior foi LFU (1.767 ms / random: 0.421 ms).
- **Memória:** O melhor foi Clock (426.049 KB / ótimo: 947.128 KB). O pior foi LFU (1462.074 KB / random: 466.339 KB).
- **Page Faults:** O melhor foi Clock (8402 faltas / ótimo: 5707). O pior foi LFU (9462 faltas / random: 8418).

### Cenário: fases medio medio f4 - 16 frames
- **Tempo:** O melhor foi FIFO (0.286 ms / ótimo: 2.988 ms). O pior foi LFU (2.209 ms / random: 0.342 ms).
- **Memória:** O melhor foi Clock (366.995 KB / ótimo: 936.114 KB). O pior foi LFU (1143.734 KB / random: 387.69 KB).
- **Page Faults:** O melhor foi Clock (6809 faltas / ótimo: 3703). O pior foi LFU (9091 faltas / random: 6810).

### Cenário: fases medio medio f4 - 32 frames
- **Tempo:** O melhor foi FIFO (0.177 ms / ótimo: 2.293 ms). O pior foi LFU (3.725 ms / random: 0.21 ms).
- **Memória:** O melhor foi Clock (251.416 KB / ótimo: 755.516 KB). O pior foi LFU (1097.838 KB / random: 240.072 KB).
- **Page Faults:** O melhor foi LRU (3678 faltas / ótimo: 1450). O pior foi LFU (8348 faltas / random: 3734).

### Cenário: fases medio restrito f2 - 4 frames
- **Tempo:** O melhor foi Clock (0.253 ms / ótimo: 1.938 ms). O pior foi LFU (0.86 ms / random: 0.308 ms).
- **Memória:** O melhor foi Clock (260.314 KB / ótimo: 496.513 KB). O pior foi LFU (798.58 KB / random: 261.776 KB).
- **Page Faults:** O melhor foi Clock (8323 faltas / ótimo: 6075). O pior foi LFU (9024 faltas / random: 8367).

### Cenário: fases medio restrito f2 - 8 frames
- **Tempo:** O melhor foi FIFO (0.241 ms / ótimo: 2.157 ms). O pior foi LFU (1.198 ms / random: 0.307 ms).
- **Memória:** O melhor foi Clock (209.893 KB / ótimo: 428.233 KB). O pior foi LFU (752.375 KB / random: 210.869 KB).
- **Page Faults:** O melhor foi FIFO (6695 faltas / ótimo: 3890). O pior foi LFU (8208 faltas / random: 6738).

### Cenário: fases medio restrito f2 - 16 frames
- **Tempo:** O melhor foi FIFO (0.164 ms / ótimo: 1.457 ms). O pior foi LFU (1.648 ms / random: 0.187 ms).
- **Memória:** O melhor foi Clock (111.04 KB / ótimo: 352.525 KB). O pior foi LFU (663.585 KB / random: 111.314 KB).
- **Page Faults:** O melhor foi Clock (3540 faltas / ótimo: 1463). O pior foi LFU (6642 faltas / random: 3542).

### Cenário: fases medio restrito f2 - 32 frames
- **Tempo:** O melhor foi FIFO (0.051 ms / ótimo: 0.225 ms). O pior foi LFU (1.766 ms / random: 0.056 ms).
- **Memória:** O melhor foi Clock (2.302 KB / ótimo: 309.189 KB). O pior foi LFU (495.309 KB / random: 3.228 KB).
- **Page Faults:** O melhor foi FIFO (50 faltas / ótimo: 50). O pior foi LFU (3643 faltas / random: 71).

### Cenário: fases pequeno medio f4 - 4 frames
- **Tempo:** O melhor foi Clock (0.059 ms / ótimo: 0.366 ms). O pior foi LFU (0.187 ms / random: 0.075 ms).
- **Memória:** O melhor foi Clock (91.141 KB / ótimo: 182.237 KB). O pior foi LFU (233.501 KB / random: 100.977 KB).
- **Page Faults:** O melhor foi Clock (1839 faltas / ótimo: 1469). O pior foi LFU (1936 faltas / random: 1842).

### Cenário: fases pequeno medio f4 - 8 frames
- **Tempo:** O melhor foi FIFO (0.061 ms / ótimo: 0.458 ms). O pior foi LFU (0.293 ms / random: 0.078 ms).
- **Memória:** O melhor foi Clock (85.407 KB / ótimo: 185.831 KB). O pior foi LFU (230.439 KB / random: 93.024 KB).
- **Page Faults:** O melhor foi LRU (1686 faltas / ótimo: 1149). O pior foi LFU (1887 faltas / random: 1678).

### Cenário: fases pequeno medio f4 - 16 frames
- **Tempo:** O melhor foi FIFO (0.053 ms / ótimo: 0.518 ms). O pior foi LFU (0.412 ms / random: 0.065 ms).
- **Memória:** O melhor foi Clock (73.258 KB / ótimo: 186.019 KB). O pior foi LFU (226.159 KB / random: 78.079 KB).
- **Page Faults:** O melhor foi FIFO (1347 faltas / ótimo: 786). O pior foi LFU (1814 faltas / random: 1369).

### Cenário: fases pequeno medio f4 - 32 frames
- **Tempo:** O melhor foi FIFO (0.036 ms / ótimo: 0.461 ms). O pior foi LFU (0.737 ms / random: 0.042 ms).
- **Memória:** O melhor foi Clock (51.149 KB / ótimo: 170.972 KB). O pior foi LFU (217.38 KB / random: 52.821 KB).
- **Page Faults:** O melhor foi FIFO (762 faltas / ótimo: 390). O pior foi LFU (1665 faltas / random: 828).

### Cenário: fases pequeno restrito f2 - 4 frames
- **Tempo:** O melhor foi Clock (0.047 ms / ótimo: 0.345 ms). O pior foi LFU (0.169 ms / random: 0.061 ms).
- **Memória:** O melhor foi Clock (52.563 KB / ótimo: 99.979 KB). O pior foi LFU (156.267 KB / random: 52.618 KB).
- **Page Faults:** O melhor foi LRU (1673 faltas / ótimo: 1214). O pior foi LFU (1793 faltas / random: 1674).

### Cenário: fases pequeno restrito f2 - 8 frames
- **Tempo:** O melhor foi Clock (0.051 ms / ótimo: 0.37 ms). O pior foi LFU (0.226 ms / random: 0.058 ms).
- **Memória:** O melhor foi Clock (42.703 KB / ótimo: 86.51 KB). O pior foi LFU (146.83 KB / random: 42.993 KB).
- **Page Faults:** O melhor foi FIFO (1354 faltas / ótimo: 783). O pior foi LFU (1642 faltas / random: 1366).

### Cenário: fases pequeno restrito f2 - 16 frames
- **Tempo:** O melhor foi FIFO (0.033 ms / ótimo: 0.251 ms). O pior foi LFU (0.336 ms / random: 0.037 ms).
- **Memória:** O melhor foi Clock (23.289 KB / ótimo: 72.025 KB). O pior foi LFU (126.737 KB / random: 23.438 KB).
- **Page Faults:** O melhor foi FIFO (732 faltas / ótimo: 315). O pior foi LFU (1316 faltas / random: 730).

### Cenário: fases pequeno restrito f2 - 32 frames
- **Tempo:** O melhor foi FIFO (0.011 ms / ótimo: 0.067 ms). O pior foi LFU (0.311 ms / random: 0.012 ms).
- **Memória:** O melhor foi Clock (2.32 KB / ótimo: 64.571 KB). O pior foi LFU (91.33 KB / random: 3.258 KB).
- **Page Faults:** O melhor foi FIFO (50 faltas / ótimo: 50). O pior foi LFU (741 faltas / random: 71).

### Cenário: localidade grande amplo ws40 - 4 frames
- **Tempo:** O melhor foi Clock (3.961 ms / ótimo: 28.775 ms). O pior foi LFU (11.442 ms / random: 4.961 ms).
- **Memória:** O melhor foi Clock (5367.98 KB / ótimo: 11234.575 KB). O pior foi LFU (17658.87 KB / random: 6113.776 KB).
- **Page Faults:** O melhor foi LFU (98473 faltas / ótimo: 89462). O pior foi FIFO (98708 faltas / random: 98655).

### Cenário: localidade grande amplo ws40 - 8 frames
- **Tempo:** O melhor foi FIFO (4.433 ms / ótimo: 43.753 ms). O pior foi LFU (15.263 ms / random: 5.604 ms).
- **Memória:** O melhor foi Clock (5318.815 KB / ótimo: 12778.711 KB). O pior foi LFU (17502.61 KB / random: 6050.905 KB).
- **Page Faults:** O melhor foi LFU (96869 faltas / ótimo: 82378). O pior foi FIFO (97399 faltas / random: 97399).

### Cenário: localidade grande amplo ws40 - 16 frames
- **Tempo:** O melhor foi FIFO (4.127 ms / ótimo: 65.784 ms). O pior foi LFU (25.701 ms / random: 5.597 ms).
- **Memória:** O melhor foi Clock (5221.535 KB / ótimo: 15512.353 KB). O pior foi LFU (21534.89 KB / random: 5925.069 KB).
- **Page Faults:** O melhor foi LFU (93614 faltas / ótimo: 73133). O pior foi FIFO (94795 faltas / random: 94810).

### Cenário: localidade grande amplo ws40 - 32 frames
- **Tempo:** O melhor foi FIFO (4.279 ms / ótimo: 107.133 ms). O pior foi LFU (39.181 ms / random: 5.249 ms).
- **Memória:** O melhor foi Clock (5023.805 KB / ótimo: 19888.222 KB). O pior foi LFU (28801.009 KB / random: 5676.403 KB).
- **Page Faults:** O melhor foi LFU (87576 faltas / ótimo: 61055). O pior foi FIFO (89541 faltas / random: 89788).

### Cenário: localidade grande enorme ws10 - 4 frames
- **Tempo:** O melhor foi Clock (3.951 ms / ótimo: 29.127 ms). O pior foi LFU (11.242 ms / random: 4.94 ms).
- **Memória:** O melhor foi Clock (5222.058 KB / ótimo: 10878.217 KB). O pior foi LFU (17359.021 KB / random: 5921.744 KB).
- **Page Faults:** O melhor foi LFU (98359 faltas / ótimo: 89057). O pior foi LRU (98633 faltas / random: 98629).

### Cenário: localidade grande enorme ws10 - 8 frames
- **Tempo:** O melhor foi LRU (4.71 ms / ótimo: 43.094 ms). O pior foi LFU (14.863 ms / random: 5.61 ms).
- **Memória:** O melhor foi Clock (5169.878 KB / ótimo: 12231.627 KB). O pior foi LFU (18683.202 KB / random: 5851.436 KB).
- **Page Faults:** O melhor foi LFU (96576 faltas / ótimo: 81740). O pior foi Clock (97221 faltas / random: 97195).

### Cenário: localidade grande enorme ws10 - 16 frames
- **Tempo:** O melhor foi FIFO (4.125 ms / ótimo: 64.962 ms). O pior foi LFU (25.289 ms / random: 5.419 ms).
- **Memória:** O melhor foi Clock (5066.9 KB / ótimo: 14637.391 KB). O pior foi LFU (21181.95 KB / random: 5712.396 KB).
- **Page Faults:** O melhor foi LFU (93160 faltas / ótimo: 72115). O pior foi FIFO (94458 faltas / random: 94356).

### Cenário: localidade grande enorme ws10 - 32 frames
- **Tempo:** O melhor foi FIFO (4.029 ms / ótimo: 103.959 ms). O pior foi LFU (36.431 ms / random: 5.117 ms).
- **Memória:** O melhor foi Clock (4857.006 KB / ótimo: 18455.113 KB). O pior foi LFU (28195.444 KB / random: 5447.636 KB).
- **Page Faults:** O melhor foi LFU (86324 faltas / ótimo: 59630). O pior foi FIFO (88812 faltas / random: 88861).

### Cenário: localidade grande medio frequente70 - 4 frames
- **Tempo:** O melhor foi FIFO (3.369 ms / ótimo: 26.071 ms). O pior foi LFU (13.332 ms / random: 3.864 ms).
- **Memória:** O melhor foi Clock (3601.915 KB / ótimo: 6514.956 KB). O pior foi LFU (12457.371 KB / random: 3811.815 KB).
- **Page Faults:** O melhor foi LFU (93509 faltas / ótimo: 78748). O pior foi FIFO (94926 faltas / random: 94949).

### Cenário: localidade grande medio frequente70 - 8 frames
- **Tempo:** O melhor foi FIFO (3.676 ms / ótimo: 36.239 ms). O pior foi LFU (16.702 ms / random: 4.464 ms).
- **Memória:** O melhor foi Clock (3440.826 KB / ótimo: 6206.343 KB). O pior foi LFU (11905.549 KB / random: 3654.1 KB).
- **Page Faults:** O melhor foi LFU (86530 faltas / ótimo: 65739). O pior foi FIFO (89856 faltas / random: 90056).

### Cenário: localidade grande medio frequente70 - 16 frames
- **Tempo:** O melhor foi FIFO (3.179 ms / ótimo: 49.781 ms). O pior foi LFU (18.339 ms / random: 4.027 ms).
- **Memória:** O melhor foi Clock (3145.833 KB / ótimo: 5909.795 KB). O pior foi LFU (8537.201 KB / random: 3353.308 KB).
- **Page Faults:** O melhor foi LFU (72623 faltas / ótimo: 49822). O pior foi FIFO (80802 faltas / random: 80854).

### Cenário: localidade grande medio frequente70 - 32 frames
- **Tempo:** O melhor foi FIFO (3.091 ms / ótimo: 62.566 ms). O pior foi LFU (20.964 ms / random: 3.474 ms).
- **Memória:** O melhor foi Clock (2600.26 KB / ótimo: 5811.017 KB). O pior foi LFU (7222.289 KB / random: 2810.484 KB).
- **Page Faults:** O melhor foi LFU (45007 faltas / ótimo: 31882). O pior foi FIFO (64729 faltas / random: 64540).

### Cenário: localidade grande restrito frequente90 - 4 frames
- **Tempo:** O melhor foi FIFO (2.128 ms / ótimo: 16.223 ms). O pior foi LFU (7.139 ms / random: 2.703 ms).
- **Memória:** O melhor foi Clock (2135.791 KB / ótimo: 4188.96 KB). O pior foi LFU (6833.478 KB / random: 2142.065 KB).
- **Page Faults:** O melhor foi LFU (65220 faltas / ótimo: 43894). O pior foi FIFO (68466 faltas / random: 68537).

### Cenário: localidade grande restrito frequente90 - 8 frames
- **Tempo:** O melhor foi FIFO (1.863 ms / ótimo: 13.394 ms). O pior foi LFU (6.182 ms / random: 2.108 ms).
- **Memória:** O melhor foi Clock (1255.012 KB / ótimo: 3992.067 KB). O pior foi LFU (5204.237 KB / random: 1306.428 KB).
- **Page Faults:** O melhor foi LFU (30284 faltas / ótimo: 18801). O pior foi FIFO (41937 faltas / random: 41798).

### Cenário: localidade grande restrito frequente90 - 16 frames
- **Tempo:** O melhor foi FIFO (1.185 ms / ótimo: 8.595 ms). O pior foi LFU (4.187 ms / random: 1.331 ms).
- **Memória:** O melhor foi Clock (345.332 KB / ótimo: 3002.628 KB). O pior foi LFU (4267.474 KB / random: 546.993 KB).
- **Page Faults:** O melhor foi LFU (8473 faltas / ótimo: 5930). O pior foi FIFO (17500 faltas / random: 17485).

### Cenário: localidade grande restrito frequente90 - 32 frames
- **Tempo:** O melhor foi FIFO (0.693 ms / ótimo: 6.42 ms). O pior foi LFU (4.318 ms / random: 0.821 ms).
- **Memória:** O melhor foi Clock (141.873 KB / ótimo: 2877.442 KB). O pior foi LFU (4049.818 KB / random: 199.638 KB).
- **Page Faults:** O melhor foi LFU (4491 faltas / ótimo: 1916). O pior foi FIFO (6217 faltas / random: 6355).

### Cenário: localidade medio amplo ws40 - 4 frames
- **Tempo:** O melhor foi Clock (0.388 ms / ótimo: 2.613 ms). O pior foi LFU (1.107 ms / random: 0.481 ms).
- **Memória:** O melhor foi Clock (538.94 KB / ótimo: 1136.635 KB). O pior foi LFU (1458.179 KB / random: 615.449 KB).
- **Page Faults:** O melhor foi LRU (9865 faltas / ótimo: 8979). O pior foi FIFO (9866 faltas / random: 9880).

### Cenário: localidade medio amplo ws40 - 8 frames
- **Tempo:** O melhor foi LRU (0.463 ms / ótimo: 3.787 ms). O pior foi LFU (1.531 ms / random: 0.549 ms).
- **Memória:** O melhor foi Clock (534.659 KB / ótimo: 1284.44 KB). O pior foi LFU (1599.565 KB / random: 608.168 KB).
- **Page Faults:** O melhor foi LFU (9713 faltas / ótimo: 8287). O pior foi FIFO (9750 faltas / random: 9739).

### Cenário: localidade medio amplo ws40 - 16 frames
- **Tempo:** O melhor foi FIFO (0.444 ms / ótimo: 5.597 ms). O pior foi LFU (2.539 ms / random: 0.546 ms).
- **Memória:** O melhor foi Clock (525.933 KB / ótimo: 1595.905 KB). O pior foi LFU (1874.767 KB / random: 596.504 KB).
- **Page Faults:** O melhor foi LFU (9425 faltas / ótimo: 7382). O pior foi FIFO (9514 faltas / random: 9503).

### Cenário: localidade medio amplo ws40 - 32 frames
- **Tempo:** O melhor foi FIFO (0.444 ms / ótimo: 8.311 ms). O pior foi LFU (4.052 ms / random: 0.523 ms).
- **Memória:** O melhor foi Clock (507.058 KB / ótimo: 2065.486 KB). O pior foi LFU (3005.887 KB / random: 571.183 KB).
- **Page Faults:** O melhor foi LFU (8806 faltas / ótimo: 6184). O pior foi FIFO (9001 faltas / random: 8986).

### Cenário: localidade medio enorme ws10 - 4 frames
- **Tempo:** O melhor foi Clock (0.388 ms / ótimo: 2.624 ms). O pior foi LFU (1.13 ms / random: 0.471 ms).
- **Memória:** O melhor foi Clock (522.018 KB / ótimo: 1198.291 KB). O pior foi LFU (1430.535 KB / random: 592.355 KB).
- **Page Faults:** O melhor foi FIFO (9860 faltas / ótimo: 8932). O pior foi LFU (9866 faltas / random: 9863).

### Cenário: localidade medio enorme ws10 - 8 frames
- **Tempo:** O melhor foi LRU (0.462 ms / ótimo: 3.745 ms). O pior foi LFU (1.636 ms / random: 0.535 ms).
- **Memória:** O melhor foi Clock (517.456 KB / ótimo: 1337.642 KB). O pior foi LFU (1568.331 KB / random: 585.449 KB).
- **Page Faults:** O melhor foi LFU (9711 faltas / ótimo: 8199). O pior foi FIFO (9737 faltas / random: 9733).

### Cenário: localidade medio enorme ws10 - 16 frames
- **Tempo:** O melhor foi FIFO (0.443 ms / ótimo: 5.426 ms). O pior foi LFU (2.505 ms / random: 0.541 ms).
- **Memória:** O melhor foi Clock (507.277 KB / ótimo: 1568.529 KB). O pior foi LFU (1831.997 KB / random: 570.832 KB).
- **Page Faults:** O melhor foi LFU (9386 faltas / ótimo: 7240). O pior foi LRU (9463 faltas / random: 9428).

### Cenário: localidade medio enorme ws10 - 32 frames
- **Tempo:** O melhor foi FIFO (0.423 ms / ótimo: 8.22 ms). O pior foi LFU (3.986 ms / random: 0.498 ms).
- **Memória:** O melhor foi Clock (487.402 KB / ótimo: 1935.798 KB). O pior foi LFU (2417.089 KB / random: 547.167 KB).
- **Page Faults:** O melhor foi LFU (8696 faltas / ótimo: 5997). O pior foi FIFO (8927 faltas / random: 8904).

### Cenário: localidade medio medio frequente70 - 4 frames
- **Tempo:** O melhor foi Clock (0.314 ms / ótimo: 2.375 ms). O pior foi LFU (0.99 ms / random: 0.416 ms).
- **Memória:** O melhor foi Clock (361.783 KB / ótimo: 679.571 KB). O pior foi LFU (951.983 KB / random: 383.682 KB).
- **Page Faults:** O melhor foi LFU (9346 faltas / ótimo: 7912). O pior foi LRU (9515 faltas / random: 9539).

### Cenário: localidade medio medio frequente70 - 8 frames
- **Tempo:** O melhor foi FIFO (0.365 ms / ótimo: 3.302 ms). O pior foi LFU (1.312 ms / random: 0.438 ms).
- **Memória:** O melhor foi Clock (346.081 KB / ótimo: 647.671 KB). O pior foi LFU (911.439 KB / random: 367.48 KB).
- **Page Faults:** O melhor foi LFU (8651 faltas / ótimo: 6617). O pior foi FIFO (9030 faltas / random: 9039).

### Cenário: localidade medio medio frequente70 - 16 frames
- **Tempo:** O melhor foi FIFO (0.353 ms / ótimo: 4.093 ms). O pior foi LFU (1.952 ms / random: 0.414 ms).
- **Memória:** O melhor foi Clock (315.807 KB / ótimo: 622.332 KB). O pior foi LFU (832.373 KB / random: 339.065 KB).
- **Page Faults:** O melhor foi LFU (7269 faltas / ótimo: 5038). O pior foi FIFO (8077 faltas / random: 8166).

### Cenário: localidade medio medio frequente70 - 32 frames
- **Tempo:** O melhor foi FIFO (0.305 ms / ótimo: 5.107 ms). O pior foi LFU (1.848 ms / random: 0.344 ms).
- **Memória:** O melhor foi Clock (263.323 KB / ótimo: 616.589 KB). O pior foi LFU (675.317 KB / random: 282.674 KB).
- **Page Faults:** O melhor foi LFU (4526 faltas / ótimo: 3252). O pior foi FIFO (6514 faltas / random: 6461).

### Cenário: localidade medio restrito frequente90 - 4 frames
- **Tempo:** O melhor foi FIFO (0.222 ms / ótimo: 1.525 ms). O pior foi LFU (0.726 ms / random: 0.287 ms).
- **Memória:** O melhor foi Clock (213.107 KB / ótimo: 456.479 KB). O pior foi LFU (675.95 KB / random: 215.057 KB).
- **Page Faults:** O melhor foi LFU (6524 faltas / ótimo: 4418). O pior foi Clock (6813 faltas / random: 6872).

### Cenário: localidade medio restrito frequente90 - 8 frames
- **Tempo:** O melhor foi FIFO (0.189 ms / ótimo: 1.183 ms). O pior foi LFU (0.632 ms / random: 0.214 ms).
- **Memória:** O melhor foi Clock (126.548 KB / ótimo: 377.758 KB). O pior foi LFU (504.918 KB / random: 132.931 KB).
- **Page Faults:** O melhor foi LFU (3007 faltas / ótimo: 1899). O pior foi FIFO (4240 faltas / random: 4244).

### Cenário: localidade medio restrito frequente90 - 16 frames
- **Tempo:** O melhor foi FIFO (0.112 ms / ótimo: 0.76 ms). O pior foi LFU (0.433 ms / random: 0.135 ms).
- **Memória:** O melhor foi Clock (35.884 KB / ótimo: 347.458 KB). O pior foi LFU (406.604 KB / random: 57.157 KB).
- **Page Faults:** O melhor foi LFU (860 faltas / ótimo: 622). O pior foi FIFO (1768 faltas / random: 1809).

### Cenário: localidade medio restrito frequente90 - 32 frames
- **Tempo:** O melhor foi FIFO (0.069 ms / ótimo: 0.528 ms). O pior foi LFU (0.448 ms / random: 0.071 ms).
- **Memória:** O melhor foi Clock (15.977 KB / ótimo: 328.91 KB). O pior foi LRU (391.225 KB / random: 20.946 KB).
- **Page Faults:** O melhor foi LFU (466 faltas / ótimo: 226). O pior foi FIFO (650 faltas / random: 637).

### Cenário: localidade pequeno medio frequente70 - 4 frames
- **Tempo:** O melhor foi Clock (0.058 ms / ótimo: 0.417 ms). O pior foi LFU (0.191 ms / random: 0.08 ms).
- **Memória:** O melhor foi Clock (71.813 KB / ótimo: 142.745 KB). O pior foi LFU (187.228 KB / random: 75.696 KB).
- **Page Faults:** O melhor foi LFU (1884 faltas / ótimo: 1555). O pior foi FIFO (1893 faltas / random: 1883).

### Cenário: localidade pequeno medio frequente70 - 8 frames
- **Tempo:** O melhor foi FIFO (0.065 ms / ótimo: 0.561 ms). O pior foi LFU (0.265 ms / random: 0.083 ms).
- **Memória:** O melhor foi Clock (68.125 KB / ótimo: 136.715 KB). O pior foi LFU (180.705 KB / random: 72.102 KB).
- **Page Faults:** O melhor foi LRU (1772 faltas / ótimo: 1300). O pior foi FIFO (1777 faltas / random: 1773).

### Cenário: localidade pequeno medio frequente70 - 16 frames
- **Tempo:** O melhor foi FIFO (0.059 ms / ótimo: 0.678 ms). O pior foi LFU (0.381 ms / random: 0.074 ms).
- **Memória:** O melhor foi Clock (62.243 KB / ótimo: 131.778 KB). O pior foi LFU (165.299 KB / random: 65.969 KB).
- **Page Faults:** O melhor foi LFU (1511 faltas / ótimo: 997). O pior foi FIFO (1591 faltas / random: 1577).

### Cenário: localidade pequeno medio frequente70 - 32 frames
- **Tempo:** O melhor foi FIFO (0.052 ms / ótimo: 0.837 ms). O pior foi LFU (0.448 ms / random: 0.058 ms).
- **Memória:** O melhor foi Clock (52.227 KB / ótimo: 156.388 KB). O pior foi LFU (135.003 KB / random: 56.305 KB).
- **Page Faults:** O melhor foi LFU (984 faltas / ótimo: 669). O pior foi FIFO (1282 faltas / random: 1280).

### Cenário: localidade pequeno restrito frequente90 - 4 frames
- **Tempo:** O melhor foi Clock (0.044 ms / ótimo: 0.269 ms). O pior foi LFU (0.146 ms / random: 0.055 ms).
- **Memória:** O melhor foi Clock (42.313 KB / ótimo: 90.924 KB). O pior foi LFU (128.649 KB / random: 43.305 KB).
- **Page Faults:** O melhor foi LFU (1316 faltas / ótimo: 887). O pior foi FIFO (1353 faltas / random: 1376).

### Cenário: localidade pequeno restrito frequente90 - 8 frames
- **Tempo:** O melhor foi FIFO (0.037 ms / ótimo: 0.213 ms). O pior foi LFU (0.131 ms / random: 0.041 ms).
- **Memória:** O melhor foi Clock (26.578 KB / ótimo: 75.798 KB). O pior foi LFU (89.852 KB / random: 27.43 KB).
- **Page Faults:** O melhor foi LFU (644 faltas / ótimo: 403). O pior foi FIFO (867 faltas / random: 868).

### Cenário: localidade pequeno restrito frequente90 - 16 frames
- **Tempo:** O melhor foi FIFO (0.024 ms / ótimo: 0.128 ms). O pior foi LFU (0.088 ms / random: 0.024 ms).
- **Memória:** O melhor foi Clock (8.633 KB / ótimo: 69.891 KB). O pior foi LRU (78.469 KB / random: 11.656 KB).
- **Page Faults:** O melhor foi LFU (197 faltas / ótimo: 145). O pior foi FIFO (393 faltas / random: 353).

### Cenário: localidade pequeno restrito frequente90 - 32 frames
- **Tempo:** O melhor foi FIFO (0.014 ms / ótimo: 0.086 ms). O pior foi LFU (0.082 ms / random: 0.015 ms).
- **Memória:** O melhor foi Clock (4.32 KB / ótimo: 67.047 KB). O pior foi LRU (78.735 KB / random: 5.445 KB).
- **Page Faults:** O melhor foi LRU (109 faltas / ótimo: 71). O pior foi FIFO (151 faltas / random: 141).

### Cenário: sequencial extragrande amplo - 4 frames
- **Tempo:** O melhor foi Clock (26.936 ms / ótimo: 215.343 ms). O pior foi LFU (89.586 ms / random: 38.243 ms).
- **Memória:** O melhor foi LRU (62312.903 KB / ótimo: 155658.848 KB). O pior foi LFU (190560.126 KB / random: 77750.495 KB).
- **Page Faults:** O melhor foi FIFO (1000000 faltas / ótimo: 993988). O pior foi FIFO (1000000 faltas / random: 1000000).

### Cenário: sequencial extragrande amplo - 8 frames
- **Tempo:** O melhor foi Clock (27.355 ms / ótimo: 350.091 ms). O pior foi LFU (137.828 ms / random: 44.151 ms).
- **Memória:** O melhor foi LRU (62312.914 KB / ótimo: 200627.438 KB). O pior foi LFU (237059.863 KB / random: 77750.473 KB).
- **Page Faults:** O melhor foi FIFO (1000000 faltas / ótimo: 985976). O pior foi FIFO (1000000 faltas / random: 1000000).

### Cenário: sequencial extragrande amplo - 16 frames
- **Tempo:** O melhor foi Clock (27.381 ms / ótimo: 635.465 ms). O pior foi LFU (245.758 ms / random: 42.586 ms).
- **Memória:** O melhor foi LRU (62313.046 KB / ótimo: 288313.906 KB). O pior foi LFU (330058.872 KB / random: 77750.656 KB).
- **Page Faults:** O melhor foi FIFO (1000000 faltas / ótimo: 969952). O pior foi FIFO (1000000 faltas / random: 1000000).

### Cenário: sequencial extragrande amplo - 32 frames
- **Tempo:** O melhor foi Clock (26.829 ms / ótimo: 1383.503 ms). O pior foi LFU (437.915 ms / random: 42.8 ms).
- **Memória:** O melhor foi LRU (62313.316 KB / ótimo: 454749.594 KB). O pior foi LFU (516053.646 KB / random: 77750.825 KB).
- **Page Faults:** O melhor foi FIFO (1000000 faltas / ótimo: 937904). O pior foi FIFO (1000000 faltas / random: 1000000).

### Cenário: sequencial grande amplo - 4 frames
- **Tempo:** O melhor foi Clock (2.824 ms / ótimo: 18.564 ms). O pior foi LFU (8.991 ms / random: 3.695 ms).
- **Memória:** O melhor foi LRU (6231.452 KB / ótimo: 16584.093 KB). O pior foi LFU (19053.357 KB / random: 7775.267 KB).
- **Page Faults:** O melhor foi FIFO (100000 faltas / ótimo: 99400). O pior foi FIFO (100000 faltas / random: 100000).

### Cenário: sequencial grande amplo - 8 frames
- **Tempo:** O melhor foi LRU (3.088 ms / ótimo: 28.646 ms). O pior foi LFU (14.037 ms / random: 3.667 ms).
- **Memória:** O melhor foi LRU (6231.451 KB / ótimo: 22478.128 KB). O pior foi LFU (23702.86 KB / random: 7775.126 KB).
- **Page Faults:** O melhor foi FIFO (100000 faltas / ótimo: 98600). O pior foi FIFO (100000 faltas / random: 100000).

### Cenário: sequencial grande amplo - 16 frames
- **Tempo:** O melhor foi LRU (2.814 ms / ótimo: 53.894 ms). O pior foi LFU (24.205 ms / random: 4.227 ms).
- **Memória:** O melhor foi LRU (6231.582 KB / ótimo: 33612.371 KB). O pior foi LFU (33001.396 KB / random: 7775.404 KB).
- **Page Faults:** O melhor foi FIFO (100000 faltas / ótimo: 97000). O pior foi FIFO (100000 faltas / random: 100000).

### Cenário: sequencial grande amplo - 32 frames
- **Tempo:** O melhor foi Clock (2.716 ms / ótimo: 100.791 ms). O pior foi LFU (44.226 ms / random: 4.179 ms).
- **Memória:** O melhor foi LRU (6231.847 KB / ótimo: 53348.819 KB). O pior foi LFU (51595.435 KB / random: 7775.528 KB).
- **Page Faults:** O melhor foi FIFO (100000 faltas / ótimo: 93800). O pior foi FIFO (100000 faltas / random: 100000).

### Cenário: sequencial grande medio - 4 frames
- **Tempo:** O melhor foi Clock (2.408 ms / ótimo: 19.321 ms). O pior foi LFU (8.893 ms / random: 3.309 ms).
- **Memória:** O melhor foi Clock (3125.215 KB / ótimo: 6063.505 KB). O pior foi LFU (10153.556 KB / random: 3125.288 KB).
- **Page Faults:** O melhor foi FIFO (100000 faltas / ótimo: 96970). O pior foi FIFO (100000 faltas / random: 100000).

### Cenário: sequencial grande medio - 8 frames
- **Tempo:** O melhor foi FIFO (2.435 ms / ótimo: 30.275 ms). O pior foi LFU (12.907 ms / random: 3.358 ms).
- **Memória:** O melhor foi Clock (3125.232 KB / ótimo: 5937.325 KB). O pior foi LFU (8591.165 KB / random: 3125.249 KB).
- **Page Faults:** O melhor foi FIFO (100000 faltas / ótimo: 92930). O pior foi FIFO (100000 faltas / random: 100000).

### Cenário: sequencial grande medio - 16 frames
- **Tempo:** O melhor foi Clock (2.161 ms / ótimo: 50.891 ms). O pior foi LFU (23.262 ms / random: 3.326 ms).
- **Memória:** O melhor foi Clock (3125.39 KB / ótimo: 5685.291 KB). O pior foi LFU (8591.514 KB / random: 3120.382 KB).
- **Page Faults:** O melhor foi FIFO (100000 faltas / ótimo: 84856). O pior foi FIFO (100000 faltas / random: 99834).

### Cenário: sequencial grande medio - 32 frames
- **Tempo:** O melhor foi Clock (2.376 ms / ótimo: 78.304 ms). O pior foi LFU (40.366 ms / random: 3.754 ms).
- **Memória:** O melhor foi Clock (3125.735 KB / ótimo: 5181.235 KB). O pior foi LFU (8592.156 KB / random: 2968.971 KB).
- **Page Faults:** O melhor foi FIFO (100000 faltas / ótimo: 68712). O pior foi FIFO (100000 faltas / random: 94973).

### Cenário: sequencial medio amplo - 4 frames
- **Tempo:** O melhor foi Clock (0.23 ms / ótimo: 1.554 ms). O pior foi LFU (0.92 ms / random: 0.373 ms).
- **Memória:** O melhor foi LRU (623.33 KB / ótimo: 1615.542 KB). O pior foi LFU (1902.678 KB / random: 777.745 KB).
- **Page Faults:** O melhor foi FIFO (10000 faltas / ótimo: 9940). O pior foi FIFO (10000 faltas / random: 10000).

### Cenário: sequencial medio amplo - 8 frames
- **Tempo:** O melhor foi Clock (0.243 ms / ótimo: 2.48 ms). O pior foi LFU (1.38 ms / random: 0.394 ms).
- **Memória:** O melhor foi LRU (623.33 KB / ótimo: 2053.267 KB). O pior foi LFU (2367.15 KB / random: 777.682 KB).
- **Page Faults:** O melhor foi FIFO (10000 faltas / ótimo: 9860). O pior foi FIFO (10000 faltas / random: 10000).

### Cenário: sequencial medio amplo - 16 frames
- **Tempo:** O melhor foi Clock (0.241 ms / ótimo: 4.262 ms). O pior foi LFU (2.421 ms / random: 0.401 ms).
- **Memória:** O melhor foi LRU (623.471 KB / ótimo: 2544.857 KB). O pior foi LFU (3295.626 KB / random: 777.878 KB).
- **Page Faults:** O melhor foi FIFO (10000 faltas / ótimo: 9700). O pior foi FIFO (10000 faltas / random: 10000).

### Cenário: sequencial medio amplo - 32 frames
- **Tempo:** O melhor foi Clock (0.245 ms / ótimo: 7.856 ms). O pior foi LFU (4.323 ms / random: 0.404 ms).
- **Memória:** O melhor foi LRU (623.736 KB / ótimo: 2593.287 KB). O pior foi LFU (5149.545 KB / random: 778.042 KB).
- **Page Faults:** O melhor foi FIFO (10000 faltas / ótimo: 9392). O pior foi FIFO (10000 faltas / random: 10000).

### Cenário: sequencial medio medio - 4 frames
- **Tempo:** O melhor foi Clock (0.202 ms / ótimo: 1.727 ms). O pior foi LFU (0.788 ms / random: 0.363 ms).
- **Memória:** O melhor foi Clock (312.72 KB / ótimo: 599.48 KB). O pior foi LFU (856.708 KB / random: 312.807 KB).
- **Page Faults:** O melhor foi FIFO (10000 faltas / ótimo: 9700). O pior foi FIFO (10000 faltas / random: 10000).

### Cenário: sequencial medio medio - 8 frames
- **Tempo:** O melhor foi Clock (0.222 ms / ótimo: 2.771 ms). O pior foi LFU (1.254 ms / random: 0.398 ms).
- **Memória:** O melhor foi Clock (312.736 KB / ótimo: 586.987 KB). O pior foi LFU (856.712 KB / random: 312.807 KB).
- **Page Faults:** O melhor foi FIFO (10000 faltas / ótimo: 9300). O pior foi FIFO (10000 faltas / random: 10000).

### Cenário: sequencial medio medio - 16 frames
- **Tempo:** O melhor foi Clock (0.224 ms / ótimo: 4.53 ms). O pior foi LFU (2.236 ms / random: 0.39 ms).
- **Memória:** O melhor foi Clock (312.896 KB / ótimo: 562.14 KB). O pior foi LFU (857.0 KB / random: 312.596 KB).
- **Page Faults:** O melhor foi FIFO (10000 faltas / ótimo: 8500). O pior foi FIFO (10000 faltas / random: 9983).

### Cenário: sequencial medio medio - 32 frames
- **Tempo:** O melhor foi Clock (0.215 ms / ótimo: 6.661 ms). O pior foi LFU (3.953 ms / random: 0.365 ms).
- **Memória:** O melhor foi Clock (313.259 KB / ótimo: 512.42 KB). O pior foi LFU (857.542 KB / random: 296.979 KB).
- **Page Faults:** O melhor foi FIFO (10000 faltas / ótimo: 6900). O pior foi FIFO (10000 faltas / random: 9470).

### Cenário: sequencial minimo restrito - 4 frames
- **Tempo:** O melhor foi Clock (0.011 ms / ótimo: 0.073 ms). O pior foi LFU (0.037 ms / random: 0.019 ms).
- **Memória:** O melhor foi Clock (15.844 KB / ótimo: 28.204 KB). O pior foi LFU (40.297 KB / random: 15.899 KB).
- **Page Faults:** O melhor foi FIFO (500 faltas / ótimo: 422). O pior foi FIFO (500 faltas / random: 499).

### Cenário: sequencial minimo restrito - 8 frames
- **Tempo:** O melhor foi Clock (0.012 ms / ótimo: 0.09 ms). O pior foi LFU (0.061 ms / random: 0.016 ms).
- **Memória:** O melhor foi Clock (15.84 KB / ótimo: 25.016 KB). O pior foi LFU (40.297 KB / random: 14.555 KB).
- **Page Faults:** O melhor foi FIFO (500 faltas / ótimo: 320). O pior foi FIFO (500 faltas / random: 456).

### Cenário: sequencial minimo restrito - 16 frames
- **Tempo:** O melhor foi Clock (0.011 ms / ótimo: 0.056 ms). O pior foi LFU (0.107 ms / random: 0.009 ms).
- **Memória:** O melhor foi Clock (16.039 KB / ótimo: 18.907 KB). O pior foi LFU (40.579 KB / random: 7.0 KB).
- **Page Faults:** O melhor foi FIFO (500 faltas / ótimo: 120). O pior foi FIFO (500 faltas / random: 204).

### Cenário: sequencial minimo restrito - 32 frames
- **Tempo:** O melhor foi FIFO (0.003 ms / ótimo: 0.012 ms). O pior foi LFU (0.013 ms / random: 0.003 ms).
- **Memória:** O melhor foi Clock (1.117 KB / ótimo: 15.766 KB). O pior foi LRU (19.813 KB / random: 1.25 KB).
- **Page Faults:** O melhor foi FIFO (20 faltas / ótimo: 20). O pior foi FIFO (20 faltas / random: 20).

### Cenário: sequencial pequeno restrito - 4 frames
- **Tempo:** O melhor foi Clock (0.043 ms / ótimo: 0.333 ms). O pior foi LFU (0.141 ms / random: 0.075 ms).
- **Memória:** O melhor foi Clock (62.719 KB / ótimo: 110.33 KB). O pior foi LFU (169.204 KB / random: 62.68 KB).
- **Page Faults:** O melhor foi FIFO (2000 faltas / ótimo: 1685). O pior foi FIFO (2000 faltas / random: 1996).

### Cenário: sequencial pequeno restrito - 8 frames
- **Tempo:** O melhor foi Clock (0.046 ms / ótimo: 0.415 ms). O pior foi LFU (0.246 ms / random: 0.065 ms).
- **Memória:** O melhor foi Clock (62.735 KB / ótimo: 97.3 KB). O pior foi LFU (169.205 KB / random: 56.993 KB).
- **Page Faults:** O melhor foi FIFO (2000 faltas / ótimo: 1268). O pior foi FIFO (2000 faltas / random: 1814).

### Cenário: sequencial pequeno restrito - 16 frames
- **Tempo:** O melhor foi Clock (0.047 ms / ótimo: 0.261 ms). O pior foi LFU (0.437 ms / random: 0.038 ms).
- **Memória:** O melhor foi Clock (62.895 KB / ótimo: 71.439 KB). O pior foi LFU (169.487 KB / random: 24.907 KB).
- **Page Faults:** O melhor foi FIFO (2000 faltas / ótimo: 436). O pior foi FIFO (2000 faltas / random: 777).

### Cenário: sequencial pequeno restrito - 32 frames
- **Tempo:** O melhor foi FIFO (0.011 ms / ótimo: 0.048 ms). O pior foi LFU (0.054 ms / random: 0.01 ms).
- **Memória:** O melhor foi Clock (1.078 KB / ótimo: 58.383 KB). O pior foi LRU (78.428 KB / random: 1.149 KB).
- **Page Faults:** O melhor foi FIFO (20 faltas / ótimo: 20). O pior foi FIFO (20 faltas / random: 20).

