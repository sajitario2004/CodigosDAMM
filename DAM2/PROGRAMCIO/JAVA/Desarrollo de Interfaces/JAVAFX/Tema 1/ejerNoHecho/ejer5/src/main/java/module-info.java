module com.discoduroroer.ejer5 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.discoduroroer.ejer5 to javafx.fxml;
    exports com.discoduroroer.ejer5;
}
