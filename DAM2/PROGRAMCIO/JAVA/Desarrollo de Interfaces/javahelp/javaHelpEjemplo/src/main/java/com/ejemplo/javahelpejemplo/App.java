package com.ejemplo.javahelpejemplo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 * 
 * main principal para ejecucion de la aplicacion
 * 
 * @author Nacho
 * @version 1.0
 */
public class App extends Application {

    private static Scene scene;
    
    /**
     * iniciador que permite ver la ventana
     * 
     * @param stage le llega el estado de la aplicacion
     * @throws IOException devolvera una excepcion en caso de falla
     */
    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/vista.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    /**
     * 
     * 
     * @param fxml String de ruta del archivo
     * @throws IOException excepcion en caso de falla de carga
     */
    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    /**
     * 
     * @param fxml String nombre de archivo 
     * @return fxmlLoader.load() ventana cargada del fxml
     * @throws IOException excecion de falla de caraga de la ventana
     */
    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    /**
     * es el main
     * 
     * 
     * @param args 
     */
    public static void main(String[] args) {
        launch();
    }

}