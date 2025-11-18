def make_sandwich(lista_ingredientes):
    print("Making a sandwich with the following items: ")
    for i in range(1, lista_ingredientes.__len__()):
        print(lista_ingredientes[i])
    print("\n")
        
lista_ingredientes1 = ["tomato", "mayonesa", "tunna", "ham"]
lista_ingredientes2 = ["ham", "cheese"]

make_sandwich(lista_ingredientes1)
make_sandwich(lista_ingredientes2)