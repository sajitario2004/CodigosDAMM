module es.dam.sumas {
    requires javafx.controls;
    requires javafx.fxml;

    opens es.dam.sumas to javafx.fxml;
    exports es.dam.sumas;
}
