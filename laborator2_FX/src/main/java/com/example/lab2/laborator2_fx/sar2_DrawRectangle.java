package com.example.lab2.laborator2_fx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class sar2_DrawRectangle extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        final double WIDTH = 400;
        final double HEIGHT = 400;
        Rectangle rect = new Rectangle(10, 10);
        rect.setFill(Color.RED);

        VBox root = new VBox();
        root.getChildren().add(rect);
        root.setAlignment(Pos.CENTER);

        Scene scene = new Scene(root, WIDTH, HEIGHT);

        scene.setOnMousePressed(e -> {
            rect.setX(e.getX());
            rect.setY(e.getX());
        });

        scene.setOnMouseDragged(e -> {
            rect.setWidth(e.getX()-rect.getX());
            rect.setHeight(e.getY()-rect.getY());
        });

        stage.setScene(scene);
        stage.setTitle("Draw Rectangle");
        stage.show();
    }
}
