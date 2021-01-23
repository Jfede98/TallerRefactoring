/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pooespol.proyectodiscreta;

import Categorias.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

/**
 * FXML Controller class
 *
 * @author Adriel Robles
 */
public class PaginaFacilController implements Initializable {

    String direction = "/main/resources/image";  
    ObjectSet type;
    GridPane container;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
   // @FXML
    public ImageView createImage (String category, String element){
        ImageView iv = new ImageView(new Image(getClass().getResource(direction + category +"/" + element + ".png").toString()));
        iv.setFitHeight(30);
        iv.setFitWidth(30);  
        return iv;
    }
    
    void fillContainer(String category){
        setType(category);
        for(String s: ObjectSet.union){
            container.getChildren().addAll(createImage(category, s));
        }    
    }
    
    private void setType(String category){
        switch(category){
            case "Animales":
                type = new Animal();
                break;
            case "Frutas":
                type = new Fruit();
                break;
            case "Plantas":
                type = new Plant();
                break;
            default:
                System.out.println("Error en Seleccionar categoría");      
        }
    }
}
