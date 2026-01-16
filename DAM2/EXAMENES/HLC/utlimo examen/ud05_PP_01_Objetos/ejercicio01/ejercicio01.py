from modulo.persona import Persona


persona = None
lista_personas = []

while True:
    print("\nMENÚ PRINCIPAL")
    print("1. Crear persona")
    print("2. Mostrar datos")
    print("3. Edad futura")
    print("4. Salir")

    opcion = input("Elige una opción: ")

    if opcion == "1":
        nombre1 = input("Dame el nombre: ")
        edad1 = int(input("Dame la edad: "))
        if edad1 > 100 or edad1 < 0:
            print("Como la edad no esta entre 0 y 100 se seteara a 0")
            edad1 = 0
        
        p1 = Persona(nombre1, edad1)
        lista_personas.append(p1)

    elif opcion == "2":
        nombre1 = input("Dime el nombre de la persona: ")
        cont = 0
        for i in lista_personas:
            if i.nombre == nombre1:
                print(i.mostrar_datos())
                cont+=1
        if cont == 0:
            print("No se ha encontrado ninguna persona con ese nombre")

    elif opcion == "3":
        nombre1 = input("Dime tu nombre para coger tu edad: ")
        anios = int(input("Dime una cantidad de años para saber cuantros tendras dentro de ese numero de años: "))
        cont = 0
        for i in lista_personas:
            if i.nombre == nombre1:
                print(i.mostrar_datos())
                print(i.calcular_edad_futura(anios))
                cont+=1
                
        if cont == 0:
            print("No se ha encontrado ninguna persona con ese nombre")
        
    elif opcion == "4":
        
        break

    else:
        print("Opción incorrecta")
