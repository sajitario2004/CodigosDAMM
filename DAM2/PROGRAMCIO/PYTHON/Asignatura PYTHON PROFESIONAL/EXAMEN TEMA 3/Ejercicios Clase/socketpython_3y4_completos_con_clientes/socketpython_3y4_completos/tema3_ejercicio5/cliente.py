import socket

SERVER_IP = '127.0.0.1'
SERVER_PORT = 8083

# abrir socket
s = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)

try:
    while True:
        frase = input("Escribe una frase para el servidor: ")
        if frase.lower().strip() == 'salir':
            break
        s.sendto(frase.encode(), (SERVER_IP, SERVER_PORT))
        datos, _ = s.recvfrom(1024)
        print(datos.decode())
except KeyboardInterrupt as ki:
    print("\nCerrando el programa...")
finally:
    s.close()