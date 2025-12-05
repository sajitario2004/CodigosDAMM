import threading, time

class Lanzador:
    def __init__(self):
        self.event = threading.Event()

    def esperar(self, id):
        print(f"{id} esperando señal")
        self.event.wait()  # bloquea hasta set()
        print(f"{id} comienza")

l = Lanzador()
hilos = [threading.Thread(target=l.esperar, args=(i,)) for i in range(4)]
for h in hilos: h.start()
time.sleep(1)
print("Señal enviada")
l.event.set()  # despierta a todos
for h in hilos: h.join()
