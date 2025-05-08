package org.aaPrincipal;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.List;

public class VentanaPrincipal extends All_In implements ActionListener {
    JFrame ventanaPrincipal = new JFrame();
    All_In all = new All_In();

    int tamanoX = all.tPantallaX;
    int tamanoY = all.tPantallaY;

    List<JButton> buttons = all.bVPrincipal;

    //variable para imagen
    Image backgroundImage = null;

    //buton
    JButton bSalir = new JButton(); // Asegúrate de inicializar el botón

    public VentanaPrincipal() {
        ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventanaPrincipal.setTitle("Ventana Principal");
        ventanaPrincipal.setResizable(false);
        ventanaPrincipal.setLocationRelativeTo(null);
        ventanaPrincipal.setBounds(0, 0, tamanoX, tamanoY);

        // Cargar la imagen de fondo
        try {
            backgroundImage = ImageIO.read(getClass().getResource("/bg.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
            backgroundImage = null;
        }

        // Panel personalizado para dibujar la imagen adaptada al tamaño del JFrame
        JPanel contentPane = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                if (backgroundImage != null) {
                    g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
                }
            }
        };
        contentPane.setLayout(null); // Desactivar el layout manager para usar posicionamiento absoluto
        ventanaPrincipal.setContentPane(contentPane);

        // Configuración del botón de salida
        bSalir.addActionListener(this);
        bSalir.setText(""); // Asegúrate de que el botón tenga texto
        int cSalidaX = all.tPantallaX - 100;
        int cSalidaY = 0;
        int tSalidaX = all.tPantallaX * 6 / 100;
        int tSalidaY = all.tPantallaY * 6 / 100;
        bSalir.setBounds(cSalidaX, cSalidaY, tSalidaX, tSalidaY);
        bSalir.setBackground(Color.RED);
        bSalir.setForeground(Color.WHITE);

        // Añadir MouseListener para el botón
        bSalir.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                bSalir.setBackground(new Color(138, 0, 0));
                bSalir.setForeground(Color.BLACK);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                bSalir.setBackground(Color.RED);
                bSalir.setForeground(Color.WHITE);
            }
        });

        // Añadir el botón al panel de contenido
        contentPane.add(bSalir);

        // Hacer visible la ventana
        ventanaPrincipal.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bSalir) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new VentanaPrincipal();
    }
}
