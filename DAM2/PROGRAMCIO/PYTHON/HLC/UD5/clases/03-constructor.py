class Perro():
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad 
        
    def habla(self):
        print(f"hola soy el perro {self.nombre}")
        print("miau")
        
mi_perro= Perro("sanchez")
mi_perro.habla()