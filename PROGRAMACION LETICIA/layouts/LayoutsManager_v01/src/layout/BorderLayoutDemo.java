package layout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

public class BorderLayoutDemo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	

	/**
	 * Create the frame.
	 */
	public BorderLayoutDemo() {
		setTitle("GridLayout Demo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 662, 352);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JButton btnNorth = new JButton("Button NORTH");
		contentPane.add(btnNorth, BorderLayout.NORTH);
		
		JButton btnEast = new JButton("EAST");
		contentPane.add(btnEast, BorderLayout.EAST);
		
		JButton btnWest = new JButton("WEST");
		contentPane.add(btnWest, BorderLayout.WEST);
		
		JButton btnSouth = new JButton("SOUTH");
		contentPane.add(btnSouth, BorderLayout.SOUTH);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton = new JButton("New button");
		panel.add(btnNewButton);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("New radio button");
		panel.add(rdbtnNewRadioButton_1);

	}

}
