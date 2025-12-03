package ch.makery.address;

import java.io.IOException;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import ch.makery.address.model.Person;
import ch.makery.address.view.PersonOverviewController;

public class MainApp extends Application {

    private Stage primaryStage;
    private BorderPane rootLayout;

    // Lista observable con datos de ejemplo
    private final ObservableList<Person> personData = FXCollections.observableArrayList();

    // Constructor con datos de ejemplo
    public MainApp() {
        personData.addAll(
            new Person("Hans", "Muster"),
            new Person("Ruth", "Mueller"),
            new Person("Heinz", "Kurz"),
            new Person("Cornelia", "Meier"),
            new Person("Werner", "Meyer"),
            new Person("Lydia", "Kunz"),
            new Person("Anna", "Best"),
            new Person("Stefan", "Meier"),
            new Person("Martin", "Mueller")
        );
    }

    public ObservableList<Person> getPersonData() {
        return personData;
    }

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("AddressApp");

        initRootLayout();
        showPersonOverview();
    }

    /**
     * Carga el RootLayout y lo asigna al Stage principal.
     */
    private void initRootLayout() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/RootLayout.fxml"));
            rootLayout = loader.load();

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();

        } catch (IOException e) {
            throw new RuntimeException("No se pudo cargar RootLayout.fxml", e);
        }
    }

    /**
     * Carga PersonOverview dentro del centro del BorderPane principal.
     */
    private void showPersonOverview() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/PersonOverview.fxml"));
            AnchorPane personOverview = loader.load();

            rootLayout.setCenter(personOverview);

            // Conectar controlador con el MainApp
            PersonOverviewController controller = loader.getController();
            controller.setMainApp(this);

        } catch (IOException e) {
            throw new RuntimeException("No se pudo cargar PersonOverview.fxml", e);
        }
    }

    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public static void main(String[] args) {
        launch(args);
    }
}

