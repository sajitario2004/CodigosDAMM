"""

"""
import threading  # Biblioteca estándar para concurrencia con hilos
import time       # Funciones de temporización

class ControlDeCruce:  # Clase que modela un cruce con coches y peatones controlado por eventos
    def __init__(self):  # Constructor
        self.pueden_pasar_peatones = threading.Event()  # Evento que indica si los peatones pueden pasar
        self.pueden_pasar_coches = threading.Event()    # Evento que indica si los coches pueden pasar

    def controlador(self):  # Hilo controlador del “semáforo”
        while True:  # Ciclo infinito alternando estados
            print("[Controlador] Peatones pueden pasar (10 minutos)...")  # Anuncia fase de peatones
            self.pueden_pasar_peatones.set()   # Activa permiso para peatones
            self.pueden_pasar_coches.clear()   # Desactiva permiso para coches
            time.sleep(10)                     # Mantiene la fase de peatones durante 10 segundos

            print("[Controlador] Coches pueden pasar (5 minutos)...")     # Anuncia fase de coches
            self.pueden_pasar_peatones.clear()  # Desactiva permiso para peatones
            self.pueden_pasar_coches.set()      # Activa permiso para coches
            time.sleep(5)                       # Mantiene la fase de coches durante 5 segundos

    def peaton(self, id):  # Hilo que representa a un peatón con identificador
        while True:  # Ciclo continuo: los peatones llegan indefinidamente
            self.pueden_pasar_peatones.wait()  # Espera hasta que el evento de peatones esté activo
            print(f"[Peatón {id}] Cruzando...")  # Cruza cuando está permitido
            time.sleep(1)                        # Simula tiempo de cruce

    def coche(self, id):  # Hilo que representa a un coche con identificador
        while True:  # Ciclo continuo: los coches llegan indefinidamente
            self.pueden_pasar_coches.wait()  # Espera hasta que el evento de coches esté activo
            print(f"[Coche {id}] Cruzando...")  # Cruza cuando está permitido
            time.sleep(1)                       # Simula tiempo de cruce

    def ejecutar(self):  # Método que levanta el sistema completo
        threading.Thread(target=self.controlador, daemon=True).start()  # Arranca el controlador como hilo daemon

        for i in range(3):  # Crea varios hilos de coches y peatones (3 de cada uno como ejemplo)
            threading.Thread(target=self.peaton, args=(i,), daemon=True).start()  # Arranca un peatón daemon
            threading.Thread(target=self.coche, args=(i,), daemon=True).start()   # Arranca un coche daemon

        time.sleep(30)  # Deja correr la simulación 30 segundos antes de terminar el programa

# Ejecutar la demostración del ejercicio 3
ejercicio3 = ControlDeCruce()  # Instancia la clase
ejercicio3.ejecutar()          # Arranca la simulación del cruce
