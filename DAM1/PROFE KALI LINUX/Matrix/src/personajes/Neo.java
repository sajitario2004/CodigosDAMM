package personajes;

public class Neo extends Personaje{

    // ATRIBUTOS:
    private boolean elegido;
    private int poder;


    // CONSTRUCTOR:
    public Neo()
    {
        super();
        this.nombre = "NEO";

        elegido = true;
        poder = (int)(Math.random()*5)+1;
    }


    @Override
    public String mostrarInformacion()
    {
        return "Neo-> id: " + super.getId() + ", nombre: " + super.getNombre() + ", ciudad: " + super.getCiudad();
    }


    public boolean isElegido() {
        return elegido;
    }


    public void setElegido(boolean elegido) {
        this.elegido = elegido;
    }


    public int getPoder() {
        return poder;
    }    
    
}
