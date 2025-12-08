package com.discoduroroer;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        SumarNumerosApp.setRoot("secondary");
    }
}
