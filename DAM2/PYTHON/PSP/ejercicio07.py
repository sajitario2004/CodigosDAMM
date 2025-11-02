import psutil
import time

def menu():
    while True:
        print("\n===== Menu Principal =====") 
        print("1. Listar procesos")
        print("2. Matar proceso (PID)")
        print("3. Salir")

        try:
            opcion = int(input("Elige una opción entre 1 y 3: "))
        except ValueError:
            print("Por favor, introduce un número válido.")
        
        if opcion == 1:
            listar()
        elif opcion == 2:
            matar()
        elif opcion == 3:
            print("Saliendo del sistema...")
            break
        else:
            print("Opción no válida.")

        input("\nPresiona 'Enter' para continuar...")

def listar():
    print("\n PID \ Nombre del Proceso")
    procesos = list(psutil.process_iter(['pid', 'name']))
    for proceso in procesos[:10]:  
        print(f"{proceso.info['pid']}\t{proceso.info['name']}")


def matar():
    try:
        pid = int(input("Introduce el PID del proceso a matar: "))

        proceso = psutil.Process(pid)
        proceso.terminate()
        proceso.wait(timeout=3)
        print(f"Proceso {pid} terminado correctamente.")
    except psutil.NoSuchProcess:
        print("No existe un proceso con ese PID.")

menu()