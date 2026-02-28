"""
update_env.py
Coleta informações do sistema e atualiza a seção "Ambiente de Testes" no README.md.
Deve ser rodado uma vez antes de commitar resultados.

Uso:
    python update_env.py
    python update_env.py --readme docs/README.md  # caminho customizado
"""

import argparse
import platform
import subprocess
import os
import re
from datetime import datetime

# ── Marcadores no README ──────────────────────────────────────────────────────
MARKER_START = "<!-- ENV_START -->"
MARKER_END   = "<!-- ENV_END -->"

# ─────────────────────────────────────────────────────────────────────────────
# Coleta de informações
# ─────────────────────────────────────────────────────────────────────────────

def get_cpu() -> str:
    system = platform.system()
    if system == "Linux":
        try:
            with open("/proc/cpuinfo") as f:
                for line in f:
                    if line.startswith("model name"):
                        return line.split(":")[1].strip()
        except Exception:
            pass
    elif system == "Darwin":
        try:
            result = subprocess.run(
                ["sysctl", "-n", "machdep.cpu.brand_string"],
                capture_output=True, text=True
            )
            return result.stdout.strip()
        except Exception:
            pass
    elif system == "Windows":
        try:
            result = subprocess.run(
                ["wmic", "cpu", "get", "name"],
                capture_output=True, text=True
            )
            lines = [l.strip() for l in result.stdout.splitlines() if l.strip() and l.strip() != "Name"]
            return lines[0] if lines else "N/A"
        except Exception:
            pass
    return platform.processor() or "N/A"

def get_ram_gb() -> str:
    try:
        import psutil
        total = psutil.virtual_memory().total
        return f"{total / (1024 ** 3):.1f} GB"
    except ImportError:
        # fallback Linux
        try:
            with open("/proc/meminfo") as f:
                for line in f:
                    if line.startswith("MemTotal"):
                        kb = int(line.split()[1])
                        return f"{kb / (1024 ** 2):.1f} GB"
        except Exception:
            pass
    return "N/A"

def get_java_version() -> str:
    try:
        result = subprocess.run(
            ["java", "-version"],
            capture_output=True, text=True
        )
        first_line = (result.stderr or result.stdout).splitlines()[0]
        return first_line.strip()
    except Exception:
        return "N/A"

def get_os() -> str:
    system = platform.system()
    if system == "Linux":
        try:
            with open("/etc/os-release") as f:
                info = {}
                for line in f:
                    if "=" in line:
                        k, v = line.strip().split("=", 1)
                        info[k] = v.strip('"')
            return info.get("PRETTY_NAME", platform.platform())
        except Exception:
            pass
    return platform.platform()

def get_cpu_cores() -> str:
    try:
        import psutil
        physical = psutil.cpu_count(logical=False)
        logical  = psutil.cpu_count(logical=True)
        return f"{physical} físicos / {logical} lógicos"
    except ImportError:
        try:
            import os
            return f"{os.cpu_count()} lógicos"
        except Exception:
            pass
    return "N/A"

def collect() -> dict:
    return {
        "os":           get_os(),
        "cpu":          get_cpu(),
        "cpu_cores":    get_cpu_cores(),
        "ram":          get_ram_gb(),
        "java":         get_java_version(),
        "python":       platform.python_version(),
        "updated_at":   datetime.now().strftime("%Y-%m-%d %H:%M"),
    }

# ─────────────────────────────────────────────────────────────────────────────
# Geração do bloco Markdown
# ─────────────────────────────────────────────────────────────────────────────

def build_block(info: dict) -> str:
    return f"""{MARKER_START}
## Ambiente de Testes

> Gerado automaticamente por `update_env.py` em {info['updated_at']}

| Campo        | Valor |
|--------------|-------|
| SO           | {info['os']} |
| CPU          | {info['cpu']} |
| Núcleos      | {info['cpu_cores']} |
| RAM          | {info['ram']} |
| Java         | {info['java']} |
| Python       | {info['python']} |

> Os resultados de benchmark (JMH) e simulação foram obtidos neste ambiente.
> Resultados podem variar em hardware diferente.
{MARKER_END}"""

# ─────────────────────────────────────────────────────────────────────────────
# Atualização do README
# ─────────────────────────────────────────────────────────────────────────────

def update_readme(readme_path: str, block: str):
    if not os.path.exists(readme_path):
        # Cria um README mínimo se não existir
        with open(readme_path, "w") as f:
            f.write("# MemTradeoff\n\n")
            f.write("Comparação de algoritmos de substituição de páginas.\n\n")
            f.write(block + "\n")
        print(f"README criado em: {readme_path}")
        return

    with open(readme_path, "r") as f:
        content = f.read()

    pattern = re.compile(
        re.escape(MARKER_START) + r".*?" + re.escape(MARKER_END),
        re.DOTALL
    )

    if pattern.search(content):
        # Substitui o bloco existente
        new_content = pattern.sub(block, content)
    else:
        # Adiciona no final
        new_content = content.rstrip() + "\n\n" + block + "\n"

    with open(readme_path, "w") as f:
        f.write(new_content)

    print(f"README atualizado: {readme_path}")

# ─────────────────────────────────────────────────────────────────────────────
# Main
# ─────────────────────────────────────────────────────────────────────────────

def main():
    parser = argparse.ArgumentParser(description="Atualiza seção de ambiente no README")
    parser.add_argument("--readme", default="README.md", help="Caminho do README (default: README.md)")
    args = parser.parse_args()

    print("Coletando informações do sistema...")
    info = collect()

    print(f"  SO:      {info['os']}")
    print(f"  CPU:     {info['cpu']}")
    print(f"  Núcleos: {info['cpu_cores']}")
    print(f"  RAM:     {info['ram']}")
    print(f"  Java:    {info['java']}")
    print(f"  Python:  {info['python']}")

    block = build_block(info)
    update_readme(args.readme, block)

if __name__ == "__main__":
    main()