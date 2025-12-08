package com.discoduroroer.ejer1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author administrador
 */


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Ejemplo1 extends Application {
    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("¡Bienvenido a JavaFX!");
        Button btn = new Button("Presióname");
        btn.setOnAction(e -> {
            label.setText("¡Has presionado el botón!");
            // ejemplo extra: cambiar estilo
            label.setStyle("-fx-text-fill: #2a9d8f; -fx-font-weight: bold;");
        });

        VBox root = new VBox(10); // 10px de separación entre controles
        root.setPadding(new Insets(15));
        root.getChildren().addAll(label, btn);

        Scene scene = new Scene(root, 300, 150);
        primaryStage.setTitle("Ejemplo 1 – Label y Button");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
