package es.dam.ud6peejer1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class PrimaryController {

    @Override
    public void start(Stage primaryStage) {

        // 1. Crear el Panel Principal (El fondo)
        Pane root = new Pane();
        // Le damos un tamaño preferido para que la ventana no salga diminuta
        root.setPrefSize(400, 300);

        // 2. Crear el Círculo Cian (como en la imagen)
        Circle circle = new Circle(100, 100, 80); // x, y, radio
        circle.setFill(Color.CYAN);
        root.getChildren().add(circle);

        // ---------------------------------------------------------
        // 3. CREACIÓN DEL MENÚ CONTEXTUAL (ContextMenu)
        // ---------------------------------------------------------
        ContextMenu contextMenu = new ContextMenu();

        // --- A. Primer Item normal con atajo de teclado ---
        MenuItem item1 = new MenuItem("Menu Item");
        item1.setAccelerator(KeyCombination.keyCombination("Ctrl+O"));
        // Acción de ejemplo (opcional)
        item1.setOnAction(e -> System.out.println("Click en Menu Item"));

        // --- B. El Submenú (Parent -> Childs) ---
        // Para hacer un submenú, se usa la clase 'Menu', no 'MenuItem'
        Menu menuParent = new Menu("Parent");
        MenuItem child1 = new MenuItem("Child 1");
        MenuItem child2 = new MenuItem("Child 2");
        // Añadimos los hijos al padre
        menuParent.getItems().addAll(child1, child2);

        // --- C. Check Menu Item (El que tiene el tick) ---
        CheckMenuItem checkItem = new CheckMenuItem("Check Menu Item");
        checkItem.setSelected(true); // Lo marcamos por defecto

        // --- D. Radio Menu Items (Opciones excluyentes) ---
        RadioMenuItem radio1 = new RadioMenuItem("Radio - Option 1");
        RadioMenuItem radio2 = new RadioMenuItem("Radio - Option 2");
        
        // Importante: Crear un ToggleGroup para que solo se pueda elegir uno a la vez
        ToggleGroup toggleGroup = new ToggleGroup();
        radio1.setToggleGroup(toggleGroup);
        radio2.setToggleGroup(toggleGroup);
        radio1.setSelected(true); // Seleccionamos el primero por defecto

        // 4. Agregar todo al ContextMenu usando Separadores
        contextMenu.getItems().addAll(
                item1,
                new SeparatorMenuItem(), // La línea separadora
                menuParent,
                new SeparatorMenuItem(),
                checkItem,
                new SeparatorMenuItem(),
                radio1,
                radio2
        );

        // ---------------------------------------------------------
        // 5. HACER QUE EL FONDO TENGA EL MENÚ (Tu pregunta clave)
        // ---------------------------------------------------------
        
        // Usamos el evento 'setOnContextMenuRequested'.
        // Esto significa: "Cuando alguien pida un menú contextual (click derecho) sobre 'root'..."
        root.setOnContextMenuRequested(event -> {
            // Mostramos el menú en la posición del ratón en la pantalla
            contextMenu.show(root, event.getScreenX(), event.getScreenY());
            
            // Consumimos el evento para que no se propague más
            event.consume();
        });

        // Opcional: Ocultar el menú si hacemos click izquierdo en cualquier lado
        root.setOnMouseClicked(event -> {
            if (contextMenu.isShowing()) {
                contextMenu.hide();
            }
        });

        // 6. Configuración final del escenario (Stage)
        Scene scene = new Scene(root);
        primaryStage.setTitle("JavaFX ContextMenu (o7planning.org)");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
