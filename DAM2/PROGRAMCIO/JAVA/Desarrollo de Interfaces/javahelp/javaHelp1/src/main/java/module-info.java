module com.mycompany.javahelp1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.javahelp1 to javafx.fxml;
    exports com.mycompany.javahelp1;
}
