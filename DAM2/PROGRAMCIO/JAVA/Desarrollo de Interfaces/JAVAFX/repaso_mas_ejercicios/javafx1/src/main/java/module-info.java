module edu.dam {
    requires javafx.controls;
    requires javafx.fxml;

    opens edu.dam to javafx.fxml;
    exports edu.dam;
}
