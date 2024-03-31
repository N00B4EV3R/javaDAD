package com.example.lab2.laborator2_fx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class sar1_PropertyExample extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        TextField top = new TextField();
        TextField middle = new TextField();
        TextField bottom = new TextField();
        top.setMaxWidth(420);
        middle.setMaxWidth(420);
        bottom.setMaxWidth(420);

        top.textProperty().bind(middle.textProperty());
        bottom.textProperty().bind(middle.textProperty());

        VBox root = new VBox(10);
        root.getChildren().addAll(top, middle, bottom);
        root.setAlignment(Pos.CENTER);
        Scene scene = new Scene(root, 480, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Property Example");
        primaryStage.show();
    }
}
