import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class BibliotecaFuncionesTest {

    @Test
    void decimalABinario() {
        int result=BibliotecaFunciones.decimalABinario(10);
        assertEquals(1010, result);
    }

    @Test
    void decimalAHexadecimal() {
        String result=BibliotecaFunciones.decimalAHexadecimal(672);
        assertEquals("2A0", result);

    }

    @Test
    void decimalAOctal() {
        int result=BibliotecaFunciones.decimalAOctal(34);
        assertEquals(42, result);
    }
}