package es.dam.ud6ppejer2;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem; // Importante
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        MenuBar menuBar = new MenuBar();
        Menu menuGame = new Menu("_Game");

        MenuItem newItem = new MenuItem("New Game");
        MenuItem pauseItem = new MenuItem("Pause Game");
        MenuItem quitItem = new MenuItem("Quit Game");
        MenuItem exitItem = new MenuItem("E_xit");

        // Accion para salir del programa
        exitItem.setOnAction(e -> Platform.exit());

        // El separador se añade entre "Quit Game" y "Exit" para que se bea mejor
        menuGame.getItems().addAll(
            newItem, 
            pauseItem, 
            quitItem, 
            new SeparatorMenuItem(), // Aqui esta el separador que pide
            exitItem
        );

        menuBar.getMenus().add(menuGame);

        BorderPane root = new BorderPane();
        root.setTop(menuBar);
        stage.setScene(new Scene(root, 300, 250));
        stage.setTitle("Menu con Separadores");
        stage.show();
    }

    public static void main(String[] args) { 
        launch(args); 
    }
    

}