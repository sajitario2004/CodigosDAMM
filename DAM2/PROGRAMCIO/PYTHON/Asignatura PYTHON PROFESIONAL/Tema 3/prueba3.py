import threading

class EsperadorConTimeout:
    def __init__(self):
        self.evento = threading.Event()

    def esperar(self):
        print("[Hilo] Esperando señal con timeout de 3 segundos...")
        if self.evento.wait(timeout=3):
            print("[Hilo] ¡Señal recibida!")
        else:
            print("[Hilo] Timeout expirado. No se recibió señal.")

    def ejecutar(self):
        hilo = threading.Thread(target=self.esperar)
        hilo.start()
        hilo.join()

# Ejecutar
ejercicio3 = EsperadorConTimeout()
ejercicio3.ejecutar()
