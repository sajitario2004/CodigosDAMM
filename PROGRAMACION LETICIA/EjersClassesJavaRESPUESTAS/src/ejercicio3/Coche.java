package ejercicio3;

public class Coche {
	private String marca;
	private String modelo;
	private Persona propietario;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Persona getPropietario() {
		return propietario;
	}

	public void setPropietario(Persona propietario) {
		this.propietario = propietario;
	}

	public Coche(String marca, String modelo, Persona propietario) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.propietario = propietario;
	}

	public Coche() {
		super();

	}

	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", modelo=" + modelo + ", propietario=" + propietario + "]";
	}

}
