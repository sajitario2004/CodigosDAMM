import threading 
import time 

"""
hay que hacer un proceso que dice proceso trabajando y 
ademas que compruebe si esta activo

despues otro proceso que pare 


titulo:
un hilo trabaja continuamente hasta que llega otro proceso y lo detiene. 
hay que usar is_set()
"""

evento = threading.Event()

class ladron(threading.Thread):
    def __init__(self):
        super().__init__()

    def run(self):
        while not evento.is_set():
            time.sleep(0.3)
            print("Estoy robando")

        print("ya no robo. me han pillado en un chino")

class policia (threading.Thread):
    def __init__(self):
        super().__init__()

    def run(self):
        print("soy la polisia y llego al chino")
        evento.set()

el_ladron = ladron()
el_ladron.start()

time.sleep(2)

el_policia = policia()
el_policia.start()

el_policia.join()
el_ladron.join()

print("programa terminado y ladron en el chino atrapado")