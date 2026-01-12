package es.dam;
// Fig. X: AddressBook.java
// Main application class that loads and displays the AddressBook's GUI.
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * JavaFX App
 * 
 * Esta es la clase principal y el main del programa
 * 
 * @author nacho
 * @version 1.0
 */
public class AddressBook extends Application {
    /**
     * Clase start que lanza la ventana
     * 
     * @param stage Stage del import javafx.stage.Stage
     * @throws Exception Excepcion que se lanza si la ventana no se lanza
     */
   @Override
   public void start(Stage stage) throws Exception {
      Parent root = 
         FXMLLoader.load(getClass().getResource("/fxml/AddressBook.fxml"));
      
      Scene scene = new Scene(root);
      stage.setTitle("Address Book");
      stage.setScene(scene);
      stage.show();
   }


   public static void main(String[] args) {
      launch(args);
   }
}
