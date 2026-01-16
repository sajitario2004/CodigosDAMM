import asyncio
#await delante hace que la operación no bloquee el servidor. Permite concurrencia sin threads.
"""
Mi expliacion: las funciones async no son funciones sincronos sino que son asincronas
EJEMPLO QUE DA GEMINI:
1. La forma clásica (def - Síncrona)
Cuando usas un def normal, actúas de forma bloqueante (secuencial):
    -Viene el Cliente A y pide una pizza.
    -Vas a la cocina, metes la pizza en el horno y te quedas mirando el horno 10 minutos hasta que está lista.
    -Se la sirves.
    -Solo entonces, atiendes al Cliente B.

    Problema: Si tienes 100 clientes, el último comerá mañana. Mientras esperas al horno, no estás haciendo nada útil, pero estás "ocupado".

2. La forma moderna (async def - Asíncrona)
Cuando usas async def, creas una Corrutina:
    -Viene el Cliente A y pide una pizza.
    -Vas a la cocina, metes la pizza y le dices al horno: "Avísame cuando acabes" (await).
    -Inmediatamente te das la vuelta y atiendes al Cliente B.
    -Cuando el horno pita, vuelves, sacas la pizza A y la sirves.

"""
async def handle(reader, writer):
    # Mi expliacion:
    data = await reader.read(100) #Lee el buffer de entrada. 
    message = data.decode()
    print("Recibido:", message)

    writer.write("OK\n".encode())
    await writer.drain() #se asegura de que la información se envía.
    writer.close()

async def main():
    server = await asyncio.start_server(handle, "127.0.0.1", 8888)
    print("Servidor a la espera")	
    await server.serve_forever()

asyncio.run(main())
