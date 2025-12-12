"""
debes realizar el ejercicio 1, pero esta vez además de despedirse el servidor 
hará un shutdown.
 - para ello debes definir una funcion dentro de la clase que deriva de 
 BaseRequestHandler, donde está la función handle y que llame a 
 server.shutdown() y server.server_close().
 - esa función la debes ejecutar en un hilo que se crea dentro, y también
 se activa, de la función handle. el servidor no se puede parar a sí mismo
 debe pararse desde un hilo.
"""

import socketserver
import threading

LOCALHOST = '127.0.0.1'
PORT = 8001

class Handler(socketserver.BaseRequestHandler):
    # metodo que detiene al servidor
    def stopper(self):
        print("Deteniendo el servidor...")
        self.server.shutdown()
        self.server.server_close()
        
    def handle(self):
        # bucle infinito
        while True:
            # se reciben bytes
            data = self.request.recv(1024)
            if not data:
                break
            # se decodifica como string
            decoded = data.decode() + '\n'
            # si limpio solo es un #
            if decoded.strip() == "#":
                # se crea un hilo que va a ejecutar el método stopper
                hilo = threading.Thread(target=self.stopper)
                # se inicia la actividad del hilo
                hilo.start()
                break
            # se envía el string de vuelta pero en mayúsculas
            self.request.sendall(decoded.upper().encode())
    def finish(self):
        self.request.sendall("Hasta luego!".encode())

try:
    server = socketserver.TCPServer((LOCALHOST, PORT), Handler)
    server.serve_forever()
except KeyboardInterrupt:
    print("Saliendo...")