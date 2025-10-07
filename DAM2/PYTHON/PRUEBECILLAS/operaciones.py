import os

def padre():
    while True:
        newpid = os.fork()
        if newpid == 0:
            hijo()
        else:
            pids = (os.getpid(), newpid)
            print("Proceso padre: ", os.getpid(), "Nuevo proceso: ", newpid)
            reply = input("pulsa s si quieres crear un nuevo proceso")
            if reply != 's':
                break


def hijo():
    print('\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>'"Proceso hijo: " , os.getpid())
    exit(0)

padre()
