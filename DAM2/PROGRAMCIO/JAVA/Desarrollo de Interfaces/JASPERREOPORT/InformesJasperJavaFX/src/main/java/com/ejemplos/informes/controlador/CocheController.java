/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.ejemplos.informes.controlador;

import com.ejemplos.informes.modelo.Coche;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import java.awt.Desktop;
import java.io.File;
import java.io.InputStream;
import javafx.event.ActionEvent;

public class CocheController {

    @FXML
    private TextField txtMarca;
    @FXML
    private TextField txtMatricula;
    @FXML
    private TextField txtColor;
    @FXML
    private TextField txtKilometros;
    @FXML
    private TableView<Coche> tablaCoches;
    @FXML
    private TableColumn<Coche, String> colMarca;
    @FXML
    private TableColumn<Coche, String> colMatricula;
    @FXML
    private TableColumn<Coche, String> colColor;
    @FXML
    private TableColumn<Coche, Integer> colKilometros;

    private ObservableList<Coche> listaCoches
            = FXCollections.observableArrayList();

    public void initialize() {
        colMarca.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getMarca()));
        colMatricula.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getMatricula()));
        colColor.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getColor()));
        colKilometros.setCellValueFactory(data -> new javafx.beans.property.SimpleObjectProperty<>(data.getValue().getKilometros()));
        tablaCoches.setItems(listaCoches);
    }

    @FXML
    private void anadirCoche() {
        String marca = txtMarca.getText();
        String matricula = txtMatricula.getText();
        String color = txtColor.getText();
        int kilometros = Integer.parseInt(txtKilometros.getText());
        Coche coche = new Coche(marca, matricula, color, kilometros);
        listaCoches.add(coche);
        txtMarca.clear();
        txtMatricula.clear();
        txtColor.clear();
        txtKilometros.clear();
    }

    @FXML
    private void generarInforme() {
        try {
            JRBeanCollectionDataSource dataSource
                    = new JRBeanCollectionDataSource(listaCoches);
            InputStream reportStream
                    = getClass().getResourceAsStream("/reports/coches.jrxml");
            JasperReport jasperReport
                    = JasperCompileManager.compileReport(reportStream);
            JasperPrint jasperPrint
                    = JasperFillManager.fillReport(jasperReport, null,
                            dataSource);
            File pdf = new File("coches.pdf");
            JasperExportManager.exportReportToPdfFile(
                    jasperPrint, pdf.getAbsolutePath());
            
            // No permite abrir el documeto una vez hecho por que ubuntu no lo permite
            // Desktop.getDesktop().open(pdf);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

   
}
