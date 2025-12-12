import socketserver

IPADDRESS = "127.0.0.1"
PORT = 8003

# Diccionario de traducción
traducciones = {
    "hola": "hello",
    "adiós": "goodbye",
    "perro": "dog",
    "gato": "cat",
    "casa": "house"
}

class MyServer(socketserver.ThreadingTCPServer):
    allow_reuse_address = True

class Handler(socketserver.BaseRequestHandler):
    def handle(self):
        self.request.sendall(b"¿A qué idioma traducir? (ingles/espanol):\n")
        idioma = self.request.recv(1024).decode('utf-8').strip().lower()

        self.request.sendall(b"Escribe la palabra:\n")
        palabra = self.request.recv(1024).decode('utf-8').strip().lower()

        if idioma == "ingles":
            traduccion = traducciones.get(palabra, "Palabra no encontrada")
        elif idioma == "espanol":
            # Invertimos el diccionario para traducción al español
            inverso = {v: k for k, v in traducciones.items()}
            traduccion = inverso.get(palabra, "Palabra no encontrada")
        else:
            traduccion = "Idioma no soportado"

        self.request.sendall(f"Traducción: {traduccion}\n".encode('utf-8'))

if __name__ == "__main__":
    with MyServer((IPADDRESS, PORT), Handler) as server:
        print(f"Servidor de traducción en {IPADDRESS}:{PORT}")
        server.serve_forever()
