package maquinaria;

import personal.Mecanico;

public class Locomotoras {
	private String matricula;
	private double potencia;
	private int antiguedad;
	private Mecanico mecanico;

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	public Mecanico getMecanico() {
		return mecanico;
	}

	public void setMecanico(Mecanico mecanico) {
		this.mecanico = mecanico;
	}

	public Locomotoras(String matricula, double potencia, int antiguedad, Mecanico mecanico) {
		super();
		this.matricula = matricula;
		this.potencia = potencia;
		this.antiguedad = antiguedad;
		this.mecanico = mecanico;
	}

	public Locomotoras() {
		super();
	}

	@Override
	public String toString() {
		return "Locomotoras [matricula=" + matricula + ", potencia=" + potencia + ", antiguedad=" + antiguedad
				+ ", mecanico=" + mecanico + "]";
	}

}
