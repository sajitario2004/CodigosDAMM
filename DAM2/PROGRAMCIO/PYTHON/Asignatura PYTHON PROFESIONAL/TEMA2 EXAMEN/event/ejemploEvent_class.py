import threading
import time
import random


class SensorWorker(threading.Thread):
    def __init__(self, stop_event):
        super().__init__()
        self.stop_event = stop_event

    def run(self):
        print("[Sensor] Iniciando lectura...")
        while not self.stop_event.is_set():
            # Simulamos lectura de datos del sensor
            dato = random.randint(0, 100)
            print(f"[Sensor] Leyendo dato: {dato}")
            time.sleep(1)  # Simulamos un delay

        print("[Sensor] Apagando sensor limpiamente...")


class Controlador:
    def __init__(self):
        self.stop_event = threading.Event()
        self.sensor = SensorWorker(self.stop_event)

    def iniciar(self):
        print("[Controlador] Encendiendo sensor...")
        self.sensor.start()

    def detener(self):
        print("[Controlador] Señal para detener el sensor.")
        self.stop_event.set()  # Avisamos al hilo
        self.sensor.join()
        print("[Controlador] Sensor detenido correctamente.")


if __name__ == "__main__":
    print("Programa iniciando...\n")

    controlador = Controlador()
    controlador.iniciar()

    time.sleep(5)  # Sensor corre 5 segundos

    controlador.detener()

    print("\nPrograma finalizado.")
