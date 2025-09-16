package Examen.ExamenNacho;

public class PlantasMedicinales extends Planta{
	boolean esAutoctona;

	public PlantasMedicinales(String codigoPlantaString, String nombre, double precio, int stock, boolean esAutoctona) {
		super(codigoPlantaString, nombre, precio, stock);
		this.esAutoctona = esAutoctona;
	}

	public boolean isEsAutoctona() {
		return esAutoctona;
	}

	public void setEsAutoctona(boolean esAutoctona) {
		this.esAutoctona = esAutoctona;
	}

	@Override
	public String toString() {
		return "PlantasMedicinales [esAutoctona=" + esAutoctona + ", codigoPlantaString=" + codigoPlantaString
				+ ", nombre=" + nombre + ", precio=" + precio + ", stock=" + stock + "]";
	}
	
	@Override
	public double calcularDescuento() {
		double respuesta;
		if ( this.esAutoctona == true ) {
			respuesta = this.precio *0.85; 
		}else {
			respuesta = this.precio;
		}
		return respuesta;
	}

}
