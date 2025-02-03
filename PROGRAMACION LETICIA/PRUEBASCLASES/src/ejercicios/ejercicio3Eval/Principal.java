package ejercicios.ejercicio3Eval;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Escuela escuela = new Escuela(5);

		Clase clase1 = new Clase("Matemáticas", 10);
		Clase clase2 = new Clase("Ciencias", 10);

		clase1.agregarEstudiante(new Estudiante("Juan", 15, 85.5));
		clase1.agregarEstudiante(new Estudiante("María", 14, 90.0));
		clase2.agregarEstudiante(new Estudiante("Pedro", 16, 78.0));
		clase2.agregarEstudiante(new Estudiante("Ana", 15, 92.5));

		escuela.agregarClase(clase1);
		escuela.agregarClase(clase2);

		escuela.mostrarEstadisticasPorClase();

		Estudiante buscado = escuela.buscarEstudianteEnTodasLasClases("Ana");
		if (buscado != null) {
			System.out.println("Estudiante encontrado: " + buscado);
		} else {
			System.out.println("Estudiante no encontrado.");
		}

		clase1.mostrarEstudiantes();
		clase1.eliminarEstudiante("Juan");
		clase1.mostrarEstudiantes();
	}

}
