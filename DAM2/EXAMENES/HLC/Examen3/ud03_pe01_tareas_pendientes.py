''' 
Desarrolla un programa en Python que permita gestionar un control de tareas pendientes, aplicando el uso de listas, condicionales y bucles.
Cada tarea debe representarse como una lista con tres elementos:
tarea = [nombre, prioridad, estado]
donde:
•	nombre → Cadena de texto con el nombre de la tarea.
•	prioridad → Número entero del 1 al 10 (1 = baja, 10 = alta).
•	estado → Cadena con el valor "pendiente" o "finalizada".

Objetivos de aprendizaje
•	Practicar el uso de listas de listas.
•	Utilizar condicionales (if, elif, else).
•	Aplicar bucles (while, for) para recorrer listas.
•	Manipular listas y técnicas de ordenamiento.
•	Implementar un menú interactivo con opciones múltiples.

'''

# =====================================================
#   CONTROL DE TAREAS PENDIENTES
#   Plantilla base - Para completar por el alumno
# =====================================================

lista_tareas = []

# Apartado 2
def agregar_tarea(tareas):
    global lista_tareas
    # TODO: Solicitar nombre y prioridad (1-10)
    # TODO: Crear lista [nombre, prioridad, estado]
    # TODO: Agregar a la lista principal con append()
    
    lista_tareas.append(tareas)
    print("tarea insertada con exito")
    pass


# Apartado 3
def cambiar_estado(tareas, nombre,estado):
    
    # TODO: Cambiar estado de "pendiente" a "finalizada" o viceversa

    cont = 1
    for tarea in tareas:
        if nombre == tarea[0]:
            tareaAux = [nombre, tarea[1], estado]
            tarea = tareaAux
            cont += 1
    if cont == 1:
        print("Tarea no encontrada")
    else:
        print("Estado de la tarea cambiado")
    pass

def eliminar_tarea(tareas,nombre):
    # TODO: Eliminar una tarea según su nombre
    cont = 1

    for tarea in tareas[:]:
        if nombre == tarea[0]:
            tareas.pop(tarea)
            cont+=1


    if cont == 1:
        print("tarea no encontrada")
    else:
        print("tarea eliminada con exito\n")

    pass


# Apartado 4
def ordenar_tareas_por_prioridad(tareas):
    # TODO: Ordenar tareas por prioridad de mayor a menor
    
    '''
    # Te dejo el algoritmo de la burbuja que te puede servir
    
    Cómo funciona ( Ejemplo )
    1 La lista [5, 2, 9, 1, 5, 6] se recorre de izquierda a derecha.

    2 Comparamos cada par de elementos:

        5 y 2 → se intercambian → [2, 5, 9, 1, 5, 6]

        5 y 9 → no se intercambian

        9 y 1 → se intercambian → [2, 5, 1, 9, 5, 6]

        … y así sucesivamente.

    3 Cada pasada “empuja” el número más grande hacia el final.
    4 Se repite hasta que la lista queda completamente ordenada.
    
    
    def burbuja(lista):
        n = len(lista)
        
        for i in range(n):
            for j in range(0, n-i-1):
                if lista[j] > lista[j+1]:
                    temp = lista[j]
                    lista[j] = lista[j+1]
                    lista[j+1] = temp

    '''
    
    # Paso 1: Creamos una copia de la lista original para no modificarla directamente
    

    # Paso 2: Implementamos un ordenamiento sencillo (tipo burbuja)
    #         porque este tipo de ordenamiento se estudia en este tema.
    #         Recorremos la lista varias veces comparando elementos adyacentes.
    
    
    # Paso 3: Devolvemos la nueva lista ordenada
    

    pass


# Apartado 5
def buscar_tarea(tareas):
    # TODO: Buscar una tarea por nombre y mostrar su información
    # 1. Estudiar Python | Prioridad: 8 | Estado: pendiente
    cont =1
    nombre  = input("dime el nombre de la tarea. ")
    for tarea in tareas:
        if nombre == tarea[0]:
            print("tarea encontrada")
            print(tarea)
            cont += 1
    if cont != 1:
        print("tarea no encontrada")
    pass


