import threading

class miHilo(threading.Thread):
    def __init__(self, num):
        super(miHilo, self).__init__()
        self.numero = num
        self.nombre = ""

    def run(self):
        if self.nombre == "hiloPar":
            print(f"par; {self.numero}")
        else:
            print(f"impar; {self.numero}")

# aqui termina la clase y comienza el programa para usar la clase

for i in range(4):
    hilo = miHilo(i)
    if (i % 2 == 0):
        hilo.nombre ="hiloPar"
    else:
        hilo.nombre="hiloImpar"

    hilo.start()