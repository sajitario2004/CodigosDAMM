package Interfaces.pruebas.examenpruebas.clases;

public abstract class Personal implements Comparable<Personal>{

	private String identificador;
	/**
	 * @param identificador
	 */
	public Personal(String identificador) {
		super();
		this.identificador = identificador;
	}

	public String getIdentificador() {
		return identificador;
	}
	public abstract double calcularSueldoExtraPorDia();
}
