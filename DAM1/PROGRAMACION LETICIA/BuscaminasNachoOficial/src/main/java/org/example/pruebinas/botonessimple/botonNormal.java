package pruebinas.botonessimple;

import javax.swing.*;

public class botonNormal {
    public static void main(String[] args) {
        JFrame ventana = new JFrame();

        JButton boton1 = new JButton("Boton1");
        boton1.setBounds(10, 10, 200, 200);
        JButton boton2 = new JButton("Boton2");
        boton2.setBounds(220, 10, 200, 200);
        JButton boton3 = new JButton("Boton3");
        boton3.setBounds(10, 220, 200, 200);
        JButton boton4 = new JButton("Boton4");
        boton4.setBounds(220, 220, 200, 200);

        ventana.add(boton1);
        ventana.add(boton2);
        ventana.add(boton3);
        ventana.add(boton4);
        ventana.setSize(430, 430);
        ventana.setLayout(null);
        ventana.setVisible(true);
    }
}
