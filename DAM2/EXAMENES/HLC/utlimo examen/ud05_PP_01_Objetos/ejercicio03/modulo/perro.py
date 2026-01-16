from modulo.animal import Animal

class Perro(Animal):
    def __init__(self, nombre, edad):
        super().__init__(nombre, edad)
    
    def hablar(self):
        print("Guau")