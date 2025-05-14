/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.github.aryantue.javafxgithubtest;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.*; // import for all layout types
import javafx.stage.Stage;

/**
 *
 * @author Aryan Shinde
 */

/**
 * Creating the start screen.   
 * The constructor will be used to execute this screen.
 */
public class Start {
    private Scene startScreen; 
    private Stage stage;
    
    public Start(Stage stage) {
        this.stage = stage;
        initialize();
    }
    
    private void initialize() {
        // creating title label
        Label title = new Label("YourCalc App");
        title.setFont(Fonts.getTitleFont());
        title.setStyle("-fx-text-fill: white;");
        
        // creating Pane layout for absolute positioning of components
        StackPane root = new StackPane();
        root.getChildren().add(title);
        root.setStyle("-fx-background-color: black;");
        
        title.setTranslateY(-150);
        
        startScreen = new Scene(root, 450, 800);
    }
    
    public Scene getStartScreen() {
        return startScreen;
    }
}
