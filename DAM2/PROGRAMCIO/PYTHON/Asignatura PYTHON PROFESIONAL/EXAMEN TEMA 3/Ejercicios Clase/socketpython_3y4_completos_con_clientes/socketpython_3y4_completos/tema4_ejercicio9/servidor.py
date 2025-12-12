import socketserver
import os  # Para verificar si el archivo existe

IPADDRESS = "127.0.0.1"
PORT = 8002
CARPETA = "./archivos/"  # Carpeta donde guardamos los archivos que se pueden enviar

class MyServer(socketserver.ThreadingTCPServer):
    allow_reuse_address = True  # Permite reiniciar el servidor rápido

class Handler(socketserver.BaseRequestHandler):
    def handle(self):
        # Pedimos al cliente el nombre del archivo
        self.request.sendall(b"Introduce el nombre del archivo a recibir:\n")
        
        # Recibimos el nombre del archivo
        nombre_archivo = self.request.recv(1024).decode('utf-8').strip()
        ruta_archivo = os.path.join(CARPETA, nombre_archivo)
        
        # Verificamos si el archivo existe
        if os.path.exists(ruta_archivo):
            self.request.sendall(b"Archivo encontrado. Enviando contenido...\n")
            # Abrimos el archivo y lo enviamos línea por línea
            with open(ruta_archivo, "r", encoding="utf-8") as f:
                for linea in f:
                    self.request.sendall(linea.encode('utf-8'))
            self.request.sendall(b"\n--- Fin del archivo ---\n")
        else:
            # Si no existe, enviamos mensaje de error
            self.request.sendall(b"ERROR: El archivo no existe.\n")

# Ejecutamos el servidor
if __name__ == "__main__":
    with MyServer((IPADDRESS, PORT), Handler) as server:
        print(f"Servidor de archivos ejecutando en {IPADDRESS}:{PORT}")
        server.serve_forever()
