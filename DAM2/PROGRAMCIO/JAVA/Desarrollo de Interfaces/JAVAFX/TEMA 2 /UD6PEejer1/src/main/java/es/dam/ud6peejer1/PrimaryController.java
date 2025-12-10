package es.dam.ud6peejer1;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;

public class PrimaryController {

    @FXML
    private Pane panelFondo;
    @FXML
    private MenuBar menuBar;
    @FXML
    private TextArea areaTexto;
    @FXML
    private ContextMenu contexMenu;
    @FXML
    private MenuItem Opcion1;

    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
