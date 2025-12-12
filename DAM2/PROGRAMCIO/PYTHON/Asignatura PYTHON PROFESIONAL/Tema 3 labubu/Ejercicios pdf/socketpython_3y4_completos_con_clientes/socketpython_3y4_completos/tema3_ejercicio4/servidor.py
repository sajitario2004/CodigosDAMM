"""
El servidor genera un número secreto aleatorio (por ejemplo, entre 1 y 100). Un cliente se conecta y envía intentos. El servidor responde si el número es:
"Muy alto"
"Muy bajo"
"Correcto”
El cliente sigue enviando intentos hasta acertar.

Puede jugar con muchos clientes a la vez
"""

import socket
import random
import threading

def threadRoutine(conn, addr):
    # crear el numero aleatorio
    randomN = random.randint(1, 100)
    print(f"El número aleatorio generado para el thread {addr} es: ", randomN)
    mess = "Adivina un número entre 1 y 100!\n" 
    conn.sendall(mess.encode())
    tries = 0
    try:
        while True:
            tries += 1
            mess = f"\nIntento {tries}: "
            conn.sendall(mess.encode())      
            guess = conn.recv(1024)
            if not guess or guess.decode().strip().isdigit():
                print(f"Debes introducir un número válido")
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
    except Exception as e:
        print(f"Error en thread {addr}: {e}")
    finally:
        conn.close()

def main():
    # creo el socket
    server_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

    try:
        server_socket.bind(("0.0.0.0", 8083))
        server_socket.listen(5)
        print("Este es el servidor del juego de adivinar el número.")
        while True:
            conn, addr = server_socket.accept()
            t = threading.Thread(target=threadRoutine, args=(conn, addr))
            t.start()
    except socket.error as e:
        print(f"Error de socket: {e}")
    except KeyboardInterrupt as ki:
        print("Cerrando programa...")
    finally:
        server_socket.close()

if __name__ == "__main__":
    main()