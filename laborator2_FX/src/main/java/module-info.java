module com.example.lab2.laborator2_fx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lab2.laborator2_fx to javafx.fxml;
    exports com.example.lab2.laborator2_fx;
    exports com.example.lab2.laborator2_fx.hello;
    opens com.example.lab2.laborator2_fx.hello to javafx.fxml;
}