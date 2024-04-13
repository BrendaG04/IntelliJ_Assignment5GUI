package com.example.assignment5gui;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import java.io.IOException;

public class LineExampleApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Line line = new Line();
        line.setStartX(0); //setting starting X point of Line
        line.setStartY(0); //setting starting Y point of Line
        line.setEndX(100); //setting ending X point of Line
        line.setEndY(200); //setting ending Y point of Line
        Group root = new Group();
        root.getChildren().add(line); //adding the class object to the group
        Scene scene = new Scene(root,300,300);
        stage.setScene(scene);
        stage.setTitle("Line Example");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}