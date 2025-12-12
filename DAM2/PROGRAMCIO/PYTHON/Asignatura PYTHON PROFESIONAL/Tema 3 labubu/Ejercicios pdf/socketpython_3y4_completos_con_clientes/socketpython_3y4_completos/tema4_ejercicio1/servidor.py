"""
recibe una cadena del cliente y la devuelve en mayúsculas. el servidor
le está preguntando constantemente. si el servidor recibe el caracter
'#' se acaba el bucle (se desconecta el cliente) y el servidor se 
despide de él
"""

import socketserver

# finales
LOCALHOST = '127.0.0.1'
PORT = 8001

# clase que define el comportamiento del servidor con cada cliente
class Handler(socketserver.BaseRequestHandler):
    def handle(self):
        # bucle infinito
        while True:
            # se recibe texto
            data = self.request.recv(1024)
            if not data:
                break
            # se pasa el texto de bytes a string
            decoded = data.decode() + '\n'
            # si el string limpio es un # se sale
            if decoded.strip() == "#":
                break
            # si no se sale se envía el string en mayusculas
            self.request.sendall(decoded.upper().encode())

    def finish(self):
        self.request.sendall("Hasta luego!".encode())

server = socketserver.TCPServer((LOCALHOST, PORT), Handler)
server.serve_forever()
