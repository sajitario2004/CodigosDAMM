package layout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;

public class GridLayoutDemo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	

	/**
	 * Create the frame.
	 */
	public GridLayoutDemo() {
		setTitle("Grid Layout");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(3, 2, 10, 20));
		
		JButton btn01 = new JButton("1");
		contentPane.add(btn01);
		
		JButton btn02 = new JButton("2");
		contentPane.add(btn02);
		
		JButton btn03 = new JButton("3");
		contentPane.add(btn03);
		
		JButton btn04 = new JButton("4");
		contentPane.add(btn04);
		
		JButton btn05 = new JButton("5");
		contentPane.add(btn05);

	}

}
