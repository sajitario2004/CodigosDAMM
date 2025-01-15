package variosJbutons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VariosJButtons extends JFrame implements ActionListener {

    public VariosJButtons() {
        // Tamaño y formato de ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1800, 1000);
        setLayout(null);  // Usamos null layout para establecer ubicaciones y tamaños manualmente

        // Crear varios botones en un bucle
        for (int i = 1; i <= 36; i++) {
            JButton button = new JButton("" + i);
            button.setSize(100, 100);  // Establecer tamaño de cada botón

            // Ubicación de los botones en el JFrame
            if (i > 24 && i <= 36) {
                button.setLocation(100 + (i - 25) * 110, 700);  // Fila 3 (Botones 25 a 36)
            } else if (i > 12 && i <= 24) {
                button.setLocation(100 + (i - 13) * 110, 400);  // Fila 2 (Botones 13 a 24)
            } else {
                button.setLocation(100 + (i - 1) * 110, 100);  // Fila 1 (Botones 1 a 12)
            }

            add(button);  // Agregar el botón al JFrame
        }

        // Hacer visible la ventana
        setVisible(true);
    }

    // ActionListener (actualmente no se usa)
    @Override
    public void actionPerformed(ActionEvent e) {}

    public static void main(String[] args) {
        new VariosJButtons();
    }
}

