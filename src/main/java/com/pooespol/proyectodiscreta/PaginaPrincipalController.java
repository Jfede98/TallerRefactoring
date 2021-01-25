/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pooespol.proyectodiscreta;

import Categorias.Animal;
import Categorias.Fruit;
import Categorias.ObjectSet;
import Categorias.Plant;
import java.io.IOException;
import java.net.URL;
import java.util.HashSet;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Adriel Robles
 */
public class PaginaPrincipalController implements Initializable {

    @FXML
//    private Pane containerButton;
//    static ObjectSet type;
    static HashSet<String> elements = new HashSet<>();
    static String category = "Animales";
//    @FXML
//    private Button buttonEasy;
//    @FXML
//    private Button buttonMedium;
//    @FXML
//    private Button buttonHard;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        setElements();
    }

    @FXML
    void setToLevelButtons() {

    }

    @FXML
    void irNivelFacil(ActionEvent event) {
        cambioScene("PaginaFacil.fxml","Nivel Facil"); 
    }

    @FXML
    void irNivelIntermedio(ActionEvent event) {
        cambioScene("PaginaIntermedio.fxml","Nivel Intermedio"); 
    }

    @FXML
    void irNivelDificil(ActionEvent event) {
                cambioScene("PaginaDificil.fxml","Nivel Dificil"); 
    }

    void cambioScene(String nombre, String nivel) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(nombre));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setTitle("Nivel Facil");
            stage.show();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void setElements(){
        switch(category){
            case "Animales":
                elements = Animal.unionAll;           
                break;
            case "Frutas":
                //elements = Fruit.unionAll;
                break;
            case "Plantas":
                //elements = Plant.unionAll;
                break;
            default:
                System.out.println("Error en Seleccionar categoría");      
        }    
    }
}
