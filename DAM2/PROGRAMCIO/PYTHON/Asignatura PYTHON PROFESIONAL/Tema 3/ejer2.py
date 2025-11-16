
"""
hay que hacer un proceso que dice proceso trabajando y 
ademas que compruebe si esta activo

despues otro proceso que pare 


titulo:
un hilo trabaja continuamente hasta que llega otro proceso y lo detiene. 
hay que usar is_set()
"""
import threading  # Importa la biblioteca estándar para trabajar con hilos
import time       # Importa funciones de tiempo (sleep, etc.)

class ControladorDeTrabajo:  # Define una clase que encapsula la lógica de control del trabajo
    def __init__(self):      # Constructor de la clase
        self.detener_evento = threading.Event()  # Crea un Event para indicar cuándo detener el trabajo

    def trabajador(self):    # Método que representa el hilo trabajador
        print("[Trabajador] Iniciando trabajo continuo...")  # Mensaje inicial
        while not self.detener_evento.is_set():  # Bucle que continúa mientras el evento NO esté activado
            print("[Trabajador] Trabajando...")  # Simula trabajo
            time.sleep(1)                        # Pausa de 1 segundo entre iteraciones (simulación)
        print("[Trabajador] ¡Detenido por señal!")  # Mensaje al salir del bucle cuando el evento se activa

    def supervisor(self):    # Método que representa el hilo supervisor
        print("[Supervisor] Esperando 5 segundos antes de detener...")  # Informa del retraso
        time.sleep(5)        # Espera 5 segundos antes de detener
        self.detener_evento.set()  # Activa el evento: el trabajador verá is_set() = True y se detendrá
        print("[Supervisor] Señal de detención enviada.")  # Confirma el envío de la señal

    def ejecutar(self):      # Método que arranca los hilos y coordina su finalización
        t1 = threading.Thread(target=self.trabajador)  # Crea el hilo para el trabajador
        t2 = threading.Thread(target=self.supervisor)  # Crea el hilo para el supervisor
        t1.start()             # Inicia el hilo trabajador
        t2.start()             # Inicia el hilo supervisor
        t1.join()              # Espera a que el trabajador termine
        t2.join()              # Espera a que el supervisor termine

# Ejecutar la demostración del ejercicio 2
ejercicio2 = ControladorDeTrabajo()  # Instancia la clase
ejercicio2.ejecutar()                # Llama al método que ejecuta los hilos
