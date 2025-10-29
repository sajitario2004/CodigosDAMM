package swing1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import java.awt.Color;
import javax.swing.JTextArea;

public class swing1_1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField cajaTexto1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing1_1 frame = new swing1_1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public swing1_1() {
		setTitle("Hello Swing");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 480);
		contentPane = new JPanel();

		contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panelArriba = new JPanel();
		panelArriba.setBorder(new EmptyBorder(10, 10, 10, 10));
		contentPane.add(panelArriba, BorderLayout.NORTH);
		panelArriba.setLayout(new BoxLayout(panelArriba, BoxLayout.X_AXIS));
		
		JLabel lblNewLabel = new JLabel("Enter the name  ");
		lblNewLabel.setAlignmentX(0.5f);
		panelArriba.add(lblNewLabel);
		
		cajaTexto1 = new JTextField();
		panelArriba.add(cajaTexto1);
		cajaTexto1.setColumns(20);
		
		JButton btnNewButton = new JButton("Add");
		
		panelArriba.add(btnNewButton);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		panel.setLayout(new FlowLayout(FlowLayout.TRAILING, 5, 5));
		
		JButton btnNewButton_2 = new JButton("Clear");
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("count");
		panel.add(btnNewButton_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.X_AXIS));
		
		JTextArea areaDeTexto = new JTextArea();
		panel_1.add(areaDeTexto);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto = cajaTexto1.getText();
				JLabel aux = new JLabel(texto);
				areaDeTexto.add(aux);
			}
		});

	}
}
