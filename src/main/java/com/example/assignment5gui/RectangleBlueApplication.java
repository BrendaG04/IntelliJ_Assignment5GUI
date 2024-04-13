package com.example.assignment5gui;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;

public class RectangleBlueApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Group root = new Group();
        stage.setTitle("Color Example");
        Rectangle rect = new Rectangle();
        rect.setX(50);
        rect.setY(20);
        rect.setWidth(200);
        rect.setHeight(250);
        rect.setEffect(new DropShadow());
        rect.setFill(Color.web("#0000FF",1));
        root.getChildren().add(rect);

        Scene scene = new Scene(root,300,400);
        stage.setScene(scene);
        stage.show();

        }

    public static void main(String[] args) {
        launch();
    }
}
