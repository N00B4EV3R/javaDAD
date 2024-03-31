module md.ceiti.dad.example.changebg {
    requires javafx.controls;
    requires javafx.fxml;


    opens md.ceiti.dad.example.changebg to javafx.fxml;
    exports md.ceiti.dad.example.changebg;
}