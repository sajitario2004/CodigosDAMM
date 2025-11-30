package main;

import java.awt.EventQueue;

import vista.CounterFrame;

public class CounterDriver {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CounterFrame frame = new CounterFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
