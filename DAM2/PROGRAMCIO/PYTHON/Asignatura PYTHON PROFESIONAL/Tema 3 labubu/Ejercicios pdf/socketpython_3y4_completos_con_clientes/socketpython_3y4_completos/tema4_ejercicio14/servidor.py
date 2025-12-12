import socketserver
import threading

IPADDRESS = "127.0.0.1"
PORT = 8007

clientes = []

class MyServer(socketserver.ThreadingTCPServer):
    allow_reuse_address = True

class Handler(socketserver.BaseRequestHandler):
    def handle(self):
        clientes.append(self.request)
        self.request.sendall(b"Bienvenido al chat!\n")
        try:
            while True:
                mensaje = self.request.recv(1024)
                if not mensaje:
                    break
                for c in clientes:
                    if c != self.request:
                        c.sendall(mensaje)
        finally:
            clientes.remove(self.request)

if __name__ == "__main__":
    with MyServer((IPADDRESS, PORT), Handler) as server:
        print(f"Servidor de chat en {IPADDRESS}:{PORT}")
        server.serve_forever()
