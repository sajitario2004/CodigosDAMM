module pru.ebas {
    requires javafx.controls;
    requires javafx.fxml;

    opens pru.ebas to javafx.fxml;
    exports pru.ebas;
}
