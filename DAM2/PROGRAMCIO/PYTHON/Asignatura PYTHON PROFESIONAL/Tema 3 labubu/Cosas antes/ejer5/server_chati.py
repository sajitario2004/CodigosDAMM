import random
import socket
import threading

s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

try:
    s.bind(("127.0.0.1", 8083))
    s.listen(5)

    def clientes(conn, addr):
        numero = random.randint(1, 100)
        conn.sendall(b"Que pasa compi, dame un numero\n")

        correcto = False
        while not correcto:
            try:
                num = int(conn.recv(1024).decode())
            except ValueError:
                conn.sendall(b"Eso no es un numero compi\n")
                continue

            if num > numero:
                mensaje = "Te has pasado, pon uno mas chico\n"
                conn.sendall(mensaje.encode())
            elif num < numero:
                mensaje = "Es muy pequeño, pon uno mas grande\n"
                conn.sendall(mensaje.encode())
            else:
                mensaje = "¡Correcto compi!\n"
                conn.sendall(mensaje.encode())
                correcto = True

        conn.sendall(b"Astalueguito compi\n")
        conn.close()

    while True:
        conn, addr = s.accept()
        f = threading.Thread(target=clientes, args=(conn, addr))
        f.start()

except socket.error as err:
    print(f"error: {err}")
finally:
    s.close()
