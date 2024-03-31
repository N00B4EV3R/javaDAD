package com.example.lab2.laborator2_fx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class sar6_RegistrationCSS extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        HBox row1 = new HBox();
        HBox row2 = new HBox();
        HBox row3 = new HBox();
        Label nameLabel = new Label("Name");
        TextField nameField = new TextField();
        Label addressLabel = new Label("Address");
        TextField addressField = new TextField();
        Button backButton = new Button("Back");
        Button saveAndContinueButton = new Button("Save and continue");
        Button saveAndQuitButton = new Button("Save and quit");
        Button quitButton = new Button("Quit");
        Button nextButton = new Button("Next");
        row1.getChildren().addAll(nameLabel, nameField);
        row2.getChildren().addAll(addressLabel, addressField);
        row3.getChildren().addAll(backButton, saveAndContinueButton, saveAndQuitButton, quitButton, nextButton);
        VBox root = new VBox();
        root.getChildren().addAll(row1, row2, row3);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Registration Form");

        scene.getStylesheets().add(getClass().getResource("/css/style.css").toExternalForm());
        backButton.getStyleClass().add("button1");
        nextButton.getStyleClass().add("button1");
        saveAndContinueButton.getStyleClass().add("saveCon");
        saveAndQuitButton.setId("saveQuit");
        row3.setId("row3");
        quitButton.setId("quit");
        primaryStage.show();
    }
}
