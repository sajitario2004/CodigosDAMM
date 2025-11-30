module ch.makery.addres.ejer1 {

    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    // Exportas tu paquete principal para ejecutar la app
    exports ch.makery.addres.ejer1;

    // Muy importante: permitir acceso a los controladores
    exports ch.makery.addres.ejer1.Controlers to javafx.fxml;
    opens ch.makery.addres.ejer1.Controlers to javafx.fxml;

    // Si cargas FXML desde el paquete principal
    opens ch.makery.addres.ejer1 to javafx.fxml;
}
