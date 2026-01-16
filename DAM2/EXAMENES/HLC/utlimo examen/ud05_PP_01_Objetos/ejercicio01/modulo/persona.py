class Persona:
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad= edad
        
    def mostrar_datos(self):
        txt = f"El nombre es {self.nombre} y la edad es {self.edad}"
        return txt
    
    def calcular_edad_futura(self, anios):
        txt = f"Tu edad dentro de {anios} años sera {self.edad+anios}"
        return txt
        
    def get_edad(self):
        return self.edad
    
    def set_edad(self, edad):
        self.edad = edad
    
    def get_nombre(self):
        return self.nombre
    
    def set_nombre(self, nombre):
        self.nombre = nombre
    