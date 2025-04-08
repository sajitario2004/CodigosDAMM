package org.aaPrincipal;

import java.util.HashMap;
import java.util.List;

import javax.swing.*;
import java.awt.event.*;

import static org.aaPrincipal.HashMapStringBotones.BotonesYString;

public class VentanaPrincipal extends JFrame implements ActionListener {
    private HashMap<List<String>, List<JButton>> botones = new HashMap<>();


    public VentanaPrincipal() {
        this.botones = BotonesYString();

    }

    @Override
    public void actionPerformed(ActionEvent e){

    }

    public static void main(String[] args) {
        new VentanaPrincipal();
    }
}
