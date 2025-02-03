package ejercicios.ejercicio3Eval;

public class Clase {
	private String nombre;
	private Estudiante[] estudiantes;
	private int numeroActualEstudiantes;

	public Clase(String nombre, int maxEstudiantes) {
		this.nombre = nombre;
		this.estudiantes = new Estudiante[maxEstudiantes];
		this.numeroActualEstudiantes = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public void agregarEstudiante(Estudiante estudiante) {
		if (numeroActualEstudiantes < estudiantes.length) {
			estudiantes[numeroActualEstudiantes++] = estudiante;
		} else {
			System.out.println("No se pueden agregar más estudiantes, la clase está llena.");
		}
	}

	public void eliminarEstudiante(String nombreEstudiante) {
		for (int i = 0; i < numeroActualEstudiantes; i++) {
			if (estudiantes[i].getNombre().equalsIgnoreCase(nombreEstudiante)) {
				// Eliminar desplazando los elementos
				for (int j = i; j < numeroActualEstudiantes - 1; j++) {
					estudiantes[j] = estudiantes[j + 1];
				}
				estudiantes[--numeroActualEstudiantes] = null;
				System.out.println("Estudiante eliminado.");
				return;
			}
		}
		System.out.println("Estudiante no encontrado.");
	}

	public Estudiante buscarEstudiante(String nombreEstudiante) {
		for (int i = 0; i < numeroActualEstudiantes; i++) {
			if (estudiantes[i].getNombre().equalsIgnoreCase(nombreEstudiante)) {
				return estudiantes[i];
			}
		}
		return null;
	}

	public double calcularPromedioCalificaciones() {
		if (numeroActualEstudiantes == 0)
			return 0.0;

		double suma = 0.0;
		for (int i = 0; i < numeroActualEstudiantes; i++) {
			suma += estudiantes[i].getCalificacion();
		}
		return suma / numeroActualEstudiantes;
	}

	public void mostrarEstudiantes() {
		System.out.println("Estudiantes en la clase " + nombre + ":");
		for (int i = 0; i < numeroActualEstudiantes; i++) {
			System.out.println(estudiantes[i]);
		}
	}
}