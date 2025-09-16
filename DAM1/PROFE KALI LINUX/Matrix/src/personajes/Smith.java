package personajes;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Smith extends Personaje implements Comparable<Smith>{

    // ATRIBUTOS:
    private int infeccion;
    private int iteracionDeCreaccion;

    // CONSTRUCTOR:
    public Smith()
    {
        super();
        this.nombre = "SMITH";

        infeccion = (int)(Math.random()*2)+1;
        iteracionDeCreaccion = 0;
    }

    public Smith(int id, LocalDateTime fecha, String ciudad, int index)
    {
        this.id = id;
        this.iteracionDeCreaccion = index;
        this.creacion = fecha;
        this.nombre = "SMITH";
        this.ciudad = ciudad;
        Personaje.personajesCreados--;
    }

    
    // METODOS:
    @Override
    public String mostrarInformacion()
    {
        DateTimeFormatter nanoSegundos = DateTimeFormatter.ofPattern("nnn");

        return super.getNombre() + ", id: " + super.getId() + ", ciudad: " + super.getCiudad() + ", Creado en el nanosegundo: " + creacion.format(nanoSegundos) + "\n";
    }

    @Override
    public int compareTo(Smith o)
    {
        return this.creacion.compareTo(o.creacion);
    }

    @Override
    public String toString()
    {
        return mostrarInformacion();
    }


    // GETTERS Y SETTERS:
    public int getInfeccion() {
        return infeccion;
    }

    public int getIteracionDeCreaccion() {
        return iteracionDeCreaccion;
    }

    public void setIteracionDeCreaccion(int iteracionDeCreaccion) {
        this.iteracionDeCreaccion = iteracionDeCreaccion;
    }

    public void setInfeccion(int infeccion) {
        this.infeccion = infeccion;
    }

}
