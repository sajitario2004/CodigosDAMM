module es.dam.prueba1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens es.dam.prueba1 to javafx.fxml;
    
    opens es.dam.prueba1.vista to javafx.fxml;
    exports es.dam.prueba1.vista to javafx.fxml;
    
    exports es.dam.prueba1;
}
