package com.example.assignment5gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloWorldApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Label label1=new Label();
        Label label2=new Label();
        label1.setText("Hello");
        label2.setText(" World");

        HBox root= new HBox();
        root.getChildren().add(label1);
        root.getChildren().add(label2);

        Scene scene = new Scene(root, 320, 240);
        stage.setTitle("JavaFX! Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}