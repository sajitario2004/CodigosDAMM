package org.pruebas;


    import javax.swing.*;
import java.awt.*;

    public class p2Ventanas extends JFrame {

        public p2Ventanas() {
            setTitle("Ventana con fondo");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setExtendedState(JFrame.MAXIMIZED_BOTH); // Pantalla completa
            setLocationRelativeTo(null);
/*
            // Cargar panel personalizado con fondo
            JPanel panelConFondo = new JPanel() {
                Image fondo = new ImageIcon(getClass().getResource("src/main/org/pruebas/bg.jpg")).getImage();

                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    g.drawImage(fondo, 0, 0, getWidth(), getHeight(), this); // Imagen escalada
                }
            };

            panelConFondo.setLayout(null); // Para posicionar manualmente otros componentes
            setContentPane(panelConFondo);

            // Aquí puedes agregar otros componentes al panel
            JButton boton = new JButton("Hola");
            boton.setBounds(100, 100, 100, 30);
            panelConFondo.add(boton);

            setVisible(true);
        }

        public static void main(String[] args) {
            new p2Ventanas();

 */
        }


    }


