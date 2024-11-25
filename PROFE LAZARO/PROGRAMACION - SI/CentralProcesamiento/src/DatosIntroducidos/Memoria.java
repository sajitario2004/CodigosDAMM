package DatosIntroducidos;

public class Memoria {
    private String direcMem, conten;

    public Memoria(String conten, String direcMem) {
        this.conten = conten;
        this.direcMem = direcMem;
    }

    public String getDirecMem() {
        return direcMem;
    }

    public void setDirecMem(String direcMem) {
        this.direcMem = direcMem;
    }

    public String getConten() {
        return conten;
    }

    public void setConten(String conten) {
        this.conten = conten;
    }
}
