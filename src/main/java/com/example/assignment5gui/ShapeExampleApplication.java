package com.example.assignment5gui;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;
import javafx.scene.shape.CubicCurve;
import javafx.stage.Stage;

import java.io.IOException;

public class ShapeExampleApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Group root = new Group();
        stage.setTitle("Cubic Curve Example");
        CubicCurve c = new CubicCurve();
        c.setStartX(20);
        c.setStartY(100);
        c.setControlX1(300);
        c.setControlX2(200);
        c.setControlY1(100);
        c.setControlY2(90);
        c.setFill(Color.RED);
        c.setEffect(new DropShadow());
        c.setEndX(100);
        c.setEndY(300);
        root.getChildren().add(c);
        Scene scene = new Scene(root,300,400);
        stage.setScene(scene);
        stage.show();
        }

    public static void main(String[] args) {
        launch();
    }
}
