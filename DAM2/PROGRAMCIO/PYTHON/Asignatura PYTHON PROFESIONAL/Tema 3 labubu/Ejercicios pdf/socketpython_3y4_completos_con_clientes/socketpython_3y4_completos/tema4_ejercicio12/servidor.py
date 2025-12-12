import socketserver

IPADDRESS = "127.0.0.1"
PORT = 8005

PALABRA_SECRETA = "PYTHON"

class MyServer(socketserver.ThreadingTCPServer):
    allow_reuse_address = True

class Handler(socketserver.BaseRequestHandler):
    def handle(self):
        progreso = ["_" for _ in PALABRA_SECRETA]
        fallos = 0
        self.request.sendall(b"Juego iniciado. Adivina la palabra.\n")

        while fallos < 6 and "".join(progreso) != PALABRA_SECRETA:
            self.request.sendall(f"Estado: {''.join(progreso)}\n".encode('utf-8'))
            self.request.sendall(b"Envía LETRA X o PALABRA XXXX:\n")
            intento = self.request.recv(1024).decode('utf-8').strip().upper()

            if intento.startswith("LETRA "):
                letra = intento.split()[1]
                if letra in PALABRA_SECRETA:
                    for i, l in enumerate(PALABRA_SECRETA):
                        if l == letra:
                            progreso[i] = letra
                    self.request.sendall(b"ACIERTO\n")
                else:
                    fallos += 1
                    self.request.sendall(b"FALLO\n")
            elif intento.startswith("PALABRA "):
                palabra = intento.split()[1]
                if palabra == PALABRA_SECRETA:
                    progreso = list(PALABRA_SECRETA)
                    self.request.sendall(b"GANASTE\n")
                else:
                    fallos += 1
                    self.request.sendall(b"FALLO\n")

        if "".join(progreso) != PALABRA_SECRETA:
            self.request.sendall(f"PERDISTE. La palabra era {PALABRA_SECRETA}\n".encode('utf-8'))

if __name__ == "__main__":
    with MyServer((IPADDRESS, PORT), Handler) as server:
        print(f"Servidor Hangman en {IPADDRESS}:{PORT}")
        server.serve_forever()
