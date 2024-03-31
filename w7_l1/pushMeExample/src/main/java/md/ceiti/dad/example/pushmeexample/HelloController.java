package md.ceiti.dad.example.pushmeexample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("You entered: "+textField.getText());
        welcomeText.setFont(Font.font("Verdana", FontWeight.BOLD, 16));
        welcomeText.setTextFill(Color.RED);
    }

    @FXML
    private TextField textField;

}