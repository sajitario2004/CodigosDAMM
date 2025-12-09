class Perro():
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad
        self.patas = 4 
    
    @classmethod        
    def habla(cls):
        print("miau")
    
    
    @classmethod
    def factory(cls, nombre, edad):
        return cls(nombre, int(edad))
    
    
    
Perro.habla()

perro_1 = Perro.factory("manolo", 3)

print(perro_1.edad, perro_1.nombre)