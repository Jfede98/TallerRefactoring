/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pooespol.proyectodiscreta;

import Categories.ObjectSet;
import Levels.Easy;
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

    private double startX, startY, a, b = 0;
    String category = PaginaPrincipalController.category;
    ObjectSet type;
    @FXML
    Pane containerImages;
    @FXML
    public static Circle leftSet = new Circle();
    @FXML
    public static Circle rightSet = new Circle();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        fillContainer();
    }

    public ImageView createImage(String name) {
        ImageView im = null;
        try (FileInputStream input = new FileInputStream(App.pathImg + name + ".png")) {
            Image image = new Image(input, 80, 80, false, false);
            im = new ImageView(image);
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
//        im.setOnMousePressed(e -> {
//            startX = im.getLayoutX();
//            startY = im.getLayoutY();
//        });
        
        im.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent t) {
                 Node n = (Node) t.getTarget();
                if (n instanceof Text) {
                    n = n.getParent();
                }
                startX = t.getX();
                startY = t.getY();
                System.out.println("layout x: " + n.getLayoutX());
                System.out.println("layout y: " + n.getLayoutY());
                System.out.println("t.get x: " + t.getX());
                System.out.println("t.get y: " + t.getY());
                System.out.println("");
                System.out.println("id: "+ n.getId());
//                startX = t.getX();
//                startY = t.getY();
            }

        });

        im.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent t) {
                Node n = (Node) t.getTarget();
                if (n instanceof Text) {
                    n = n.getParent();
                }
//                double x = n.getLayoutX() + t.getX() - startX;
//                double y = n.getLayoutY() + t.getY() - startY;
                double x = n.getLayoutX() + t.getX() - startX;
                double y = n.getLayoutY() + t.getY() - startY;
//                n.layoutXProperty().set(x);
//                n.layoutYProperty().set(y);
                n.setLayoutX(x);
                n.setLayoutY(y);
                
                System.out.println("posicion x: " + x);
                System.out.println("Posicion y: " + y);
                System.out.println(Easy.isInsideLeft(x, y));
                
            }
        });

        im.setOnMouseReleased(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent t) {
                Node n = (Node) t.getTarget();
                if (n instanceof Text) {
                    n = n.getParent();
                }
                if (!Easy.isInsideLeft(n.getLayoutX(), n.getLayoutY())) {
                    n.layoutXProperty().set(0);
                    n.layoutYProperty().set(0);
                }
            }
        });
        return im;
    }

    void fillContainer() {
        int contador = 0;
        double posicionX = 0;
        double posicionY = 0;
        for (String s : PaginaPrincipalController.elements) {
            ImageView imagen = createImage(s);
            if ((contador % 3 == 0) && contador != 0) {
                posicionY = posicionY + 80;
                posicionX = 0;
            }
            imagen.setX(posicionX);
            imagen.setY(posicionY);
            containerImages.getChildren().add(imagen);
            posicionX = posicionX + 80;
            contador++;
        }
    }

}
