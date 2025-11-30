package ch.makery.addres.ejer1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApp extends Application {

    private Stage primaryStage;
    private BorderPane rootLayout;

    @Override
    public void start(Stage stage) {
        this.primaryStage = stage;
        this.primaryStage.setTitle("AddressApp Modern");

        initRootLayout();
        showPersonOverview();
    }

    
    private void initRootLayout() {
        try {
            FXMLLoader loader = new FXMLLoader(
                    MainApp.class.getResource("/ch/makery/addres/ejer1/RootLayout.fxml")
            );

            rootLayout = loader.load();
            Scene scene = new Scene(rootLayout, 900, 600);
            primaryStage.setScene(scene);
            primaryStage.show();

        } catch (IOException e) {
            System.err.println("Error loading RootLayout.fxml");
            e.printStackTrace();
            
        }
    }

    
    private void showPersonOverview() {
        try {
            FXMLLoader loader = new FXMLLoader(
                    MainApp.class.getResource("/ch/makery/addres/ejer1/PersonOverview.fxml")
                    
            );

            AnchorPane personOverview = loader.load();
            rootLayout.setCenter(personOverview);
            

        } catch (IOException e) {
            System.err.println("Error loading PersonOverview.fxml");
            e.printStackTrace();
            
        }
    }

    public Stage getPrimaryStage() {
        return primaryStage;
        
    }

    public static void main(String[] args) {
        launch();
        
    }
}
