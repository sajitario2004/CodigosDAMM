import socketserver

IPADDRESS = "127.0.0.1"
PORT = 8004

# Lista de palabras a memorizar
palabras = ["python", "socket", "servidor", "cliente", "programa"]

class MyServer(socketserver.ThreadingTCPServer):
    allow_reuse_address = True

class Handler(socketserver.BaseRequestHandler):
    def handle(self):
        puntos = 0
        for palabra in palabras:
            self.request.sendall(f"Memoriza esta palabra: {palabra}\n".encode('utf-8'))
            self.request.sendall(b"Repite la palabra:\n")
            respuesta = self.request.recv(1024).decode('utf-8').strip()
            if respuesta == palabra:
                puntos += 1
                self.request.sendall(b"Correcto!\n")
            else:
                self.request.sendall(f"Incorrecto. Fin del juego. Puntos: {puntos}\n".encode('utf-8'))
                break

if __name__ == "__main__":
    with MyServer((IPADDRESS, PORT), Handler) as server:
        print(f"Servidor de memorización en {IPADDRESS}:{PORT}")
        server.serve_forever()
