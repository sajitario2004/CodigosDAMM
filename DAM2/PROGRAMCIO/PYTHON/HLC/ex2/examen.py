import random

# ============================
# LISTA DE PRODUCTOS
# ============================

inventario = []

for i in range(1, 31):
    proveedores = {
        f"Proveedor{i}A": {
            "precio_producto": round(random.uniform(1, 50), 2),
            "email": f"contacto{i}A@empresa.com",
            "persona_contacto": f"Persona{i}A"
        },
        f"Proveedor{i}B": {
            "precio_producto": round(random.uniform(1, 50), 2),
            "email": f"contacto{i}B@empresa.com",
            "persona_contacto": f"Persona{i}B"
        }
    }
    inventario.append({
        "nombre": f"Producto{i}",
        "precio": round(random.uniform(5, 100), 2),
        "stock": random.randint(1, 100),
        "stock_minimo": random.randint(2, 10),
        "proveedores": proveedores
    })


# ============================
# EJERCICIO 1: Gestión básica de productos
# ============================

def nuevo_producto(nombre, precio, stock, proveedores=None, stock_minimo=2):
    """
    Apartado 1 y Ejercicio 2 (modificado):
    Crear un diccionario que represente un producto con 'nombre', 'precio', 'stock'.
    Ahora acepta 'proveedores' (diccionario) y 'stock_minimo' (entero) opcionales.

    proveedores: dict opcional con clave=nombre_proveedor, valor=dict(datos del proveedor)
    stock_minimo: mínimo de stock para el control
    """
    return {
        "nombre": nombre,
        "precio": precio,
        "stock": stock,
        "stock_minimo": stock_minimo,
        "proveedores": proveedores or {}
    }

def mostrar_inventario(lista):
    """
    Apartado 3:
    Recorrer la lista de productos y mostrar sus datos: nombre, precio y stock.
    """
    for p in lista:
        print(f"Producto: {p.get('nombre','<sin nombre>')} | Precio: {p.get('precio',0)}€ | "
              f"Stock: {p.get('stock',0)} | Stock mín.: {p.get('stock_minimo','-')}")

def actualizar_stock(producto, cantidad):
    """
    Apartado 4:
    Modificar el stock sumando o restando la cantidad.
    """
    producto["stock"] = producto.get("stock", 0) + cantidad
    return producto["stock"]


# ============================
# EJERCICIO 2: Diccionarios con proveedores
# ============================

def nuevo_producto_con_proveedores(nombre, precio, stock, proveedores=None):
    """
    Apartado 1:
    Crear un producto que incluya un diccionario de proveedores.
    """
    return nuevo_producto(nombre, precio, stock, proveedores=proveedores)

def mostrar_proveedores(producto):
    """
    Apartado 3:
    Mostrar los proveedores de un producto y sus datos.
    """
    provs = producto.get("proveedores", {})
    if not provs:
        print(f"El producto '{producto.get('nombre','?')}' no tiene proveedores registrados.")
        return
    print(f"Proveedores de {producto.get('nombre','<sin nombre>')}:")
    for nombre, datos in provs.items():
        print(f" - {nombre} -> {', '.join(f'{k}: {v}' for k, v in datos.items())}")


# ============================
# EJERCICIO 3: Búsquedas en el inventario
# ============================

def buscar_producto(inventario, nombre):
    """
    Apartado 1:
    Buscar un producto por su nombre y devolver el diccionario o None si no existe.
    """
    return next((p for p in inventario if p.get("nombre","").lower()==nombre.lower()), None)

def buscar_por_proveedor(inventario, nombre_proveedor):
    """
    Apartado 2:
    Mostrar todos los productos que son suministrados por un proveedor.
    """
    encontrados = [p for p in inventario if nombre_proveedor in p.get("proveedores",{})]
    if encontrados:
        print(f"Productos suministrados por '{nombre_proveedor}':")
        for p in encontrados:
            print(f" - {p.get('nombre')} (Stock actual: {p.get('stock',0)})")
    else:
        print(f"No se encontraron productos para el proveedor '{nombre_proveedor}'.")
    return encontrados


# ============================
# EJERCICIO 4: Control de stock y mínimos
# ============================

def asignar_stock_minimo(producto, minimo):
    """
    Apartado 1:
    Añadir clave 'stock_minimo' a un producto con valor entre 2 y 10.
    """
    producto["stock_minimo"] = min(max(minimo, 2), 10)
    return producto["stock_minimo"]

def listar_bajo_minimos(inventario):
    """
    Apartado 2:
    Devolver los productos cuyo stock es menor al stock mínimo.
    """
    return [p for p in inventario if p.get("stock",0) < p.get("stock_minimo",0)]


# ============================
# EJERCICIO 5: Inventario avanzado
# ============================

