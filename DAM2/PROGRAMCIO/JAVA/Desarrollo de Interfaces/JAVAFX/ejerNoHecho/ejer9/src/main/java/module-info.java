module com.discoduroroer.ejer9 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.discoduroroer.ejer9 to javafx.fxml;
    exports com.discoduroroer.ejer9;
}
