
from modulo.gato import Gato
from modulo.perro import Perro


lista_animales = []

while True:
    print("\nMENÚ PRINCIPAL")
    print("1. Crear perro")
    print("2. Crear gato")
    print("3. Hacer hablar al animal")
    print("4. Salir")

    opcion = input("Elige una opción: ")

    if opcion == "1":
        n = input("Dime el nombre del perro: ")
        e = int(input("Dime el edad del perro: "))
        p1 = Perro(n,e)
        lista_animales.append(p1)
        print("El perro se ha creado correctamente")
    
        pass

    elif opcion == "2":
        n = input("Dime el nombre del gato: ")
        e = int(input("Dime el edad del gato: "))
        g1 = Gato(n,e)
        lista_animales.append(g1)
        print("El gato se ha creado correctamente")
    
        pass

    elif opcion == "3":
        for i in lista_animales:
            print(i.show_me())
            i.hablar()
        pass

    elif opcion == "4":
        break

    else:
        print("Opción incorrecta")
