package com.kodilla.TicTacToe;

import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.layout.*;

import javafx.stage.Stage;
import javafx.application.Application;

import javax.print.DocFlavor;
import javax.swing.*;
import javax.swing.plaf.basic.BasicOptionPaneUI;
import java.util.Random;
import java.util.Vector;


public class TicTacToe extends Application {
    private Label status = new Label();

    public static void main(String[] args) {
        launch(args);
    }



    @Override
    public void start(Stage primaryStage) throws Exception {


        Button button1 = new Button("CLICK");
        button1.setPrefWidth(100);
        button1.setPrefHeight(100);
        button1.setOnAction((ActionEvent e) -> {
            button1.setText("X");
            button1.setDisable(true);
            draw0();
        });

        Button button2 = new Button("CLICK");
        button2.setPrefWidth(100);
        button2.setPrefHeight(100);
        button2.setOnAction((ActionEvent e) -> {
            button2.setText("X");
            button2.setDisable(true);
            draw0();
        });

        Button button3 = new Button("CLICK");
        button3.setPrefWidth(100);
        button3.setPrefHeight(100);
        button3.setOnAction((ActionEvent e) -> {
            button3.setText("X");
            button3.setDisable(true);
            draw0();
        });

        Button button4 = new Button("CLICK");
        button4.setPrefWidth(100);
        button4.setPrefHeight(100);
        button4.setOnAction((ActionEvent e) -> {
            button4.setText("X");
            button4.setDisable(true);
            draw0();
        });

        Button button5 = new Button("CLICK");
        button5.setPrefWidth(100);
        button5.setPrefHeight(100);
        button5.setOnAction((ActionEvent e) -> {
            button5.setText("X");
            button5.setDisable(true);
            draw0();
        });

        Button button6 = new Button("CLICK");
        button6.setPrefWidth(100);
        button6.setPrefHeight(100);
        button6.setOnAction((ActionEvent e) -> {
            button6.setText("X");
            button6.setDisable(true);
            draw0();
        });

        Button button7 = new Button("CLICK");
        button7.setPrefWidth(100);
        button7.setPrefHeight(100);
        button7.setOnAction((ActionEvent e) -> {
            button7.setText("X");
            button7.setDisable(true);
            draw0();
        });

        Button button8 = new Button("CLICK");
        button8.setPrefWidth(100);
        button8.setPrefHeight(100);
        button8.setOnAction((ActionEvent e) -> {
            button8.setText("X");
            button8.setDisable(true);
            draw0();
        });

        Button button9 = new Button("CLICK");
        button9.setPrefWidth(100);
        button9.setPrefHeight(100);
        button9.setOnAction((ActionEvent e) -> {
            button9.setText("X");
            button9.setDisable(true);
            draw0();
        }
        );


        public void drawO(){

            Random a = new Random();
            int n = a.nextInt(9);
            n+=1;

            if (!button1.isDisabled() || !button2.isDisabled() || !button3.isDisabled()
                    || !button4.isDisabled() || !button5.isDisabled() || !button6.isDisabled()
                    || !button7.isDisabled() || !button8.isDisabled() || !button9.isDisabled()){
                button+n.setText("O");
            }
        }

        public boolean checkForWin(){

            if (button1.getText().equals(button2.getText()) && button2.getText().equals(button3.getText())  ){
                return true;
            } else if(button4.getText().equals(button5.getText()) && button5.getText().equals(button6.getText())){
                return true;
            }else if(button7.getText().equals(button8.getText()) && button8.getText().equals(button9.getText())){
                return true;
            }else if(button1.getText().equals(button4.getText()) && button4.getText().equals(button7.getText())){
                return true;
            }else if(button2.getText().equals(button5.getText()) && button5.getText().equals(button8.getText())){
                return true;
            }else if(button3.getText().equals(button6.getText()) && button6.getText().equals(button9.getText())){
                return true;
            }else if(button1.getText().equals(button5.getText()) && button5.getText().equals(button9.getText())){
                return true;
            }else if(button3.getText().equals(button5.getText()) && button5.getText().equals(button7.getText())){
                return true;
            }else{
                return false;
            }
        }

        if(checkForWin == true){
            status.setText("Wygrałeś. Koniec gry.");
        }



        GridPane root = new GridPane();

        root.addRow(1, button1, button2, button3);
        root.addRow(2, button4, button5, button6);
        root.addRow(3, button7, button8, button9);
        root.addColumn(1, button1, button4, button7);
        root.addColumn(2, button2, button5, button8);
        root.addColumn(3, button3, button6, button9);


        Scene scene1 = new Scene(root, 300, 300);


        primaryStage.setTitle("TicTacToe");
        primaryStage.setScene(scene1);
        primaryStage.show();

    }
}


