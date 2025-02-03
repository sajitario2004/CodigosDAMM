package ejercicio4Eval;

public class Principal {

	public static void main(String[] args) {
		Sorteo sorteo = new Sorteo(3);

		// Agregar nombres al sorteo
		sorteo.agregarNombre("Juan");
		sorteo.agregarNombre("María");
		sorteo.agregarNombre("Pedro");
		sorteo.agregarNombre("Ana");
		sorteo.agregarNombre("Luis");
		sorteo.agregarNombre("María"); // Nombre duplicado

		// Listar nombres
		sorteo.listarNombres();

		// Seleccionar nombres al azar
		System.out.println("\nSeleccionando 3 nombres al azar:");
		String[] seleccionados = sorteo.seleccionarNombresAleatorios(3);
		for (int i=0;i<seleccionados.length;i++) {
			System.out.println("- " + seleccionados[i]);
		}

		// Intentar seleccionar más nombres de los disponibles
		System.out.println("\nIntentando seleccionar 10 nombres al azar:");
		seleccionados = sorteo.seleccionarNombresAleatorios(10);
	}

}
