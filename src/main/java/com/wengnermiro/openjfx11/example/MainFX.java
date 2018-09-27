package com.wengnermiro.openjfx11.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * MainFX sample javaFX example
 * <p>
 * source {@link https://openjfx.io/openjfx-docs/#gradle}
 *
 * @author Miro Wengner (@miragemiko)
 */
public class MainFX extends Application {

    @Override
    public void start(Stage stage) {
        Label l = new Label("Hello, OpenJFX 11 World!");
        Scene scene = new Scene(l, 320, 240);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
