import threading

area_total = 0
# Funciones para calcular areas
def area_triangulo(base, altura):
    var_aux = (base * altura) / 2
    print(f"Area triángulo: {var_aux} m2")
    global area_total
    area_total+=(base * altura) / 2

def area_rectangulo(base, altura):
    var_aux=base*altura
    print(f"Area rectángulo: {var_aux} m2")
    global area_total
    area_total+=base * altura

# Crear hilos 
hilo1 = threading.Thread(target=area_triangulo, args=(10, 12,)) 
hilo2 = threading.Thread(target=area_rectangulo, args=(8, 12,))  
hilo3 = threading.Thread(target=area_rectangulo, args=(6, 5,)) 


hilo1.start()
hilo1.join()
hilo2.start()
hilo2.join()
hilo3.start()
hilo3.join()




print(f"✅ Calculo de áreas completado. el area total es {area_total}")
