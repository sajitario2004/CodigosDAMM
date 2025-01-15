package RULE;

import javax.swing.*;

public class venantaprueba1 extends JFrame {
    private JPanel RulePrueba;
    private JButton button1;

    public venantaprueba1() {
        setContentPane(RulePrueba);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 1000);
        setLocationRelativeTo(null);

        setVisible(true);
    }

    public static void main(String[] args) {
        new venantaprueba1();
    }
}
