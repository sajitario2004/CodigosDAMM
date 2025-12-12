import socket

# Creamos el socket del cliente
cliente = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

# Datos del servidor al que queremos conectar
host = '127.0.0.1'
puerto = 8081

try:
    # .connect() intenta establecer la comunicación
    cliente.connect((host, puerto))
    
    # Enviamos un mensaje (codificado a bytes)
    mensaje = "Hola Servidor, ¿me escuchas?"
    cliente.send(mensaje.encode('utf-8'))

    # Esperamos la respuesta del servidor
    respuesta = cliente.recv(1024).decode('utf-8')
    print(f"📨 Servidor responde: {respuesta}")

except ConnectionRefusedError:
    print("❌ No se pudo conectar. ¿Está el servidor encendido?")

finally:
    # Cerramos el socket
    cliente.close()