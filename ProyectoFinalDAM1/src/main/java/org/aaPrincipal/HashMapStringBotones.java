package org.aaPrincipal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.*;
import java.awt.event.*;

public class HashMapStringBotones {

    public static HashMap<List<String>, List<JButton>> BotonesYString() {
        HashMap<List<String>, List<JButton>> botonesVPrincipal= new HashMap<>();

        //String de nombres identificativos
        List<String> StringBotones1 = new ArrayList<>();
        //Ventana Principal
        StringBotones1.add("Jugar");
        StringBotones1.add("Opciones");
        StringBotones1.add("Partidas Guardadas");
        StringBotones1.add("Salir");

        //Boton general
        StringBotones1.add("Volver a Menu");

        //Ventana Juegos
        StringBotones1.add("Marcianitos");
        StringBotones1.add("Busca Minitas");
        StringBotones1.add("Solitario");
        StringBotones1.add("Izquierda VS Derecha");


        //Ventana Opciones
        StringBotones1.add("Pantalla Completa");
        StringBotones1.add("Modo Ventana");

        //Ventana Partidas guardadas
        StringBotones1.add("Partidas Marcianitos");
        StringBotones1.add("Partidas Busca Minitas");
        StringBotones1.add("Partidas Solitario");
        StringBotones1.add("Partidas Izquierda VS Derecha");

        List<JButton> botones1 = new ArrayList<>();
        botones1.add(new JButton());

        botonesVPrincipal.put(StringBotones1, botones1);
        return botonesVPrincipal;
    }
}
