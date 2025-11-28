"""
Recibe una cadena del cliente y la devuelve en mayúsculas. 
El servidor le está preguntando constantemente. 
Si el servidor recibe el carácter ‘#’ se acaba el bucle (Se desconecta el cliente) y el servidor se despide de él.
"""

import socketserver

class Handle(socketserver.BaseRequestHandler):
    def handle(self):
        data = self.request.recv(1024)
        self.request.sendall(b"Hola")


server = TCPServer(("localhost", 8000), Handle)
server.serve_forever()