# Apartado 6
def mostrar_tareas(tareas):
    # TODO: Mostrar todas las tareas con su nombre, prioridad y estado
    [print(f"{i} \n") for i in tareas]
    pass


# Apartado 7
def listar_tareas_por_prioridad(tareas):
    # TODO: Pedir prioridad y mostrar solo las tareas con ese valor
    '''
    Tareas ordenadas por prioridad (de mayor a menor):
    Leer un libro | Prioridad: 9 | Estado: pendiente
    Estudiar Python | Prioridad: 8 | Estado: pendiente
    Hacer ejercicio | Prioridad: 5 | Estado: finalizada
    Lavar ropa | Prioridad: 3 | Estado: pendiente

    '''

    lista_aux1 = []
    lista_aux2 = []
    lista_aux3 = []
    lista_aux4 = []
    lista_aux5 = []
    lista_aux6 = []
    lista_aux7 = []
    lista_aux8 = []
    lista_aux9 = []

    for tarea in tareas:
        if tarea[1] == 1:
            lista_aux1.append(tarea)
        if tarea[1] == 2:
            lista_aux2.append(tarea)
        if tarea[1] == 3:
            lista_aux3.append(tarea)
        if tarea[1] == 4:
            lista_aux4.append(tarea)
        if tarea[1] == 5:
            lista_aux5.append(tarea)
        if tarea[1] == 6:
            lista_aux6.append(tarea)
        if tarea[1] == 7:
            lista_aux7.append(tarea)
        if tarea[1] == 8:
            lista_aux7.append(tarea)
        if tarea[1] == 9:
            lista_aux9.append(tarea)
        

    lista_aux = [lista_aux1,lista_aux2,lista_aux3,lista_aux4,lista_aux5,lista_aux6,lista_aux7,lista_aux8,lista_aux9,]

    print("Aqui tienes la lista filtrada: ")
    print(lista_aux)

    pass





# Apartado 1 - Menú principal
def menu():
        global lista_tareas

        print("\n===== CONTROL DE TAREAS PENDIENTES =====")
        print("1. Agregar tarea")
        print("2. Cambiar estado de tarea")
        print("3. Eliminar tarea")
        print("4. Ordenar tareas por prioridad")
        print("5. Buscar tarea")
        print("6. Mostrar todas las tareas")
        print("7. Listar tareas por prioridad")
        print("8. Salir")
        print("=========================================")

        seleccion = int(input("Selecciona una opcion:"))
        if seleccion == 1:
            nombre = input("dime el nombre de la tarea: ")
            prioridad= int(input("dime la prioridad de la tarea entre (1 y 10): "))
            estado = input("dime el estado de la tarea (pendiente/finalizado): ")
            tarea = [nombre, prioridad, estado]
            agregar_tarea(tarea)
            menu()

        elif seleccion == 2:
            nombre = input("dime el nombre de la tarea que quieres cambiar el estado")
            estado = input("Dime el nuevo estado de la tarea (pendiente, finalizado)")
            cambiar_estado(lista_tareas, nombre, estado)
            menu()
        elif seleccion == 3:
            nombre = input("Dime el nombre de la tarea: ")
            eliminar_tarea(lista_tareas, nombre)
            menu()
        elif seleccion == 4:
            ordenar_tareas_por_prioridad()
            menu()
        elif seleccion == 5:
            buscar_tarea()
            menu()
        elif seleccion == 6:
            mostrar_tareas(lista_tareas)
            menu()
        elif seleccion == 7:
            listar_tareas_por_prioridad(lista_tareas)
            menu()
        elif seleccion == 8:
            print("Saliendo del programa...")
        else:
            print("⚠️ Opción no válida. Intenta de nuevo.")
            print("Saliendo del programa...")

# Ejecución principal
if __name__ == "__main__":
    menu()
