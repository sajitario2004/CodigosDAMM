/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package es.dam.view;

import es.dam.model.Persona;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author administrador
 */
public class TableViewController implements Initializable {

    @FXML
    private Button btnAgregarPersona;
    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtApellido;
    @FXML
    private TextField txtEdad;
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
        
        
        this.columNombre.setCellValueFactory(new PropertyValueFactory("nombre"));
        this.columApellido.setCellValueFactory(new PropertyValueFactory("apellidos"));
        this.columEdad.setCellValueFactory(new PropertyValueFactory("edad"));
    }    

    @FXML
    private void anadirPersona(ActionEvent event) {
        try{
            String nombre = txtNombre.getText();
            String apellido = txtApellido.getText();
            int edad = Integer.parseInt(txtEdad.getText());
            
            Persona p = new Persona(nombre, apellido, edad);
            
            
            if (!this.personas.contains(p)){
                this.personas.add(p);
                
                this.tblPersonas.setItems(personas);
                
            } else{
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setTitle("Eso no se puede hacer");
                alert.setContentText("Ese ya esta dentro de la tabla");
                alert.showAndWait();
            }  
        }catch(NumberFormatException e){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Eso no se puede hacer");
            alert.setContentText("As introducido una letra donde va un numero compi");
            alert.showAndWait();
        }
        
    }

    @FXML
    private void editarPersona(ActionEvent event) {
        
        Persona p = this.tblPersonas.getSelectionModel().getSelectedItem();
        
        if (p==null){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Eso no se puede hacer");
            alert.setContentText("As introducido una letra donde va un numero compi");
            alert.showAndWait();
        }else {
            try {
                
                String nombre = this.txtNombre.getText();
                String apellido = this.txtApellido.getText();
                int edad = Integer.parseInt(this.txtEdad.getText());
                
                Persona aux = new Persona(nombre, apellido, edad);
                
                if (!this.personas.contains(aux)){
                    
                    p.setNombre(aux.getNombre());
                    p.setApellidos(aux.getApellidos());
                    p.setEdad(aux.getEdad());
                    
                    this.tblPersonas.refresh();
                    
                    
                    
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setHeaderText(null);
                    alert.setTitle("modificado");
                    alert.setContentText("se ha modificado correctamente");
                    alert.showAndWait();
                    
                    
                }else {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setHeaderText(null);
                    alert.setTitle("tienes un error");
                    alert.setContentText("As fallado te as equivocado");
                    alert.showAndWait();
                }
                
            } catch(NumberFormatException e){
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setTitle("Eso no se puede hacer");
                alert.setContentText("As introducido una letra donde va un numero compi");
                alert.showAndWait();
            }
        }
    }

    @FXML
    private void deletePersona(ActionEvent event) {
        
        Persona p = this.tblPersonas.getSelectionModel().getSelectedItem();
        
        if (p == null){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Eso no se puede hacer");
            alert.setContentText("As introducido una letra donde va un numero compi");
            alert.showAndWait();
        }else {
            this.personas.remove(p);
            this.tblPersonas.refresh();
        }
    }

    @FXML
    private void seleccionar(MouseEvent event) {
        
        Persona p = this.tblPersonas.getSelectionModel().getSelectedItem();
        if (p != null){
            this.txtNombre.setText(p.getNombre());
            this.txtApellido.setText(p.getApellidos());
            this.txtEdad.setText(p.getEdad()+"");
        }
    }
    
}
