from cliente import Cliente
from cuenta_bancaria import CuentaBancaria

#Creacion de clientes
cliente1 = Cliente("Nacho")
cliente2 = Cliente("Marco")
cliente3 = Cliente("Serena")
cliente4 = Cliente("Iker")
cliente5 = Cliente("Jorge")

# Creacion de Cuentas Bancarias
cuenta1 = CuentaBancaria("Ahorros",cliente1.nombre, 1000)
cuenta2 = CuentaBancaria("Pagos",cliente1.nombre, 1000)
cuenta3 = CuentaBancaria("Debitos Casa",cliente2.nombre, 1000)
cuenta4 = CuentaBancaria("Hijo",cliente2.nombre, 1000)
cuenta5 = CuentaBancaria("Fruterias Paqui",cliente3.nombre, 1000)
cuenta6 = CuentaBancaria("Ahorros",cliente3.nombre, 1000)
cuenta7 = CuentaBancaria("IES HOLA",cliente4.nombre, 1000)
cuenta8 = CuentaBancaria("Hija",cliente4.nombre, 1000)
cuenta9 = CuentaBancaria("Conda",cliente5.nombre, 1000)
cuenta10 = CuentaBancaria("Inversion",cliente5.nombre, 1000)

# Agregamos las cuentas a cada cliente
cliente1.agregar_cuenta(cuenta1)
cliente1.agregar_cuenta(cuenta2)
cliente2.agregar_cuenta(cuenta3)
cliente2.agregar_cuenta(cuenta4)
cliente3.agregar_cuenta(cuenta5)
cliente3.agregar_cuenta(cuenta6)
cliente4.agregar_cuenta(cuenta7)
cliente4.agregar_cuenta(cuenta8)
cliente5.agregar_cuenta(cuenta9)
cliente5.agregar_cuenta(cuenta10)

# Pruebas con el cliente 1
cliente1.cuentas_bancarias[1].retirar(20)
cliente1.cuentas_bancarias[1].depositar(100)

cliente1.cuentas_bancarias[1].mostrar_saldo()
cliente1.cuentas_bancarias[1].mostrar_movimientos()


# Pruebas con el cliente 2
cliente2.cuentas_bancarias[0].retirar(1200)


