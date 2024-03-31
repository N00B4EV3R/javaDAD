package com.example.lab2.laborator2_fx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class sar3_CircleExample extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        final double HEIGHT = 400;
        final double WIDTH = 400;

        Circle circle = new Circle(WIDTH/2, HEIGHT/2, 20, Color.RED);
        Text heading = new Text(WIDTH/2 - 50, 20, "Click on the red cirlce");
        Text message = new Text(WIDTH/2 - 40, HEIGHT - 20, "");

        Group root = new Group(heading, circle, message);
        Scene scene = new Scene(root, WIDTH, HEIGHT, Color.YELLOW);

        scene.setOnMouseMoved(e -> {
            circle.setCenterX(e.getX()-50);
            circle.setCenterY(e.getY()-50);
        });

        scene.setOnMouseDragged(e -> {
            circle.setCenterX(e.getX()-50);
            circle.setCenterY(e.getY()-50);
        });

        scene.setOnMousePressed(e -> message.setText("Keep trying!!!"));

        scene.setOnMouseReleased(e -> message.setText(""));

        scene.setOnMouseEntered(e -> scene.setFill(Color.BLUE));

        scene.setOnMouseExited(e -> scene.setFill(Color.YELLOW));

        stage.setScene(scene);
        stage.setTitle("Red Circle");
        stage.show();
    }
}
