package personajes;

import java.time.LocalDateTime;

public abstract class Personaje {
    
    // ATRIBUTOS:
    protected int id;
    protected String nombre;
    protected String ciudad;
    protected LocalDateTime creacion;
    protected int edad;

    static protected int personajesCreados;


    // CONSTRUCTOR:
    protected Personaje()
    {
        personajesCreados++;
        this.id = personajesCreados;

        this.nombre = nombreAleatorio();
        this.ciudad = ciudadAleatoria();
        this.creacion = LocalDateTime.now();
        this.edad = (int)(Math.random()*100)+1; //(Edad aleatoria de 1 a 100)
    }

    public abstract String mostrarInformacion();

    public String ciudadAleatoria()
    {
        String[] ciudades = {"Madrid", "New York", "Pekin", "Leganés", "Londres", "Paris", "Fuengirola", "Dublin", "Bagdad", "Texas", "Caracas"};

        int aleatorio = (int)(Math.random()*ciudades.length);

        return ciudades[aleatorio];
    }

    public String nombreAleatorio()
    {
        String[] nombres = {"Juan", "Pedro", "María", "Ana", "Luis", "Carlos", "Sofía", "Lucía", "Elena", "Miguel", "Pablo", "David", "Miriam", "Jesús", "Carmen", "Alicia", "Antonio"};

        int aleatorio = (int)(Math.random()*nombres.length);

        return nombres[aleatorio];
    }
    
    // GETTERS:
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public LocalDateTime getCreacion() {
        return creacion;
    }

    public static int getCreados() {
        return personajesCreados;
    }

}
