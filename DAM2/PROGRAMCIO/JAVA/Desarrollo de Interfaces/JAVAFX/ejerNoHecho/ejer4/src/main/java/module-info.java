module com.discoduroroer.ejer4 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.discoduroroer.ejer4 to javafx.fxml;
    exports com.discoduroroer.ejer4;
}
