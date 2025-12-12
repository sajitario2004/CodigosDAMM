"""
El servidor genera un número secreto aleatorio (por ejemplo, entre 1 y 100). Un cliente se conecta y envía intentos. El servidor responde si el número es:
"Muy alto"
"Muy bajo"
"Correcto”
El cliente sigue enviando intentos hasta acertar.

"""

import socket
import random

# creo el socket
server_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

try:
    server_socket.bind(("0.0.0.0", 8083))
    server_socket.listen(5)

    # crear el numero aleatorio
    randomN = random.randint(1, 100)
    print("Este es el servidor del juego de adivinar el número.")
    print("El número aleatorio generado es", randomN)

    conn, dir = server_socket.accept()
    mess = "Adivina un número entre 1 y 100!" 
    conn.sendall(mess.encode())
    tries = 0
    while True:
        tries += 1
        mess = f"\nIntento {tries}: "
        conn.sendall(mess.encode())      
        guess = conn.recv(1024)
        guess = int(guess.decode())
        if (guess > 100 or guess < 1):
            conn.sendall(b"ERROR: tiene que ser entre 1 y 100")
        else:
            if (guess > randomN):
                conn.sendall(b"Muy alto")
            elif (guess < randomN):
                conn.sendall(b"Muy bajo")
            else:
                conn.sendall(b"Correcto\n")
                break 
    conn.close()
except socket.error as e:
    print(f"Error de socket: {e}")
except KeyboardInterrupt as ki:
    print("Cerrando programa...")
finally:
    server_socket.close()
