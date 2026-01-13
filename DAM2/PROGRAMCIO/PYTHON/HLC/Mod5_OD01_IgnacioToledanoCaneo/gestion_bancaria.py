class CuentaBancaria():
    def __init__(self, titular, saldo):
        self.titular = titular
        self.saldo = saldo
        self.movimientos = []

    def depositar(self, cantidad):
        self.saldo += cantidad
        txt = f"Se ha depositado {cantidad} en la cuenta. Saldo actual {self.saldo} euros."
        self.movimientos.append(txt)
    
    def retirar(self, cantidad):
        if cantidad > self.saldo:
            print("No se puede retirar esa cantidad de la cuenta.")
            print("Saldo insuficienta")
        else:
            self.saldo -= cantidad
            txt = f"Se ha retirado {cantidad}, de la cuenta. Saldo actual {self.saldo} euros."
            self.movimientos.append(txt)

    def mostrar_saldo(self):
        print(f"su saldo es {self.saldo}")

    def mostrar_movimientos(self):
        print(f"Lista de movimientos de {self.titular}:")
        for i in self.movimientos:
            print(f"\t{i}")

class Cliente():
    def __init__(self, nombre):
        self.nombre = nombre
        self.cuentas_bancarias = []

    def agregar_cuenta(self, cuenta):
        self.cuentas_bancarias.append(cuenta)

def menu():
    print("Bienvenido a el menu del banco Nacholut.")
    valor = -1
    while valor != 0:
        valor = int(input("Introduce la opcion que desea realizar"))

cliente1 = Cliente("Nacho")
cliente2 = Cliente("Marcos")
cliente3 = Cliente("Jorge")
cliente4 = Cliente("Mario")
cliente5 = Cliente("Iker")

cuenta1_cliente1 = CuentaBancaria("Nacho", 1200)
cuenta2_cliente1 = CuentaBancaria("Nacho", 3200)
cuenta1_cliente2 = CuentaBancaria("Marcos", 1400)
cuenta2_cliente2 = CuentaBancaria("Marcos", 1600)
cuenta1_cliente3 = CuentaBancaria("Jorge", 600)
cuenta2_cliente3 = CuentaBancaria("Jorge", 900)
cuenta1_cliente4 = CuentaBancaria("Mario", 3200)
cuenta2_cliente4 = CuentaBancaria("Mario", 4200)
cuenta1_cliente5 = CuentaBancaria("Iker", 1000)
cuenta2_cliente5 = CuentaBancaria("Iker", 800)

cliente1.agregar_cuenta(cuenta1_cliente1)
cliente1.agregar_cuenta(cuenta2_cliente1)
cliente2.agregar_cuenta(cuenta1_cliente2)
cliente2.agregar_cuenta(cuenta2_cliente2)
cliente3.agregar_cuenta(cuenta1_cliente3)
cliente3.agregar_cuenta(cuenta2_cliente3)
cliente4.agregar_cuenta(cuenta1_cliente4)
cliente4.agregar_cuenta(cuenta2_cliente4)
cliente5.agregar_cuenta(cuenta1_cliente5)
cliente5.agregar_cuenta(cuenta2_cliente5)

print("\nEjecutando simulacion...\n")

cuenta1_cliente1.depositar(500)
cuenta1_cliente1.retirar(200)
cuenta2_cliente1.retirar(1000)

cuenta1_cliente2.depositar(100)
cuenta2_cliente2.depositar(5000)

cuenta1_cliente3.retirar(2000) 

cuenta1_cliente4.depositar(50)
cuenta1_cliente4.retirar(50)

cuenta1_cliente5.retirar(100)
cuenta2_cliente5.depositar(200)

cuenta1_cliente1.mostrar_movimientos()