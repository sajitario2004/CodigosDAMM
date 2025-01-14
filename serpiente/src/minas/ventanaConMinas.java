package minas;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

import static minas.calculoArrayMinas.ArraysInfoMinas;



public class ventanaConMinas extends JFrame implements ActionListener {
    //tamaño ventana

    //cogemos el tamaño de la pantalla en 2 variables

    int altura = getHeight();
    int anchura = getWidth();


    //array minas
    String [][][] arrayminas = ArraysInfoMinas();


    //botones
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

    public ventanaConMinas(String [][][] arrayminas){



        cas1 = new JButton("");
        cas1.setBounds(0, 0, 100, 100);
        ventana.add(cas1);
        cas1.addActionListener(this);

        cas2 = new JButton("");
        cas2.setBounds(100, 0, 100, 100);
        ventana.add(cas2);
        cas2.addActionListener(this);

        cas3 = new JButton("");
        cas3.setBounds(200, 0, 100, 100);
        ventana.add(cas3);
        cas3.addActionListener(this);

        cas4 = new JButton("");
        cas4.setBounds(300, 0, 100, 100);
        ventana.add(cas4);
        cas4.addActionListener(this);

        cas5 = new JButton("");
        cas5.setBounds(400, 0, 100, 100);
        ventana.add(cas5);
        cas5.addActionListener(this);

        cas6 = new JButton("");
        cas6.setBounds(500, 0, 100, 100);
        ventana.add(cas6);
        cas6.addActionListener(this);

        cas7 = new JButton("");
        cas7.setBounds(600, 0, 100, 100);
        ventana.add(cas7);
        cas7.addActionListener(this);

        cas8 = new JButton("");
        cas8.setBounds(700, 0, 100, 100);
        ventana.add(cas8);
        cas8.addActionListener(this);

        cas9 = new JButton("");
        cas9.setBounds(800, 0, 100, 100);
        ventana.add(cas9);
        cas9.addActionListener(this);

        cas10 = new JButton("");
        cas10.setBounds(900, 0, 100, 100);
        ventana.add(cas10);
        cas10.addActionListener(this);

        try {
            Thread.sleep(200);
        } catch (Exception e) {
            System.out.println(e);
        }


        cas11 = new JButton("");
        cas11.setBounds(0, 100, 100, 100);
        ventana.add(cas11);
        cas11.addActionListener(this);

        cas12 = new JButton("");
        cas12.setBounds(100, 100, 100, 100);
        ventana.add(cas12);
        cas12.addActionListener(this);

        cas13 = new JButton("");
        cas13.setBounds(200, 100, 100, 100);
        ventana.add(cas13);
        cas13.addActionListener(this);

        cas14 = new JButton("");
        cas14.setBounds(300, 100, 100, 100);
        ventana.add(cas14);
        cas14.addActionListener(this);

        cas15 = new JButton("");
        cas15.setBounds(400, 100, 100, 100);
        ventana.add(cas15);
        cas15.addActionListener(this);

        cas16 = new JButton("");
        cas16.setBounds(500, 100, 100, 100);
        ventana.add(cas16);
        cas16.addActionListener(this);

        cas17 = new JButton("");
        cas17.setBounds(600, 100, 100, 100);
        ventana.add(cas17);
        cas17.addActionListener(this);

        cas18 = new JButton("");
        cas18.setBounds(700, 100, 100, 100);
        ventana.add(cas18);
        cas18.addActionListener(this);

        cas19 = new JButton("");
        cas19.setBounds(800, 100, 100, 100);
        ventana.add(cas19);
        cas19.addActionListener(this);

        cas20 = new JButton("");
        cas20.setBounds(900, 100, 100, 100);
        ventana.add(cas20);
        cas20.addActionListener(this);


        try {
            Thread.sleep(200);
        } catch (Exception e) {
            System.out.println(e);
        }


        cas21 = new JButton("");
        cas21.setBounds(0, 200, 100, 100);
        ventana.add(cas21);
        cas21.addActionListener(this);

        cas22 = new JButton("");
        cas22.setBounds(100, 200, 100, 100);
        ventana.add(cas22);
        cas22.addActionListener(this);

        cas23 = new JButton("");
        cas23.setBounds(200, 200, 100, 100);
        ventana.add(cas23);
        cas23.addActionListener(this);

        cas24 = new JButton("");
        cas24.setBounds(300, 200, 100, 100);
        ventana.add(cas24);
        cas24.addActionListener(this);

        cas25 = new JButton("");
        cas25.setBounds(400, 200, 100, 100);
        ventana.add(cas25);
        cas25.addActionListener(this);

        cas26 = new JButton("");
        cas26.setBounds(500, 200, 100, 100);
        ventana.add(cas26);
        cas26.addActionListener(this);

        cas27 = new JButton("");
        cas27.setBounds(600, 200, 100, 100);
        ventana.add(cas27);
        cas27.addActionListener(this);

        cas28 = new JButton("");
        cas28.setBounds(700, 200, 100, 100);
        ventana.add(cas28);
        cas28.addActionListener(this);

        cas29 = new JButton("");
        cas29.setBounds(800, 200, 100, 100);
        ventana.add(cas29);
        cas29.addActionListener(this);

        cas30 = new JButton("");
        cas30.setBounds(900, 200, 100, 100);
        ventana.add(cas30);
        cas30.addActionListener(this);


        try {
            Thread.sleep(200);
        } catch (Exception e) {
            System.out.println(e);
        }


        cas31 = new JButton("");
        cas31.setBounds(0, 300, 100, 100);
        ventana.add(cas31);
        cas31.addActionListener(this);

        cas32 = new JButton("");
        cas32.setBounds(100, 300, 100, 100);
        ventana.add(cas32);
        cas32.addActionListener(this);

        cas33 = new JButton("");
        cas33.setBounds(200, 300, 100, 100);
        ventana.add(cas33);
        cas33.addActionListener(this);

        cas34 = new JButton("");
        cas34.setBounds(300, 300, 100, 100);
        ventana.add(cas34);
        cas34.addActionListener(this);

        cas35 = new JButton("");
        cas35.setBounds(400, 300, 100, 100);
        ventana.add(cas35);
        cas35.addActionListener(this);

        cas36 = new JButton("");
        cas36.setBounds(500, 300, 100, 100);
        ventana.add(cas36);
        cas36.addActionListener(this);

        cas37 = new JButton("");
        cas37.setBounds(600, 300, 100, 100);
        ventana.add(cas37);
        cas37.addActionListener(this);

        cas38 = new JButton("");
        cas38.setBounds(700, 300, 100, 100);
        ventana.add(cas38);
        cas38.addActionListener(this);

        cas39 = new JButton("");
        cas39.setBounds(800, 300, 100, 100);
        ventana.add(cas39);
        cas39.addActionListener(this);

        cas40 = new JButton("");
        cas40.setBounds(900, 300, 100, 100);
        ventana.add(cas40);
        cas40.addActionListener(this);

        try {
            Thread.sleep(200);
        } catch (Exception e) {
            System.out.println(e);
        }

        cas41 = new JButton("");
        cas41.setBounds(0, 400, 100, 100);
        ventana.add(cas41);
        cas41.addActionListener(this);

        cas42 = new JButton("");
        cas42.setBounds(100, 400, 100, 100);
        ventana.add(cas42);
        cas42.addActionListener(this);

        cas43 = new JButton("");
        cas43.setBounds(200, 400, 100, 100);
        ventana.add(cas43);
        cas43.addActionListener(this);

        cas44 = new JButton("");
        cas44.setBounds(300, 400, 100, 100);
        ventana.add(cas44);
        cas44.addActionListener(this);

        cas45 = new JButton("");
        cas45.setBounds(400, 400, 100, 100);
        ventana.add(cas45);
        cas45.addActionListener(this);

        cas46 = new JButton("");
        cas46.setBounds(500, 400, 100, 100);
        ventana.add(cas46);
        cas46.addActionListener(this);

        cas47 = new JButton("");
        cas47.setBounds(600, 400, 100, 100);
        ventana.add(cas47);
        cas47.addActionListener(this);

        cas48 = new JButton("");
        cas48.setBounds(700, 400, 100, 100);
        ventana.add(cas48);
        cas48.addActionListener(this);

        cas49 = new JButton("");
        cas49.setBounds(800, 400, 100, 100);
        ventana.add(cas49);
        cas49.addActionListener(this);

        cas50 = new JButton("");
        cas50.setBounds(900, 400, 100, 100);
        ventana.add(cas50);
        cas50.addActionListener(this);


        try {
            Thread.sleep(200);
        } catch (Exception e) {
            System.out.println(e);
        }


        cas51 = new JButton("");
        cas51.setBounds(0, 500, 100, 100);
        ventana.add(cas51);
        cas51.addActionListener(this);

        cas52 = new JButton("");
        cas52.setBounds(100, 500, 100, 100);
        ventana.add(cas52);
        cas52.addActionListener(this);

        cas53 = new JButton("");
        cas53.setBounds(200, 500, 100, 100);
        ventana.add(cas53);
        cas53.addActionListener(this);

        cas54 = new JButton("");
        cas54.setBounds(300, 500, 100, 100);
        ventana.add(cas54);
        cas54.addActionListener(this);

        cas55 = new JButton("");
        cas55.setBounds(400, 500, 100, 100);
        ventana.add(cas55);
        cas55.addActionListener(this);

        cas56 = new JButton("");
        cas56.setBounds(500, 500, 100, 100);
        ventana.add(cas56);
        cas56.addActionListener(this);

        cas57 = new JButton("");
        cas57.setBounds(600, 500, 100, 100);
        ventana.add(cas57);
        cas57.addActionListener(this);

        cas58 = new JButton("");
        cas58.setBounds(700, 500, 100, 100);
        ventana.add(cas58);
        cas58.addActionListener(this);

        cas59 = new JButton("");
        cas59.setBounds(800, 500, 100, 100);
        ventana.add(cas59);
        cas59.addActionListener(this);

        cas60 = new JButton("");
        cas60.setBounds(900, 500, 100, 100);
        ventana.add(cas60);
        cas60.addActionListener(this);


        try {
            Thread.sleep(200);
        } catch (Exception e) {
            System.out.println(e);
        }


        cas61 = new JButton("");
        cas61.setBounds(0, 600, 100, 100);
        ventana.add(cas61);
        cas61.addActionListener(this);

        cas62 = new JButton("");
        cas62.setBounds(100, 600, 100, 100);
        ventana.add(cas62);
        cas62.addActionListener(this);

        cas63 = new JButton("");
        cas63.setBounds(200, 600, 100, 100);
        ventana.add(cas63);
        cas63.addActionListener(this);

        cas64 = new JButton("");
        cas64.setBounds(300, 600, 100, 100);
        ventana.add(cas64);
        cas64.addActionListener(this);

        cas65 = new JButton("");
        cas65.setBounds(400, 600, 100, 100);
        ventana.add(cas65);
        cas65.addActionListener(this);

        cas66 = new JButton("");
        cas66.setBounds(500, 600, 100, 100);
        ventana.add(cas66);
        cas66.addActionListener(this);

        cas67 = new JButton("");
        cas67.setBounds(600, 600, 100, 100);
        ventana.add(cas67);
        cas67.addActionListener(this);

        cas68 = new JButton("");
        cas68.setBounds(700, 600, 100, 100);
        ventana.add(cas68);
        cas68.addActionListener(this);

        cas69 = new JButton("");
        cas69.setBounds(800, 600, 100, 100);
        ventana.add(cas69);
        cas69.addActionListener(this);

        cas70 = new JButton("");
        cas70.setBounds(900, 600, 100, 100);
        ventana.add(cas70);
        cas70.addActionListener(this);

        cas71 = new JButton("");
        cas71.setBounds(0, 700, 100, 100);
        ventana.add(cas71);
        cas71.addActionListener(this);

        cas72 = new JButton("");
        cas72.setBounds(100, 700, 100, 100);
        ventana.add(cas72);
        cas72.addActionListener(this);

        cas73 = new JButton("");
        cas73.setBounds(200, 700, 100, 100);
        ventana.add(cas73);
        cas73.addActionListener(this);

        cas74 = new JButton("");
        cas74.setBounds(300, 700, 100, 100);
        ventana.add(cas74);
        cas74.addActionListener(this);

        cas75 = new JButton("");
        cas75.setBounds(400, 700, 100, 100);
        ventana.add(cas75);
        cas75.addActionListener(this);

        cas76 = new JButton("");
        cas76.setBounds(500, 700, 100, 100);
        ventana.add(cas76);
        cas76.addActionListener(this);

        cas77 = new JButton("");
        cas77.setBounds(600, 700, 100, 100);
        ventana.add(cas77);
        cas77.addActionListener(this);

        cas78 = new JButton("");
        cas78.setBounds(700, 700, 100, 100);
        ventana.add(cas78);
        cas78.addActionListener(this);

        cas79 = new JButton("");
        cas79.setBounds(800, 700, 100, 100);
        ventana.add(cas79);
        cas79.addActionListener(this);

        cas80 = new JButton("");
        cas80.setBounds(900, 700, 100, 100);
        ventana.add(cas80);
        cas80.addActionListener(this);


        try {
            Thread.sleep(200);
        } catch (Exception e) {
            System.out.println(e);
        }


        cas81 = new JButton("");
        cas81.setBounds(0, 800, 100, 100);
        ventana.add(cas81);
        cas81.addActionListener(this);

        cas82 = new JButton("");
        cas82.setBounds(100, 800, 100, 100);
        ventana.add(cas82);
        cas82.addActionListener(this);

        cas83 = new JButton("");
        cas83.setBounds(200, 800, 100, 100);
        ventana.add(cas83);
        cas83.addActionListener(this);

        cas84 = new JButton("");
        cas84.setBounds(300, 800, 100, 100);
        ventana.add(cas84);
        cas84.addActionListener(this);

        cas85 = new JButton("");
        cas85.setBounds(400, 800, 100, 100);
        ventana.add(cas85);
        cas85.addActionListener(this);

        cas86 = new JButton("");
        cas86.setBounds(500, 800, 100, 100);
        ventana.add(cas86);
        cas86.addActionListener(this);

        cas87 = new JButton("");
        cas87.setBounds(600, 800, 100, 100);
        ventana.add(cas87);
        cas87.addActionListener(this);

        cas88 = new JButton("");
        cas88.setBounds(700, 800, 100, 100);
        ventana.add(cas88);
        cas88.addActionListener(this);

        cas89 = new JButton("");
        cas89.setBounds(800, 800, 100, 100);
        ventana.add(cas89);
        cas89.addActionListener(this);

        cas90 = new JButton("");
        cas90.setBounds(900, 800, 100, 100);
        ventana.add(cas90);
        cas90.addActionListener(this);


        try {
            Thread.sleep(200);
        } catch (Exception e) {
            System.out.println(e);
        }


        cas91 = new JButton("");
        cas91.setBounds(0, 900, 100, 100);
        ventana.add(cas91);
        cas91.addActionListener(this);

        cas92 = new JButton("");
        cas92.setBounds(100, 900, 100, 100);
        ventana.add(cas92);
        cas92.addActionListener(this);

        cas93 = new JButton("");
        cas93.setBounds(200, 900, 100, 100);
        ventana.add(cas93);
        cas93.addActionListener(this);

        cas94 = new JButton("");
        cas94.setBounds(300, 900, 100, 100);
        ventana.add(cas94);
        cas94.addActionListener(this);

        cas95 = new JButton("");
        cas95.setBounds(400, 900, 100, 100);
        ventana.add(cas95);
        cas95.addActionListener(this);

        cas96 = new JButton("");
        cas96.setBounds(500, 900, 100, 100);
        ventana.add(cas96);
        cas96.addActionListener(this);

        cas97 = new JButton("");
        cas97.setBounds(600, 900, 100, 100);
        ventana.add(cas97);
        cas97.addActionListener(this);

        cas98 = new JButton("");
        cas98.setBounds(700, 900, 100, 100);
        ventana.add(cas98);
        cas98.addActionListener(this);

        cas99 = new JButton("");
        cas99.setBounds(800, 900, 100, 100);
        ventana.add(cas99);
        cas99.addActionListener(this);

        cas100 = new JButton("");
        cas100.setBounds(900, 900, 100, 100);
        ventana.add(cas100);
        cas100.addActionListener(this);



        System.out.println("altura: " + altura);

        //le damos ese tamaño a la pantalla y la imprimimos
        ventana.setResizable(true);
        ventana.setSize(1000,1100);
        ventana.setLayout(null);
        ventana.setVisible(true);

        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {


        if (e.getSource() == cas1) {
            cas1.setText(arrayminas[0][0][1]);
            ventana.repaint();
        }
        if (e.getSource() == cas2) {
            cas2.setText(arrayminas[1][0][1]);
            ventana.repaint();
        }
        if (e.getSource() == cas3) {
            cas3.setText(arrayminas[2][0][1]);
            ventana.repaint();
        }
        if (e.getSource() == cas4) {
            cas4.setText(arrayminas[3][0][1]);
            ventana.repaint();
        }
        if (e.getSource() == cas5) {
            cas5.setText(arrayminas[4][0][1]);
            ventana.repaint();
        }
        if (e.getSource() == cas6) {
            cas6.setText(arrayminas[5][0][1]);
            ventana.repaint();
        }
        if (e.getSource() == cas7) {
            cas7.setText(arrayminas[6][0][1]);
            ventana.repaint();
        }
        if (e.getSource() == cas8) {
            cas8.setText(arrayminas[7][0][1]);
            ventana.repaint();
        }
        if (e.getSource() == cas9) {
            cas9.setText(arrayminas[8][0][1]);
            ventana.repaint();
        }
        if (e.getSource() == cas10) {
            cas10.setText(arrayminas[9][0][1]);
            ventana.repaint();
        }


        if (e.getSource() == cas11) {
            cas11.setText(arrayminas[0][1][1]);
            ventana.repaint();
        }
        if (e.getSource() == cas12) {
            cas12.setText(arrayminas[1][1][1]);
            ventana.repaint();
        }
        if (e.getSource() == cas13) {
            cas13.setText(arrayminas[2][1][1]);
            ventana.repaint();
        }
        if (e.getSource() == cas14) {
            cas14.setText(arrayminas[3][1][1]);
            ventana.repaint();
        }
        if (e.getSource() == cas15) {
            cas15.setText(arrayminas[4][1][1]);
            ventana.repaint();
        }
        if (e.getSource() == cas16) {
            cas16.setText(arrayminas[5][1][1]);
            ventana.repaint();
        }
        if (e.getSource() == cas17) {
            cas17.setText(arrayminas[6][1][1]);
            ventana.repaint();
        }
        if (e.getSource() == cas18) {
            cas18.setText(arrayminas[7][1][1]);
            ventana.repaint();
        }
        if (e.getSource() == cas19) {
            cas19.setText(arrayminas[8][1][1]);
            ventana.repaint();
        }
        if (e.getSource() == cas20) {
            cas20.setText(arrayminas[9][1][1]);
        }
        if (e.getSource() == cas21) {
            cas21.setText(arrayminas[0][2][1]);
            ventana.repaint();
        }
        if (e.getSource() == cas22) {
            cas22.setText(arrayminas[1][2][1]);
            ventana.repaint();
        }
        if (e.getSource() == cas23) {
            cas23.setText(arrayminas[2][2][1]);
            ventana.repaint();
        }
        if (e.getSource() == cas24) {
            cas24.setText(arrayminas[3][2][1]);
            ventana.repaint();
        }
        if (e.getSource() == cas25) {
            cas25.setText(arrayminas[4][2][1]);
            ventana.repaint();
        }
        if (e.getSource() == cas26) {
            cas26.setText(arrayminas[5][2][1]);
            ventana.repaint();
        }
        if (e.getSource() == cas27) {
            cas27.setText(arrayminas[6][2][1]);
            ventana.repaint();
        }
        if (e.getSource() == cas28) {
            cas28.setText(arrayminas[7][2][1]);
            ventana.repaint();
        }
        if (e.getSource() == cas29) {
            cas29.setText(arrayminas[8][2][1]);
            ventana.repaint();
        }
        if (e.getSource() == cas30) {
            cas30.setText(arrayminas[9][2][1]);
            ventana.repaint();
        }
        if (e.getSource() == cas31) {
            cas31.setText(arrayminas[0][3][1]);
            ventana.repaint();
        }
        if (e.getSource() == cas32) {
            cas32.setText(arrayminas[1][3][1]);
            ventana.repaint();
        }
        if (e.getSource() == cas33) {
            cas33.setText(arrayminas[2][3][1]);
            ventana.repaint();
        }
        if (e.getSource() == cas34) {
            cas34.setText(arrayminas[3][3][1]);
        }
        if (e.getSource() == cas35) {
            cas35.setText(arrayminas[4][3][1]);
            ventana.repaint();
        }
        if (e.getSource() == cas36) {
            cas36.setText(arrayminas[5][3][1]);
            ventana.repaint();
        }
        if (e.getSource() == cas37) {
            cas37.setText(arrayminas[6][3][1]);
            ventana.repaint();
        }
        if (e.getSource() == cas38) {
            cas38.setText(arrayminas[7][3][1]);
            ventana.repaint();
        }
        if (e.getSource() == cas39) {
            cas39.setText(arrayminas[8][3][1]);
            ventana.repaint();
        }
        if (e.getSource() == cas40) {
            cas40.setText(arrayminas[9][3][1]);
            ventana.repaint();
        }
        if (e.getSource() == cas41) {
            cas41.setText(arrayminas[0][4][1]);
            ventana.repaint();
        }
        if (e.getSource() == cas42) {
            cas42.setText(arrayminas[1][4][1]);
            ventana.repaint();
        }
        if (e.getSource() == cas43) {
            cas43.setText(arrayminas[2][4][1]);
            ventana.repaint();
        }
        if (e.getSource() == cas44) {
            cas44.setText(arrayminas[3][4][1]);
            ventana.repaint();
        }
        if (e.getSource() == cas45) {
            cas45.setText(arrayminas[4][4][1]);
            ventana.repaint();
        }
        if (e.getSource() == cas46) {
            cas46.setText(arrayminas[5][4][1]);
            ventana.repaint();
        }
        if (e.getSource() == cas47) {
            cas47.setText(arrayminas[6][4][1]);
            ventana.repaint();
        }
        if (e.getSource() == cas48) {
            cas48.setText(arrayminas[7][4][1]);
            ventana.repaint();
        }
        if (e.getSource() == cas49) {
            cas49.setText(arrayminas[8][4][1]);
            ventana.repaint();
        }
        if (e.getSource() == cas50) {
            cas50.setText(arrayminas[9][4][1]);
            ventana.repaint();
        }
        if (e.getSource() == cas51) {
            cas51.setText(arrayminas[0][5][1]);
            ventana.repaint();
        }
        if (e.getSource() == cas52) {
            cas52.setText(arrayminas[1][5][1]);
            ventana.repaint();
        }
        if (e.getSource() == cas53) {
            cas53.setText(arrayminas[2][5][1]);
            ventana.repaint();
        }
        if (e.getSource() == cas54) {
            cas54.setText(arrayminas[3][5][1]);
            ventana.repaint();
        }
        if (e.getSource() == cas55) {
            cas55.setText(arrayminas[4][5][1]);
            ventana.repaint();
        }
        if (e.getSource() == cas56) {
            cas56.setText(arrayminas[5][5][1]);
            ventana.repaint();
        }
        if (e.getSource() == cas57) {
            cas57.setText(arrayminas[6][5][1]);
            ventana.repaint();
        }
        if (e.getSource() == cas58) {
            cas58.setText(arrayminas[7][5][1]);
            ventana.repaint();
        }
        if (e.getSource() == cas59) {
            cas59.setText(arrayminas[8][5][1]);
            ventana.repaint();
        }
        if (e.getSource() == cas60) {
            cas60.setText(arrayminas[9][5][1]);
            ventana.repaint();
        }
        if (e.getSource() == cas61) {
            cas61.setText(arrayminas[0][6][1]);
            ventana.repaint();
        }
        if (e.getSource() == cas62) {
            cas62.setText(arrayminas[1][6][1]);
            ventana.repaint();
        }
        if (e.getSource() == cas63) {
            cas63.setText(arrayminas[2][6][1]);
            ventana.repaint();
        }
        if (e.getSource() == cas64) {
            cas64.setText(arrayminas[3][6][1]);
            ventana.repaint();
        }
    }

    public static void main(String[] args) {

        String [][][] arrayminas = ArraysInfoMinas();


        new ventanaConMinas(arrayminas);
    }
}
