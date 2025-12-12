import socketserver
import threading

IPADDRESS = "127.0.0.1"
PORT = 8008

jugadores = []   # Lista de conexiones
elecciones = {}  # Diccionario de elecciones de los jugadores

class MyServer(socketserver.ThreadingTCPServer):
    allow_reuse_address = True

def resultado(j1, j2):
    # Regla: piedra > tijera, tijera > papel, papel > piedra
    if j1 == j2:
        return "EMPATE"
    if (j1=="piedra" and j2=="tijera") or (j1=="tijera" and j2=="papel") or (j1=="papel" and j2=="piedra"):
        return "JUGADOR 1 GANA"
    return "JUGADOR 2 GANA"

class Handler(socketserver.BaseRequestHandler):
    def handle(self):
        jugadores.append(self.request)
        self.request.sendall(b"Bienvenido! Esperando otro jugador...\n")
        while len(jugadores) < 2:
            pass  # Esperamos al segundo jugador
        self.request.sendall(b"Segundo jugador conectado. Juega!\n")
        self.request.sendall(b"Elige: piedra, papel o tijera:\n")
        eleccion = self.request.recv(1024).decode('utf-8').strip().lower()
        elecciones[self.request] = eleccion

        # Esperamos a que el otro jugador elija
        while len(elecciones) < 2:
            pass

        # Determinamos resultado
        j1, j2 = list(elecciones.values())
        res = resultado(j1, j2)
        for c in jugadores:
            c.sendall(f"Jugador 1: {j1}, Jugador 2: {j2}, Resultado: {res}\n".encode('utf-8'))

        # Limpiamos para la próxima partida
        jugadores.clear()
        elecciones.clear()

if __name__ == "__main__":
    with MyServer((IPADDRESS, PORT), Handler) as server:
        print(f"Servidor Piedra, Papel o Tijera en {IPADDRESS}:{PORT}")
        server.serve_forever()
