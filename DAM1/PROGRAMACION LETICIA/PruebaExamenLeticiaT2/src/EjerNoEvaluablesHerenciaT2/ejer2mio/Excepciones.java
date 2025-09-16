package EjerNoEvaluablesHerenciaT2.ejer2mio;

public class Excepciones extends Exception {
    public static String ANIMAL_RETIRADO = "El animal ya se lo ha llevado el dueño";

    public Excepciones() {
    }

    public Excepciones(String message) {
        super(message);
    }

    public Excepciones(String message, Throwable cause) {
        super(message, cause);
    }

    public Excepciones(Throwable cause) {
        super(cause);
    }

    public Excepciones(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
