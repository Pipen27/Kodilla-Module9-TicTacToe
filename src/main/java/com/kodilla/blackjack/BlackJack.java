package com.kodilla.blackjack;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

import javafx.stage.Stage;

public class BlackJack extends Application {

    private Image imageback = new Image("file:src/main/resources/kratka-background.jpg");
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        BackgroundSize backgroundSize = new BackgroundSize(307, 307, true, true, true, false);
        BackgroundImage backgroundImage = new BackgroundImage(imageback, BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        Background background = new Background(backgroundImage);

        GridPane gridPane = new GridPane();
        gridPane.setBackground(background);



        Scene scene = new Scene(gridPane, 400, 400, Color.BLACK);


        Button button1 = new Button("CLICK");
        button1.setPrefWidth(100);
        button1.setPrefHeight(100);
        button1.setOnAction((ActionEvent e) -> {
            button1.setText("X");
        });

        Button button2 = new Button("CLICK");
        button2.setPrefWidth(100);
        button2.setPrefHeight(100);
        button2.setOnAction((ActionEvent e) -> {
            button2.setText("X");
        });

        Button button3 = new Button("CLICK");
        button3.setPrefWidth(100);
        button3.setPrefHeight(100);
        button3.setOnAction((ActionEvent e) -> {
            button3.setText("X");
        });

        Button button4 = new Button("CLICK");
        button4.setPrefWidth(100);
        button4.setPrefHeight(100);
        button4.setOnAction((ActionEvent e) -> {
            button4.setText("X");
        });

        Button button5 = new Button("CLICK");
        button5.setPrefWidth(100);
        button5.setPrefHeight(100);
        button5.setOnAction((ActionEvent e) -> {
            button5.setText("X");
        });

        Button button6 = new Button("CLICK");
        button6.setPrefWidth(100);
        button6.setPrefHeight(100);
        button6.setOnAction((ActionEvent e) -> {
            button6.setText("X");
        });

        Button button7 = new Button("CLICK");
        button7.setPrefWidth(100);
        button7.setPrefHeight(100);
        button7.setOnAction((ActionEvent e) -> {
            button7.setText("X");
        });

        Button button8 = new Button("CLICK");
        button8.setPrefWidth(100);
        button8.setPrefHeight(100);
        button8.setOnAction((ActionEvent e) -> {
            button8.setText("X");
        });

        Button button9 = new Button("CLICK");
        button9.setPrefWidth(100);
        button9.setPrefHeight(100);
        button9.setOnAction((ActionEvent e) -> {
            button9.setText("X");
        });

        GridPane root = new GridPane();

        root.addRow(1, button1, button2, button3);
        root.addRow(2, button4, button5, button6 );
        root.addRow(3, button7, button8, button9);



        Scene scene1 = new Scene(root, 300,300);




        primaryStage.setTitle("TicTacToe");
        primaryStage.setScene(scene1);
        primaryStage.show();

    }
}
