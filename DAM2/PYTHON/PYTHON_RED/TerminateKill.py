'''
Se ve cómo se usa terminate, kill proceso.wait y las excepciones que lanza psutil.Process que son psutil.NoSuchProcess y psutil.AccessDenied
'''
import psutil
import time

# Supongamos que conocemos el PID del proceso
pid = 1234  # reemplaza con el PID real

try:
    proceso = psutil.Process(pid)
    
    # TERMINATE: intenta cerrar el proceso de manera "suave"
    proceso.terminate()
    print(f"Se envió la señal terminate al proceso {pid}.")

    # Esperamos hasta 3 segundos a que termine
    try:
        proceso.wait(timeout=3) #se usa para esperar a que ese proceso termine.
        print(f"Proceso {pid} terminó correctamente con terminate.")
    except psutil.TimeoutExpired:
        print(f"Proceso {pid} no respondió a terminate, se usará kill.")
        # KILL: fuerza la terminación inmediata
        proceso.kill()
        proceso.wait(timeout=3)
        print(f"Proceso {pid} fue terminado con kill.")

    # POLL: verificamos si el proceso sigue activo
    if proceso.is_running():
        print(f"Proceso {pid} todavía está activo.")
    else:
        print(f"Proceso {pid} ya no está activo.")
    
except psutil.NoSuchProcess:
    print(f"No existe el proceso con PID {pid}.")
except psutil.AccessDenied:
    print(f"No tienes permisos para interactuar con el proceso {pid}.")