def resumen_inventario(inventario):
    """
    Apartado 1:
    Mostrar total de productos, media de precios y producto con mayor stock.
    """
    total = len(inventario)
    media = sum(p.get("precio",0) for p in inventario)/total if total else 0
    mayor = max(inventario, key=lambda p: p.get("stock",0)) if total else None
    print(f"Total productos: {total}")
    print(f"Precio medio: {media:.2f}€")
    if mayor:
        print(f"Producto con mayor stock: {mayor.get('nombre')} ({mayor.get('stock')} unidades)")
    return {"total": total, "media_precio": media, "mayor_stock": mayor}

def productos_por_ciudad(inventario, ciudad):
    """
    Apartado 2:
    Mostrar productos cuyos proveedores se encuentren en la ciudad indicada.
    """
    resultados = []
    for p in inventario:
        if any(datos.get("ciudad","").lower()==ciudad.lower() for datos in p.get("proveedores",{}).values()):
            resultados.append(p)
    if resultados:
        print(f"Productos con proveedores en '{ciudad}':")
        for p in resultados:
            print(f" - {p.get('nombre')} (Stock: {p.get('stock')})")
    else:
        print(f"No se encontraron productos con proveedores en '{ciudad}'.")
    return resultados

def añadir_proveedor(producto, nombre, datos_dict):
    """
    Apartado 3:
    Agregar un proveedor al diccionario de proveedores de un producto.
    """
    producto.setdefault("proveedores", {})[nombre] = datos_dict
    return producto["proveedores"]


# ============================
# MENÚ PRINCIPAL (Opcional)
# ============================

def menu():
    """
    Crear un menú interactivo para usar las funciones de inventario:
    1. Mostrar inventario
    2. Buscar producto por nombre
    3. Buscar productos por proveedor
    4. Filtrar productos por ciudad
    5. Actualizar stock
    6. Añadir proveedor
    7. Listar productos bajo stock mínimo
    8. Resumen del inventario
    0. Salir
    """
    opciones = {"1": mostrar_inventario, "0": lambda _: print("Saliendo...")}
    while True:
        print("\n--- MENÚ DE INVENTARIO (demo) ---")
        print("1) Mostrar inventario | 0) Salir")
        op = input("Elige opción: ").strip()
        if op == "0": break
        (opciones.get(op) or (lambda _: print("Opción no reconocida.")))(inventario)


if __name__ == '__main__':
    inventario_ej = [
        nuevo_producto("Manzana",0.50,50,{"FrutasSL":{"ciudad":"Madrid","telefono":"910111222"},
                                          "EcoFruta":{"ciudad":"Sevilla","telefono":"954333444"}},5),
        nuevo_producto("Leche",1.20,20,{"LacteosSA":{"ciudad":"Barcelona","telefono":"931111222"},
                                        "Lecheria":{"ciudad":"Madrid","telefono":"917777888"}},10),
        nuevo_producto("Pan",0.80,8,{"PanaderoWeb":{"ciudad":"Sevilla","telefono":"954555666"},
                                     "HornoCentral":{"ciudad":"Valencia","telefono":"963111222"}},10),
        nuevo_producto("Jabon",2.50,3,{"Quimicos":{"ciudad":"Bilbao","telefono":"944111333"},
                                      "LimpioSL":{"ciudad":"Madrid","telefono":"910222333"}},4),
        nuevo_producto("Huevos",2.80,12,{"GranjaFelix":{"ciudad":"Valencia","telefono":"963444555"},
                                         "HuevosExpress":{"ciudad":"Madrid","telefono":"910999000"}},6)
    ]

    print("\n=== Mostrar inventario de ejemplo ===")
    mostrar_inventario(inventario_ej)

    print("\n=== Mostrar proveedores de cada producto ===")
    for p in inventario_ej:
        mostrar_proveedores(p)

    print("\n=== Buscar por proveedor (existente) ===")
    buscar_por_proveedor(inventario_ej, "LacteosSA")

    print("\n=== Buscar por proveedor (inexistente) ===")
    buscar_por_proveedor(inventario_ej, "ProveedorNoExiste")

    print("\n=== Listar productos bajo stock mínimo ===")
    for p in listar_bajo_minimos(inventario_ej):
        print(f" - {p.get('nombre')} (Stock: {p.get('stock')} < Min: {p.get('stock_minimo')})")

    print("\n=== Actualizar stock para poner 'Pan' bajo mínimos y verificar ===")
    actualizar_stock(buscar_producto(inventario_ej,"Pan"), -6)
    for p in listar_bajo_minimos(inventario_ej):
        print(f" - {p.get('nombre')} (Stock: {p.get('stock')} < Min: {p.get('stock_minimo')})")

    print("\n=== Resumen del inventario ===")
    resumen_inventario(inventario_ej)

    print("\n=== Productos por ciudad: 'Madrid' ===")
    productos_por_ciudad(inventario_ej, "Madrid")

    print("\n=== Añadir nuevo proveedor a 'Manzana' y mostrar proveedores ===")
    añadir_proveedor(buscar_producto(inventario_ej,"Manzana"),
                      "NuevoProveedor",{"ciudad":"Granada","telefono":"958000111"})
    mostrar_proveedores(buscar_producto(inventario_ej,"Manzana"))

    print("\n=== Fin de la demostración ===")
