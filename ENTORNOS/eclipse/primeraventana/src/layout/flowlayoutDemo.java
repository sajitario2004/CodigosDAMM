package layout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;

public class flowlayoutDemo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel experimentalLayout;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public flowlayoutDemo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		experimentalLayout = new JPanel();
		experimentalLayout.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(experimentalLayout);
		experimentalLayout.setLayout(new FlowLayout(FlowLayout.RIGHT, 20, 5));
		
		JButton btnButton4 = new JButton("Button 4");
		experimentalLayout.add(btnButton4);
		
		JButton btnButton3 = new JButton("Button 3");
		experimentalLayout.add(btnButton3);
		
		JButton btnButton2 = new JButton("Button 2");
		experimentalLayout.add(btnButton2);
		
		JButton btnButton1 = new JButton("Button 1");
		experimentalLayout.add(btnButton1);
		
		JButton btnButton5 = new JButton("Button 5");
		experimentalLayout.add(btnButton5);

	}

}
