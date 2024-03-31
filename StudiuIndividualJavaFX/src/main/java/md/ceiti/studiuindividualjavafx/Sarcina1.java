package md.ceiti.studiuindividualjavafx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Sarcina1 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    private TextField xField, aField, bField;
    @Override
    public void start(Stage stage) {
        final double WIDTH = 765;
        final double HEIGHT = 350;
        Label xLabel = new Label("X =");
        xField = new TextField();
        HBox xRow = new HBox(5);
        xRow.setAlignment(Pos.CENTER);
        xRow.getChildren().addAll(xLabel, xField);

        Label aLabel = new Label("A =");
        aField = new TextField();
        HBox aRow = new HBox(5);
        aRow.setAlignment(Pos.CENTER);
        aRow.getChildren().addAll(aLabel, aField);

        Label bLabel = new Label("B =");
        bField = new TextField();
        HBox bRow = new HBox(5);
        bRow.setAlignment(Pos.CENTER);
        bRow.getChildren().addAll(bLabel, bField);

        VBox rows = new VBox(10);
        rows.getChildren().addAll(xRow, aRow, bRow);

        Button calcButton = new Button("Calculate");
        Button clearButton = new Button("Clear");
        Button exitButton = new Button("Exit");
        exitButton.setAlignment(Pos.CENTER_RIGHT);
        HBox buttonsRow = new HBox(5);
        buttonsRow.setAlignment(Pos.CENTER);
        buttonsRow.getChildren().addAll(calcButton, clearButton);



        VBox leftPart = new VBox(20);
        leftPart.setAlignment(Pos.CENTER_LEFT);
        leftPart.getChildren().addAll(rows, buttonsRow);

        VBox rightPart = new VBox();
        Image formula = new Image("formula.png");
        ImageView photo = new ImageView(formula);

        rightPart.getChildren().addAll(photo,exitButton);
        rightPart.setAlignment(Pos.CENTER_RIGHT);


        HBox upPart = new HBox(10);
        upPart.getChildren().addAll(leftPart, rightPart);
        upPart.setAlignment(Pos.CENTER);

        HBox bottomPart = new HBox(4);
        Label resultLabel = new Label("Result: ");
        TextField resultField = new TextField();
        bottomPart.getChildren().addAll(resultLabel, resultField);
        bottomPart.setAlignment(Pos.BOTTOM_LEFT);


        calcButton.setOnAction(e->{
            try{
                double x = Double.parseDouble(xField.getText());
                double a = Double.parseDouble(aField.getText());
                double b = Double.parseDouble(bField.getText());
                if(x>7){
                    double result = x*(a+b)*(a+b);
                    resultField.setText(result+"");
                } else{
                    if(!(a==0 &&b==0)){
                        double result = (x+4)/(a*a+b*b);
                        resultField.setText(result+"");
                    }
                    else{
                        Alert alert = new Alert(Alert.AlertType.ERROR);
                        alert.setHeaderText("Invalid data!!");
                        alert.setContentText("A sau B trebuie sa fie diferite de 0");
                        alert.showAndWait();
                        clearFields();
                    }
                }
            }
            catch (Exception ex){
                ex.printStackTrace();
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText("Invalid data!!");
                alert.setContentText("Ai introdus date invalide");
                alert.showAndWait();
                clearFields();
                resultField.setText("");
            }
        });

        clearButton.setOnAction(e->{
            clearFields();
            resultField.setText("");
        });

        exitButton.setOnAction(e->{
            System.exit(0);
        });

        VBox root = new VBox(15);
        root.getChildren().addAll(upPart, bottomPart);
        root.setAlignment(Pos.CENTER);
        Scene scene = new Scene(root, WIDTH, HEIGHT);
        scene.getStylesheets().add(getClass().getResource("/styleSar1.css").toExternalForm());
        stage.setScene(scene);
        stage.setTitle("Sarcina 1");
        stage.show();
//        765x380
    }

    public void clearFields(){
        aField.setText("");
        bField.setText("");
        xField.setText("");
    }


}
