package ies.vdm;

import org.junit.Test;
import static org.junit.Assert.*;

public class testEjercicioA {
	@Test
    public void testAprobadoPorMedia() {
        String resultado = EjercicioA.main(6.0, 7.0, "");
        assertEquals("Estas aprobado con una media de: 6.5", resultado);
    }

    @Test
    public void testSuspendidoYRecuperacionApta() {
        String resultado = EjercicioA.main(3.0, 4.0, "apto");
        assertEquals("Estas aprobado con un 5.", resultado);
    }

    @Test
    public void testSuspendidoYRecuperacionNoApta() {
        String resultado = EjercicioA.main(3.0, 4.0, "no apto");
        assertEquals("Estas suspendido con una media de: 3.5", resultado);
    }

    @Test
    public void testJustoAprobadoPorMedia() {
        String resultado = EjercicioA.main(5.0, 5.0, "");
        assertEquals("Estas aprobado con una media de: 5.0", resultado);
    }

    @Test
    public void testRecuperacionNullYMediaSuspensa() {
        String resultado = EjercicioA.main(3.0, 3.0, "");
        assertEquals("No ha introducido nada por lo tanto no es apto", resultado);
    }
}
