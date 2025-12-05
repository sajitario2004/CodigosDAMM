import threading
import time

contador = 0
lock = threading.Lock()

def incrementar():
    global contador
    for _ in range(1000):
        with lock:
            contador += 1

hilos = []
for _ in range(6):
    hilo = threading.Thread(target=incrementar)
    hilo.start()
    hilos.append(hilo)

for h in hilos:
    h.join()

print("Resultado final =", contador)
