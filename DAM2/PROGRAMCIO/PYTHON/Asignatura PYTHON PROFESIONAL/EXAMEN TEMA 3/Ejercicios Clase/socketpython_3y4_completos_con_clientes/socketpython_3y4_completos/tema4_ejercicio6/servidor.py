"""
repite el ejercicio 3 para varios clientes
"""

import socketserver
import random

LOCALHOST = "127.0.0.1"
PORT = 8000


# se define el servidor multihilos
class MyServer(socketserver.ThreadingTCPServer):
    allow_reuse_address = True

class Handler(socketserver.BaseRequestHandler):
    def handle(self):
        # crear el numero aleatorio
        randomN = random.randint(1, 100)
        # se printea en consola del servidor el número generado
        print(f"El número aleatorio generado para {self.client_address} es", randomN)
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
    print("Este es el servidor multihilos del juego de adivinar el número.")
    server = MyServer((LOCALHOST, PORT), Handler)
    server.serve_forever()
except KeyboardInterrupt:
    print("Cerrando servidor...")
except Exception as e:
    print(f"Error: {e}")
