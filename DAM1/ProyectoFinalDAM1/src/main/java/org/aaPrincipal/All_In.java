package org.aaPrincipal;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

public class All_In {

    //tamaño de la pantalla
    final int tPantallaY;
    final int tPantallaX;

    JButton bSalir;


    //Lista de botones principales
    List<JButton> bVPrincipal = new ArrayList<>();
    List<JButton> bOpciones = new ArrayList<>();
    List<JButton> bSelectorJuegos = new ArrayList<>();
    List<JButton> bPartidasGuardadas = new ArrayList<>();
    List<JButton> bVBuscaminas = new ArrayList<>();
    List<JButton> bJBuscaminas = new ArrayList<>();
    List<JButton> bVMarcianitos = new ArrayList<>();
    List<JButton> bJMarcianitos = new ArrayList<>();
    List<JButton> bVSolitario = new ArrayList<>();
    List<JButton> bJSolitarios = new ArrayList<>();

    public All_In() {

        //Tamaño de la pantalla
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();

        this.tPantallaX = screenSize.width ;
        this.tPantallaY = screenSize.height ;

        //Boton de cerrar
        this.bSalir = new JButton("X");

        //Botones prinicpals
        JButton selecJuego = new JButton("Juegos");
        this.bVPrincipal.add(selecJuego);
        JButton selecOpciones = new JButton("Opciones");
        this.bVPrincipal.add(selecOpciones);
        JButton partidasGuardadas = new JButton("Partidas");
        this.bVPrincipal = bVPrincipal;

        List<JButton> bOpciones = new ArrayList<>();
        this.bOpciones = bOpciones;
        List<JButton> bSelectorJuegos = new ArrayList<>();
        this.bSelectorJuegos = bSelectorJuegos;
        List<JButton> bPartidasGuardadas = new ArrayList<>();
        this.bPartidasGuardadas = bPartidasGuardadas;
        List<JButton> bVBuscaminas = new ArrayList<>();
        this.bVBuscaminas = bVBuscaminas;
        List<JButton> bJBuscaminas = new ArrayList<>();
        this.bJBuscaminas = bJBuscaminas;
        List<JButton> bVMarcianitos = new ArrayList<>();
        this.bVMarcianitos = bVMarcianitos;
        List<JButton> bJMarcianitos = new ArrayList<>();
        this.bJMarcianitos = bJMarcianitos;
        List<JButton> bVSolitario = new ArrayList<>();
        this.bVSolitario = bVSolitario;
        List<JButton> bJSolitarios = new ArrayList<>();
        this.bJSolitarios = bJSolitarios;
    }

    //Ventana Principal
       /* StringBotones1.add("Jugar");
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
        return botonesVPrincipal;*/

}
