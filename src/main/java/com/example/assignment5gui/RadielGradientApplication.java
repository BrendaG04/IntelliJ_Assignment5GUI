package com.example.assignment5gui;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.RadialGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.io.IOException;

public class RadielGradientApplication extends Application {
    @Override
    public void start(final Stage stage) throws IOException {
            stage.setTitle("Radial Gradient Example");
            Group root = new Group();
            Scene scene = new Scene(root, 400, 300, Color.WHITE);
            stage.setScene(scene);
            addRectangle(scene);
            stage.show();
        }
        private void addRectangle(final Scene scene) {
            Circle C = new Circle(200,150,100);
            RadialGradient gradient1 = new RadialGradient(0,
                    .1,
                    100,
                    100,
                    200,
                    false,
                    CycleMethod.NO_CYCLE,
                    new Stop(0, Color.YELLOW),
                    new Stop(1, Color.RED));
            C.setFill(gradient1);
            final Group root = (Group) scene.getRoot();
            root.getChildren().add(C);
        }
    public static void main(String[] args) {
        launch();
    }
}