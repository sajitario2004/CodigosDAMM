module ch.makery.adre {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens ch.makery.address to javafx.fxml;
    
    exports ch.makery.address.view to javafx.fxml;
    opens ch.makery.address.view to javafx.fxml;
    
    exports ch.makery.address;
}
