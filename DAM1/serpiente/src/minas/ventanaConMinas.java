package minas;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
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

    // variables para el tiempo
    Timer tiempo;

    int tiempoINT = 0;
    JButton casTempRestart;
    JLabel tiempo1;


    //ventana
    JFrame ventana = new JFrame();

    public ventanaConMinas(String [][][] arrayminas) throws InterruptedException {

        ventana.setTitle("Buscaminas Nacho");
        ventana.setResizable(true);
        ventana.setSize(1800,1000);
        ventana.setLayout(null);

        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);




        cas1 = new JButton("");
        cas1.setBounds(460, 0, 100, 100);
        ventana.add(cas1);
        cas1.addActionListener(this);

        cas2 = new JButton("");
        cas2.setBounds(560, 0, 100, 100);
        ventana.add(cas2);
        cas2.addActionListener(this);

        cas3 = new JButton("");
        cas3.setBounds(660, 0, 100, 100);
        ventana.add(cas3);
        cas3.addActionListener(this);

        cas4 = new JButton("");
        cas4.setBounds(760, 0, 100, 100);
        ventana.add(cas4);
        cas4.addActionListener(this);

        cas5 = new JButton("");
        cas5.setBounds(860, 0, 100, 100);
        ventana.add(cas5);
        cas5.addActionListener(this);

        cas6 = new JButton("");
        cas6.setBounds(960, 0, 100, 100);
        ventana.add(cas6);
        cas6.addActionListener(this);

        cas7 = new JButton("");
        cas7.setBounds(1060, 0, 100, 100);
        ventana.add(cas7);
        cas7.addActionListener(this);

        cas8 = new JButton("");
        cas8.setBounds(1160, 0, 100, 100);
        ventana.add(cas8);
        cas8.addActionListener(this);

        cas9 = new JButton("");
        cas9.setBounds(1260, 0, 100, 100);
        ventana.add(cas9);
        cas9.addActionListener(this);

        cas10 = new JButton("");
        cas10.setBounds(1360, 0, 100, 100);
        ventana.add(cas10);
        cas10.addActionListener(this);

        try {
            Thread.sleep(200);
        } catch (Exception e) {
            System.out.println(e);
        }


        cas11 = new JButton("");
        cas11.setBounds(460, 100, 100, 100);
        ventana.add(cas11);
        cas11.addActionListener(this);

        cas12 = new JButton("");
        cas12.setBounds(560, 100, 100, 100);
        ventana.add(cas12);
        cas12.addActionListener(this);

        cas13 = new JButton("");
        cas13.setBounds(660, 100, 100, 100);
        ventana.add(cas13);
        cas13.addActionListener(this);

        cas14 = new JButton("");
        cas14.setBounds(760, 100, 100, 100);
        ventana.add(cas14);
        cas14.addActionListener(this);

        cas15 = new JButton("");
        cas15.setBounds(860, 100, 100, 100);
        ventana.add(cas15);
        cas15.addActionListener(this);

        cas16 = new JButton("");
        cas16.setBounds(960, 100, 100, 100);
        ventana.add(cas16);
        cas16.addActionListener(this);

        cas17 = new JButton("");
        cas17.setBounds(1060, 100, 100, 100);
        ventana.add(cas17);
        cas17.addActionListener(this);

        cas18 = new JButton("");
        cas18.setBounds(1160, 100, 100, 100);
        ventana.add(cas18);
        cas18.addActionListener(this);

        cas19 = new JButton("");
        cas19.setBounds(1260, 100, 100, 100);
        ventana.add(cas19);
        cas19.addActionListener(this);

        cas20 = new JButton("");
        cas20.setBounds(1360, 100, 100, 100);
        ventana.add(cas20);
        cas20.addActionListener(this);


        try {
            Thread.sleep(200);
        } catch (Exception e) {
            System.out.println(e);
        }


        cas21 = new JButton("");
        cas21.setBounds(460, 200, 100, 100);
        ventana.add(cas21);
        cas21.addActionListener(this);

        cas22 = new JButton("");
        cas22.setBounds(560, 200, 100, 100);
        ventana.add(cas22);
        cas22.addActionListener(this);

        cas23 = new JButton("");
        cas23.setBounds(660, 200, 100, 100);
        ventana.add(cas23);
        cas23.addActionListener(this);

        cas24 = new JButton("");
        cas24.setBounds(760, 200, 100, 100);
        ventana.add(cas24);
        cas24.addActionListener(this);

        cas25 = new JButton("");
        cas25.setBounds(860, 200, 100, 100);
        ventana.add(cas25);
        cas25.addActionListener(this);

        cas26 = new JButton("");
        cas26.setBounds(960, 200, 100, 100);
        ventana.add(cas26);
        cas26.addActionListener(this);

        cas27 = new JButton("");
        cas27.setBounds(1060, 200, 100, 100);
        ventana.add(cas27);
        cas27.addActionListener(this);

        cas28 = new JButton("");
        cas28.setBounds(1160, 200, 100, 100);
        ventana.add(cas28);
        cas28.addActionListener(this);

        cas29 = new JButton("");
        cas29.setBounds(1260, 200, 100, 100);
        ventana.add(cas29);
        cas29.addActionListener(this);

        cas30 = new JButton("");
        cas30.setBounds(1360, 200, 100, 100);
        ventana.add(cas30);
        cas30.addActionListener(this);


        try {
            Thread.sleep(200);
        } catch (Exception e) {
            System.out.println(e);
        }


        cas31 = new JButton("");
        cas31.setBounds(460, 300, 100, 100);
        ventana.add(cas31);
        cas31.addActionListener(this);

        cas32 = new JButton("");
        cas32.setBounds(560, 300, 100, 100);
        ventana.add(cas32);
        cas32.addActionListener(this);

        cas33 = new JButton("");
        cas33.setBounds(660, 300, 100, 100);
        ventana.add(cas33);
        cas33.addActionListener(this);

        cas34 = new JButton("");
        cas34.setBounds(760, 300, 100, 100);
        ventana.add(cas34);
        cas34.addActionListener(this);

        cas35 = new JButton("");
        cas35.setBounds(860, 300, 100, 100);
        ventana.add(cas35);
        cas35.addActionListener(this);

        cas36 = new JButton("");
        cas36.setBounds(960, 300, 100, 100);
        ventana.add(cas36);
        cas36.addActionListener(this);

        cas37 = new JButton("");
        cas37.setBounds(1060, 300, 100, 100);
        ventana.add(cas37);
        cas37.addActionListener(this);

        cas38 = new JButton("");
        cas38.setBounds(1160, 300, 100, 100);
        ventana.add(cas38);
        cas38.addActionListener(this);

        cas39 = new JButton("");
        cas39.setBounds(1260, 300, 100, 100);
        ventana.add(cas39);
        cas39.addActionListener(this);

        cas40 = new JButton("");
        cas40.setBounds(1360, 300, 100, 100);
        ventana.add(cas40);
        cas40.addActionListener(this);

        try {
            Thread.sleep(200);
        } catch (Exception e) {
            System.out.println(e);
        }

        cas41 = new JButton("");
        cas41.setBounds(460, 400, 100, 100);
        ventana.add(cas41);
        cas41.addActionListener(this);

        cas42 = new JButton("");
        cas42.setBounds(560, 400, 100, 100);
        ventana.add(cas42);
        cas42.addActionListener(this);

        cas43 = new JButton("");
        cas43.setBounds(660, 400, 100, 100);
        ventana.add(cas43);
        cas43.addActionListener(this);

        cas44 = new JButton("");
        cas44.setBounds(760, 400, 100, 100);
        ventana.add(cas44);
        cas44.addActionListener(this);

        cas45 = new JButton("");
        cas45.setBounds(860, 400, 100, 100);
        ventana.add(cas45);
        cas45.addActionListener(this);

        cas46 = new JButton("");
        cas46.setBounds(960, 400, 100, 100);
        ventana.add(cas46);
        cas46.addActionListener(this);

        cas47 = new JButton("");
        cas47.setBounds(1060, 400, 100, 100);
        ventana.add(cas47);
        cas47.addActionListener(this);

        cas48 = new JButton("");
        cas48.setBounds(1160, 400, 100, 100);
        ventana.add(cas48);
        cas48.addActionListener(this);

        cas49 = new JButton("");
        cas49.setBounds(1260, 400, 100, 100);
        ventana.add(cas49);
        cas49.addActionListener(this);

        cas50 = new JButton("");
        cas50.setBounds(1360, 400, 100, 100);
        ventana.add(cas50);
        cas50.addActionListener(this);


        try {
            Thread.sleep(200);
        } catch (Exception e) {
            System.out.println(e);
        }


        cas51 = new JButton("");
        cas51.setBounds(460, 500, 100, 100);
        ventana.add(cas51);
        cas51.addActionListener(this);

        cas52 = new JButton("");
        cas52.setBounds(560, 500, 100, 100);
        ventana.add(cas52);
        cas52.addActionListener(this);

        cas53 = new JButton("");
        cas53.setBounds(660, 500, 100, 100);
        ventana.add(cas53);
        cas53.addActionListener(this);

        cas54 = new JButton("");
        cas54.setBounds(760, 500, 100, 100);
        ventana.add(cas54);
        cas54.addActionListener(this);

        cas55 = new JButton("");
        cas55.setBounds(860, 500, 100, 100);
        ventana.add(cas55);
        cas55.addActionListener(this);

        cas56 = new JButton("");
        cas56.setBounds(960, 500, 100, 100);
        ventana.add(cas56);
        cas56.addActionListener(this);

        cas57 = new JButton("");
        cas57.setBounds(1060, 500, 100, 100);
        ventana.add(cas57);
        cas57.addActionListener(this);

        cas58 = new JButton("");
        cas58.setBounds(1160, 500, 100, 100);
        ventana.add(cas58);
        cas58.addActionListener(this);

        cas59 = new JButton("");
        cas59.setBounds(1260, 500, 100, 100);
        ventana.add(cas59);
        cas59.addActionListener(this);

        cas60 = new JButton("");
        cas60.setBounds(1360, 500, 100, 100);
        ventana.add(cas60);
        cas60.addActionListener(this);


        try {
            Thread.sleep(200);
        } catch (Exception e) {
            System.out.println(e);
        }


        cas61 = new JButton("");
        cas61.setBounds(460, 600, 100, 100);
        ventana.add(cas61);
        cas61.addActionListener(this);

        cas62 = new JButton("");
        cas62.setBounds(560, 600, 100, 100);
        ventana.add(cas62);
        cas62.addActionListener(this);

        cas63 = new JButton("");
        cas63.setBounds(660, 600, 100, 100);
        ventana.add(cas63);
        cas63.addActionListener(this);

        cas64 = new JButton("");
        cas64.setBounds(760, 600, 100, 100);
        ventana.add(cas64);
        cas64.addActionListener(this);

        cas65 = new JButton("");
        cas65.setBounds(860, 600, 100, 100);
        ventana.add(cas65);
        cas65.addActionListener(this);

        cas66 = new JButton("");
        cas66.setBounds(960, 600, 100, 100);
        ventana.add(cas66);
        cas66.addActionListener(this);

        cas67 = new JButton("");
        cas67.setBounds(1060, 600, 100, 100);
        ventana.add(cas67);
        cas67.addActionListener(this);

        cas68 = new JButton("");
        cas68.setBounds(1160, 600, 100, 100);
        ventana.add(cas68);
        cas68.addActionListener(this);

        cas69 = new JButton("");
        cas69.setBounds(1260, 600, 100, 100);
        ventana.add(cas69);
        cas69.addActionListener(this);

        cas70 = new JButton("");
        cas70.setBounds(1360, 600, 100, 100);
        ventana.add(cas70);
        cas70.addActionListener(this);

        cas71 = new JButton("");
        cas71.setBounds(460, 700, 100, 100);
        ventana.add(cas71);
        cas71.addActionListener(this);

        cas72 = new JButton("");
        cas72.setBounds(560, 700, 100, 100);
        ventana.add(cas72);
        cas72.addActionListener(this);

        cas73 = new JButton("");
        cas73.setBounds(660, 700, 100, 100);
        ventana.add(cas73);
        cas73.addActionListener(this);

        cas74 = new JButton("");
        cas74.setBounds(760, 700, 100, 100);
        ventana.add(cas74);
        cas74.addActionListener(this);

        cas75 = new JButton("");
        cas75.setBounds(860, 700, 100, 100);
        ventana.add(cas75);
        cas75.addActionListener(this);

        cas76 = new JButton("");
        cas76.setBounds(960, 700, 100, 100);
        ventana.add(cas76);
        cas76.addActionListener(this);

        cas77 = new JButton("");
        cas77.setBounds(1060, 700, 100, 100);
        ventana.add(cas77);
        cas77.addActionListener(this);

        cas78 = new JButton("");
        cas78.setBounds(1160, 700, 100, 100);
        ventana.add(cas78);
        cas78.addActionListener(this);

        cas79 = new JButton("");
        cas79.setBounds(1260, 700, 100, 100);
        ventana.add(cas79);
        cas79.addActionListener(this);

        cas80 = new JButton("");
        cas80.setBounds(1360, 700, 100, 100);
        ventana.add(cas80);
        cas80.addActionListener(this);


        try {
            Thread.sleep(200);
        } catch (Exception e) {
            System.out.println(e);
        }


        cas81 = new JButton("");
        cas81.setBounds(460, 800, 100, 100);
        ventana.add(cas81);
        cas81.addActionListener(this);

        cas82 = new JButton("");
        cas82.setBounds(560, 800, 100, 100);
        ventana.add(cas82);
        cas82.addActionListener(this);

        cas83 = new JButton("");
        cas83.setBounds(660, 800, 100, 100);
        ventana.add(cas83);
        cas83.addActionListener(this);

        cas84 = new JButton("");
        cas84.setBounds(760, 800, 100, 100);
        ventana.add(cas84);
        cas84.addActionListener(this);

        cas85 = new JButton("");
        cas85.setBounds(860, 800, 100, 100);
        ventana.add(cas85);
        cas85.addActionListener(this);

        cas86 = new JButton("");
        cas86.setBounds(960, 800, 100, 100);
        ventana.add(cas86);
        cas86.addActionListener(this);

        cas87 = new JButton("");
        cas87.setBounds(1060, 800, 100, 100);
        ventana.add(cas87);
        cas87.addActionListener(this);

        cas88 = new JButton("");
        cas88.setBounds(1160, 800, 100, 100);
        ventana.add(cas88);
        cas88.addActionListener(this);

        cas89 = new JButton("");
        cas89.setBounds(1260, 800, 100, 100);
        ventana.add(cas89);
        cas89.addActionListener(this);

        cas90 = new JButton("");
        cas90.setBounds(1360, 800, 100, 100);
        ventana.add(cas90);
        cas90.addActionListener(this);


        try {
            Thread.sleep(200);
        } catch (Exception e) {
            System.out.println(e);
        }


        cas91 = new JButton("");
        cas91.setBounds(460, 900, 100, 100);
        ventana.add(cas91);
        cas91.addActionListener(this);

        cas92 = new JButton("");
        cas92.setBounds(560, 900, 100, 100);
        ventana.add(cas92);
        cas92.addActionListener(this);

        cas93 = new JButton("");
        cas93.setBounds(660, 900, 100, 100);
        ventana.add(cas93);
        cas93.addActionListener(this);

        cas94 = new JButton("");
        cas94.setBounds(760, 900, 100, 100);
        ventana.add(cas94);
        cas94.addActionListener(this);

        cas95 = new JButton("");
        cas95.setBounds(860, 900, 100, 100);
        ventana.add(cas95);
        cas95.addActionListener(this);

        cas96 = new JButton("");
        cas96.setBounds(960, 900, 100, 100);
        ventana.add(cas96);
        cas96.addActionListener(this);

        cas97 = new JButton("");
        cas97.setBounds(1060, 900, 100, 100);
        ventana.add(cas97);
        cas97.addActionListener(this);

        cas98 = new JButton("");
        cas98.setBounds(1160, 900, 100, 100);
        ventana.add(cas98);
        cas98.addActionListener(this);

        cas99 = new JButton("");
        cas99.setBounds(1260, 900, 100, 100);
        ventana.add(cas99);
        cas99.addActionListener(this);

        cas100 = new JButton("");
        cas100.setBounds(1360, 900, 100, 100);
        ventana.add(cas100);
        cas100.addActionListener(this);



        System.out.println("altura: " + altura);



        // temporizador
        casTempRestart = new JButton("Resetear");
        casTempRestart.setBounds(100, 450, 100, 100);
        ventana.add(casTempRestart);
        casTempRestart.addActionListener(this);



            // Timer para el cronómetro
        tiempo = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tiempoINT++;
                tiempo1.setText("Tiempo: " + tiempoINT + " segundos");
            }
        });

        tiempo1 = new JLabel();
        tiempo1.setText("Tiempo: " + "0" + " segundos");
        tiempo1.setBounds(1600, 450, 200, 100);
        ventana.add(tiempo1);


        //ventana visible
        ventana.setVisible(true);



    }

    public void actionPerformed(ActionEvent e) {

        //botones tiempo
        if (e.getSource() == casTempRestart) {

            tiempoINT = 0; // Iniciar el cronómetro
            tiempo1.setText("Tiempo: " + tiempoINT + " segundos");
            tiempo.stop();

        }

        //botones minas

        if (e.getSource() == cas1) {
            cas1.setText(arrayminas[0][0][1]);
            ventana.repaint();
            cas1.setEnabled(false);
            tiempo.start();
            if (arrayminas[0][0][1].equals('0')) {
                cas2.setEnabled(false);
                cas11.setEnabled(false);
                cas12.setEnabled(false);
            }
        }
        if (e.getSource() == cas2) {
            cas2.setText(arrayminas[1][0][1]);
            ventana.repaint();
            cas2.setEnabled(false);
            tiempo.start();
            if (arrayminas[0][0][2].equals('0')) {
                cas1.setEnabled(false);
                cas3.setEnabled(false);
                cas11.setEnabled(false);
                cas12.setEnabled(false);
                cas13.setEnabled(false);
            }
        }
        if (e.getSource() == cas3) {
            cas3.setText(arrayminas[2][0][1]);
            ventana.repaint();
            cas3.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas4) {
            cas4.setText(arrayminas[3][0][1]);
            ventana.repaint();
            cas4.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas5) {
            cas5.setText(arrayminas[4][0][1]);
            ventana.repaint();
            cas5.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas6) {
            cas6.setText(arrayminas[5][0][1]);
            ventana.repaint();
            cas6.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas7) {
            cas7.setText(arrayminas[6][0][1]);
            ventana.repaint();
            cas7.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas8) {
            cas8.setText(arrayminas[7][0][1]);
            ventana.repaint();
            cas8.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas9) {
            cas9.setText(arrayminas[8][0][1]);
            ventana.repaint();
            cas9.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas10) {
            cas10.setText(arrayminas[9][0][1]);
            ventana.repaint();
            cas10.setEnabled(false);
            tiempo.start();
        }


        if (e.getSource() == cas11) {
            cas11.setText(arrayminas[0][1][1]);
            ventana.repaint();
            cas11.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas12) {
            cas12.setText(arrayminas[1][1][1]);
            ventana.repaint();
            cas12.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas13) {
            cas13.setText(arrayminas[2][1][1]);
            ventana.repaint();
            cas13.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas14) {
            cas14.setText(arrayminas[3][1][1]);
            ventana.repaint();
            cas14.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas15) {
            cas15.setText(arrayminas[4][1][1]);
            ventana.repaint();
            cas15.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas16) {
            cas16.setText(arrayminas[5][1][1]);
            ventana.repaint();
            cas16.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas17) {
            cas17.setText(arrayminas[6][1][1]);
            ventana.repaint();
            cas17.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas18) {
            cas18.setText(arrayminas[7][1][1]);
            ventana.repaint();
            cas18.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas19) {
            cas19.setText(arrayminas[8][1][1]);
            ventana.repaint();
            cas19.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas20) {
            cas20.setText(arrayminas[9][1][1]);
            ventana.repaint();
            cas20.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas21) {
            cas21.setText(arrayminas[0][2][1]);
            ventana.repaint();
            cas21.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas22) {
            cas22.setText(arrayminas[1][2][1]);
            ventana.repaint();
            cas22.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas23) {
            cas23.setText(arrayminas[2][2][1]);
            ventana.repaint();
            cas23.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas24) {
            cas24.setText(arrayminas[3][2][1]);
            ventana.repaint();
            cas24.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas25) {
            cas25.setText(arrayminas[4][2][1]);
            ventana.repaint();
            cas25.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas26) {
            cas26.setText(arrayminas[5][2][1]);
            ventana.repaint();
            cas26.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas27) {
            cas27.setText(arrayminas[6][2][1]);
            ventana.repaint();
            cas27.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas28) {
            cas28.setText(arrayminas[7][2][1]);
            ventana.repaint();
            cas28.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas29) {
            cas29.setText(arrayminas[8][2][1]);
            ventana.repaint();
            cas29.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas30) {
            cas30.setText(arrayminas[9][2][1]);
            ventana.repaint();
            cas30.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas31) {
            cas31.setText(arrayminas[0][3][1]);
            ventana.repaint();
            cas31.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas32) {
            cas32.setText(arrayminas[1][3][1]);
            ventana.repaint();
            cas32.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas33) {
            cas33.setText(arrayminas[2][3][1]);
            ventana.repaint();
            cas33.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas34) {
            cas34.setText(arrayminas[3][3][1]);
            ventana.repaint();
            cas34.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas35) {
            cas35.setText(arrayminas[4][3][1]);
            ventana.repaint();
            cas35.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas36) {
            cas36.setText(arrayminas[5][3][1]);
            ventana.repaint();
            cas36.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas37) {
            cas37.setText(arrayminas[6][3][1]);
            ventana.repaint();
            cas37.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas38) {
            cas38.setText(arrayminas[7][3][1]);
            ventana.repaint();
            cas38.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas39) {
            cas39.setText(arrayminas[8][3][1]);
            ventana.repaint();
            cas39.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas40) {
            cas40.setText(arrayminas[9][3][1]);
            ventana.repaint();
            cas40.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas41) {
            cas41.setText(arrayminas[0][4][1]);
            ventana.repaint();
            cas41.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas42) {
            cas42.setText(arrayminas[1][4][1]);
            ventana.repaint();
            cas42.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas43) {
            cas43.setText(arrayminas[2][4][1]);
            ventana.repaint();
            cas43.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas44) {
            cas44.setText(arrayminas[3][4][1]);
            ventana.repaint();
            cas44.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas45) {
            cas45.setText(arrayminas[4][4][1]);
            ventana.repaint();
            cas45.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas46) {
            cas46.setText(arrayminas[5][4][1]);
            ventana.repaint();
            cas46.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas47) {
            cas47.setText(arrayminas[6][4][1]);
            ventana.repaint();
            cas47.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas48) {
            cas48.setText(arrayminas[7][4][1]);
            ventana.repaint();
            cas48.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas49) {
            cas49.setText(arrayminas[8][4][1]);
            ventana.repaint();
            cas49.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas50) {
            cas50.setText(arrayminas[9][4][1]);
            ventana.repaint();
            cas50.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas51) {
            cas51.setText(arrayminas[0][5][1]);
            ventana.repaint();
            cas51.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas52) {
            cas52.setText(arrayminas[1][5][1]);
            ventana.repaint();
            cas52.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas53) {
            cas53.setText(arrayminas[2][5][1]);
            ventana.repaint();
            cas53.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas54) {
            cas54.setText(arrayminas[3][5][1]);
            ventana.repaint();
            cas54.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas55) {
            cas55.setText(arrayminas[4][5][1]);
            ventana.repaint();
            cas55.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas56) {
            cas56.setText(arrayminas[5][5][1]);
            ventana.repaint();
            cas56.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas57) {
            cas57.setText(arrayminas[6][5][1]);
            ventana.repaint();
            cas57.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas58) {
            cas58.setText(arrayminas[7][5][1]);
            ventana.repaint();
            cas58.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas59) {
            cas59.setText(arrayminas[8][5][1]);
            ventana.repaint();
            cas59.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas60) {
            cas60.setText(arrayminas[9][5][1]);
            ventana.repaint();
            cas60.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas61) {
            cas61.setText(arrayminas[0][6][1]);
            ventana.repaint();
            cas61.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas62) {
            cas62.setText(arrayminas[1][6][1]);
            ventana.repaint();
            cas62.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas63) {
            cas63.setText(arrayminas[2][6][1]);
            ventana.repaint();
            cas63.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas64) {
            cas64.setText(arrayminas[3][6][1]);
            ventana.repaint();
            cas64.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas65) {
            cas65.setText(arrayminas[4][6][1]);
            ventana.repaint();
            cas65.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas66) {
            cas66.setText(arrayminas[5][6][1]);
            ventana.repaint();
            cas66.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas67) {
            cas67.setText(arrayminas[6][6][1]);
            ventana.repaint();
            cas67.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas68) {
            cas68.setText(arrayminas[7][6][1]);
            ventana.repaint();
            cas68.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas69) {
            cas69.setText(arrayminas[8][6][1]);
            ventana.repaint();
            cas69.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas70) {
            cas70.setText(arrayminas[9][6][1]);
            ventana.repaint();
            cas70.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas71) {
            cas71.setText(arrayminas[0][7][1]);
            ventana.repaint();
            cas71.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas72) {
            cas72.setText(arrayminas[1][7][1]);
            ventana.repaint();
            cas72.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas73) {
            cas73.setText(arrayminas[2][7][1]);
            ventana.repaint();
            cas73.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas74) {
            cas74.setText(arrayminas[3][7][1]);
            ventana.repaint();
            cas74.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas75) {
            cas75.setText(arrayminas[4][7][1]);
            ventana.repaint();
            cas75.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas76) {
            cas76.setText(arrayminas[5][7][1]);
            ventana.repaint();
            cas76.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas77) {
            cas77.setText(arrayminas[6][7][1]);
            ventana.repaint();
            cas77.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas78) {
            cas78.setText(arrayminas[7][7][1]);
            ventana.repaint();
            cas78.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas79) {
            cas79.setText(arrayminas[8][7][1]);
            ventana.repaint();
            cas79.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas80) {
            cas80.setText(arrayminas[9][7][1]);
            ventana.repaint();
            cas80.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas81) {
            cas81.setText(arrayminas[0][8][1]);
            ventana.repaint();
            cas81.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas82) {
            cas82.setText(arrayminas[1][8][1]);
            ventana.repaint();
            cas82.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas83) {
            cas83.setText(arrayminas[2][8][1]);
            ventana.repaint();
            cas83.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas84) {
            cas84.setText(arrayminas[3][8][1]);
            ventana.repaint();
            cas84.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas85){
            cas85.setText(arrayminas[4][8][1]);
            ventana.repaint();
            cas85.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas86) {
            cas86.setText(arrayminas[5][8][1]);
            ventana.repaint();
            cas86.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas87) {
            cas87.setText(arrayminas[6][8][1]);
            ventana.repaint();
            cas87.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas88) {
            cas88.setText(arrayminas[7][8][1]);
            ventana.repaint();
            cas88.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas89) {
            cas89.setText(arrayminas[8][8][1]);
            ventana.repaint();
            cas89.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas90) {
            cas90.setText(arrayminas[9][8][1]);
            ventana.repaint();
            cas90.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas91) {
            cas91.setText(arrayminas[0][9][1]);
            ventana.repaint();
            cas91.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas92) {
            cas92.setText(arrayminas[1][9][1]);
            ventana.repaint();
            cas92.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas93) {
            cas93.setText(arrayminas[2][9][1]);
            ventana.repaint();
            cas93.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas94) {
            cas94.setText(arrayminas[3][9][1]);
            ventana.repaint();
            cas94.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas95) {
            cas95.setText(arrayminas[4][9][1]);
            ventana.repaint();
            cas95.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas96) {
            cas96.setText(arrayminas[5][9][1]);
            ventana.repaint();
            cas96.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas97) {
            cas97.setText(arrayminas[6][9][1]);
            ventana.repaint();
            cas97.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas98) {
            cas98.setText(arrayminas[7][9][1]);
            ventana.repaint();
            cas98.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas99) {
            cas99.setText(arrayminas[8][9][1]);
            ventana.repaint();
            cas99.setEnabled(false);
            tiempo.start();
        }
        if (e.getSource() == cas100){
            cas100.setText(arrayminas[9][9][1]);
            ventana.repaint();
            cas100.setEnabled(false);
            tiempo.start();
        }
    }
}
