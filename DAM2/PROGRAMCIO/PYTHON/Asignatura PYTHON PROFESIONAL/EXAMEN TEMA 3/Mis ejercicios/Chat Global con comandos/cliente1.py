import socket

host = "127.0.0.1"
port = 8085

server_conection = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

server_conection.connect((host, port))
print("nos hemos conectado al server\n")



try:
    
    mensage1_server = server_conection.recv(1024).decode()
    print(mensage1_server)
    
    while True:
        mensage2_server = server_conection.recv(1024).decode()
        print(mensage2_server)
        num = input("\n")
        server_conection.sendall(num.encode())
        
        mensage_comprob = server_conection.recv(1024).decode()
        print(mensage_comprob)
        
        comprob = server_conection.recv(1024).decode()
        if  comprob == "0":
            print("Cerrando conexion desde el cliente...")
            break
            
        
except Exception as e:
    print(e)
finally:
    server_conection.close()