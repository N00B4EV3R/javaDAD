module md.ceiti.dad.example.metricconvertor {
    requires javafx.controls;
    requires javafx.fxml;


    opens md.ceiti.dad.example.metricconvertor to javafx.fxml;
    exports md.ceiti.dad.example.metricconvertor;
}