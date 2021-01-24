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

    String direction = "/main/resources/Image";  
    String category = PaginaPrincipalController.category;
    ObjectSet type;
    GridPane container;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        fillContainer();
    }    
    
    public ImageView createImage (String name){
        ImageView iv = new ImageView(new Image(getClass().getResource(direction + category +"/" + name + ".png").toString()));
//        iv.setFitHeight(30);
//        iv.setFitWidth(30);  
        
        return iv;
    }
    
    void fillContainer(){
        for(String s: PaginaPrincipalController.elements){
            container.getChildren().addAll(createImage(s));
        }    
    }
    

    
}
