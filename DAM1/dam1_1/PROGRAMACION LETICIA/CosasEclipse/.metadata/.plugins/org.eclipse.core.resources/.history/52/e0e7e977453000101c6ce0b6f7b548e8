package hola;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class UtilTextTest {
	
	@Test
	public void testEjer3() {
		// prueba normal
		int[] respuesta1 = {1,5,8};
		assertArrayEquals(respuesta1, UtilText.findSpaces("d hil de "));
		
		
		//poner solo espacios
		int[] respuesta2 = {0,1,2};
		assertArrayEquals(respuesta2, UtilText.findSpaces("   "));
		
		// sin espacios
		int[] respuesta3 = {};
		assertArrayEquals(respuesta3, UtilText.findSpaces(""));
		
		//palabras mas espaciadas
		int[] respuesta4 = {1,5,6,9};
		assertArrayEquals(respuesta4, UtilText.findSpaces("d hil  de "));
	}
}
