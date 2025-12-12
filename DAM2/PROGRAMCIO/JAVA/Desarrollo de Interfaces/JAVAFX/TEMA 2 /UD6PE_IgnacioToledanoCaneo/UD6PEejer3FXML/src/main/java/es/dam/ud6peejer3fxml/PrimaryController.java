package es.dam.ud6peejer3fxml;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
