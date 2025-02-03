package ejercicio5Eval;

public class Principal {
	public static void main(String[] args) {
		// Crear un inventario con capacidad para 5 productos
		Inventario inventario = new Inventario(5);

		// Registrar productos
		inventario.registrarProducto("Manzanas", 50);
		inventario.registrarProducto("Naranjas", 30);
		inventario.registrarProducto("Plátanos", 20);

		// Consultar cantidad de un producto
		System.out.println(inventario.consultarCantidad("Manzanas"));
		System.out.println(inventario.consultarCantidad("Uvas"));

		// Reducir inventario
		inventario.reducirInventario("Manzanas", 10);
		inventario.reducirInventario("Manzanas", 100);

		// Mostrar inventario
		inventario.mostrarInventario();

		// Calcular el valor total del inventario
		double[] precios = { 2.0, 1.5, 1.2, 0.0, 0.0 }; // Precios alineados con el inventario
		System.out.println("Valor total del inventario:" + inventario.calcularValorTotal(precios));
	}
}
