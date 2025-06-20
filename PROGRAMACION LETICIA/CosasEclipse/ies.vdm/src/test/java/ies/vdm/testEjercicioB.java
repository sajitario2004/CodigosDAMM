package ies.vdm;

import org.junit.Test;

import static org.junit.Assert.*;

public class testEjercicioB {
		 @Test
	    public void testIvaGeneralSinPromo() {
	        String resultado = EjercicioB.Main(100, "general", "nopro");
	        assertTrue(resultado.contains("IVA (21%)"));
	        assertTrue(resultado.contains("TOTAL                 121.00"));
	    }

	    @Test
	    public void testIvaReducidoConMitad() {
	        String resultado = EjercicioB.Main(100, "reducido", "mitad");
	        assertTrue(resultado.contains("IVA (10%)"));
	        assertTrue(resultado.contains("Cód. promo. (mitad): -55.00"));
	        assertTrue(resultado.contains("TOTAL                 55.00"));
	    }

	    @Test
	    public void testIvaSuperreducidoConMeno5() {
	        String resultado = EjercicioB.Main(100, "superreducido", "meno5");
	        assertTrue(resultado.contains("IVA (4%)"));
	        assertTrue(resultado.contains("Cód. promo. (meno5): -5.00"));
	        assertTrue(resultado.contains("TOTAL                 99.00"));
	    }

	     @Test
	    public void testIvaGeneralCon5porc() {
	        String resultado = EjercicioB.Main(200, "general", "5porc");
	        assertTrue(resultado.contains("IVA (21%)"));
	        assertTrue(resultado.contains("Cód. promo. (5porc): -12.10"));
	        assertTrue(resultado.contains("TOTAL                 229.90"));
	    }

	    @Test
	    public void testIvaInvalido() {
	        String resultado = EjercicioB.Main(100, "invalido", "nopro");
	        assertTrue(resultado.equals("Tipo de IVA no válido."));
	    }

	    @Test
	    public void testPromoInvalido() {
	        String resultado = EjercicioB.Main(100, "general", "desconocido");
	        assertTrue(resultado.equals("Código promocional no válido."));
	    }
	    
	    
}
