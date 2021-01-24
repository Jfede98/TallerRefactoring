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
import javafx.scene.layout.FlowPane;
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
    @FXML
    FlowPane containerImages;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        fillContainer();
    }    
    
    public ImageView createImage (String name){
//        double startX, startY = 0;
        //System.out.println("print antes image view");
        ImageView iv = new ImageView(new Image(getClass().getResource(direction + category +"/" + name + ".png").toString()));
        return iv;
        //ImageView imageView1 = null;
//        Image image1 = new Image("/src/main/resources/ImageAnimales/" + name + ".png", 18, 30, false, false);
//        return new ImageView(image1);
    }
    
    void fillContainer(){
        System.out.println("elements en fillcontainer:" + PaginaPrincipalController.elements.size());
        for(String s: PaginaPrincipalController.elements){
            containerImages.getChildren().add(createImage(s));
//            System.out.println(s);
        }    
    }
    

    
}
