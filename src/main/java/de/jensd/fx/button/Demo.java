package de.jensd.fx.button;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Demo extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/buttondemo.fxml"));
        Scene scene = new Scene(root);
        scene.getStylesheets().add("/styles/buttondemo.css");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setTitle("Button of choice - DEMO");
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}