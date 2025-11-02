#crea un proceso y matalo
    #listar proceso
    #matar proceso
    #salir

import psutil
import time
import subprocess

def menu():
    subprocess.run("clear")
    print("Menu")
    print("1. listar proceso")
    print("2. matar proceso")
    print("3. salir")
    opc = input("introduce opcion(1-3)\n")
    return  opc

opc = int (menu())

while (opc < 1 or opc >3) and not salir:
    opc = int(menu())
    match opc:
        case 1: listar()
        case 2: matar()
        case 3: salir = True

def listar():
    print