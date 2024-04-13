module com.example.assignment5gui {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires com.almasb.fxgl.all;

    opens com.example.assignment5gui to javafx.fxml;
    exports com.example.assignment5gui;
}