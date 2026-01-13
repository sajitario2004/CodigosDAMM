class Jugador:
    def __init__(self, nombre):
        self.nombre = nombre
        self.vida = 100
        
    def atacar(self, enemigo):
        enemigo.vida -= 10
        print(f"{self.nombre} ataca a {enemigo.nombre} (-10 vida)")
    
    def __str__(self):
        return f"{self.nombre} con vida {self.vida}"
        
jugador1 = Jugador("Nacho")
jugador2 = Jugador("Marcos")

jugador1.atacar(jugador2)

print(jugador2) # 90 de vida