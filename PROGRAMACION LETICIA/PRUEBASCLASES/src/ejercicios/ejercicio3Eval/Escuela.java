package ejercicios.ejercicio3Eval;

public class Escuela {
	private Clase[] clases;
	private int numeroActualClases;

	public Escuela(int maxClases) {
		this.clases = new Clase[maxClases];
		this.numeroActualClases = 0;
	}

	public void agregarClase(Clase clase) {
		if (numeroActualClases < clases.length) {
			clases[numeroActualClases++] = clase;
		} else {
			System.out.println("No se pueden agregar más clases, la escuela está llena.");
		}
	}

	public Clase buscarClase(String nombreClase) {
		for (int i = 0; i < numeroActualClases; i++) {
			if (clases[i].getNombre().equalsIgnoreCase(nombreClase)) {
				return clases[i];
			}
		}
		return null;
	}

	public Estudiante buscarEstudianteEnTodasLasClases(String nombreEstudiante) {
		for (int i = 0; i < numeroActualClases; i++) {
			Estudiante estudiante = clases[i].buscarEstudiante(nombreEstudiante);
			if (estudiante != null) {
				return estudiante;
			}
		}
		return null;
	}

	public void mostrarEstadisticasPorClase() {
		System.out.println("Estadísticas por clase:");
		for (int i = 0; i < numeroActualClases; i++) {
			Clase clase = clases[i];
			System.out.println("Clase: " + clase.getNombre());
			System.out.println("Número de estudiantes: " + clase.calcularPromedioCalificaciones());
			System.out.println("Promedio de calificaciones: " + clase.calcularPromedioCalificaciones());
			System.out.println();
		}
	}
}
