package minas;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

public class ventanaConMinas extends JFrame implements ActionListener {
    JButton cas1;
    JButton cas2;
    JButton cas3;
    JButton cas4;
    JButton cas5;
    JButton cas6;
    JButton cas7;
    JButton cas8;
    JButton cas9;
    JButton cas10;
    JButton cas11;
    JButton cas12;
    JButton cas13;
    JButton cas14;
    JButton cas15;
    JButton cas16;
    JButton cas17;
    JButton cas18;
    JButton cas19;
    JButton cas20;
    JButton cas21;
    JButton cas22;
    JButton cas23;
    JButton cas24;
    JButton cas25;
    JButton cas26;
    JButton cas27;
    JButton cas28;
    JButton cas29;
    JButton cas30;
    JButton cas31;
    JButton cas32;
    JButton cas33;
    JButton cas34;
    JButton cas35;
    JButton cas36;
    JButton cas37;
    JButton cas38;
    JButton cas39;
    JButton cas40;
    JButton cas41;
    JButton cas42;
    JButton cas43;
    JButton cas44;
    JButton cas45;
    JButton cas46;
    JButton cas47;
    JButton cas48;
    JButton cas49;
    JButton cas50;
    JButton cas51;
    JButton cas52;
    JButton cas53;
    JButton cas54;
    JButton cas55;
    JButton cas56;
    JButton cas57;
    JButton cas58;
    JButton cas59;
    JButton cas60;
    JButton cas61;
    JButton cas62;
    JButton cas63;
    JButton cas64;
    JButton cas65;
    JButton cas66;
    JButton cas67;
    JButton cas68;
    JButton cas69;
    JButton cas70;
    JButton cas71;
    JButton cas72;
    JButton cas73;
    JButton cas74;
    JButton cas75;
    JButton cas76;
    JButton cas77;
    JButton cas78;
    JButton cas79;
    JButton cas80;
    JButton cas81;
    JButton cas82;
    JButton cas83;
    JButton cas84;
    JButton cas85;
    JButton cas86;
    JButton cas87;
    JButton cas88;
    JButton cas89;
    JButton cas90;
    JButton cas91;
    JButton cas92;
    JButton cas93;
    JButton cas94;
    JButton cas95;
    JButton cas96;
    JButton cas97;
    JButton cas98;
    JButton cas99;
    JButton cas100;


    JFrame ventana = new JFrame();

    public ventanaConMinas(){

        ventana.setSize(1250, 1250);
        ventana.setLayout(null);
        ventana.setVisible(true);

        cas1 = new JButton("0");
        cas1.setBounds(0, 0, 50, 50);
        ventana.add(cas1);
        cas1.addActionListener(this);

        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cas1) {
            cas1.setText("valorArray");
            ventana.repaint();
        }
    }

    public static void main(String[] args) {
        new ventanaConMinas();
    }
}
