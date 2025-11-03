'''
Crea un programa en Python que:

- Pida al usuario un número N (cantidad de procesos hijos a crear).

- Use os.fork() para crear N procesos hijos.

 -Cada hijo debe imprimir:

    Su número de proceso (PID).

    El número de orden en el que se cre (1<=numero<=N).

    Una pausa aleatoria entre impresiones (para simular trabajo), entre 1 y 2 segundos.
'''
import os
import time
import math

def padre(num):
    
    for i in range(1 , num):
        time.sleep(1)
        newpid=os.fork()
        if newpid == 0:
            hijo(i)
        else:
            print(f"Creando hijo con pid {newpid}")

def hijo(numHijo):
    sum=0

    os._exit(0)


input1 = int(input("Escribe el numero de hijos"))

padre(input1)

