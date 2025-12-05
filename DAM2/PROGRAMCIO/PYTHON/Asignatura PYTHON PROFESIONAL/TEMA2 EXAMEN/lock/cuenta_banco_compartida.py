"""
Cuenta bancaria compartida

Crea una clase CuentaBancaria con un saldo inicial.
Varios hilos representan personas que depositan o 
retiran dinero. Usa Lock para evitar conflictos y join para esperar a que 
todos los hilos terminen antes de imprimir el saldo final.
"""
import threading
import time

class Cuenta_bancaria:
    def __init__(self):
        self.saldo_inicial=500
        self.lock=threading.Lock()

    def mostrar_cantidad(self):
        print(f"Tu saldo es de {self.saldo_inicial}")

    def anadir_dinero(self, cantidad):
        with self.lock:
            self.saldo_inicial+=cantidad
            print(f"Se añadio la catidad de {cantidad} a la cuenta correctamente")
            self.mostrar_cantidad()

    def retirar_dinero(self, cantidad):
        with self.lock:
            self.saldo_inicial-=cantidad
            print(f"Se retiro la catidad de {cantidad} de la cuenta correctamente")
            self.mostrar_cantidad()


class Persona(threading.Thread):
    def __init__(self, cuenta_bancaria, nombre, operacion, cantidad):
        super().__init__()
        self.cuenta_bancaria= cuenta_bancaria
        self.nombre=nombre
        self.operacion=operacion
        self.cantidad = cantidad

    def run(self):
        print(f"bienbenido a el banco. {self.nombre}")
        print(f"El saldo actual de la cuenta es: {self.cuenta_bancaria.saldo_inicial}")
        if self.operacion.lower()=="depositar":
            self.cuenta_bancaria.anadir_dinero(self.cantidad)
        elif self.operacion == 'retirar':
            self.cuenta_bancaria.retirar_dinero(self.cantidad)

print("La cuenta es compartida entre Nacho, Ana y Luis")
cuenta_bank = Cuenta_bancaria()
persona1 = Persona(cuenta_bank, "Nacho", "depositar", 20)
persona2 = Persona(cuenta_bank, "Ana", "retirar", 60)
persona3 = Persona(cuenta_bank, "Luis", "depositar", 100)

persona1.start()
persona2.start()
persona3.start()

persona1.join()
persona2.join()
persona3.join()

print("operaciones finalizadas")