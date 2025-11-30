module basico.ejemplo.prueba2 {
    requires javafx.controls;
    requires javafx.fxml;

    opens basico.ejemplo.prueba2 to javafx.fxml;
    exports basico.ejemplo.prueba2;
}
