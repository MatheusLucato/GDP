module com.gdp.gdp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.gdp.gdp to javafx.fxml;
    exports com.gdp.gdp;
}