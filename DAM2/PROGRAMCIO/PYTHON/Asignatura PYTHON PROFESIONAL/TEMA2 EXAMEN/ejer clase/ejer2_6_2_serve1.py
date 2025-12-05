import threading
import time
import random

# El servidor solo permite 3 conexiones simultáneas
sem_servidor = threading.Semaphore(3)

def cliente(id_cliente):
    print(f"[Cliente {id_cliente}] Intentando conectar...")
    with sem_servidor:   # si hay hueco entra, si no espera
        print(f" --> [Cliente {id_cliente}] CONECTADO")
        time.sleep(random.uniform(2, 4))  # simulación de transferencia
        print(f" <-- [Cliente {id_cliente}] Desconectado")

# ---------- PROGRAMA PRINCIPAL ----------
hilos = []
for i in range(10):     # 10 clientes
    h = threading.Thread(target=cliente, args=(i,))
    h.start()
    hilos.append(h)

# Esperar a todos
for h in hilos:
    h.join()

print("\n=== Servidor libre, todas las conexiones atendidas ===")
