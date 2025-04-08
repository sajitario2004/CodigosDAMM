package Interfaces.pruebas.examenpruebas.ejercicio2;

public class Traduccion {

	private String palabra;
	private String idioma;
	/**
	 * @param palabra
	 * @param idioma
	 */
	public Traduccion(String palabra, String idioma) {
		this.palabra = palabra;
		this.idioma = idioma;
	}
	public String getPalabra() {
		return palabra;
	}
	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	@Override
	public String toString() {
		return "Traduccion [palabra=" + palabra + ", idioma=" + idioma + "]";
	}
}
