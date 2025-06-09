package personajes;

public class PersonaGenerica extends Personaje{


    // ATRIBUTOS:
    private int probabilidadMuerte;


    // CONTRUCTOR:
    public PersonaGenerica()
    {
        super();
        probabilidadMuerte = (int)(Math.random()*100)+1;
    }

    // METODOS:
    @Override
    public String mostrarInformacion()
    {
        return "id: " + super.getId() + ", nombre: " + super.getNombre() + ", ciudad: " + super.getCiudad() + "\n";
    }

    @Override
    public String toString()
    {
        return mostrarInformacion();
    }

    public int getProbabilidadMuerte() {
        return probabilidadMuerte;
    }

    public void setProbabilidadMuerte(int probabilidadMuerte) {
        this.probabilidadMuerte = probabilidadMuerte;
    }


}
