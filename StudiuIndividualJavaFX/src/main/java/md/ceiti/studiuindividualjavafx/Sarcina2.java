package md.ceiti.studiuindividualjavafx;

import javafx.application.Application;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Sarcina2 extends Application {

    private ArrayList<TextField> textFields = new ArrayList<>();
    private VBox textFieldContainer = new VBox();

    @Override
    public void start(Stage stage) {
        HBox root = new HBox(30);
        root.setPadding(new Insets(10));

        root.setAlignment(Pos.CENTER);


        TextArea textArea = new TextArea();
        textArea.setPrefWidth(450);
        textArea.setText("A fost odata un mos si o baba, fiecare avand cate o fata. Fata babei era urata, lenesa, certareata si rautacioasa, dar se alinta si lasa tot greul pe fata mosneagului, care era frumoasa, harnica, ascultatoare si buna la inima. Baba si fata ei o oropseau rau pe fata mosneagului, de aceea aceasta a hotarat sa plece de acasa.\n");
        textArea.setWrapText(true);
        root.getChildren().add(textArea);


        VBox rightBox = new VBox();
        rightBox.setSpacing(10);

        for (int i = 0; i < 5; i++) {
            addTextField();
        }

        textFieldContainer.setPrefWidth(220);

        ScrollPane scrollPane = new ScrollPane(textFieldContainer);
        scrollPane.setFitToWidth(true);
        scrollPane.setFitToHeight(true);

        rightBox.getChildren().add(scrollPane);

        Button addButton = new Button("Adauga un nou rand");
        addButton.setOnAction(e -> addTextField());

        Button removeButton = new Button("Sterge ultimul rand");
        removeButton.setOnAction(e -> {
            if (!textFields.isEmpty()) {
                textFieldContainer.getChildren().remove(textFields.remove(textFields.size() - 1));
            }
        });

        Button convertButton = new Button("Modifica textul");
        convertButton.setOnAction(e->{
            textArea.setText(editText(textArea.getText()));
        });

        rightBox.getChildren().addAll(convertButton,addButton,removeButton);


        root.getChildren().add(rightBox);

        Scene scene = new Scene(root, 700, 300);
        stage.setScene(scene);
        stage.setTitle("Sarcina 2");
        stage.show();
    }

    private void addTextField() {
        TextField textField = new TextField();
        textField.setPromptText("Introdu cuvantul pentru dolarul "+(textFields.size()+1));
        textFields.add(textField);
        textFieldContainer.getChildren().add(textField);
    }

    private String editText(String text){
        String originText = text;
        int count = text.split("\\$\\w+", -1).length - 1;
        if(count==0){
            Alert alert = new Alert(Alert.AlertType.WARNING);
//            alert.setHeaderText("Eroare!");
            alert.setContentText("Pentru a efectua unele schimbari pune simbolul '$' in fata unui cuvant");
            alert.showAndWait();
            return text;
        }
        for(int i=0;i<count;i++){
            if(textFields.get(i).getText().equals("")){
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText("Eroare!");
                alert.setContentText("Textul de la randul "+(i+1)+" este nul");
                alert.showAndWait();
                return originText;
            }
            else text = text.replaceFirst("\\$\\w+",textFields.get(i).getText());
        }
        for(TextField i: textFields)
            i.setText(null);
        return text;
    }


    public static void main(String[] args) {
        launch(args);
    }
}
