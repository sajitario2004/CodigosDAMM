package proyect2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;

public class pizzaShop extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pizzaShop frame = new pizzaShop();
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
	public pizzaShop() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 564, 605);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 20));
		
		JLabel lblPizzaHunt = new JLabel("Pizza Hunt");
		lblPizzaHunt.setFont(new Font("Dialog", Font.BOLD, 18));
		panel.add(lblPizzaHunt);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.Y_AXIS));
		
		JPanel panelMedioArriba = new JPanel();
		panel_1.add(panelMedioArriba);
		panelMedioArriba.setLayout(new BoxLayout(panelMedioArriba, BoxLayout.X_AXIS));
		
		JPanel panelMedioArribaIzquierda = new JPanel();
		panelMedioArriba.add(panelMedioArribaIzquierda);
		panelMedioArribaIzquierda.setLayout(new BoxLayout(panelMedioArribaIzquierda, BoxLayout.Y_AXIS));
		
		JPanel panel_3 = new JPanel();
		panelMedioArribaIzquierda.add(panel_3);
		
		JLabel orderN = new JLabel("Order NO.");
		panel_3.add(orderN);
		
		textField = new JTextField();
		panel_3.add(textField);
		textField.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		panelMedioArribaIzquierda.add(panel_4);
		
		JLabel lblNewLabel = new JLabel("CustomerName");
		panel_4.add(lblNewLabel);
		
		textField_1 = new JTextField();
		panel_4.add(textField_1);
		textField_1.setColumns(10);
		
		JPanel panel_5 = new JPanel();
		panelMedioArribaIzquierda.add(panel_5);
		
		JLabel lblNewLabel_1 = new JLabel("Quantity");
		panel_5.add(lblNewLabel_1);
		
		textField_2 = new JTextField();
		panel_5.add(textField_2);
		textField_2.setColumns(10);
		
		JPanel panelMedioArribaDerecha = new JPanel();
		panelMedioArriba.add(panelMedioArribaDerecha);
		panelMedioArribaDerecha.setLayout(new BoxLayout(panelMedioArribaDerecha, BoxLayout.Y_AXIS));
		
		JPanel panel_3_1 = new JPanel();
		panelMedioArribaDerecha.add(panel_3_1);
		
		JLabel lblRate = new JLabel("Rate");
		panel_3_1.add(lblRate);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		panel_3_1.add(textField_3);
		
		JPanel panel_4_1 = new JPanel();
		panelMedioArribaDerecha.add(panel_4_1);
		
		JLabel lblAmount = new JLabel("Amount");
		panel_4_1.add(lblAmount);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		panel_4_1.add(textField_4);
		
		JPanel panel_5_1 = new JPanel();
		panelMedioArribaDerecha.add(panel_5_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Cost of Toppings");
		panel_5_1.add(lblNewLabel_1_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		panel_5_1.add(textField_5);
		
		JPanel panelMedioAbajo = new JPanel();
		panel_1.add(panelMedioAbajo);
		panelMedioAbajo.setLayout(new BoxLayout(panelMedioAbajo, BoxLayout.X_AXIS));
		
		JPanel PanelMedioAbajoIzquierda = new JPanel();
		panelMedioAbajo.add(PanelMedioAbajoIzquierda);
		PanelMedioAbajoIzquierda.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_6 = new JPanel();
		PanelMedioAbajoIzquierda.add(panel_6, BorderLayout.NORTH);
		
		JLabel lblPizzaType = new JLabel("Pizza Type");
		panel_6.add(lblPizzaType);
		
		JPanel panel_8 = new JPanel();
		PanelMedioAbajoIzquierda.add(panel_8, BorderLayout.CENTER);
		panel_8.setLayout(new BoxLayout(panel_8, BoxLayout.Y_AXIS));
		
		JRadioButton rdbtnPanPizza = new JRadioButton("Pan Pizza");
		panel_8.add(rdbtnPanPizza);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Stuffed Crust");
		panel_8.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Regular");
		panel_8.add(rdbtnNewRadioButton_1);
		
		JPanel PanelMedioAbajoDerecha = new JPanel();
		panelMedioAbajo.add(PanelMedioAbajoDerecha);
		PanelMedioAbajoDerecha.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_7 = new JPanel();
		PanelMedioAbajoDerecha.add(panel_7, BorderLayout.NORTH);
		
		JLabel lblTopings = new JLabel("Topings");
		panel_7.add(lblTopings);
		
		JPanel panel_9 = new JPanel();
		PanelMedioAbajoDerecha.add(panel_9, BorderLayout.CENTER);
		panel_9.setLayout(new BoxLayout(panel_9, BoxLayout.Y_AXIS));
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("onios");
		panel_9.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("cheese");
		panel_9.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("tomato");
		panel_9.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("baby corn");
		panel_9.add(chckbxNewCheckBox_3);
		
		JPanel panel_10 = new JPanel();
		panel_1.add(panel_10);
		panel_10.setLayout(new BoxLayout(panel_10, BoxLayout.X_AXIS));
		
		JTextArea textArea = new JTextArea();
		panel_10.add(textArea);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.SOUTH);
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 5));
		
		JButton CalculateRate = new JButton("Calculate RATE");
		panel_2.add(CalculateRate);
		
		JButton CalculateTotal = new JButton("CalculateTotal");
		panel_2.add(CalculateTotal);
		
		JButton Clear = new JButton("Clear");
		panel_2.add(Clear);

	}

}
