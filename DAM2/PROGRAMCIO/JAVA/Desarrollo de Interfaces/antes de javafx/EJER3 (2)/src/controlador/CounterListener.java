package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Counter;
import vista.CounterFrame;
import vista.CounterPanel;

public class CounterListener implements ActionListener {
	private Counter modelo;
	private CounterPanel vista;
	
	public CounterListener(Counter modelo, CounterPanel vista) {
		this.modelo = modelo;
		this.vista = vista;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
		
		switch (str) {
		case "     -    ":
			modelo.decrement();
			break;
		case "    +    ":
			modelo.increment();
			break;
		default:
			break;
		}
		
		vista.actualizarValor(modelo.getContador());
		
	}
}
