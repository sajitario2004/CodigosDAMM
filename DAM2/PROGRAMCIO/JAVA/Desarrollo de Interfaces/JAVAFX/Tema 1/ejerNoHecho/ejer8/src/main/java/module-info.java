module com.discoduroroer.ejer8 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.discoduroroer.ejer8 to javafx.fxml;
    exports com.discoduroroer.ejer8;
}
