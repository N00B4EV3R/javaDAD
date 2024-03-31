module md.ceiti.dad.example.javfx_firstexample {
    requires javafx.controls;
    requires javafx.fxml;


    opens md.ceiti.dad.example.javfx_firstexample to javafx.fxml;
    exports md.ceiti.dad.example.javfx_firstexample;
}