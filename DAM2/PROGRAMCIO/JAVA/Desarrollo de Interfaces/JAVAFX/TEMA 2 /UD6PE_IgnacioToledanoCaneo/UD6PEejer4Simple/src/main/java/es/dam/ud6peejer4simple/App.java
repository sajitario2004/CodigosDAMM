package es.dam.ud6peejer4simple;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.CustomMenuItem;
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

        // La barra de menu
        MenuBar menuBar = new MenuBar();

        // El boton menu de la barra de menu
        Menu customMenu = new Menu("Menu");

        // Creamos un boton normal y luego lo añadimos a un boton personalizado
        // llamado CustomMenuItem a el cual le ponemos desde un boton asta un radio buton
        Button btnItem = new Button("MenuItem 1");
        CustomMenuItem item1 = new CustomMenuItem();
        item1.setContent(btnItem);

        // Esto es un menuItem normal
        MenuItem item2 = new MenuItem("MenuItem 2");

        // ChecBox dentro de un CustomMenuItem
        // me Funciona pero no entiendo por que 
        CheckBox chkBox = new CheckBox("MenuItem 3");
        chkBox.setSelected(true); 
        CustomMenuItem item3 = new CustomMenuItem();
        item3.setContent(chkBox);


        // Añado todo a el menu
        customMenu.getItems().addAll(item1, item2, item3);

        // Añado el menu a el la barra del menu de arriba
        menuBar.getMenus().add(customMenu);

        // Panel principal
        BorderPane root = new BorderPane();
        // Lo ponemos arriba
        root.setTop(menuBar);

        // Y ya estaria profe lo demas viene por defecto con los ejemplos 😎
        Scene scene = new Scene(root, 300, 250);
        stage.setTitle("JavaFX Custom Menu - Code");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}