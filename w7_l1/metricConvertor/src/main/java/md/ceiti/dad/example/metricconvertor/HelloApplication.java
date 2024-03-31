package md.ceiti.dad.example.metricconvertor;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.jar.JarEntry;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //cmToInch
        TextField cmText = new TextField();
        Label cmLabel = new Label("cm");
        TextField inchText = new TextField();
        Label inchLabel = new Label("inches");

        Button cmToInchButton = new Button(" ===> ");
        Button inchToCmButton = new Button(" <=== ");

        VBox inchCmButton = new VBox();
        inchCmButton.getChildren().addAll(cmToInchButton, inchCmButton);

        HBox inchCmPanel = new HBox(10);
        inchCmPanel.getChildren().addAll(cmText, cmLabel, inchCmButton, inchText, inchLabel);

        //kmToMile
        TextField kmText = new TextField();
        Label kmLabel = new Label("cm");
        TextField mileText = new TextField();
        Label mileLabel = new Label("inches");

        Button kmToMileButton = new Button(" ===> ");
        Button mileToKmButton = new Button(" <=== ");

        VBox kmMileButton = new VBox();
        kmMileButton.getChildren().addAll(kmToMileButton, mileToKmButton);

        HBox kmMilePanel = new HBox(10);
        kmMilePanel.getChildren().addAll(kmText, kmLabel, kmMilePanel, mileText, mileLabel);

        //kgToPounds
        extField cmText = new TextField();
        Label cmLabel = new Label("cm");
        TextField inchText = new TextField();
        Label inchLabel = new Label("inches");

        Button cmToInchButton = new Button(" ===> ");
        Button inchToCmButton = new Button(" <=== ");

        VBox inchCmButton = new VBox();
        inchCmButton.getChildren().addAll(cmToInchButton, inchCmButton);

        HBox inchCmPanel = new HBox(10);
        inchCmPanel.getChildren().addAll(cmText, cmLabel, inchCmButton, inchText, inchLabel);

        extField cmText = new TextField();
        Label cmLabel = new Label("cm");
        TextField inchText = new TextField();
        Label inchLabel = new Label("inches");

        Button cmToInchButton = new Button(" ===> ");
        Button inchToCmButton = new Button(" <=== ");

        VBox inchCmButton = new VBox();
        inchCmButton.getChildren().addAll(cmToInchButton, inchCmButton);

        HBox inchCmPanel = new HBox(10);
        inchCmPanel.getChildren().addAll(cmText, cmLabel, inchCmButton, inchText, inchLabel);


    }

    public static void main(String[] args) {
        launch();
    }
}