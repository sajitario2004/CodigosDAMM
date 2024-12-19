import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class testNachoBiblioFun {


    @Test
    public void testEsCapicua() {
        //caso normal es capicua
        assertTrue(biblioFunNacho.esCapicua(121));
        //caso normal cuando falla
        assertFalse(biblioFunNacho.esCapicua(123));

        //caso normal con digitos pares y es capicua
        assertTrue(biblioFunNacho.esCapicua(1221));
        //caso número negativo pero capicua
        assertFalse(biblioFunNacho.esCapicua(-121));
    }

    @Test
    public void testEsPrimo() {
        //caso normal
        assertTrue(biblioFunNacho.esPrimo(7));
        assertFalse(biblioFunNacho.esPrimo(4)); // Caso normal
        assertFalse(biblioFunNacho.esPrimo(1)); // Caso borde
        assertFalse(biblioFunNacho.esPrimo(-5)); // Caso número negativo
        assertTrue(biblioFunNacho.esPrimo(2)); // Caso mínimo primo
    }

    @Test
    public void testSiguientePrimo() {
        assertEquals(7, biblioFunNacho.siguientePrimo(5)); // Caso normal
        assertEquals(2, biblioFunNacho.siguientePrimo(-1)); // Caso número negativo
        assertEquals(3, biblioFunNacho.siguientePrimo(2)); // Caso borde
    }

    @Test
    public void testDigitos() {
        assertEquals(3, biblioFunNacho.digitos(123)); // Caso normal
        assertEquals(1, biblioFunNacho.digitos(0)); // Caso borde
        assertEquals(4, biblioFunNacho.digitos(-1234)); // Caso número negativo
    }

    @Test
    public void testVoltea() {
        assertEquals(321, biblioFunNacho.voltea(123)); // Caso normal
        assertEquals(1, biblioFunNacho.voltea(100)); // Caso con ceros al final
        assertEquals(-321, biblioFunNacho.voltea(-123)); // Caso número negativo
    }

    @Test
    public void testDigitoN() {
        assertEquals(2, biblioFunNacho.digitoN(1234, 2)); // Caso normal
        assertEquals(-1, biblioFunNacho.digitoN(1234, 5)); // Caso posición fuera de rango
        assertEquals(-1, biblioFunNacho.digitoN(-1234, 0)); // Caso número negativo
    }

    @Test
    public void testQuitaPorDetras() {
        //caso normal
        assertEquals(123, biblioFunNacho.quitaPorDetras(12345, 2));
        //caso de borrar todos los numeros
        assertEquals(0, biblioFunNacho.quitaPorDetras(123, 3));
        //caso de numero
        assertEquals(-12, biblioFunNacho.quitaPorDetras(-123, 1)); // Caso número negativo
    }

    @Test
    public void testQuitaPorDelante() {
        //caso normal de quitar 2 numeros por delante
        assertEquals(345, biblioFunNacho.quitaPorDelante(12345, 2));
        //caso de borrar todos los numeros
        assertEquals(0, biblioFunNacho.quitaPorDelante(123, 3));
        //caso de numero negativo
        assertEquals(-3, biblioFunNacho.quitaPorDelante(-123, 2));
    }

    @Test
    public void testPegaPorDetras() {
        //caso normal
        assertEquals(1234, biblioFunNacho.pegaPorDetras(123, 4));
        //caso no normal pero cuando el usuario introduce un numero negastivo
        assertEquals(-1234, biblioFunNacho.pegaPorDetras(-123, 4));
        //caso por si el usuario quiere pegar mas de un digito por detras
        assertEquals(10, biblioFunNacho.pegaPorDetras(10, 12));
    }

    @Test
    public void testPegaPorDelante() {
        //caso normal
        assertEquals(4123, biblioFunNacho.pegaPorDelante(123, 4));
        //caso no normal cuando el usuario introduce un nuemro negativo
        assertEquals(-4123, biblioFunNacho.pegaPorDelante(-123, 4));
        //caso de que el usuario introduce mal el digito
        assertEquals(10, biblioFunNacho.pegaPorDetras(10, 12));
    }


}