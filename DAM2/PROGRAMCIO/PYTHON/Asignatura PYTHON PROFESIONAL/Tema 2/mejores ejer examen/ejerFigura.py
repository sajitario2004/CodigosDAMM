import threading

class Figura(threading.Thread):
    def __init__(self, tipo, var1, var2):
        super().__init__()
        self.var1 = int(var1)
        self.var2 = int(var2)
        self.tipo = tipo.lower()
        self.area = 0

    def run(self):
        if self.tipo == "cuadrado":
            self.area = self.var1 * self.var2
        elif self.tipo == "triangulo":
            self.area = (self.var1 * self.var2) / 2
        else:
            print("Ese tipo de figura no está disponible.")


print("Vamos a calcular el área de las figuras. Puedes elegir cuadrado o triángulo.")
final_resultado = 0

while True:
    print("\nIntroduce 0 en 'tipo' para salir.")
    tipo = input("Dime el tipo de polígono del que quieres calcular su área (cuadrado / triangulo): ")

    if tipo == "0":
        print("\nAplicación finalizada.")
        print(f"El área total sumada es: {final_resultado}")
        break

    var1 = input("Dime el tamaño del lado 1 (o base en caso de triángulo): ")
    var2 = input("Dime el tamaño del lado 2 (o altura en caso de triángulo): ")

    f1 = Figura(tipo, var1, var2)
    f1.start()
    f1.join()

    resultado_aux = f1.area
    final_resultado += resultado_aux

    print(f"El área de la figura es: {resultado_aux}")
    print(f"La suma total de áreas hasta ahora es: {final_resultado}")
