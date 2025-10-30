package swing1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class swing1_2 extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;

    // --- Componentes principales ---
    private JPanel contentPane;
    private JPanel panelArriba;
    private JPanel panelInferior;
    private JPanel panelCentro;

    private JLabel lblNombre;
    private JTextField cajaTexto1;
    private JTextArea areaDeTexto;
    private JScrollPane scrollPane;

    private JButton btnAdd;
    private JButton btnClear;
    private JButton btnCount;

    private int count = 0;

    /**
     * Método principal.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    swing1_2 frame = new swing1_2();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Constructor del frame.
     */
    public swing1_2() {
        setTitle("Hello Swing");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 720, 480);

        // --- Panel principal ---
        contentPane = new JPanel(new BorderLayout(10, 10));
        contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
        setContentPane(contentPane);

        // --- Panel superior (NORTH) ---
        panelArriba = new JPanel();
        panelArriba.setLayout(new BoxLayout(panelArriba, BoxLayout.X_AXIS));

        lblNombre = new JLabel("Enter the name: ");
        panelArriba.add(lblNombre);

        cajaTexto1 = new JTextField();
        cajaTexto1.setColumns(20);
        panelArriba.add(cajaTexto1);

        btnAdd = new JButton("Add");
        panelArriba.add(btnAdd);

        contentPane.add(panelArriba, BorderLayout.NORTH);

        // --- Panel central (CENTER) ---
        panelCentro = new JPanel(new BorderLayout());
        areaDeTexto = new JTextArea();
        scrollPane = new JScrollPane(areaDeTexto);
        panelCentro.add(scrollPane, BorderLayout.CENTER);
        contentPane.add(panelCentro, BorderLayout.CENTER);

        // --- Panel inferior (SOUTH) ---
        panelInferior = new JPanel(new FlowLayout(FlowLayout.TRAILING, 5, 5));
        btnClear = new JButton("Clear");
        btnCount = new JButton("Count");
        panelInferior.add(btnClear);
        panelInferior.add(btnCount);
        contentPane.add(panelInferior, BorderLayout.SOUTH);

        // --- Un solo ActionListener ---
        btnAdd.addActionListener(this);
        btnClear.addActionListener(this);
        btnCount.addActionListener(this);
    }

    /**
     * Método que maneja todos los eventos de los botones.
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == btnAdd) {
            String texto = cajaTexto1.getText().trim();
            if (!texto.isEmpty()) {
                areaDeTexto.append(texto + "\n");
                count++;
                cajaTexto1.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "La caja de texto está vacía.", "Aviso", JOptionPane.WARNING_MESSAGE);
            }
        } 
        else if (source == btnClear) {
            int opcion = JOptionPane.showConfirmDialog(
                this,
                "¿Estás seguro de que quieres borrar el contenido?",
                "Peligro",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
            );
            if (opcion == JOptionPane.YES_OPTION) {
                areaDeTexto.setText("");
                count = 0;
            }
        } 
        else if (source == btnCount) {
            JOptionPane.showMessageDialog(
                this,
                "El contador tiene " + count + " elementos.",
                "Información",
                JOptionPane.INFORMATION_MESSAGE
            );
        }
    }
}
