import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class testNachoBiblioFun {


    @Test
    public void testEsCapicua() {
        //caso normal es capicua
        try {
            assertTrue(biblioFunNacho.esCapicua(121));
        } catch (Exception e) {
            System.err.println("error: " + e.getMessage());
        }
        //caso normal cuando falla
        try {
            assertFalse(biblioFunNacho.esCapicua(123));
        } catch (Exception e) {
            System.err.println("error: " + e.getMessage());
        }
        //caso normal con digitos pares y es capicua
        try {
            assertTrue(biblioFunNacho.esCapicua(1221));
        } catch (Exception e) {
            System.err.println("error: " + e.getMessage());
        }
        //caso número negativo pero capicua
        try {
            biblioFunNacho.esCapicua(-121);
        } catch (Exception e) {
            System.err.println("error: " + e.getMessage());
        }
        //caso número 0
        try {
            assertTrue(biblioFunNacho.esCapicua(0));
        } catch (Exception e) {
            System.err.println("error: " + e.getMessage());
        }
    }

    @Test
    public void testEsPrimo() {
        //caso normal
        try {
            assertTrue(biblioFunNacho.esPrimo(7));
        } catch (Exception e) {
            System.err.println("error: " + e.getMessage());
        }
        //caso normal cuando falla
        try {
            assertFalse(biblioFunNacho.esPrimo(4));
        } catch (Exception e) {
            System.err.println("error: " + e.getMessage());
        }
        //caso número 1
        try {
            biblioFunNacho.esPrimo(1);
        } catch (Exception e) {
            System.err.println("error: " + e.getMessage());
        }
        //caso número negativo
        try {
            biblioFunNacho.esPrimo(-5);
        } catch (Exception e) {
            System.err.println("error: " + e.getMessage());
        }
        //caso número 2, que es el primer primo
        try {
            assertTrue(biblioFunNacho.esPrimo(2));
        } catch (Exception e) {
            System.err.println("error: " + e.getMessage());
        }
    }

    @Test
    public void testSiguientePrimo() {
        //caso normal
        try {
            assertEquals(7, biblioFunNacho.siguientePrimo(5));
        } catch (Exception e) {
            System.err.println("error: " + e.getMessage());
        }
        //cass de numero negativo
        try {
            biblioFunNacho.siguientePrimo(-1);
        } catch(Exception e) {
            System.err.println("error: " + e.getMessage());
        }
        //caso de primo mas cercano
        try {
            assertEquals(3, biblioFunNacho.siguientePrimo(2));
        } catch (Exception e) {
            System.err.println("error: " + e.getMessage());
        }
        //caso salto de error
        try {
            biblioFunNacho.siguientePrimo(15/2);
        } catch (Exception e) {
            System.err.println("error: " + e.getMessage());
        }
    }

    @Test
    public void testDigitos() {
        //caso normal
        assertEquals(3, biblioFunNacho.digitos(123));
        //caso comprobar si 0 lo cuenta como digito
        assertEquals(1, biblioFunNacho.digitos(0));
        //caso número negativo
        assertEquals(4, biblioFunNacho.digitos(-1234));

    }

    @Test
    public void testVoltea() {
        //caso normal impar
        assertEquals(321, biblioFunNacho.voltea(123));
        //caso normal par
        assertEquals(21, biblioFunNacho.voltea(12));
        //caso número con uno
        assertEquals(1, biblioFunNacho.voltea(1));
        //caso número con solo un 0
        assertEquals(0, biblioFunNacho.voltea(0));
        //caso número con ceros
        assertEquals(1, biblioFunNacho.voltea(100));
        //caso numero negativo
        assertEquals(-321, biblioFunNacho.voltea(-123));
    }

    @Test
    public void testDigitoN() {
        //caso normal
        try {
            assertEquals(2, biblioFunNacho.digitoN(1234, 2));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        //caso de numero negativo
        try {
            assertEquals(-1, biblioFunNacho.digitoN(1234, 5));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        //caso de numero negativo y posicion
        try {
            assertEquals(-1, biblioFunNacho.digitoN(-1234, 0));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        //caso error inesperado
        try {
            assertEquals(-1, biblioFunNacho.digitoN(1234, 25));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void testQuitaPorDetras() {
        //caso normal
        assertEquals(123, biblioFunNacho.quitaPorDetras(12345, 2));
        //caso de borrar todos los numeros
        assertEquals(0, biblioFunNacho.quitaPorDetras(123, 3));
        //caso de numero
        assertEquals(-12, biblioFunNacho.quitaPorDetras(-123, 1));
        //caso de numero negativo en digito
        assertEquals(0, biblioFunNacho.quitaPorDetras(-123, -5));
        //caso error inesperado
        assertEquals(0, biblioFunNacho.quitaPorDetras(12345, 25));
    }

    @Test
    public void testQuitaPorDelante() {
        //caso normal de quitar 2 numeros por delante
        assertEquals(345, biblioFunNacho.quitaPorDelante(12345, 2));
        //caso de borrar todos los numeros
        assertEquals(0, biblioFunNacho.quitaPorDelante(123, 3));
        //caso de numero negativo
        assertEquals(-3, biblioFunNacho.quitaPorDelante(-123, 2));
        //caso de numero negativo en digito
        assertEquals(0, biblioFunNacho.quitaPorDetras(123, -15));
        //caso error 2
        assertEquals(0, biblioFunNacho.quitaPorDetras(12, 15));
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