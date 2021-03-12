package com.kodilla.TicTacToe;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.List;

public class ButtonsCreator extends Button {

    Button button;
    NewGameButton newGameButton = new NewGameButton();
    ExitGameButton exitGameButton = new ExitGameButton();

    public void createButtons (List<Button> buttons) {

        for (int i = 0; i < 9; i++) {
            buttons.add(button = new Button(String.valueOf(i + 1)));
            button.setPrefWidth(100);
            button.setPrefHeight(100);
            button.setText("CLICK");
        }
    }

    public Button createNewGameButton() {

       return new Button("NEW GAME");
    }

    public Button createExitGameButton(){

        return new Button("EXIT GAME");

    }

    public void setNewGameButton (Button newGameBtn, List<Button> buttons, Label status1, Label status2, Label status3, Label status4) {

        newGameBtn.setOnAction((ActionEvent a) -> newGameButton.newGame(buttons, status1, status2, status3, status4));
    }

    public void setExitGameButton (Button exitGameBtn) {

        exitGameBtn.setOnAction((ActionEvent a) -> exitGameButton.exitGame());
    }
}
