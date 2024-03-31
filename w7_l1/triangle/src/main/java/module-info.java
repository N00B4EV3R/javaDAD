module md.ceiti.dad.example.triangle {
    requires javafx.controls;
    requires javafx.fxml;


    opens md.ceiti.dad.example.triangle to javafx.fxml;
    exports md.ceiti.dad.example.triangle;
}