package pru.ebas;
import pru.ebas.modelo.*;
import java.io.IOException;
import java.text.NumberFormat;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class sumaControlador {
    //variables
    @FXML
    private TextField operador1;
    
    @FXML
    private TextField operador2;
    
    @FXML
    private TextField resultado;
    

    //funciones
    @FXML
    private void sumar(ActionEvent event) throws IOException {
        try {
        int op1 = Integer.parseInt(this.operador1.getText());
        int op2 = Integer.parseInt(this.operador2.getText());

        Suma suma = new Suma(op1, op2);
        int result = suma.suma();

        this.resultado.setText(Integer.toString(result));;
        
        } catch(NumberFormatException e){
            System.out.println(e);
        }
    }
}
