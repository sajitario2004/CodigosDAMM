import socketserver
import random

IPADDRESS = "127.0.0.1"
PORT = 8006

# Lista de frases
frases = ["HOLA MUNDO", "PYTHON ES GENIAL", "SOCKET SERVER"]

class MyServer(socketserver.ThreadingTCPServer):
    allow_reuse_address = True

class Handler(socketserver.BaseRequestHandler):
    def handle(self):
        vidas = 3
        frase = random.choice(frases)
        self.request.sendall(f"Juego iniciado. Tienes {vidas} vidas.\n".encode('utf-8'))
        progreso = ["_" if c != " " else " " for c in frase]

        while vidas > 0 and "".join(progreso) != frase:
            self.request.sendall(f"Progreso: {''.join(progreso)}\n".encode('utf-8'))
            self.request.sendall(b"Pregunta letra o longitud (LETRA X / LONGITUD):\n")
            pregunta = self.request.recv(1024).decode('utf-8').strip().upper()

            if pregunta.startswith("LETRA "):
                letra = pregunta.split()[1]
                if letra in frase:
                    for i, c in enumerate(frase):
                        if c == letra:
                            progreso[i] = letra
                    self.request.sendall(b"ACIERTO\n")
                else:
                    vidas -= 1
                    self.request.sendall(f"FALLO. Vidas restantes: {vidas}\n".encode('utf-8'))
            elif pregunta == "LONGITUD":
                self.request.sendall(f"Longitud: {len(frase)}\n".encode('utf-8'))

            self.request.sendall(b"Propón la frase (PALABRA ...):\n")
            intento = self.request.recv(1024).decode('utf-8').strip().upper()
            if intento == frase:
                self.request.sendall(b"GANASTE!\n")
                break
            else:
                vidas -= 1
                self.request.sendall(f"Incorrecto. Vidas restantes: {vidas}\n".encode('utf-8'))

        if vidas == 0:
            self.request.sendall(f"PERDISTE. La frase era: {frase}\n".encode('utf-8'))

if __name__ == "__main__":
    with MyServer((IPADDRESS, PORT), Handler) as server:
        print(f"Servidor frases en {IPADDRESS}:{PORT}")
        server.serve_forever()
