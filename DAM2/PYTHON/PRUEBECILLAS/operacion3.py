import os
import socket

def servidor():
    s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    s.bind(('localhost', 12345))
    s.listen(5)
    print("Servidor escuchando en el puertos 12345")

    while True:
        conn, addr = s.accept()
        print(f"conexion desde el puerto {addr}")
        pid = os.fork()
        if pid == 0:
            s.close()
            conn.sendall(b"hola cliente \n")
            conn.close()
            os._exit(0)
        else:
            conn.close()

servidor()