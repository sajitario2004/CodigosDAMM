package ies.vdm;

import java.util.ArrayList;
import java.util.List;

import org.junit.*;
import static org.junit.Assert.*;

public class testEjercicioD {

    @Test
    public void testDigitoPresenteVariasVeces() {
        List<Integer> esperado = new ArrayList<>();
        esperado.add(0);
        esperado.add(3);
        esperado.add(6);

        List<Integer> resultado = EjercicioD.main(1231231, 1);
        assertEquals(esperado, resultado);
    }

    @Test
    public void testDigitoPresenteUnaVez() {
        List<Integer> esperado = new ArrayList<>();
        esperado.add(1);

        List<Integer> resultado = EjercicioD.main(34567, 4);
        assertEquals(esperado, resultado);
    }

    @Test
    public void testDigitoNoPresente() {
        List<Integer> esperado = new ArrayList<>();

        List<Integer> resultado = EjercicioD.main(987654, 1);
        assertEquals(esperado, resultado);
    }

    @Test
    public void testNumeroNegativo() {
        List<Integer> esperado = new ArrayList<>();
        esperado.add(0);
        esperado.add(2);
        esperado.add(4);

        List<Integer> resultado = EjercicioD.main(-505050, 5);
        assertEquals(esperado, resultado);
    }

    @Test
    public void testTodoIgual() {
        List<Integer> esperado = new ArrayList<>();
        esperado.add(0);
        esperado.add(1);
        esperado.add(2);
        esperado.add(3);

        List<Integer> resultado = EjercicioD.main(7777, 7);
        assertEquals(esperado, resultado);
    }
}
