package maquinaria;

class Vagones {

	private int id;
	private double cargaMaxima;
	private double cargaActual;
	private String tipoMercancia;
	//Constructores
	public Vagones(int id, double cargaMaxima, double cargaActual, String tipoMercancia) {
		super();
		this.id = id;
		this.cargaMaxima = cargaMaxima;
		this.cargaActual = cargaActual;
		this.tipoMercancia = tipoMercancia;
	}
	public Vagones() {
		super();
	}
	//Getters and setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getCargaMaxima() {
		return cargaMaxima;
	}
	public void setCargaMaxima(double cargaMaxima) {
		this.cargaMaxima = cargaMaxima;
	}
	public double getCargaActual() {
		return cargaActual;
	}
	public void setCargaActual(double cargaActual) {
		this.cargaActual = cargaActual;
	}
	public String getTipoMercancia() {
		return tipoMercancia;
	}
	public void setTipoMercancia(String tipoMercancia) {
		this.tipoMercancia = tipoMercancia;
	}
	@Override
	public String toString() {
		return "Vagones [id=" + id + ", cargaMaxima=" + cargaMaxima + ", cargaActual=" + cargaActual
				+ ", tipoMercancia=" + tipoMercancia + "]";
	}
	
}
