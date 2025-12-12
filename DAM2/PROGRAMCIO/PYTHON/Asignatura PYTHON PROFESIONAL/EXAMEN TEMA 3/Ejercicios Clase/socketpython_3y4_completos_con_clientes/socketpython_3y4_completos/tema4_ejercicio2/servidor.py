"""
el servidor al conectarse un cliente le devolverá un saludo y le dirá qué
número de cliente es. además, le dirá la dirección y el puerto del 
servidor y la dirección y el puerto del cliente que se ha conectado.
"""

LOCALHOST = "127.0.0.1"
PORT = 8001

import socketserver

class Handler(socketserver.BaseRequestHandler):
    def setup(self):
        # se crea el atributo en el servidor si no existe y se inicializa a 0
        if not hasattr(self.server, "conexiones"):
            self.server.conexiones = 0
        # se le suma 1
        self.server.conexiones += 1

    def handle(self):
        self.request.sendall("Hola! Bienvenido al TCPServer :)\n".encode())
        # se da el número de conexión
        ans = f"Eres el cliente {self.server.conexiones}.\n"
        self.request.sendall(ans.encode())
        # se da la información del servidor
        ans = f"La dirección del servidor es: {self.server.server_address}.\n"
        self.request.sendall(ans.encode())
        # se da la información del cliente
        ans = f"Tu dirección es: {self.client_address}.\n"
        self.request.sendall(ans.encode())

try:
    server = socketserver.TCPServer((LOCALHOST, PORT), Handler)
    server.serve_forever()
except Exception as e:
    print(f"Error: {e}")
except KeyboardInterrupt:
    print("\nDesconexión forzada...")