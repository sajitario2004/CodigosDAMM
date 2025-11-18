import socket

# Crear socket de cliente
client_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

try:
    # Conectar con el servidor
    client_socket.connect(("127.0.0.1", 8081))
    
    
    # Recibir mensaje del servidor
    data = client_socket.recv(1024)
    print("Servidor dice:", data.decode())

    # Enviar respuesta
    client_socket.sendall(b"Hola, servidor, soy tu cliente")
except socket.error as exc:
	print(f"Ha ocurrido el error {exc}")
finally:
    # Cerrar conexión
    client_socket.close()
