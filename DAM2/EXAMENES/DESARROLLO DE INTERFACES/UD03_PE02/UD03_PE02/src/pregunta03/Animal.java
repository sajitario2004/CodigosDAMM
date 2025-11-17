/**
 * 
 */
package pregunta03;

/**
 * 
 */
public class Animal {

	private String name; // nombre del animal
	private int edad; // edad del animal
	private String raza; // raza del animal
	
	
	// generar constructores
	public Animal(String name,  String raza) {
		this.name = name;
		this.raza = raza;
	}


	// generar getters y setters
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public String getRaza() {
		return raza;
	}


	public void setRaza(String raza) {
		this.raza = raza;
	}


	// generar metodos que faltan
	@Override
	public String toString() {
		return "Animal [name=" + name + ", edad=" + edad + ", raza=" + raza + "]";
	}

	
	
	

}
