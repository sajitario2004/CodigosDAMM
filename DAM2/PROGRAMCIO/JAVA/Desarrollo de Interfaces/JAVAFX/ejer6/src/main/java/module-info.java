module com.discoduroroer.ejer6 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.discoduroroer.ejer6 to javafx.fxml;
    exports com.discoduroroer.ejer6;
}
