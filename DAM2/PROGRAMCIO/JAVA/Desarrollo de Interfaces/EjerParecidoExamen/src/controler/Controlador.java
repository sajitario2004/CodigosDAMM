package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Password;
import view.BotonPersonalizado;

public class Controlador implements ActionListener {

	private Password ps;
	private BotonPersonalizado bp;
	
	public Controlador(Password ps, BotonPersonalizado bp) {
		this.ps = ps;
		this.bp = bp;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String s = e.getActionCommand();
		
		switch (s) {
		case "1":
			
			break;
		case "2":
			
			break;
		case "3":
			
			break;
		case "4":
			
			break;
		case "5":
			
			break;
		case "6":
			
			break;
		case "7":
			
			break;
		case "8":
			
			break;
		case "9":
			
			break;
		case "0":
			
			break;

		case "comprob":
			
			break;

		case "reset":
			
			break;

		default:
			break;
		}
	}

}
