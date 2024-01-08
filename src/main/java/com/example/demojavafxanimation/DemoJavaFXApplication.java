package com.example.demojavafxanimation;

import javafx.animation.ScaleTransition;
import javafx.animation.Transition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;

public class DemoJavaFXApplication extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws IOException {
        String javaVersion = System.getProperty("java.version");
        String javafxVersion = System.getProperty("javafx.version");

        Label lblHello = new Label("Hello World");
        ScaleTransition st = new ScaleTransition(Duration.seconds(1));
        st.setAutoReverse(true);
        st.setCycleCount(Transition.INDEFINITE);
        st.setByX(2);
        st.setByY(2);
        st.setNode(lblHello);

        Label lblInfo = new Label("Hello, JavaFX %s, running on Java %s".formatted(javafxVersion, javaVersion));

        BorderPane bp = new BorderPane(lblHello);
        bp.setTop(lblInfo);
        stage.setScene(new Scene(bp, 300, 200));
        stage.show();
        st.play();
    }

}