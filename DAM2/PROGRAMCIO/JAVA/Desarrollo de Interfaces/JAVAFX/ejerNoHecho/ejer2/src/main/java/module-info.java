module com.discoduroroer.ejer2 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.discoduroroer.ejer2 to javafx.fxml;
    exports com.discoduroroer.ejer2;
}
