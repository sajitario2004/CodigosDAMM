package org.aaPrincipal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;


public class VentanaPrincipal extends All_In implements ActionListener {
    JFrame ventanaPrincipal = new JFrame();

    All_In all = new All_In();

    int tamanoX = all.tPantallaX;
    int tamanoY = all.tPantallaY;

    List<JButton> buttons = all.bVPrincipal;


    public VentanaPrincipal() {
        ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventanaPrincipal.setTitle("Ventana Principal");
        ventanaPrincipal.setResizable(true);
        ventanaPrincipal.setLocationRelativeTo(null);
        ventanaPrincipal.getContentPane().setLayout(null);
        ventanaPrincipal.setBounds(0, 0, tamanoX, tamanoY);
        ventanaPrincipal.setVisible(true);

        // boton de salida
        bSalir.addActionListener(this);
        bSalir.setText("X");
        //bSalir.set
            //cordenadas de boton de salida
        int cSalidaX = all.tPantallaX - 100;
        int cSalidaY = 0;
            //tamaño del boton de salida
        int tSalidaX = all.tPantallaX * 6 /100 ;
        int tSalidaY = all.tPantallaY * 6 /100 ;
        bSalir.setBounds(cSalidaX, cSalidaY, tSalidaX, tSalidaY);

            //Colores boton salir
        bSalir.setBackground(Color.RED);
        bSalir.setForeground(Color.WHITE);

            // Añadir un MouseListener para detectar eventos del ratón
        bSalir.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                // Cuando el ratón entra en el botón
                Color DARK_RED = new Color(138, 0 , 0 );
                bSalir.setBackground(DARK_RED); // Cambia color fondo
                bSalir.setForeground(Color.BLACK); // Cambia Color texto
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // Cuando el ratón sale del botón
                bSalir.setBackground(Color.RED); // Cambia color fondo
                bSalir.setForeground(Color.WHITE); // Cambia color texto
            }
        });


        ventanaPrincipal.add(bSalir);



    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == bSalir){
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new VentanaPrincipal();
        
    }
}
