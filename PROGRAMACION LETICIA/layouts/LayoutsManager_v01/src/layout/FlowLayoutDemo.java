package layout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;

public class FlowLayoutDemo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel experimentalLayout;

	

	/**
	 * Create the frame.
	 */
	public FlowLayoutDemo() {
		setTitle("Ventana con FlowLayout");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 585, 326);
		experimentalLayout = new JPanel();
		experimentalLayout.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(experimentalLayout);
		experimentalLayout.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 5));
		
		JButton btnButton1 = new JButton("Button 1");
		experimentalLayout.add(btnButton1);
		
		JButton btnButton2 = new JButton("Button 2");
		experimentalLayout.add(btnButton2);
		
		JButton btnButton3 = new JButton("Button 3");
		experimentalLayout.add(btnButton3);
		
		JButton btnButton4 = new JButton("Long Named - Button 4");
		experimentalLayout.add(btnButton4);
		
		JButton btn5 = new JButton("5");
		experimentalLayout.add(btn5);

	}

}
