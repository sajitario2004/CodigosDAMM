module es.dam {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens es.dam to javafx.fxml;
    opens es.dam.model to javafx.base;
    opens es.dam.view to javafx.fxml;
    
    exports es.dam.view;
    exports es.dam.model;
    exports es.dam;
}
