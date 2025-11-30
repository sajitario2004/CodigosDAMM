package basico.ejemplo.prueba2;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        App2.setRoot("secondary");
    }
}
