package Interfaces.pruebas.examenpruebas.ejercicio2;

public class Palabra {
	
	private String palabraOrigen;
	private String palabraTraducida;
	/**
	 * @param palabraOrigen
	 * @param palabraTraducida
	 */
	public Palabra(String palabraOrigen, String palabraTraducida) {
		this.palabraOrigen = palabraOrigen;
		this.palabraTraducida = palabraTraducida;
	}
	public String getPalabraOrigen() {
		return palabraOrigen;
	}
	public void setPalabraOrigen(String palabraOrigen) {
		this.palabraOrigen = palabraOrigen;
	}
	public String getPalabraTraducida() {
		return palabraTraducida;
	}
	public void setPalabraTraducida(String palabraTraducida) {
		this.palabraTraducida = palabraTraducida;
	}
	@Override
	public String toString() {
		return "Palabra [palabraOrigen=" + palabraOrigen + ", palabraTraducida=" + palabraTraducida + "]";
	}

}
