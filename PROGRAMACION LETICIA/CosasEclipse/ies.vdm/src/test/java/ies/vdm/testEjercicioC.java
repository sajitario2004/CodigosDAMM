package ies.vdm;


import java.util.Arrays;
import java.util.List;

import org.junit.*;
import static org.junit.Assert.*;

public class testEjercicioC {

    @Test
    public void testNumerosMixtos() {
        List<Integer> numeros = Arrays.asList(3, 8, 5, 2, 7, -1);
        String resultado = EjercicioC.main(numeros);
        assertTrue(resultado.contains("Has introducido 5 números."));
        assertTrue(resultado.contains("La media de los impares es: 5.0"));
        assertTrue(resultado.contains("El mayor de los pares es: 8"));
    }

    @Test
    public void testSoloImpares() {
        List<Integer> numeros = Arrays.asList(1, 3, 5, 7, -1);
        String resultado = EjercicioC.main(numeros);
        assertTrue(resultado.contains("Has introducido 4 números."));
        assertTrue(resultado.contains("La media de los impares es: 4.0"));
        assertTrue(resultado.contains("No se introdujeron números pares."));
    }

    @Test
    public void testSoloPares() {
        List<Integer> numeros = Arrays.asList(2, 4, 6, 10, -1);
        String resultado = EjercicioC.main(numeros);
        assertTrue(resultado.contains("Has introducido 4 números."));
        assertTrue(resultado.contains("No se introdujeron números impares."));
        assertTrue(resultado.contains("El mayor de los pares es: 10"));
    }

    @Test
    public void testNegativoPrimero() {
        List<Integer> numeros = Arrays.asList(-5);
        String resultado = EjercicioC.main(numeros);
        assertTrue(resultado.contains("Has introducido 0 números."));
        assertTrue(resultado.contains("No se introdujeron números impares."));
        assertTrue(resultado.contains("No se introdujeron números pares."));
    }
}
