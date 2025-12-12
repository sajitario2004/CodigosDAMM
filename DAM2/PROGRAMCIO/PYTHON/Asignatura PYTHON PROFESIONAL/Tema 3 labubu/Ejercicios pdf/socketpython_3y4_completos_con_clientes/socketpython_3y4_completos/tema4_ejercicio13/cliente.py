import socket  # Para crear el cliente TCP

# Creamos el socket del cliente (IPv4, TCP)
client = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

# Pedimos al usuario la IP del servidor (por defecto localhost)
host = input("IP del servidor (ENTER para 127.0.0.1): ").strip()
if host == "":
    host = "127.0.0.1"

# Pedimos el puerto del servidor
port = int(input("Puerto del servidor: "))

# Nos conectamos al servidor
client.connect((host, port))
print("Conectado al servidor. Escribe texto, ENTER vacío para salir.")

try:
    while True:
        # Pedimos al usuario que escriba un mensaje
        msg = input("Mensaje para el servidor: ")
        if msg == "":
            # Si está vacío, salimos
            break

        # Enviamos el mensaje al servidor
        client.send(msg.encode())

        # Intentamos leer una respuesta del servidor
        data = client.recv(1024)
        if not data:
            print("Servidor cerrado.")
            break

        print("Servidor:", data.decode().strip())
finally:
    # Cerramos el socket
    client.close()
    print("Cliente desconectado.")
