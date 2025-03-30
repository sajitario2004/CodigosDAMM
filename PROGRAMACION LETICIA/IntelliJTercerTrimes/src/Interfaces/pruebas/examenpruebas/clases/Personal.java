package Interfaces.pruebas.examenpruebas.clases;

public abstract class Personal implements Comparable<Personal>{

	/**
	 * @param identificador
	 */
	public Personal(String identificador) {
		super();
		this.identificador = identificador;
	}
	private String identificador;

	public String getIdentificador() {
		return identificador;
	}
	public abstract double calcularSueldoExtraPorDia();
}
