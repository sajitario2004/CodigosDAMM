package edu.dam;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchEjer1() throws IOException {
        App.setRoot("secondary");
    }
}
