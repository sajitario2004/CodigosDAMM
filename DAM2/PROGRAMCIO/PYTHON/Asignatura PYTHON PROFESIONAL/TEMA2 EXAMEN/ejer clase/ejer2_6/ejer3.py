import threading
import time
import random

fichero = ""
lock = threading.Lock()

def escribir(nombre):
    global fichero
    lineas = random.randint(1, 5)   # escribe entre 1 y 5 líneas
    for t in range(lineas):
        with lock:      # QUITAR ESTO para probar corrupción
            fichero += f"El hilo {nombre} escribe la línea {t}\n"
        time.sleep(1)   # fuerza cambio de contexto

# CREAR HILOS DE FORMA ALEATORIA
hilos = []
for i in range(5):
    hilo = threading.Thread(target=escribir, args=(i,))
    hilo.start()
    hilos.append(hilo)

for h in hilos:
    h.join()

print("Contenido del fichero simulado:\n")
print(fichero)
