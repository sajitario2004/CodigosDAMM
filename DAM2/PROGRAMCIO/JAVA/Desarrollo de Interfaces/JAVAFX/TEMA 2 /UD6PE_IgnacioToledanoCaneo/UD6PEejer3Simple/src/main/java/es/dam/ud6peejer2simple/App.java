package es.dam.ud6peejer2simple;

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

        // Creamos el la barra de menu
        MenuBar menuBar = new MenuBar();

        //  Crear los Menus principales (File, Edit, Help)
        Menu menuFile = new Menu("File");
        Menu menuEdit = new Menu("Edit");
        Menu menuHelp = new Menu("Help");

        // Crear los Items para el menu "File" (New, Open File, Exit)
        MenuItem itemNew = new MenuItem("New");
        MenuItem itemOpen = new MenuItem("Open File");
        MenuItem itemExit = new MenuItem("Exit");
        
        
        // Agregamos los items dentro del menu "File"
        menuFile.getItems().addAll(itemNew, itemOpen, itemExit);

        // Agregar los tres menus a la Barra Principal
        menuBar.getMenus().addAll(menuFile, menuEdit, menuHelp);

        // Layout Principal BorderPane queda mas bonito por que se ajusta siempre
        BorderPane root = new BorderPane();
        root.setTop(menuBar);

        // Configuracion de la Escena otra vez 
        Scene scene = new Scene(root, 640, 480);
        stage.setTitle("JavaFX Menu - Code Nacho");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}