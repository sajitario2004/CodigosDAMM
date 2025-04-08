package Examen.ExamenNacho;

public class PlantaFrutal extends Planta{
	String estacionFructificacionString;

	public PlantaFrutal(String codigoPlantaString, String nombre, double precio, int stock,
			String estacionFructificacionString) {
		super(codigoPlantaString, nombre, precio, stock);
		this.estacionFructificacionString = estacionFructificacionString;
	}

	public String getEstacionFructificacionString() {
		return estacionFructificacionString;
	}

	public void setEstacionFructificacionString(String estacionFructificacionString) {
		this.estacionFructificacionString = estacionFructificacionString;
	}

	@Override
	public String toString() {
		return "PlantaFrutal [estacionFructificacionString=" + estacionFructificacionString + ", codigoPlantaString="
				+ codigoPlantaString + ", nombre=" + nombre + ", precio=" + precio + ", stock=" + stock + "]";
	}
	
	@Override
	public double calcularDescuento() {
		double respuesta;
		if (this.estacionFructificacionString.equalsIgnoreCase("verano")) {
			respuesta = this.precio * 0.90;
		}else {
			respuesta = this.precio;
		}
		return respuesta;
	};
	
	

}
