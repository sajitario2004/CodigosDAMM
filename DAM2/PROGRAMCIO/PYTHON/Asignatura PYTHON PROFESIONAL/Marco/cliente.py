import socket
import threading
import time


running = True

def recibir():
    try:
        global running
        while running:
            mensaje = client_socket.recv(1024).decode()
            print(mensaje)
    except socket.error as e:
        print(e)
    finally:
        client_socket.close()
        running = False

def mandar():
    try:
        global running
        while running:
            put = input()
            client_socket.sendall(put.encode())
    except socket.error as e:
        print(e)
    except KeyboardInterrupt as e:
        print("Signal detected")
    finally:
        client_socket.close()
        running = False


if __name__ == '__main__':
    client_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    # Cambiar por la ip destino (192.168.20.110)
    client_socket.connect(("192.168.20.110", 8081))
    time.sleep(0.5)
    client_socket.sendall(input("Nombre: ").encode())
    recibir_hilo = threading.Thread(target=recibir, daemon=True)
    mandar_hilo = threading.Thread(target=mandar, daemon=True)
    recibir_hilo.start()
    mandar_hilo.start()
    recibir_hilo.join()
    mandar_hilo.join()