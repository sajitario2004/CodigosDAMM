module com.discoduroroer {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.discoduroroer to javafx.fxml;
    exports com.discoduroroer;
}
