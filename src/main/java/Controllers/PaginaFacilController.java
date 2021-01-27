/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Categories.ObjectSet;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author Adriel Robles
 */
public class PaginaFacilController implements Initializable {
    private double startX = 0, startY = 0;
    String category = PaginaPrincipalController.category;
    ObjectSet type;
    @FXML
    Pane containerImages;
    @FXML public static Circle leftSet;
    @FXML public static Circle rightSet;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        fillContainer();
    }    
    
    public ImageView createImage (String name){
       ImageView imageView1 = null;
        try (FileInputStream input = new FileInputStream(App.pathImg+name+".png")) {
            Image image = new Image(input, 80, 80, false, false);
            imageView1 = new ImageView(image);
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        imageView1.setOnMousePressed(new EventHandler<MouseEvent>(){
           @Override
           public void handle(MouseEvent t) {
                 startX = t.getX();
                 startY = t.getY();
           }
            
        });
        
        imageView1.setOnMouseDragged(new EventHandler<MouseEvent>(){
           @Override
           public void handle(MouseEvent t) {
               Node n = (Node) t.getTarget();
               if(n instanceof Text)
                   n = n.getParent();
               n.layoutXProperty().set(n.getLayoutX()+t.getX()-startX);
               n.layoutYProperty().set(n.getLayoutY()+t.getY()-startY);
           }
            
        });
        return imageView1;
    }
    
    void fillContainer(){
        int contador =0;
        double posicionX=0;
        double posicionY=0;
        for(String s: PaginaPrincipalController.elements){
            ImageView imagen = createImage(s);
            if ((contador%3==0)&& contador!=0){
                posicionY=posicionY+80;
                posicionX=0;
            }
            imagen.setX(posicionX);
            imagen.setY(posicionY);
            containerImages.getChildren().add(imagen);
            posicionX=posicionX+80;
            contador++;
        }    
    }
    
    
    

    
}
