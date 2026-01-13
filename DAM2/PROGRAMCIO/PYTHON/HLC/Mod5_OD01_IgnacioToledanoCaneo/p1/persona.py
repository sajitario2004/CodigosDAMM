class Persona:
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad
    
    def saluda(self):
        print(f"hola, soy {self.nombre} y tengo {self.edad} años")
        
persona1 = Persona("nacho", 21)

persona1.saluda()