package ejercicio4Eval;

public class Sorteo {
	private String[] participantes;
	private int numeroActualParticipantes;

	public Sorteo(int capacidadInicial) {
		this.participantes = new String[capacidadInicial];
		this.numeroActualParticipantes = 0;
	}

	// Método para añadir un nombre al sorteo
	public void agregarNombre(String nombre) {
		if (existeNombre(nombre)) {
			System.out.println("El nombre '" + nombre + "' ya está en el sorteo.");
			return;
		}
		// Redimensionar si es necesario
		if (numeroActualParticipantes == participantes.length) {
			redimensionarArray();
		}
		participantes[numeroActualParticipantes++] = nombre;
		System.out.println("Nombre '" + nombre + "' añadido al sorteo.");
	}

	// Método para comprobar si un nombre ya existe
	public boolean existeNombre(String nombre) {
		for (int i = 0; i < numeroActualParticipantes; i++) {
			if (participantes[i].equalsIgnoreCase(nombre)) {
				return true;
			}
		}
		return false;
	}

	// Método para seleccionar nombres al azar sin repeticiones
	public String[] seleccionarNombresAleatorios(int cantidad) {
		if (cantidad > numeroActualParticipantes) {
			System.out.println("No hay suficientes participantes para seleccionar " + cantidad + " nombres.");
			return new String[0];
		}

		String[] seleccionados = new String[cantidad];
		boolean[] seleccionadosIndices = new boolean[numeroActualParticipantes];

		int seleccionadosCount = 0;
		while (seleccionadosCount < cantidad) {
			int indiceAleatorio = (int) (Math.random() * numeroActualParticipantes);
			if (!seleccionadosIndices[indiceAleatorio]) {
				seleccionados[seleccionadosCount++] = participantes[indiceAleatorio];
				seleccionadosIndices[indiceAleatorio] = true;
			}
		}

		return seleccionados;
	}

	// Método para listar los nombres almacenados
	public void listarNombres() {
		if (numeroActualParticipantes == 0) {
			System.out.println("No hay participantes en el sorteo.");
			return;
		}

		System.out.println("Participantes en el sorteo:");
		for (int i = 0; i < numeroActualParticipantes; i++) {
			System.out.println("- " + participantes[i]);
		}
	}

	// Método privado para redimensionar el arreglo
	private void redimensionarArray() {
		int nuevaCapacidad = participantes.length +1;
		String[] nuevoArreglo = new String[nuevaCapacidad];
		System.arraycopy(participantes, 0, nuevoArreglo, 0, participantes.length);
		participantes = nuevoArreglo;
		System.out.println("El arreglo fue redimensionado a una capacidad de " + nuevaCapacidad);
	}
}
