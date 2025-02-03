package ejercicio5Eval;

public class Inventario {
	private String[] productos;
	private int[] cantidades;
	private int capacidad; // Tamaño máximo del inventario
	private int totalProductos; // Número actual de productos registrados

	// Constructor para inicializar el inventario con una capacidad fija
	public Inventario(int capacidad) {
		this.capacidad = capacidad;
		this.productos = new String[capacidad];
		this.cantidades = new int[capacidad];
		this.totalProductos = 0;
	}

	// Método para registrar productos
	public void registrarProducto(String nombre, int cantidadInicial) {
		// Verificar si el producto ya existe
		for (int i = 0; i < totalProductos; i++) {
			if (productos[i].equals(nombre)) {
				// Si existe, suma la cantidad al inventario existente
				cantidades[i] += cantidadInicial;
				System.out.println("Producto actualizado: " + nombre + " -> Nueva cantidad: " + cantidades[i]);

			}
		}

		// Verificar si hay espacio disponible en el inventario
		if (totalProductos < capacidad) {
			// Agregar el nuevo producto
			productos[totalProductos] = nombre;
			cantidades[totalProductos] = cantidadInicial;
			totalProductos++;
			System.out.println("Producto registrado: " + nombre + " -> Cantidad: " + cantidadInicial);
		} else {
			System.out.println("Error: No hay espacio suficiente en el inventario.");
		}
	}

	// Método para consultar la cantidad de un producto
	public String consultarCantidad(String nombre) {
		String mensaje="El producto " + nombre + " no está registrado en el inventario.";
		for (int i = 0; i < totalProductos; i++) {
			if (productos[i].equals(nombre)) {
				mensaje="Cantidad disponible de " + nombre + ": " + cantidades[i];
			}
		}
		return  mensaje;
	}

	// Método para reducir el inventario (vender productos)
	public void reducirInventario(String nombre, int cantidad) {
		for (int i = 0; i < totalProductos; i++) {
			if (productos[i].equals(nombre)) {
				if (cantidades[i] >= cantidad) {
					cantidades[i] -= cantidad;
					System.out.println("Venta realizada: " + cantidad + " unidades de " + nombre + ".");
					
				} else {
					System.out.println("Error: Cantidad insuficiente de " + nombre + " en el inventario.");
					
				}
			}
		}
		System.out.println("Error: El producto " + nombre + " no está registrado en el inventario.");
	}

	// Método para mostrar todo el inventario
	public void mostrarInventario() {
		System.out.println("Inventario actual:");
		for (int i = 0; i < totalProductos; i++) {
			System.out.println(productos[i] + ".Cantidad: " + cantidades[i]);
		}
	}

	// Método para calcular el valor total del inventario
	public double calcularValorTotal(double[] precios) {
		double valorTotal = 0.0;

		for (int i = 0; i < totalProductos; i++) {
			if (cantidades[i] != 0) {
				valorTotal += cantidades[i] * precios[i];
			}
		}
		return valorTotal;
	}
}
