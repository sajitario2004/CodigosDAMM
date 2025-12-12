import socket

socket_servidor = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

direccion = "127.0.0.1"
puerto = 8081

try:
    socket_servidor.bind((direccion, puerto))

    socket_servidor.listen(1)

    print(f"El serveidor esta escuchando menino en {direccion}:{puerto}")

    conn, addr = socket_servidor.accept()

    print("conexion establecida con el server")

    mensaje = conn.recv(1024).decode('utf-8')
    print(f"El cliente dice: {mensaje}")

    conn.send("hola compi he recivido tu mensaje".encode('utf-8'))

    

except  ConnectionError:
    print("no se puede conectar")

finally:
    print("cerramos la conexion")
    conn.close()
