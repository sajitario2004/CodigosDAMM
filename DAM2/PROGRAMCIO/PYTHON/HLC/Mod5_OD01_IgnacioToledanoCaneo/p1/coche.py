class Coche:
    def __init__(self, marca, color):
        self.marca = marca
        self.color = color
        
    def arrancar(self):
        print(f"El {self.marca} ha arrancado")
        
coche1 = Coche("audi", "rojo")
coche1.arrancar()

