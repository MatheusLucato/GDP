package com.gdp.app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class GdpApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        String inputFileFxml = "hello-view.fxml";
        FXMLLoader fxmlLoader = new FXMLLoader(GdpApp.class.getResource("/" + GdpApp.class.getPackageName() + "/" + inputFileFxml));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}