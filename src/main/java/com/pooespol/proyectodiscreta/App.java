package com.pooespol.proyectodiscreta;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import static javafx.application.Application.launch;

/**
 * JavaFX App
 */
public class App extends Application {
    public static String pathImg="src/main/resources/images/";
    public static String pathFiles="src/main/resources/files/";
    private static Scene scene;
    public static Stage stage;
    public static Parent root;
    @Override
    public void start(Stage stage) throws Exception {
        App.stage = stage;
        FXMLLoader fxmLoader=new FXMLLoader(App.class.getResource("PaginaPrincipal.fxml"));
        root=fxmLoader.load();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
 
    }
    public static void main(String[] args) {
        launch();
    }
}