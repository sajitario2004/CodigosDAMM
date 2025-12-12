package es.dam.ud6ppejer4;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        MenuBar menuBar = new MenuBar();
        Menu menuOptions = new Menu("Options");

        // Creamos el submenu "Difficulty"
        Menu menuDifficulty = new Menu("Difficulty");

        // Creamos los items para ese submenu (reutilizando lógica anterior)
        ToggleGroup diffGroup = new ToggleGroup();
        RadioMenuItem easy = new RadioMenuItem("Easy");
        RadioMenuItem medium = new RadioMenuItem("Medium");
        RadioMenuItem hard = new RadioMenuItem("Hard");
        
        easy.setToggleGroup(diffGroup);
        medium.setToggleGroup(diffGroup);
        hard.setToggleGroup(diffGroup);
        easy.setSelected(true);

        // Añadimos los items al Submenu
        menuDifficulty.getItems().addAll(easy, medium, hard);

        // Crear un TextField
        TextField txtName = new TextField();
        txtName.setPromptText("Player Name");
        
        // Envolverlo en un CustomMenuItem
        CustomMenuItem customItem = new CustomMenuItem(txtName);

        // Añadimos el Submenu y el CustomMenuItem al menu principal Options
        menuOptions.getItems().addAll(
            menuDifficulty,  // Añadimos el submenu como si fuera un item
            new SeparatorMenuItem(),
            customItem       // El cuadro de texto
        );

        menuBar.getMenus().add(menuOptions);

        BorderPane root = new BorderPane();
        root.setTop(menuBar);
        stage.setScene(new Scene(root, 300, 250));
        stage.setTitle("Menu con submenu y items personalizados");
        stage.show();
    }

    public static void main(String[] args) { 
        launch(args); 
    }

}