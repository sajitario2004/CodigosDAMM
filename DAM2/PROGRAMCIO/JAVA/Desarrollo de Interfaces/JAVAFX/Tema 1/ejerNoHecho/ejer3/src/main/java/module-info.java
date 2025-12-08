module com.discoduroroer.ejer3 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.discoduroroer.ejer3 to javafx.fxml;
    exports com.discoduroroer.ejer3;
}
