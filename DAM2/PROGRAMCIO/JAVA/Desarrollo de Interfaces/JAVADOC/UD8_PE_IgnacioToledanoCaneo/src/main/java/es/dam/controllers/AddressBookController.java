package es.dam.controllers;

import java.util.List;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import es.dam.queries.PersonQueries;
import es.dam.model.Person;

/**
 * Clase controler del fxml de AddressBook.fxml
 * 
 * @author nacho
 */
public class AddressBookController {
   @FXML private ListView<Person> listView; // displays contact names
   @FXML private TextField firstNameTextField;
   @FXML private TextField lastNameTextField;
   @FXML private TextField emailTextField;
   @FXML private TextField phoneTextField;
   @FXML private TextField findByLastNameTextField;

   // interacts with the database
   private final PersonQueries personQueries = new PersonQueries();

   // stores list of Person objects that results from a database query
   private final ObservableList<Person> contactList = 
      FXCollections.observableArrayList();
   
   /**
    * Seteador de un listener para eventos
    */
   public void initialize() {
      listView.setItems(contactList); // bind to contactsList
      getAllEntries(); // populates contactList, which updates listView 

      // when ListView selection changes, display selected person's data
      listView.getSelectionModel().selectedItemProperty().addListener(
         (observableValue, oldValue, newValue) -> {
            displayContact(newValue);
         }
      );     
   }

   /**
    * getter que devuelve una entrada
    */
   private void getAllEntries() {
      contactList.setAll(personQueries.getAllPeople()); 
      selectFirstEntry();
   }

   /**
    * select que selecciona la primera entrada
    */
   private void selectFirstEntry() {
      listView.getSelectionModel().selectFirst();          
   }

   /**
    * Desplegar informacion de contacto, si la persona es nula no la añade
    * 
    * @param person Variable tipo Person
    */
   private void displayContact(Person person) {
      if (person != null) {
         firstNameTextField.setText(person.getFirstName());
         lastNameTextField.setText(person.getLastName());
         emailTextField.setText(person.getEmail());
         phoneTextField.setText(person.getPhoneNumber());
      }
      else {
         firstNameTextField.clear();
         lastNameTextField.clear();
         emailTextField.clear();
         phoneTextField.clear();
      }
   }

   /**
    * ActionEvent que gestiona el evento de añadir una entrada por boton presionado
    * 
    * @param event Event el cual le llega por el boton de añadir Entrada
    */
   @FXML
   void addEntryButtonPressed(ActionEvent event) {
      int result = personQueries.addPerson(
         firstNameTextField.getText(), lastNameTextField.getText(), 
         emailTextField.getText(), phoneTextField.getText());                                     
      
      if (result == 1) {
         displayAlert(AlertType.INFORMATION, "Entry Added", 
            "New entry successfully added.");
      }
      else {
         displayAlert(AlertType.ERROR, "Entry Not Added", 
            "Unable to add entry.");
      }
      
      getAllEntries();
   }

   /**
    * ActionEvent que gestiona el boton de busqueda
    * 
    * @param event Event que espera la señal del boton de busqueda
    */
   @FXML
   void findButtonPressed(ActionEvent event) {
      List<Person> people = personQueries.getPeopleByLastName(
         findByLastNameTextField.getText() + "%");

      if (people.size() > 0) { // display all entries
         contactList.setAll(people);
         selectFirstEntry();
      }
      else {
         displayAlert(AlertType.INFORMATION, "Lastname Not Found", 
            "There are no entries with the specified last name.");
      }
   }

   /**
    * ActionEvent del boton de busqueda el cual devuelve todas la entradas
    * 
    * @param event 
    */
   @FXML
   void browseAllButtonPressed(ActionEvent event) {
      getAllEntries();
   }

   /**
    * Desplegar alerta
    * 
    * @param type Tipo de alerta
    * @param title Titulo de la alerta
    * @param message Mensaje de la alerta
    */
   private void displayAlert(
      AlertType type, String title, String message) {
      Alert alert = new Alert(type);
      alert.setTitle(title);
      alert.setContentText(message);
      alert.showAndWait();
   }
}

