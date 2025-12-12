package es.dam.ud6peejer2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * JavaFX App - Solución Tarea Menú Contextual
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        
        // Panel root, estco contiene todo
        Pane root = new Pane();
        
        // Creamos el contexMenu
        ContextMenu contextMenu = new ContextMenu();
        
        // El circulo azul del fondo
        Circle circle = new Circle(100, 100, 80); // x=100, y=100, radio=80
        circle.setFill(Color.CYAN);
        root.getChildren().add(circle);

        // Primera parte del contexmenu tien que tener un MenuItem que al hacer Control + O se active
        MenuItem item1 = new MenuItem("Menu Item");
        item1.setAccelerator(KeyCombination.keyCombination("Ctrl+O"));
        // Este print es por comprobacion de funcionamiento
        item1.setOnAction(e -> System.out.println("Has pulsado el Item 1"));

        // El Submenu ,Parent -> Child 1, Child 2
        Menu menuParent = new Menu("Parent");
        MenuItem child1 = new MenuItem("Child 1");
        MenuItem child2 = new MenuItem("Child 2");
        menuParent.getItems().addAll(child1, child2);

        // Check Menu Item (El que tiene el tick)
        CheckMenuItem checkItem = new CheckMenuItem("Check Menu Item");
        checkItem.setSelected(true); // Marcado por defecto

        // Radio Menu Items (2 opciones, solo puedes marcar 1)
        RadioMenuItem radio1 = new RadioMenuItem("Radio - Option 1");
        RadioMenuItem radio2 = new RadioMenuItem("Radio - Option 2");
        
        // Creamos un grupo para que solo se pueda elegir uno a la vez
        // Este TogleGroup contendra los radioButons
        ToggleGroup group = new ToggleGroup();
        radio1.setToggleGroup(group);
        radio2.setToggleGroup(group);
        // Con esto selecciono uno por defecto (en este caso el primero)
        radio1.setSelected(true); 

        // Añadimos todo al Menu al menu principal con el se eparador
        contextMenu.getItems().addAll(
                item1,
                menuParent,
                checkItem,
                new SeparatorMenuItem(),
                radio1,
                radio2
        );

        // Añadimos el contexMenu a todo el panel root que es el principal
        root.setOnContextMenuRequested(event -> {
            //lo que hace el event.getScreenXoY es coger la posicion del raton pra mostrarlo ahi
            contextMenu.show(root, event.getScreenX(), event.getScreenY());
            event.consume(); // detenemos el evento
        });
        
        // Esto es opcional pero como lo vi en uno de los tutoriales de jenko 
        // Esto hace que cuando agas click izquierdo en cualquier lado se oculte el menu
        root.setOnMouseClicked(event -> {
             if (contextMenu.isShowing()) {
                 contextMenu.hide();
             }
        });

        // Esto es configuracion que que venia de base
        Scene scene = new Scene(root, 640, 480);
        stage.setTitle("JavaFX ContextMenu Tarea");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}