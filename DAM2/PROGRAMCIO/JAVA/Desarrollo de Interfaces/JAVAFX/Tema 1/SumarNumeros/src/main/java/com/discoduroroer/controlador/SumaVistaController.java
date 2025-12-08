/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.discoduroroer.controlador;

import com.discoduroroer.modelo.Suma;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author javi
 */
public class SumaVistaController implements Initializable {

    
    
    //variables
    
    
    @FXML
    private TextField txtOp2;
    @FXML
    private TextField txtOp1;
    @FXML
    private TextField txtResultado;
    @FXML
    private Button sumar;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void sumaNumeros(ActionEvent event) {
        try {
            Suma s = new Suma(Integer.parseInt(this.txtOp1.getText()), Integer.parseInt(this.txtOp2.getText()));
            int resultado = s.sumar();
        
            txtResultado.setText(resultado+"");
            
        } catch(NumberFormatException e){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Formato incorrecto compi");
            alert.showAndWait();
        }
    }
}
