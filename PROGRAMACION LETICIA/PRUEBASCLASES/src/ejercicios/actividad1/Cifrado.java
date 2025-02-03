package ejercicios.actividad1;

import java.util.Arrays;

public class Cifrado {
	private String texto;
	private int n;

	public Cifrado() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cifrado(String texto, int n) {
		super();
		this.texto = texto;
		this.n = n;
	}

	public String cesar() {
		char mensaje[] = texto.toCharArray();
		for (int i = 0; i < mensaje.length; i++) {
			char c = mensaje[i];
			if (Character.isAlphabetic(c)) {
				c += n;
				if (Character.isLowerCase(mensaje[i])) {
					if (c > 'z') {
						c = (char) (c - 'z' + 'a' - 1);
					}
				} else {
					if (c > 'Z') {
						c = (char) (c - 'Z' + 'A' - 1);
					}
				}
				mensaje[i] = c;
			}
		}
		return String.valueOf(mensaje);
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
}
