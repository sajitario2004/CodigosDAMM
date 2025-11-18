lista_mensajes = []

for i in range(1,11):
    lista_mensajes.append(f"mensaje Especial {i}\n")
    
print(lista_mensajes)

def send_menssages(lista_mensajes):
    for i in lista_mensajes:
        print(f"message: {i}")
        
    print(f"Message sent -----------------------------")
    print(lista_mensajes)
    
    
send_menssages(lista_mensajes)