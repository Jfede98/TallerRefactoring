/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pooespol.proyectodiscreta;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Adriel Robles
 */
public class PaginaPrincipalController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    @FXML
    void irNivelFacil(ActionEvent event){
        try {
                FXMLLoader loader=new FXMLLoader(getClass().getResource("PaginaFacil.fxml"));
                Parent root= loader.load();
                Scene scene=new Scene(root);
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.initModality(Modality.APPLICATION_MODAL);
                stage.setTitle("Nivel Facil");
                stage.show();
            } catch (IOException ex) {
              System.out.println(ex.getMessage());  
            }
    }
    @FXML
    void irNivelIntermedio(ActionEvent event){
        try {
                FXMLLoader loader=new FXMLLoader(getClass().getResource("PaginaIntermedio.fxml"));
                Parent root= loader.load();
                Scene scene=new Scene(root);
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.initModality(Modality.APPLICATION_MODAL);
                stage.setTitle("Nivel Intermedio");
                stage.show();
            } catch (IOException ex) {
              System.out.println(ex.getMessage());  
            }
    }
    @FXML
    void irNivelDificil(ActionEvent event){
        try {
                FXMLLoader loader=new FXMLLoader(getClass().getResource("PaginaDificil.fxml"));
                Parent root= loader.load();
                Scene scene=new Scene(root);
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.initModality(Modality.APPLICATION_MODAL);
                stage.setTitle("Nivel Dificil");
                stage.show();
            } catch (IOException ex) {
              System.out.println(ex.getMessage());  
            }
    }
    
}
