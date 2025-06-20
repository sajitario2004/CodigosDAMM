package puto;

import static org.junit.Assert.assertEquals; 
import org.junit.Test;

public class camelCaseConverterTest {

    @Test
    public void testCamelCase1() {
        // Prueba con una frase normal
        assertEquals("tejeroMaricon", camelCaseConverter.camelCase1("tejero grande"));
        
        // Prueba con múltiples espacios
        assertEquals("holaMundo", camelCaseConverter.camelCase1("hola   mundo"));
        
        // Prueba con mayúsculas al inicio
        assertEquals("javaEsGenial", camelCaseConverter.camelCase1("java es genial"));
        
        // Prueba con una sola palabra
        assertEquals("prueba", camelCaseConverter.camelCase1("prueba"));
        
        // Prueba con una frase vacía
        assertEquals("", camelCaseConverter.camelCase1(""));
        
        // Prueba con espacios al inicio y al final
        assertEquals("EjemploPrueba", camelCaseConverter.camelCase1("  ejemplo prueba  "));
        
        
        // Prueba con caracteres mayusculas
        assertEquals("EjemploConMAYUSCULAS", camelCaseConverter.camelCase1("Ejemplo Con MAYUSCULA S"));
    }
}
