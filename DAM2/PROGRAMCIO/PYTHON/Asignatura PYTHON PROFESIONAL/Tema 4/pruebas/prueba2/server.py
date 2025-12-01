import socketserver

class MiHandler(socketserver.BaseRequestHandler):
    def handle(self):
        print(f"Cliente conectado: {self.client_address}")

        data = self.request.recv(1024).strip()
        print("Cliente dice:", data.decode())

        self.request.sendall("Hola cliente, recibí tu mensaje.".encode())

if __name__ == "__main__":
    server = socketserver.TCPServer(("127.0.0.1", 8083), MiHandler)
    print("Servidor escuchando en 127.0.0.1:8083...")
    server.serve_forever()