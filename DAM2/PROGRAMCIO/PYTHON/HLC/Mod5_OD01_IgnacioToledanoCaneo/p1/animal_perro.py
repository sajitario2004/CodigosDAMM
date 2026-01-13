class Animal:
    def hablar(self):
        print("Hace un sonido")
        
class Perro(Animal):
    def hablar(self):
        print("Guau")
        
class Gato(Animal):
    def hablar(self):
        return "Miau"
    
p = Perro()
p.hablar()