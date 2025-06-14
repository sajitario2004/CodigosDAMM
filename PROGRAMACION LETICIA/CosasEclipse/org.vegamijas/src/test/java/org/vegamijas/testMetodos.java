package org.vegamijas;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class testMetodos {

	@Test
	public void testFindDigit() {
		
		//test 1 prueba caso normal
		int num1 = 654885982;
		int dig1 = 8;
		int[] res1 = {3, 4, 7};
		assertEquals(Arrays.toString(res1) , Arrays.toString(Metodos.findDigit(num1, dig1)));
	

		//test 2 no hay ningun numero
		// no tiene que devolver nada
		int num2 = 666666;
		int dig2 = 8;
		int[] res2 = {};
		assertEquals(Arrays.toString(res2), Arrays.toString(Metodos.findDigit(num2, dig2)));
		
		//test 3 2 numeros en el digito
		//tiene que coger solo el primer digito
		int num3 = 654885982;
		int dig3 = 83;
		int[] res3 = {3, 4, 7};
		assertEquals(Arrays.toString(res3) , Arrays.toString(Metodos.findDigit(num3, dig3)));
		
		//test 4 envio -1 por numeros
		//tiene que no devolver nada
		int num4 = -1;
		int dig4 = 8;
		int[] res4 = {};
		assertEquals(Arrays.toString(res4) , Arrays.toString(Metodos.findDigit(num4, dig4)));
	
		//test 5 envio un numero negativo
		// tiene que contar como si el guion del negativo no estuviera
		int num5 = -518258;
		int dig5 = 8;
		int[] res5 = {2, 5};
		assertEquals(Arrays.toString(res5) , Arrays.toString(Metodos.findDigit(num5, dig5)));
	}
	
	@Test
	public void testSumEvenPositions() {
		//test 1
		int[] ar1 = {1,2,3,5,3,7,9,102,56};
		int res1 = 72;
		assertEquals(res1, Metodos.sumEvenPositions(ar1));
	
		//test 2 el array esta vacio
		// va a dar 0 ya que no tiene numeros impares
		int[] ar2 = {};
		int res2 = 0;
		assertEquals(res2, Metodos.sumEvenPositions(ar2));
		
		//test 3 el array tiene 0 en todos los numeros impares
		int[] ar3 = {0,0,0,0,0,0};
		int res3 = 0;
		assertEquals(res3, Metodos.sumEvenPositions(ar3));
		
		//test 4 el array tiene numeros negativos
		int[] ar4 = {-1,5,6,4,-45};
		int res4 = -40;
		assertEquals(res4, Metodos.sumEvenPositions(ar4));
		
		//test 5 el array solo tiene numeros negativos
		int[] ar5 = {-1,-2,-3,-4};
		int res5 = -4;
		assertEquals(res5, Metodos.sumEvenPositions(ar5));
	}
	
	@Test
	public void testSplitByLetter() {
		//test 1
		String str1 = "ANA,FRANK,PEDRO,LUIS";
		String ch1str1 = ",";
		char chp1 = ch1str1.charAt(0);
		String[] res1 = {"ANA", "FRANK", "PEDRO", "LUIS"};
		assertEquals(Arrays.toString(res1), Arrays.toString(Metodos.splitByLetter(str1, chp1)));
		
		//test 2 prueba con simbolos mas extraños como @
		// tiene que devolverlo igual
		String str2 = "ANA@FRANK@PEDRO@LUIS";
		String ch2str2 = "@";
		char chp2 = ch2str2.charAt(0);
		String[] res2 = {"ANA", "FRANK", "PEDRO", "LUIS"};
		assertEquals(Arrays.toString(res2), Arrays.toString(Metodos.splitByLetter(str2, chp2)));
		
		//test 3 prueba sin nada que pueda cortar en el char
		//tiene que devolver el array como le llego
		String str3 = "ANA,FRANK,PEDRO,LUIS";
		String ch3str3 = " ";
		char chp3 = ch3str3.charAt(0);
		String[] res3 = {"ANA,FRANK,PEDRO,LUIS"};
		assertEquals(Arrays.toString(res3), Arrays.toString(Metodos.splitByLetter(str3, chp3)));
		
		//test 4 prueba sin nada en el string
		//tiene que devolver nada un string vacio en la primera posicion
		String str4 = "";
		String ch4str4 = ",";
		char chp4 = ch4str4.charAt(0);
		String[] res4 = {null};
		assertEquals(Arrays.toString(res4), Arrays.toString(Metodos.splitByLetter(str4, chp4)));
		
		//test 5 prueba solo con el simbolo por el que parte
		//tiene que devolver null entre las comas
		String str5 = ",,,,,";
		String ch5str5 = ",";
		char chp5 = ch5str5.charAt(0);
		String[] res5 = {null, null, null, null, null, null};
		assertEquals(Arrays.toString(res5), Arrays.toString(Metodos.splitByLetter(str5, chp5)));
		
	}
	
	@Test
	public void test4() {
		//test 1 prueba normal
		String str11 = "abcd";
		String str12 = "zyxw";
		int[] res1 = {11834, 11858, 11880, 11900};
		assertEquals(Arrays.toString(res1), Arrays.toString( Metodos.scalarProduct(str11, str12)));
		
		//test 2 espacios en el primer str 
		// tiene que multiplicar la posicion vacia por espacios
		String str21 = "abc";
		String str22 = "zyxw";
		int[] res2 = {11834, 11858, 11880, 3808};
		assertEquals(Arrays.toString(res2), Arrays.toString( Metodos.scalarProduct(str21, str22)));
		
		//test 3 espacios en el segundo str 
		// tiene que multiplicar la posicion vacia por espacios
		String str31 = "abcd";
		String str32 = "zyx";
		int[] res3 = {11834, 11858, 11880, 3200};
		assertEquals(Arrays.toString(res3), Arrays.toString( Metodos.scalarProduct(str31, str32)));
		
		//test 4 los 2 str estan vacios por lo que tiene que devolver vacio
		String str41 = "";
		String str42 = "";
		int[] res4 = {};
		assertEquals(Arrays.toString(res4), Arrays.toString( Metodos.scalarProduct(str41, str42)));
		
		//test 5 simbolos extraños con otra numeracion en la tabla asci
		String str51 = "@%&/(";
		String str52 = "=)(=&";
		int[] res5 = {3904, 1517, 1520, 2867, 1520};
		assertEquals(Arrays.toString(res5), Arrays.toString( Metodos.scalarProduct(str51, str52)));
		
	}
}
