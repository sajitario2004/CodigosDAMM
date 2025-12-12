package es.dam.ud6ppejer1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        // Crear el MenuBar 
        MenuBar menuBar = new MenuBar();

        // Crear el Menu "Game" 
        // El guion bajo dice que para poner el atajo de teclado (Alt+G) se hace asi perro no me funciona
        Menu menuGame = new Menu("_Game"); 

        // Creo Items Basicos 
        MenuItem newItem = new MenuItem("New Game");
        MenuItem pauseItem = new MenuItem("_Pause Game"); // Item dinámico

        // Logica Dinamica que tiene este ejercicio:
        // Cambiar texto al hacer clic
        pauseItem.setOnAction(e -> {
            // Te cambia el contenido del boton "pauseItem" por si lo has pulsado
            // Y para comprobar si funciona te imprime una linea por terminal
            if (pauseItem.getText().equals("_Pause Game")) {
                pauseItem.setText("_Resume Game");
                System.out.println("Juego Pausado");
                
            } else {
                pauseItem.setText("_Pause Game");
                System.out.println("Juego Reanudado");
                
            }
        });

        // Anadir items al menu y el menu a la barra 
        menuGame.getItems().addAll(newItem, pauseItem);
        menuBar.getMenus().add(menuGame);

        BorderPane root = new BorderPane();
        root.setTop(menuBar);
        stage.setScene(new Scene(root, 300, 250));
        stage.setTitle("Menu Basico Dinamico");
        stage.show();
    }

    public static void main(String[] args) { 
        launch(args); 
    }
}