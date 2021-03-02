package com.kodilla.TicTacToe;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;

import java.util.ArrayList;
import java.util.List;

public class UserMover {

    public void userMove(List<Button> buttons) {

        List<Button> userMoves = new ArrayList<>();
        for (Button userClick : buttons) {
             userClick.setOnAction((ActionEvent e) -> {
                userClick.setText("X");

                userClick.setDisable(true);
            });
               userMoves.add(userClick);
                }


        }


    }

