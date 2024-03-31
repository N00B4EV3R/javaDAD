package md.ceiti.dad.example.pushMeExample;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Circle face = new Circle(125, 125, 80);
        face.setFill(Color.YELLOW);
        face.setStroke(Color.RED);

        Circle rightEye = new Circle(86, 100, 10);
        rightEye.setFill(Color.YELLOW);
        rightEye.setStroke(Color.BLUE);

        Circle leftEye = new Circle(162, 100, 10);
        leftEye.setFill(Color.YELLOW);
        leftEye.setStroke(Color.BLUE);

        Arc mouth = new Arc(125, 150, 45, 35, 0, -180);
        mouth.setFill(Color.YELLOW);
        mouth.setStroke(Color.BLUE);
        mouth.setType(ArcType.OPEN);


        String s = "Changing Face";
        Text caption = new Text(45, 240, s);
        caption.setFill(Color.BLUE);
        caption.setFont(Font.font("Verdana", 15));

        Group group = new Group(face, rightEye, leftEye, mouth, caption);
//        Scene scene1 = new Scene(group, 250, 275, Color.YELLOW);

        Button smileButton = new Button("Smile");
        Button frownButton = new Button("Frown");

        HBox buttonBox = new HBox(10);
        buttonBox.setAlignment(Pos.CENTER);

        buttonBox.getChildren().addAll(smileButton, frownButton);

        VBox root = new VBox(10);
        root.setBackground(Background.EMPTY);
        root.setAlignment(Pos.CENTER);

        root.getChildren().addAll(buttonBox, group);

        Scene scene = new Scene(root, 250, 275, Color.YELLOW);

        smileButton.setOnAction(e -> {
            mouth.setLength(-180);
            caption.setText("Ruslan n-a scapat trolicu");
        });

        frownButton.setOnAction(e -> {
            mouth.setLength(180);
            caption.setText("Ruslan a luat 4 la testare");
        });

        stage.setScene(scene);
        stage.setTitle(s);

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
