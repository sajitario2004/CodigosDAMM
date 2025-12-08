module com.discoduroroer.ejer1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.discoduroroer.ejer1 to javafx.fxml;
    exports com.discoduroroer.ejer1;
}
