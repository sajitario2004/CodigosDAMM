module ch.makery.address {

    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    // Exportas tu paquete principal para ejecutar la app
    exports ch.makery.address;

    // Muy importante: permitir acceso a los controladores
    exports ch.makery.address.view to javafx.fxml;
    opens ch.makery.address.view to javafx.fxml;

    // Si cargas FXML desde el paquete principal
    opens ch.makery.address to javafx.fxml;
}
