from modulo.cuenta_bancaria import CuentaBancaria

cuenta = CuentaBancaria("Ahorros", 1200)

while True:
    print("\nMENÚ PRINCIPAL")
    print("1. Mostrar saldo")
    print("2. Ingresar dinero")
    print("3. Retirar dinero")
    print("4. Mostrar Historial")
    print("5. Salir")

    opcion = input("Elige una opción: ")

    if opcion == "1":
        print("TU SALDO ES DE: ",cuenta.mostrar_saldo())
        

    elif opcion == "2":
        cantidad = int(input("Dime la cantidad a ingresar: "))
        cuenta.ingresar(cantidad)
        print("Se ingreso correctamente")
    

    elif opcion == "3":
        cantidad = int(input("Dime la cantidad a retirar: "))
        cuenta.retirar(cantidad)
        print("Se ingreso correctamente")
    
    elif opcion == "4":
        cuenta.mostrar_historial()
        pass
    
    elif opcion == "5":
        break

    else:
        print("Opción incorrecta")
