import os 

def padre():
    for bucle in range (1,6):
        newpid=os.fork()
        if newpid == 0:
            hijo(bucle)
        else:
            print(f"Creando hijo con PID {newpid}")    

def hijo(numHijo):
    suma = 0
    for bucle2 in range (1 , (os.getpid() % 100)):
        suma += bucle2
    print(f"Soy el hijo {numHijo} y la suma es de {suma} con el PID {os.getpid()}")
    os._exit(0)

padre()        