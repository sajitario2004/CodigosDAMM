package minas;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import static minas.calculoArrayMinas.ArraysInfoMinas;


public class inicio extends JFrame implements ActionListener {

    JFrame ventanaInicio = new JFrame();
    JButton Iniciar = new JButton("Iniciar");


    public inicio() {
        ventanaInicio.setTitle("Inicio");
        ventanaInicio.setLayout(null);
        ventanaInicio.setSize(600, 600);

        Iniciar.addActionListener(this);
        Iniciar.setBounds(250, 500, 100,50 );
        ventanaInicio.add(Iniciar);

        ImageIcon FotoCayetano = new ImageIcon(getClass().getResource("img/calletano.jpg"));

        JLabel lblFotoCayetano = new JLabel();

        lblFotoCayetano.setSize(400,400);
        lblFotoCayetano.setLocation(125, 10);

        lblFotoCayetano.setIcon(FotoCayetano);

        ventanaInicio.add(lblFotoCayetano);

        ventanaInicio.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Iniciar) {
            String [][][] arrayminas = ArraysInfoMinas();
            try {
                new ventanaConMinas(arrayminas);
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            }

            ventanaInicio.setVisible(false);

        }
    }



    public static void main(String[] args) {
        new inicio();

    }
}
