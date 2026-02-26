"""
generate_workloads.py
Gera todos os workloads de uma vez. Sempre produz os mesmos arquivos.
Para mudar a seed, edite a constante SEED abaixo.

Uso:
    python generate_workloads.py
    python generate_workloads.py --output data/workloads  # pasta customizada
"""

import argparse
import random
import os
import csv

# ─────────────────────────────────────────────
# Seed global — edite aqui para mudar
# ─────────────────────────────────────────────
SEED = 42

# ─────────────────────────────────────────────
# Configuração dos workloads a gerar
# ─────────────────────────────────────────────
WORKLOADS = [
    # (nome_arquivo,             tipo,          length,   universe,  kwargs extras)

    # ── RANDOM ──────────────────────────────────────────────────────────────────
    # universo pequeno (poucos páginas, muita repetição)
    ("random_xs_tight",          "random",         500,      20,  {}),
    ("random_sm_tight",          "random",       2_000,      20,  {}),
    ("random_md_tight",          "random",      10_000,      20,  {}),
    # universo médio
    ("random_xs_medium",         "random",         500,     100,  {}),
    ("random_sm_medium",         "random",       2_000,     100,  {}),
    ("random_md_medium",         "random",      10_000,     100,  {}),
    ("random_lg_medium",         "random",     100_000,     100,  {}),
    # universo grande (muitas páginas, menos repetição)
    ("random_sm_wide",           "random",       2_000,     500,  {}),
    ("random_md_wide",           "random",      10_000,     500,  {}),
    ("random_lg_wide",           "random",     100_000,     500,  {}),
    ("random_xl_wide",           "random",   1_000_000,     500,  {}),
    # universo enorme
    ("random_md_huge",           "random",      10_000,   2_000,  {}),
    ("random_lg_huge",           "random",     100_000,   2_000,  {}),

    # ── SEQUENTIAL ──────────────────────────────────────────────────────────────
    ("sequential_xs_tight",      "sequential",     500,      20,  {}),
    ("sequential_sm_tight",      "sequential",   2_000,      20,  {}),
    ("sequential_md_medium",     "sequential",  10_000,     100,  {}),
    ("sequential_lg_medium",     "sequential", 100_000,     100,  {}),
    ("sequential_md_wide",       "sequential",  10_000,     500,  {}),
    ("sequential_lg_wide",       "sequential", 100_000,     500,  {}),
    ("sequential_xl_wide",       "sequential",1_000_000,    500,  {}),

    # ── LOCALITY ────────────────────────────────────────────────────────────────
    # hot_prob alto = acesso muito concentrado no working set
    ("locality_sm_tight_hot90",  "locality",     2_000,      50,  {"working_set_ratio": 0.2, "hot_prob": 0.9}),
    ("locality_md_tight_hot90",  "locality",    10_000,      50,  {"working_set_ratio": 0.2, "hot_prob": 0.9}),
    ("locality_lg_tight_hot90",  "locality",   100_000,      50,  {"working_set_ratio": 0.2, "hot_prob": 0.9}),
    # hot_prob médio = acesso moderado
    ("locality_sm_medium_hot70", "locality",     2_000,     200,  {"working_set_ratio": 0.2, "hot_prob": 0.7}),
    ("locality_md_medium_hot70", "locality",    10_000,     200,  {"working_set_ratio": 0.2, "hot_prob": 0.7}),
    ("locality_lg_medium_hot70", "locality",   100_000,     200,  {"working_set_ratio": 0.2, "hot_prob": 0.7}),
    # working set maior
    ("locality_md_wide_ws40",    "locality",    10_000,     500,  {"working_set_ratio": 0.4, "hot_prob": 0.8}),
    ("locality_lg_wide_ws40",    "locality",   100_000,     500,  {"working_set_ratio": 0.4, "hot_prob": 0.8}),
    # working set pequeno + universo enorme = pressão máxima
    ("locality_md_huge_ws10",    "locality",    10_000,   2_000,  {"working_set_ratio": 0.1, "hot_prob": 0.85}),
    ("locality_lg_huge_ws10",    "locality",   100_000,   2_000,  {"working_set_ratio": 0.1, "hot_prob": 0.85}),

    # ── PHASES ──────────────────────────────────────────────────────────────────
    # poucas fases
    ("phases_sm_tight_p2",       "phases",       2_000,      50,  {"num_phases": 2}),
    ("phases_md_tight_p2",       "phases",      10_000,      50,  {"num_phases": 2}),
    # fases padrão (4)
    ("phases_sm_medium_p4",      "phases",       2_000,     200,  {"num_phases": 4}),
    ("phases_md_medium_p4",      "phases",      10_000,     200,  {"num_phases": 4}),
    ("phases_lg_medium_p4",      "phases",     100_000,     200,  {"num_phases": 4}),
    # muitas fases
    ("phases_md_wide_p8",        "phases",      10_000,     500,  {"num_phases": 8}),
    ("phases_lg_wide_p8",        "phases",     100_000,     500,  {"num_phases": 8}),
    ("phases_xl_wide_p8",        "phases",   1_000_000,     500,  {"num_phases": 8}),
    # fases com universo enorme
    ("phases_md_huge_p4",        "phases",      10_000,   2_000,  {"num_phases": 4}),
    ("phases_lg_huge_p8",        "phases",     100_000,   2_000,  {"num_phases": 8}),
]

