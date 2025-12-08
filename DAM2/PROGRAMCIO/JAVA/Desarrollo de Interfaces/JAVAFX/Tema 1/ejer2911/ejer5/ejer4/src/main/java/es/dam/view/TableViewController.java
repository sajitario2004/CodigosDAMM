/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package es.dam.view;

import es.dam.model.Persona;
import java.io.IOException;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author administrador
 */
public class TableViewController implements Initializable {

    @FXML
    private Button btnAgregarPersona;
    @FXML
    private Button btnEdit;
    @FXML
    private Button btnEliminar;
    @FXML
    private TableView<Persona> tblPersonas;
    @FXML
    private TableColumn columNombre;
    @FXML
    private TableColumn columApellido;
    @FXML
    private TableColumn columEdad;
    
    public ObservableList<Persona> personas;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        personas = FXCollections.observableArrayList();
        this.tblPersonas.setItems(personas);
        
        
        this.columNombre.setCellValueFactory(new PropertyValueFactory("nombre"));
        this.columApellido.setCellValueFactory(new PropertyValueFactory("apellidos"));
        this.columEdad.setCellValueFactory(new PropertyValueFactory("edad"));
    }    

    @FXML
    private void anadirPersona(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/es/dam/AgregarView.fxml"));
            
            Parent root = loader.load();
            
            AgregarController controlador = loader.getController();
            controlador.initAtributo(personas);
            
            Scene scene = new Scene(root, 600, 800);
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.showAndWait();
            
            Persona p = controlador.getPersona();
            if ( p != null){
                this.personas.add(p);
                this.tblPersonas.refresh();
            }else {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText(null);
                alert.setTitle("introducido");
                alert.setContentText("Se ha introducido con exito");
                alert.showAndWait();
            }
            
        } catch (IOException ex) {
            System.getLogger(TableViewController.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        
        
        
    }

    @FXML
    private void editarPersona(ActionEvent event) {
        
        
    }

    @FXML
    private void deletePersona(ActionEvent event) {
        
       
    }

    @FXML
    private void seleccionar(MouseEvent event) {
        
        
    }
    
}
