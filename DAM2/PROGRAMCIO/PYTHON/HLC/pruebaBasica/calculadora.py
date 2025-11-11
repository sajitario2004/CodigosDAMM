import subprocess


def sumar(num1, num2):
    return num1 + num2

def restar(num1, num2):
    return num1 - num2

def multiplicar(num1, num2):
    return num1 * num2

def dividir(num1, num2):
    return num1 / num2


while True:
    print('que operacion desea realizar')
    print('1. sumar')
    print('2. restar')
    print('3. multiplicar')
    print('4. dividir')
    selec = int(input());
    selecN1 = int(input('ahora digame el primer numero '))
    selecN2 = int(input('Ahora el otro numero con el que desea realizar la operacion'))
    if selec == 1:
        resultado = sumar(selecN1, selecN2)
    elif selec == 2:
        resultado = restar(selecN1, selecN2)
    elif selec == 3:
        resultado = multiplicar(selecN1, selecN2)
    elif selec == 4:
        resultado = dividir(selecN1, selecN2)
    else:
        print("seleccion no disponible")

    resultado = 0
    print("El resultado de la operacion es "+ resultado)

