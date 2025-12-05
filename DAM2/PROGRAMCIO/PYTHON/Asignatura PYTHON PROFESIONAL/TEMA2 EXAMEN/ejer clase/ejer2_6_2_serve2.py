import threading
import time
import random

# La BD solo permite 2 operaciones simultáneas
sem_bd = threading.Semaphore(2)

def consulta(id_consulta):
    print(f"[Consulta {id_consulta}] Esperando acceso a la BD..")
    with sem_bd:
        print(f"[Consulta {id_consulta}] Ejecutando consulta...")
        time.sleep(random.uniform(3, 6))  # Simulación lenta
        print(f"[Consulta {id_consulta}] Consulta finalizada")

# ---------- PROGRAMA PRINCIPAL ----------
hilos = []
for c in range(6):     # 6 consultas
    h = threading.Thread(target=consulta, args=(c,))
    h.start()
    hilos.append(h)

for h in hilos:
    h.join()

print("\n=== Base de datos ya procesó todas las consultas ===")
