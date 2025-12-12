import socketserver

IPADDRESS = "127.0.0.1"
PORT = 8000

# Servidor multihilos
class MyServer(socketserver.ThreadingTCPServer):
    allow_reuse_address = True

# Handler para cada cliente
class Handler(socketserver.BaseRequestHandler):
    def setup(self):
        print(f"Conexión entrante de {self.client_address}")

    def handle(self):
        self.request.sendall(b"Bienvenido al juego de Piedra, Papel o Tijera!\n")
        # Esperar la elección del jugador
        self.request.sendall(b"Elige: piedra, papel o tijera: ")
        eleccion = self.request.recv(1024).strip().decode('utf-8')
        print(f"Jugador {self.client_address} eligió: {eleccion}")
        # Aquí podrías guardar la elección para enfrentarlo con otro jugador
        self.request.sendall(f"Has elegido: {eleccion}\n".encode('utf-8'))

    def finish(self):
        print(f"Conexión cerrada de {self.client_address}")

if __name__ == "__main__":
    with MyServer((IPADDRESS, PORT), Handler) as server:
        print(f"Servidor escuchando en {IPADDRESS}:{PORT}")
        server.serve_forever()