# ─────────────────────────────────────────────
# Geradores
# ─────────────────────────────────────────────
def generate_random(length, universe, **_):
    return [random.randint(0, universe - 1) for _ in range(length)]

def generate_sequential(length, universe, **_):
    return [i % universe for i in range(length)]

def generate_locality(length, universe, working_set_ratio=0.2, hot_prob=0.8, **_):
    working_set_size = max(1, int(universe * working_set_ratio))
    working_set = list(range(working_set_size))
    cold_set    = list(range(working_set_size, universe))
    sequence = []
    for _ in range(length):
        if random.random() < hot_prob or not cold_set:
            sequence.append(random.choice(working_set))
        else:
            sequence.append(random.choice(cold_set))
    return sequence

def generate_phases(length, universe, num_phases=4, **_):
    phase_size          = length // num_phases
    phase_universe_size = max(1, universe // num_phases)
    sequence = []
    for p in range(num_phases):
        start = p * phase_universe_size
        end   = min(start + phase_universe_size, universe)
        for _ in range(phase_size):
            sequence.append(random.randint(start, end - 1))
    # completa o restante (quando length não é divisível por num_phases)
    while len(sequence) < length:
        sequence.append(random.randint(0, universe - 1))
    return sequence

GENERATORS = {
    "random":     generate_random,
    "sequential": generate_sequential,
    "locality":   generate_locality,
    "phases":     generate_phases,
}

# ─────────────────────────────────────────────
# I/O
# ─────────────────────────────────────────────
def save_csv(sequence, path):
    os.makedirs(os.path.dirname(path), exist_ok=True)
    with open(path, "w", newline="") as f:
        writer = csv.writer(f)
        writer.writerow(["page"])
        for page in sequence:
            writer.writerow([page])

# ─────────────────────────────────────────────
# Main
# ─────────────────────────────────────────────
def main():
    parser = argparse.ArgumentParser(description="Gera todos os workloads de uma vez")
    parser.add_argument("--output", default="data/workloads",
                        help="Pasta de saída (default: data/workloads)")
    args = parser.parse_args()

    print(f"Seed: {SEED}  |  Saída: {args.output}/\n")

    for name, tipo, length, universe, kwargs in WORKLOADS:
        # Seed derivada: garante reprodutibilidade independente da ordem
        derived_seed = SEED + hash(name) & 0xFFFFFFFF
        random.seed(derived_seed)

        sequence = GENERATORS[tipo](length, universe, **kwargs)
        path     = os.path.join(args.output, f"{name}.csv")
        save_csv(sequence, path)

        print(f"  ✓ {name}.csv  ({tipo}, length={length}, universe={universe})")

    print(f"\n{len(WORKLOADS)} workloads gerados em '{args.output}/'")

if __name__ == "__main__":
    main()