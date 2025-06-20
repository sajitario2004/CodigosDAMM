package ies.vdm.examen;

import org.junit.Test;

import static org.junit.Assert.*;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class testEjerExamen {
	
	//test esAnagrama
	
	//test normal
	@Test 
	public void pruebaNormalAnagrama() {
		//variables 
		String cad1 = "ojos rojos";
		String cad2 = "rojos ojos";
		
		//esperado
		boolean esperado = true;
		
		//resultado 
		boolean resultado = Util.esAnagrama(cad1, cad2);
		
		//comparacion
		assertEquals(resultado, esperado);
	}
	
	//test simbolos raros
	@Test 
	public void simbolosRarosAnagrama() {
		//variables 
		String cad1 = "ojos rojos**";
		String cad2 = "**rojos ojos";
		
		//esperado
		boolean esperado = true;
		
		//resultado 
		boolean resultado = Util.esAnagrama(cad1, cad2);
		
		//comparacion
		assertEquals(resultado, esperado);
	}
	
	//string no coinciden por un espacio
	@Test 
	public void noCoincidenPorUnEspacioAnagrama() {
		//variables 
		String cad1 = "ojos r ojos";
		String cad2 = "rojos ojos";
		
		//esperado
		boolean esperado = true;
		
		//resultado 
		boolean resultado = Util.esAnagrama(cad1, cad2);
		
		//comparacion
		assertEquals(resultado, esperado);
	}
	
	//cadenas que no coinciden
	@Test 
	public void noCoincidenAnagrama() {
		//variables 
		String cad1 = "ojos ojos";
		String cad2 = "rojos ojos";
		
		//esperado
		boolean esperado = false;
		
		//resultado 
		boolean resultado = Util.esAnagrama(cad1, cad2);
		
		//comparacion
		assertEquals(resultado, esperado);
	}

	
	//test intercalarCadenas
	//test normal
	@Test
	public void pruebaNormalIntercalarCad() {
		//variables
		String cad1 = "Hl";
		String cad2 = "oa";
		//esperado
		String esperado = "Hola";
		
		//resultado
		String resultado = Util.intercalarCadenas(cad1, cad2);
		//comparacion
		assertEquals(esperado, resultado);
		
	}
	
	//Cadenas con espacios y caracteres especiales
	@Test
	public void pruebaEspaciosYCaracteresEspecialesIntercalarCad() {
		//variables
		String cad1 = "*H/l ";
		String cad2 = "*o_a-";
		//esperado
		String esperado = "**Ho/_la -";
		
		//resultado
		String resultado = Util.intercalarCadenas(cad1, cad2);
		//comparacion
		assertEquals(esperado, resultado);
		
	}
	
	//una cadena va vacia
	@Test
	public void pruebaUnaCadenaVaciaIntercalarCad() {
		//variables
		String cad1 = "";
		String cad2 = "Hola";
		//esperado
		String esperado = "Hola";
		
		//resultado
		String resultado = Util.intercalarCadenas(cad1, cad2);
		//comparacion
		assertEquals(esperado, resultado);
		
	}
	
	//con saltos de linea
	@Test
	public void pruebaSaltosDeLineaIntercalarCad() {
		//variables
		String cad1 = "\n";
		String cad2 = "\n";
		//esperado
		String esperado = "\n\n";
		
		//resultado
		String resultado = Util.intercalarCadenas(cad1, cad2);
		//comparacion
		assertEquals(esperado, resultado);
		
	}
	
	
	//test rotar lista
	//test numeros
	@Test
	public void pruebaNumerosRotarLista() {
		//variables
		List<Integer> numeros = new ArrayList<>();
		numeros.add(15);
		numeros.add(12);
		numeros.add(11);
		numeros.add(5);
		numeros.add(112);
		
		int k = 2;
		
		//esperado
		List<Integer> esperado = new ArrayList<Integer>();
		esperado.add(5);
		esperado.add(112);
		esperado.add(15);
		esperado.add(12);
		esperado.add(11);

		
		//resultado
		List<Integer> resultado = Util.rotarLista(numeros, k);
		
		//comparacion
		assertEquals(resultado, esperado);
		
		
		
	}
	
	//test Strings
	@Test
	public void pruebaStrRotarLista() {
		//variables
		List<String> str = new ArrayList<>();
		str.add("hola");
		str.add("adios");
		str.add("buenas");
		str.add("noches");
		str.add("dias");
		
		int k = 3;
		
		//esperado
		List<String> esperado = new ArrayList<>();
		esperado.add("buenas");
		esperado.add("noches");
		esperado.add("dias");
		esperado.add("hola");
		esperado.add("adios");

		
		//resultado
		List<String> resultado = Util.rotarLista(str, k);
		
		//comparacion
		assertEquals(resultado, esperado);
		
	}
	
	//test sin saltos
	@Test
	public void pruebaSinRotaciones() {
		//variables
				List<String> str = new ArrayList<>();
				str.add("hola");
				str.add("adios");
				str.add("buenas");
				str.add("noches");
				str.add("dias");
				
				int k = 0;
				
				//esperado
				List<String> esperado = new ArrayList<>();
				esperado.add("hola");
				esperado.add("adios");
				esperado.add("buenas");
				esperado.add("noches");
				esperado.add("dias");

				
				//resultado
				List<String> resultado = Util.rotarLista(str, k);
				
				//comparacion
				assertEquals(resultado, esperado);
	}
	
	//test booleans
	@Test
	public void pruebaBooleansRotar() {
		//variables
				List<Boolean> bol = new ArrayList<>();
				bol.add(true);
				bol.add(true);
				bol.add(false);
				bol.add(false);
				bol.add(true);
				
				int k = 3;
				
				//esperado
				List<Boolean> esperado = new ArrayList<>();
				esperado.add(false);
				esperado.add(false);
				esperado.add(true);
				esperado.add(true);
				esperado.add(true);

				
				//resultado
				List<Boolean> resultado = Util.rotarLista(bol, k);
				
				//comparacion
				assertEquals(resultado, esperado);
	}
	
	
	//test insercion listas
	//prueba normal
	@Test
	public void pruebaNormalInterseccionListas() {
		//valores
		//variables
				List<String> str1 = new ArrayList<>();
				str1.add("hola");
				str1.add("adios");
				str1.add("buenas");
				str1.add("noches");
				str1.add("dias");
				
				List<String> str2 = new ArrayList<>();
				str2.add("buenas2");
				str2.add("noches");
				str2.add("dias2");
				str2.add("hola");
				str2.add("adios2");
		
		//esperado
	
				List<String> esperado = new ArrayList<>();
				esperado.add("hola");
				esperado.add("noches");
				
		//resultado
				
				List<String> resultado = Util.interseccionListas(str1, str2);
		
		//comparacion
				assertEquals(resultado, esperado);
	}
	
	//interseccion con numeros negativos
	@Test
	public void numeroNegativosInterseccion() {
		//valores
				//variables
						List<Integer> num1 = new ArrayList<>();
						num1.add(5);
						num1.add(-2);
						num1.add(26);
						num1.add(0);
						num1.add(10);
						
						List<Integer> num2 = new ArrayList<>();
						num2.add(-2);
						num2.add(32);
						num2.add(190);
						num2.add(5);
						num2.add(82);
				
				//esperado
			
						List<Integer> esperado = new ArrayList<>();
						esperado.add(5);
						esperado.add(-2);
						
				//resultado
						
						List<Integer> resultado = Util.interseccionListas(num1, num2);
				
				//comparacion
						assertEquals(resultado, esperado);
	}
	//interseccion desigual completo
	@Test
	public void numeroDesigualInterseccion() {
		//valores
				//variables
						List<Integer> num1 = new ArrayList<>();
						num1.add(26);
						num1.add(0);
						num1.add(10);
						
						List<Integer> num2 = new ArrayList<>();
						num2.add(32);
						num2.add(190);
						num2.add(82);
				
				//esperado
			
						List<Integer> esperado = new ArrayList<>();
						
				//resultado
						
						List<Integer> resultado = Util.interseccionListas(num1, num2);
				
				//comparacion
						assertEquals(resultado, esperado);
	}
	
	//insercion cadenas con valores extraños y saltos de lienea y valores repetido
	@Test
	public void pruebaDuraInterseccion() {
				//variables
						List<String> str1 = new ArrayList<>();
						str1.add("hola\n");
						str1.add("adios");
						str1.add("1");
						str1.add("1");
						str1.add("dias2**//");
						
						List<String> str2 = new ArrayList<>();
						str2.add("1");
						str2.add("1");
						str2.add("dias2**//");
						str2.add("hola\n");
						str2.add("adios2");
				
				//esperado
			
						List<String> esperado = new ArrayList<>();
						esperado.add("hola\n");
						esperado.add("1");
						esperado.add("dias2**//");

						
				//resultado
						
						List<String> resultado = Util.interseccionListas(str1, str2);
				
				//comparacion
						assertEquals(resultado, esperado);
		
	}
	
}
