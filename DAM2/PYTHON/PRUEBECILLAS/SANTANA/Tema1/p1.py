import random

palabras = ["mequetrefe", "python", "sandiego", "programacion", "algoritmo"]

def randomPalabra():
    return random.choice(palabras)

def jugar():
    palabra = randomPalabra()
    palabra_oculta = "_" * len(palabra)
    intentos_maximos = 7
    intentos = 0
    letras_adivinadas = []

    print("Bienvenido a el ahorcado")
    print("Tienes que adivinar la palabra y no puedes tener mas 7 fallos")

    while intentos != intentos_maximos:
        print("La palabra a adivinar es: " + palabra_oculta)
        print("Introduce una letra")
        print("Llevas " , intentos , " fallos.")
        letra = input().lower()

        if letra in letras_adivinadas:
            print("Esa letra ya la has introducido.")
            continue

        if len(letra) != 1:
            print("No se puede introducir su letra ") 

        elif letra in palabra:
            letras_adivinadas.append(letra)
            print("Esa letra es correcta. ")
            for i in range(len(palabra)):
                if palabra[i] == letra:
                    palabra_oculta = palabra_oculta[:i] + letra + palabra_oculta[i+1:]
                    print("\n")

        elif letra not in palabra:
            intentos+=1
            print("Has fallado tienes un intento manos.")

        if palabra == palabra_oculta:
            break

    if palabra == palabra_oculta:
        print("\bFelicidades ganaste. ")
    else:
        print("Perdiste puto friki. ")

    jugarDeNuevo = "n"
    jugarDeNuevo = input("¿Quieres jugar de nuevo? (s/n): ").lower()
    if jugarDeNuevo  == "s":
        jugar()

jugar()