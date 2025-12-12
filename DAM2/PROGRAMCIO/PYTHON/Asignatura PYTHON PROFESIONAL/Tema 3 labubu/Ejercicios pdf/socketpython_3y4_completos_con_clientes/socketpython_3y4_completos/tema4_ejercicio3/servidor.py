"""
implementa el juego de numeros aleatorios hecho con socket
"""

import socketserver
import random

LOCALHOST = "127.0.0.1"
PORT = 8000

class Handler(socketserver.BaseRequestHandler):
    def handle(self):
        # crear el numero aleatorio
        randomN = random.randint(1, 100)
        # se printea en consola del servidor el número generado
        print("El número aleatorio generado es", randomN)
        # se le envía al cliente las instrucciones
        mess = "Adivina un número entre 1 y 100!" 
        self.request.sendall(mess.encode())
        # contador de intentos
        tries = 0
        # bucle infinito
        while True:
            # se contabilizan los intentos
            tries += 1
            # se le dice al cliente cuantos intentos lleva
            mess = f"\nIntento {tries}: "
            self.request.sendall(mess.encode())
            # se recive un número y se pasa de bytes a int
            guess = self.request.recv(1024)
            guess = int(guess.decode())
            # se comprueba que es un número válido
            if (guess > 100 or guess < 1 or not guess):
                self.request.sendall(b"ERROR: tiene que ser entre 1 y 100")
            else:
                # se imprime el mensaje correspondiente según las condiciones
                if (guess > randomN):
                    self.request.sendall(b"Muy alto")
                elif (guess < randomN):
                    self.request.sendall(b"Muy bajo")
                else:
                    self.request.sendall(b"Correcto\n")
                    print(f"El cliente ha adivinado el número con {tries} intentos.")
                    break 

try:
    print("Este es el servidor del juego de adivinar el número.")
    server = socketserver.TCPServer((LOCALHOST, PORT), Handler)
    server.serve_forever()
except KeyboardInterrupt:
    print("Cerrando servidor...")
except Exception as e:
    print(f"Error: {e}")