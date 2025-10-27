import java.awt.EventQueue;

import javax.swing.JTextPane;

import layout.flowlayoutDemo;

public class Main {
	public static void main(String[] args) {
		
		JTextPane pinga = new JTextPane();
		pinga.setText("pinga");
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					flowlayoutDemo frame = new flowlayoutDemo();
					frame.add(pinga);
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
	}
}
