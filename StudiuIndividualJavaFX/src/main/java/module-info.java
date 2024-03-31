module md.ceiti.studiuindividualjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens md.ceiti.studiuindividualjavafx to javafx.fxml;
    exports md.ceiti.studiuindividualjavafx;
}
