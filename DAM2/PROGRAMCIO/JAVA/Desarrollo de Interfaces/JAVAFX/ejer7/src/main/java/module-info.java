module com.discoduroroer.ejer7 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.discoduroroer.ejer7 to javafx.fxml;
    exports com.discoduroroer.ejer7;
}
