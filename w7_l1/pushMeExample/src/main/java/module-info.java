module md.ceiti.dad.example.pushmeexample {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens md.ceiti.dad.example.pushmeexample to javafx.fxml;
    exports md.ceiti.dad.example.pushmeexample;
}