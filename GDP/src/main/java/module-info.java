module com.gdp.app {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.gdp.app to javafx.fxml;
    exports com.gdp.app;
}