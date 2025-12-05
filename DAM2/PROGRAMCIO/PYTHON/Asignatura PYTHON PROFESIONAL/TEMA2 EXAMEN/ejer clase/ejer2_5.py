import threading
import time

# ---- Clase Thread propia ----
class MiHilo(threading.Thread):
    def run(self):
        # Muestra su nombre e identificador
        print(f"Hilo arrancado -> Nombre: {self.name}, Identificador: {self.ident}")
        time.sleep(3)


# ------------------ PROCESO PRINCIPAL ------------------
hilos = []

# Crear 5 hilos y arrancarlos
for i in range(5):
    hilo = MiHilo()
    hilo.start()
    hilos.append(hilo)

# Mostrar nombre e id desde el programa principal
print("\nDesde el programa principal:")
for h in hilos:
    print(f" -> Nombre: {h.name}, Identificador: {h.ident}")

# Cambiar el nombre por esePedazoHiloX (X = identificador)
for h in hilos:
    h.name = f"esePedazoHilo{h.ident}"

# Mostrar los nombres nuevos
print("\nNombres cambiados:")
for h in hilos:
    print(f" -> Nuevo nombre: {h.name}")

# Esperar que terminen
for h in hilos:
    h.join()

print("\nFinalizado todo usando la clase thread")
