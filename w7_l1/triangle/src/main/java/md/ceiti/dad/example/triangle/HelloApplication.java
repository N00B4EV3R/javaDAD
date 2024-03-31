package md.ceiti.dad.example.triangle;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.shape.*;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Line AB = new Line();
        AB.setStartX(100);
        AB.setStartY(70);
        AB.setEndX(100);
        AB.setEndY(250);

        Line AC = new Line();
        AC.setStartX(100);
        AC.setStartY(70);
        AC.setEndX(400);
        AC.setEndY(250);
        
        Line BC = new Line();
        BC.setStartX(100);
        BC.setStartY(250);
        BC.setEndX(400);
        BC.setEndY(250);

        Group root = new Group(AB, AC, BC);
        Scene scene = new Scene(root, 700,700);
        stage.setScene(scene);
        stage.setTitle("Triangle");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}