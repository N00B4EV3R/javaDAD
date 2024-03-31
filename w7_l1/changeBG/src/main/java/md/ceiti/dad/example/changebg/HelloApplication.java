package md.ceiti.dad.example.changebg;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Button redButton = new Button("Change color to red");
        Button blueButton = new Button("Change color to blue");
        HBox hBox = new HBox(10);
        hBox.setAlignment(Pos.CENTER);
        hBox.getChildren().addAll(redButton, blueButton);


        Group root = new Group();
        root.getChildren().add(hBox);

        Scene scene = new Scene(root, 300, 300);

        redButton.setOnAction(e->{
            scene.setFill(Color.RED);
        });
        blueButton.setOnAction(e->{
            scene.setFill(Color.BLUE);
        });

        stage.setScene(scene);
        stage.setTitle("Changing color");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}