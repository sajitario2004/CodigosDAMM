import threading, time, random

class Buffer:
    def __init__(self):
        self.items = []
        self.cond = threading.Condition()

    def producir(self, item):
        with self.cond:                # adquiere el lock asociado
            self.items.append(item)
            self.cond.notify()        # despierta a un consumidor
    def consumir(self):
        with self.cond:
            while not self.items:     # espera hasta que haya items
                self.cond.wait()
            return self.items.pop(0)

# Uso: 1 productor, 2 consumidores
buf = Buffer()
def prod():
    for i in range(5):
        time.sleep(random()*0.2)
        buf.producir(i)
        print("Producido", i)
def cons(id):
    for _ in range(3):
        item = buf.consumir()
        print("Consumidor", id, "consumió", item)

p = threading.Thread(target=prod); c1 = threading.Thread(target=cons, args=(1,)); c2 = threading.Thread(target=cons, args=(2,))
p.start(); c1.start(); c2.start()
p.join(); c1.join(); c2.join()
