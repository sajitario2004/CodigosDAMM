import random
import socket
import threading

s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

try:
    s.bind(("127.0.0.1", 8083))
    s.listen(5)
    
    def clientes(conn, addr):
    #creamos numero
        numero = random.randint(1,100)
    
        mensaje = "Que pasa compi, dame un numero\n"
        conn.sendall(mensaje.encode())
        
        correcto = False
        while not correcto:
            num = int(conn.recv(1024).decode())
            if num > numero:
                mensaje = "Te as pasado 3 pueblos compi, pon un numero mas xico\n"
                conn.sendall(mensaje.encode())
            elif num < numero:
                mensaje = "Compi con mas ganas que ese numero es muy xico. pon uno mas grande\n"
                conn.sendall(mensaje.encode())
            else: 
                conn.sendall(b"Compi as hacertado\n")
                correcto = True
                break
        
        num =int(conn.recv(1024).decode())
        conn.sendall(b"Astalueguito compi\n")
        
    while True:
        conn, addr = s.accept()
        f = threading.Thread(target=clientes, args=(conn, addr))
        f.start()
    conn.close()
except socket.error as err:
    print(f"error: {err}")
finally:
    s.close()
    
