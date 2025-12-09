class Perro():
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad
        self.patas = 4 
        
    def habla(self):
        print(f"hola soy el perro {self.nombre}")
        print("miau")

Perro.patas = 3
mi_perro= Perro("sanchez", 5)
mi_perro.habla()
mi_perro.patas = 5
print(Perro.patas)
print(mi_perro.patas)