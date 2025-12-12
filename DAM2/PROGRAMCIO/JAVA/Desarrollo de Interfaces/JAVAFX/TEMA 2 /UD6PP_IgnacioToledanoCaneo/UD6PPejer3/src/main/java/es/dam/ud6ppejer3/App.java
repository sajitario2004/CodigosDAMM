package es.dam.ud6ppejer3;

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

        // CheckMenuItem (Opciones independientes) 
        CheckMenuItem soundItem = new CheckMenuItem("Sound");
        CheckMenuItem musicItem = new CheckMenuItem("Music");
        musicItem.setSelected(true); // Marcado por defecto 

        // RadioMenuItem (Opciones excluyentes)
        RadioMenuItem easyItem = new RadioMenuItem("Easy");
        RadioMenuItem mediumItem = new RadioMenuItem("Medium");
        RadioMenuItem hardItem = new RadioMenuItem("Hard");

        // Crear el ToggleGroup meter los radioButon del menu y que cuando marques uno se desmarque el que este marcado 
        ToggleGroup difficultyGroup = new ToggleGroup();
        easyItem.setToggleGroup(difficultyGroup);
        mediumItem.setToggleGroup(difficultyGroup);
        hardItem.setToggleGroup(difficultyGroup);
        // Selecciono uno por defecto
        easyItem.setSelected(true); 

        // Añadir todo al menu con un separador entre tipos 
        menuOptions.getItems().addAll(
            soundItem, 
            musicItem, 
            new SeparatorMenuItem(), 
            easyItem, 
            mediumItem, 
            hardItem
        );

        menuBar.getMenus().add(menuOptions);
        BorderPane root = new BorderPane();
        root.setTop(menuBar);
        stage.setScene(new Scene(root, 300, 250));
        stage.setTitle("Menu con Check y radioButons");
        stage.show();
    }

    public static void main(String[] args) { 
        launch(args); 
    }

}