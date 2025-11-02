import os

def padre():
    for num in range (1,4):
        newpid = os.fork()
        if newpid == 0:
            hijo(num)
        else:
            print(f"Soy el padre  con PID {os.getpid()}")

def hijo(numHijo):
    print(f"Soy el hijo {numHijo} con el PID {os.getpid()}") 
    os._exit(0)
    
padre()          