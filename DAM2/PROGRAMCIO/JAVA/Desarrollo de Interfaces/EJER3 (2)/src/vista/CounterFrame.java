package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;

public class CounterFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public CounterFrame() {
		configuracionVentana();
	}
	
	/**
	 * Create the frame.
	 */
	public void configuracionVentana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel = new JLabel("2 PANELS CON SUMA Y RESTA");
		panel.add(lblNewLabel);
		
		CounterPanel panel1 = new CounterPanel();
		CounterPanel panel2 = new CounterPanel();
		
		contentPane.add(panel1);
		contentPane.add(panel2);

	}

}
