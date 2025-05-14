package com.github.aryantue.javafxgithubtest;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        Start startScreen = new Start(stage);
        Scene startScene = startScreen.getStartScreen();
        
        stage.setScene(startScene); 
        stage.setTitle("YourCalc App");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}