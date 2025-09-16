package org;

import javax.swing.*;

public class pruebasSwing {
    private JPanel panel1;

    public pruebasSwing() {
        JFrame ventana = new JFrame();
        ventana.setContentPane(panel1);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.pack();
        ventana.setExtendedState(JFrame.MAXIMIZED_BOTH);
        ventana.setVisible(true);

    }

    public static void main(String[] args) {
        new pruebasSwing();
    }
}
