import socket

c = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

try:
    c.connect(("127.0.0.1", 8083))
    
    data = c.recv(1024)
    
    print("servidor recive: ", data.decode())
    print
    
    # Enviar respuesta
    c.sendall(b"Hola, servidor, soy tu cliente")
    
    
except socket.error as exc:
	print(f"Ha ocurrido el error {exc}")
finally:
    # Cerrar conexión
    c.close()
