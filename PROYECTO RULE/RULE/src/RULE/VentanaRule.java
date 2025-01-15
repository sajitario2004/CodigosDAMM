package RULE;

import javax.swing.*;
import java.awt.event.*;

public class VentanaRule extends JFrame implements ActionListener {

    JFrame ventana = new JFrame();



    //ventana
    public VentanaRule() {
        //tamaño y formato de ventana
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(1800, 1000);
        ventana.setLayout(null);


        // Crear varios botones en un bucle

       for (int i = 1; i <= 36; i++) {
            JButton button = new JButton("" + i);
            button.setSize(100, 100);  // Establecer tamaño de cada botón

            // Ubicación de los botones en el JFrame
            if (i > 24 && i <= 36) {
                button.setLocation(600 + (i - 25) * 105, 900);  // Fila 3 (Botones 25 a 36)
            } else if (i > 12 && i <= 24) {
                button.setLocation(600 + (i - 13) * 105, 800);  // Fila 2 (Botones 13 a 24)
            } else if (i > 1 && i <= 12) {
                button.setLocation(600 + (i - 1) * 105, 700);  // Fila 1 (Botones 1 a 12)
            }

           button.setLayout(null);

           ventana.add(button);  // Agregar el botón al JFrame
       }

        // imagen rule

        ImageIcon FotoRule = new ImageIcon(getClass().getResource("/imgs/RULEFOTO.jpg"));

        JLabel lblFotoRule = new JLabel();

        lblFotoRule.setSize(690,690);
        lblFotoRule.setLocation(555, 10);

        lblFotoRule.setIcon(FotoRule);


        //DESCANSO PARA LA RAM

        try {
            Thread.sleep(200);
        } catch (Exception e) {
            System.out.println(e);
        }


        //Añadimos FOto
        ventana.add(lblFotoRule);


        //visualizar ventana
        ventana.setVisible(true);
    }


    //acction lissener
    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        new VentanaRule();
    }
}
