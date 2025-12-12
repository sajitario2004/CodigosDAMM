"""
El servidor genera un número secreto aleatorio (por ejemplo, entre 1 y 100).
Un cliente responde si el número es "muy alto", "muy bajo" o "correcto".
El cliente sigue enviando intentos hasta acertar.
"""
 
import socket

client_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

try:
    client_socket.connect(("127.0.0.1", 8083))
    while True:
        # recibe datos del servidor
        data = client_socket.recv(1024)
        message = data.decode()
        print("Servidor dice:", message)
        if message.lower() == "correcto":
            print("Has adivinado el número!")
            break
        guess = input("Introduce tu intento: ")
        client_socket.sendall(guess.encode())
except socket.error as e:
    print(f"Error de socket: {e}")
except KeyboardInterrupt:
    print("Cerrando programa...")
finally:
    client_socket.close()