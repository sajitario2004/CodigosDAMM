/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.ejemplo.javahelpejemplo.controler;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javax.help.HelpBroker;
import javax.help.HelpSet;

/**
 * FXML Controller class
 *
 * @author nacho
 */
public class VistaController implements Initializable {

    @FXML
    private Button btnAyuda;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void showAyuda(ActionEvent event) {
        try {
            ClassLoader cl = this.getClass().getClassLoader();
            URL hsURL = HelpSet.findHelpSet(cl, "ayuda/ayuda.hs");
            HelpSet hs = new HelpSet(cl, hsURL);
            HelpBroker hb = hs.createHelpBroker();
            hb.setDisplayed(true);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
}
