package ejercicio2;

public class Rectangulo {

	// Atributos
	private int base;
	private int altura;
	// Getters and setters

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

//Constructores
	public Rectangulo(int base, int altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	public Rectangulo() {
		super();
	}

	@Override
	public String toString() {
		return "Rectangulo [base=" + base + ", altura=" + altura + "]";
	}

	/**
	 * Calcular el área del rectángulo. Calcular el perímetro. Mostrar los
	 * resultados.
	 * 
	 */
	public int calcularArea() {
		return base * altura;
	}

	public int calcularPerimetro() {
		return (2 * base + 2 * altura);
	}

	public void mostrarResultados() {
		System.out.println("El área es: " + calcularArea() + " y el perímetro es: " + calcularPerimetro());
	}
}
