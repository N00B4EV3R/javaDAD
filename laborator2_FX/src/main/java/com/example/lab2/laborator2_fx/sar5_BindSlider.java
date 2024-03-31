package com.example.lab2.laborator2_fx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class sar5_BindSlider extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        final double horiSliderWidth = 300;
        final double vertSliderHeight = 300;

        DecimalFormatSymbols dfs = new DecimalFormatSymbols(Locale.CANADA);
        dfs.setDecimalSeparator('.');
        DecimalFormat df = new DecimalFormat("#0.0", dfs);

        Slider verticalSlider = new Slider(0, 255, 0);
        verticalSlider.setMinHeight(vertSliderHeight);
        verticalSlider.setShowTickLabels(true);
        verticalSlider.setShowTickMarks(true);
        verticalSlider.setSnapToTicks(true);
        verticalSlider.setMajorTickUnit(30);
        verticalSlider.setMinorTickCount(10);
        verticalSlider.setOrientation(Orientation.VERTICAL);

        Slider horizontalSlider = new Slider(0, 300, 0);
        horizontalSlider.setMinWidth(horiSliderWidth);
        horizontalSlider.setShowTickLabels(true);
        horizontalSlider.setShowTickMarks(true);
        horizontalSlider.setSnapToTicks(true);
        horizontalSlider.setMajorTickUnit(30);
        horizontalSlider.setMinorTickCount(10);
        horizontalSlider.setOrientation(Orientation.HORIZONTAL);

        Rectangle rect = new Rectangle(0,0);
        rect.setFill(Color.BLUE);

        Label horizLabel = new Label("Current value is 0.0");
        Label vertLabel = new Label("Current value is 0.0");

        verticalSlider.valueProperty().addListener((observable, newValue, oldValue) -> {
            vertLabel.setText("Current value is "+df.format(newValue));
            rect.setHeight((Double) newValue);
        });

        horizontalSlider.valueProperty().addListener((observable, newValue, oldValue) -> {
            horizLabel.setText("Current value is "+df.format(newValue));
            rect.setWidth((Double) newValue);
        });

        verticalSlider.valueProperty().bindBidirectional(horizontalSlider.valueProperty());

        VBox vertBox = new VBox(10);
        vertBox.setAlignment(Pos.BOTTOM_LEFT);
        vertBox.setMinWidth(horiSliderWidth/3);
        vertBox.getChildren().addAll(verticalSlider, vertLabel);

        VBox horiBox = new VBox(10);
        horiBox.setAlignment(Pos.BOTTOM_LEFT);
        horiBox.getChildren().addAll(rect, horizontalSlider, horizLabel);

        HBox root = new HBox(30);
        root.setPadding(new Insets(10,10,10,10));
        root.getChildren().addAll(horiBox, vertBox);

        Scene scene = new Scene(root, 480, 350);
        stage.setTitle("Slider Example");
        stage.setScene(scene);
        stage.show();
    }
}
