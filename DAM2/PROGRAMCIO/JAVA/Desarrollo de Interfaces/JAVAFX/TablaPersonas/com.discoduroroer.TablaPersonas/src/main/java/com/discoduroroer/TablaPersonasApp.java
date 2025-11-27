package com.discoduroroer;

import static com.sun.javafx.scene.control.skin.Utils.getResource;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX TablaPersonasApp
 */
public class TablaPersonasApp extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/TablaPersonas.fxml"));
        scene = new Scene(fxmlLoader.load(), 640, 480);
        stage.setScene(scene);
        stage.show();   
    }

    
    public static void main(String[] args) {
        launch();
    }

}