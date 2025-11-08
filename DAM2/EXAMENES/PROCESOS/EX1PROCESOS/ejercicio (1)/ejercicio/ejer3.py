'''
Escribe un programa en Python que:

Pida al usuario un número entero positivo N (por ejemplo, N = 100).
Se crean 2 procesos hijo.
El primer hijo buscará y contará los números primos en el rango [2, N//2].
El segundo hijo buscará y contará los números primos en el rango [N//2 + 1, N].
Cada hijo imprimirá cuántos primos encontró en su rango y la lista de los mismos.
'''
import os

input1 = int(input("dime un numero entero positivo\n"))

array1 = []

def padre(input1):
    newpid = os.fork()
    if newpid == 0:
        input2 = input1/2
        print(input2)
        hijo(1, input2)
    else:
        if input1 % 2 == 0:
            input3 = input1 - (input1/2) +1
            hijo(input3, input1)
        else:
            input3 = input1 - (input1/2)
            hijo(input3, input1)

    print(array1)


def hijo(origen, final1):
    for i in range(origen, final1):
        cont = 0
        for j in range(1, i):
            if i % j == 0:
                cont+1
        if cont > 2:
            array1.append(i)

    
        
padre(input1)