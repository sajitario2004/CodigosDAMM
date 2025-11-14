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



# Apartado 2
def agregar_tarea(tareas):
    # TODO: Solicitar nombre y prioridad (1-10)
    # TODO: Crear lista [nombre, prioridad, estado]
    # TODO: Agregar a la lista principal con append()
    pass


# Apartado 3
def cambiar_estado(tareas,nombre,estado):
    # TODO: Cambiar estado de "pendiente" a "finalizada" o viceversa
    pass

def eliminar_tarea(tareas,nombre):
    # TODO: Eliminar una tarea según su nombre
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
    
    pass


# Apartado 6
def mostrar_tareas(tareas):
    # TODO: Mostrar todas las tareas con su nombre, prioridad y estado
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
    pass


# Apartado 1 - Menú principal
def menu():

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


       
        print("⚠️ Opción no válida. Intenta de nuevo.")

# Ejecución principal
if __name__ == "__main__":
    menu()
