import socket

c = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

try:
    c.connect(("127.0.0.1", 8084))
    
    # Primer mensaje del servidor
    data = c.recv(1024)
    print("Servidor:", data.decode().strip())
    
    comprob = False
    while not comprob:
        # Pedir número al usuario
        text = input("Dime el número: ")
        c.sendall(text.encode())
        
        # Recibir respuesta del servidor
        data = c.recv(1024)
        mensaje = data.decode().strip()
        print("Servidor:", mensaje)
        
        # Comprobar si hemos acertado
        if mensaje.startswith("Compi has acertado") or mensaje.startswith("Compi as hacertado"):
            comprob = True
    
    # Mensaje final
    data = c.recv(1024)
    if data:
        print("Servidor:", data.decode().strip())
    
except socket.error as exc:
	print(f"Ha ocurrido el error {exc}")
finally:
    # Cerrar conexión
    c.close()
