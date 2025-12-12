import socket
import threading
import time

# Configuración del servidor
HOST = '127.0.0.1'  # Localhost
PORT = 8082        # Puerto arbitrario ( > 1024)

# Variables globales para guardar el estado del juego
clientes = []       # Guardará las conexiones de los sockets
jugadas = {}        # Diccionario para guardar: {0: 'piedra', 1: 'papel'}
lock = threading.Lock() # Para evitar conflictos al escribir variables compartidas

def calcular_ganador(j0, j1):
    if j0 == j1:
        return "Empate", "Empate"
    
    ganador_0 = False
    if (j0 == 'piedra' and j1 == 'tijera') or (j0 == 'papel' and j1 == 'piedra') or (j0 == 'tijera' and j1 == 'papel'):
        ganador_0 = True
        
    if ganador_0:
        return "¡Ganaste!", "Perdiste (Rival eligió " + j0 + ")"
    else:
        return "Perdiste (Rival eligió " + j1 + ")", "¡Ganaste!"

def manejar_cliente(conn, addr, id_jugador):
    print(f"[NUEVA CONEXIÓN] Jugador {id_jugador} conectado desde {addr}")
    
    try:
        # 1. Mensaje de bienvenida / Espera
        conn.sendall(b"Bienvenido. Eres el Jugador " + str(id_jugador + 1).encode() + b".\n")
        
        # Bucle simple para esperar a que ambos estén conectados
        while len(clientes) < 2:
            conn.sendall(b"Esperando al otro jugador...\n")
            time.sleep(2)
        
        conn.sendall(b"JUEGO INICIADO! Escribe: piedra, papel o tijera\n")

        while True:
            # 2. Recibir jugada
            data = conn.recv(1024).decode().strip().lower()
            if not data:
                break
            
            # Validar entrada
            if data not in ['piedra', 'papel', 'tijera']:
                conn.sendall(b"Opcion invalida. Intenta de nuevo.\n")
                continue

            # Guardar jugada de forma segura
            print(f"Jugador {id_jugador} ha jugado.")
            with lock:
                jugadas[id_jugador] = data

            # 3. Esperar al otro jugador (Sincronización)
            conn.sendall(b"Esperando al rival...\n")
            
            while True:
                with lock:
                    # Si ambos han jugado (diccionario tiene 2 llaves) salimos del loop
                    if len(jugadas) == 2:
                        break
                time.sleep(0.5) # Pequeña pausa para no saturar CPU

            # 4. Calcular resultado (solo lo hace un hilo para evitar duplicidad, o ambos leen)
            with lock:
                j0 = jugadas[0]
                j1 = jugadas[1]
            
            # Determinar mensaje para ESTE cliente
            res_0, res_1 = calcular_ganador(j0, j1)
            mensaje = res_0 if id_jugador == 0 else res_1
            
            conn.sendall(f"Resultado: {mensaje}\n".encode())

            # Limpiar jugadas para la siguiente ronda (un poco 'truculento' con hilos, 
            # hacemos que esperen un poco antes de borrar para que ambos lean)
            time.sleep(1) 
            with lock:
                if len(jugadas) > 0:
                    jugadas.clear()
            
            conn.sendall(b"Juega de nuevo (o Ctrl+C para salir):\n")

    except Exception as e:
        print(f"Error con Jugador {id_jugador}: {e}")
    finally:
        conn.close()

def main():
    servidor = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    servidor.bind((HOST, PORT))
    servidor.listen()
    print(f"[ESCUCHANDO] Servidor en {HOST}:{PORT}")

    id_counter = 0
    while id_counter < 2:
        conn, addr = servidor.accept()
        clientes.append(conn)
        
        # Iniciar un hilo para este cliente
        thread = threading.Thread(target=manejar_cliente, args=(conn, addr, id_counter))
        thread.start()
        
        id_counter += 1
        print(f"[CONECTADOS] {len(clientes)}/2")

if __name__ == "__main__":
    main()