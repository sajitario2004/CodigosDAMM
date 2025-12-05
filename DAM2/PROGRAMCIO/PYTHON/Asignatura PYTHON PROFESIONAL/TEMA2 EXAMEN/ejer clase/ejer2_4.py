import threading
import time

def tarea():
    # Mostrar nombre del hilo e identificador
    print(f"Hilo -> Nombre: {threading.current_thread().name}, Identificador: {threading.get_ident()}")
    time.sleep(3)


def main():
    hilos = []

    # Crear 5 hilos y arrancarlos
    for _ in range(5):
        hilo = threading.Thread(target=tarea)
        hilo.start()

        # Cambiar nombre del hilo por “eseHiloee-identificador”
        hilo.name = f"eseHiloee-{hilo.ident}"

        hilos.append(hilo)

    # Mostrar número de hilos activos
    print(f"\nNúmero de hilos activos: {threading.active_count()}")

    # Mostrar listado de hilos con enumerate
    print("\nListado de hilos activos (nombre e id):")
    for h in threading.enumerate():
        print(f" -> Nombre: {h.name}, Identificador: {h.ident}")

    # Esperar a que todos acaben
    for h in hilos:
        h.join()

    print("\nFinalizado y a otra cosa mariposa")


main()

