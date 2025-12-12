import socketserver
import subprocess  # Para ejecutar comandos del sistema

IPADDRESS = "127.0.0.1"  # Dirección local
PORT = 8001             # Puerto de escucha

# Creamos un servidor multihilo
class MyServer(socketserver.ThreadingTCPServer):
    allow_reuse_address = True  # Permite reiniciar el servidor sin esperar

# Clase que maneja cada cliente
class Handler(socketserver.BaseRequestHandler):
    def handle(self):
        # Mensaje de bienvenida al cliente
        self.request.sendall(b"Envía un comando para ejecutar:\n")
        
        # Recibimos el comando del cliente
        comando = self.request.recv(1024).decode('utf-8').strip()
        
        try:
            # Ejecutamos el comando usando Popen
            proceso = subprocess.Popen(comando, shell=True, stdout=subprocess.PIPE, stderr=subprocess.PIPE)
            
            # Capturamos la salida y errores del comando
            salida, error = proceso.communicate()
            
            # Enviamos la salida al cliente
            if salida:
                self.request.sendall(salida)
            # Enviamos los errores si los hay
            if error:
                self.request.sendall(error)
        except Exception as e:
            # En caso de error enviamos el mensaje al cliente
            self.request.sendall(f"Error: {e}".encode('utf-8'))

# Ejecutamos el servidor
if __name__ == "__main__":
    with MyServer((IPADDRESS, PORT), Handler) as server:
        print(f"Servidor ejecutando comandos en {IPADDRESS}:{PORT}")
        server.serve_forever()
