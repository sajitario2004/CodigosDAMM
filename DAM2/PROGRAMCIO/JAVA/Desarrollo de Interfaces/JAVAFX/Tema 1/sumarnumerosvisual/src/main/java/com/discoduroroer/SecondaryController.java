package com.discoduroroer;

import java.io.IOException;
import javafx.fxml.FXML;

public class SecondaryController {

    @FXML
    private void switchToPrimary() throws IOException {
        SumarNumerosApp.setRoot("primary");
    }
}