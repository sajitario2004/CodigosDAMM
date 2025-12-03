/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package es.dam.view;

import es.dam.model.Persona;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author administrador
 */
public class AgregarController implements Initializable {

    @FXML
    private Button btnSave;
    @FXML
    private Button btnExit;
    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtApellido;
    @FXML
    private TextField txtEdad;
    
    private Persona persona;
    
    private ObservableList<Persona> personaS;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public void initAtributo(ObservableList<Persona> personaS){
        this.personaS = personaS;
        
    }
    
    @FXML
    private void save(ActionEvent event) {
        Persona p = null;
                
        if (!this.txtNombre.getText().equals(null) || !this.txtApellido.getText().equals(null) || !this.txtEdad.getText().equals(null)){
            p = new Persona(this.txtNombre.getText(), this.txtApellido.getText(), Integer.parseInt(this.txtEdad.getText()));
        }
        
        if (!this.personaS.contains(p)){
            this.persona = p;
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setTitle("introducido");
            alert.setContentText("Se ha introducido con exito");
            alert.showAndWait();
            
            Stage stage = (Stage) this.btnSave.getScene().getWindow();
            stage.close();
            
            
            
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("no introducido");
            alert.setContentText("error algo mal introducido");
            alert.showAndWait();
        }
        
    }

    @FXML
    private void exit(ActionEvent event) {
        this.persona = null;
        Stage stage = (Stage) this.btnSave.getScene().getWindow();
        stage.close();
    }

    public Persona getPersona() {
        return persona;
    }
    
    
}
