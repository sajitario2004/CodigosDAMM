import socket

sock = socket.socket()
sock.connect(("127.0.0.1", 8083))
sock.sendall(b"Hola servidor desde socketserver!")
print(sock.recv(1024).decode())
sock.close()
