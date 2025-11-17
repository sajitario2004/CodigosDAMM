package pregunta02;

import java.awt.Color;
import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ventanaMetodosPago extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	//variables arrays string
	ArrayList<String> arrTxtOpcionesPago = new ArrayList<String>();
	ArrayList<String> arrTxtOpcionesBolsa = new ArrayList<String>();

	/**
	 * Create the frame.
	 */
	public ventanaMetodosPago() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//listas
		//lista1
		arrTxtOpcionesPago.add("Efectivo");
		arrTxtOpcionesPago.add("Targeta");
		arrTxtOpcionesPago.add("Transferencia");
		arrTxtOpcionesPago.add("Bizum");
		
		//lista 2
		arrTxtOpcionesBolsa.add("Si");
		arrTxtOpcionesBolsa.add("No");

		
		
		
		//grupos radio butons
		ButtonGroup grupoDeOpciones = new ButtonGroup(); // metodos de pago
		ButtonGroup grupoSiNo = new ButtonGroup();

		
		// titulo
		JLabel lblMetodo = new JLabel("Seleccione Metodo de Pago");
		lblMetodo.setBounds(25, 6, 191, 16);
		contentPane.add(lblMetodo);

		//panel
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(23, 28, 171, 140);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(236, 28, 111, 78);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		
		// radio butons metodos de pago
		JRadioButton rdbtnOpcion1 = new JRadioButton("Efectivo");
		rdbtnOpcion1.setBounds(6, 6, 141, 23);
		panel.add(rdbtnOpcion1);

		JRadioButton rdbtnOpcion2 = new JRadioButton("Tarjeta");
		rdbtnOpcion2.setBounds(6, 41, 141, 23);
		panel.add(rdbtnOpcion2);

		JRadioButton rdbtnOpcion3 = new JRadioButton("Transferencia");
		rdbtnOpcion3.setBounds(6, 76, 141, 23);
		panel.add(rdbtnOpcion3);

		JRadioButton rdbtnOpcion4 = new JRadioButton("Bizum");
		rdbtnOpcion4.setBounds(6, 111, 141, 23);
		panel.add(rdbtnOpcion4);

		// metodo seleccionado (texto)
		JLabel lblMetodoSelected = new JLabel("Metodo Seleccionado:");
		lblMetodoSelected.setBounds(25, 194, 413, 16);
		contentPane.add(lblMetodoSelected);

		//realizar pago
		JButton btnAplicarMetodo = new JButton("Realizar Pago");
		
		btnAplicarMetodo.setBounds(230, 143, 117, 29);
		contentPane.add(btnAplicarMetodo);

		
		// radio butons de si o no
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Si");
		rdbtnNewRadioButton_4.setBounds(6, 6, 54, 23);
		panel_1.add(rdbtnNewRadioButton_4);

		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("No");
		rdbtnNewRadioButton_5.setBounds(6, 41, 68, 23);
		panel_1.add(rdbtnNewRadioButton_5);

		// grupo metodo de pago
		grupoDeOpciones.add(rdbtnOpcion1);
		grupoDeOpciones.add(rdbtnOpcion2);
		grupoDeOpciones.add(rdbtnOpcion3);
		grupoDeOpciones.add(rdbtnOpcion4);
		
		// grupo si o no
		grupoSiNo.add(rdbtnNewRadioButton_4);
		grupoSiNo.add(rdbtnNewRadioButton_5);
		

		// label de texto con bolsas
		JLabel lblBolsaText = new JLabel("Bolsas");
		lblBolsaText.setBounds(239, 6, 108, 16);
		contentPane.add(lblBolsaText);

		JLabel lblBolsaRequired = new JLabel("Necesita Bolsa:");
		lblBolsaRequired.setBounds(25, 222, 137, 16);
		contentPane.add(lblBolsaRequired);
		
		// listener
		btnAplicarMetodo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblMetodoSelected.setText("Metodo Seleccionado: ");
				lblBolsaRequired.setText("Necesito Bolsa: ");
				
				String metodoPago = "";
				String siOno= "";
				
				if (rdbtnOpcion1.isSelected()) {
					metodoPago = arrTxtOpcionesPago.get(0);
				}else if (rdbtnOpcion2.isSelected()) {
					metodoPago = arrTxtOpcionesPago.get(1);
				}else if (rdbtnOpcion3.isSelected()) {
					metodoPago = arrTxtOpcionesPago.get(2);
				}else if (rdbtnOpcion4.isSelected()) {
					metodoPago = arrTxtOpcionesPago.get(3);
				}else {
					JOptionPane.showMessageDialog(panel, "Metodo de pago no seleccionado");
				}
				
				if(rdbtnNewRadioButton_4.isSelected()) {
					siOno = arrTxtOpcionesBolsa.get(0);
				}else if(rdbtnNewRadioButton_5.isSelected()) {
					siOno = arrTxtOpcionesBolsa.get(1);
				}else {
					JOptionPane.showMessageDialog(panel_1, "Elige bolsa si o no");
				}
				
				lblMetodoSelected.setText(lblMetodoSelected.getText() + metodoPago);
				lblBolsaRequired.setText(lblBolsaRequired.getText()+siOno);
				
			}
		});

	}
}
