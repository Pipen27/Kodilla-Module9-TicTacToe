package com.kodilla.TicTacToe;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import java.util.List;

public class WinXChecker {

    AllButtonsDisabler disabler = new AllButtonsDisabler();

    public boolean checkWinX(List<Button> buttons, Label status1) {

        if (buttons.get(0).getText().equals("X") && buttons.get(1).getText().equals("X") && buttons.get(2).getText().equals("X")) {
            status1.setText("WYGRANA X");
            disabler.allButtonsDisable(buttons);

        } else if (buttons.get(3).getText().equals("X") && buttons.get(4).getText().equals("X") && buttons.get(5).getText().equals("X")) {
            status1.setText("WYGRANA X");
            disabler.allButtonsDisable(buttons);

        } else if (buttons.get(6).getText().equals("X") && buttons.get(7).getText().equals("X") && buttons.get(8).getText().equals("X")) {
            status1.setText("WYGRANA X");
            disabler.allButtonsDisable(buttons);

        } else if (buttons.get(0).getText().equals("X") && buttons.get(3).getText().equals("X") && buttons.get(6).getText().equals("X")) {
            status1.setText("WYGRANA X");
            disabler.allButtonsDisable(buttons);

        } else if (buttons.get(1).getText().equals("X") && buttons.get(4).getText().equals("X") && buttons.get(7).getText().equals("X")) {
            status1.setText("WYGRANA X");
            disabler.allButtonsDisable(buttons);

        } else if (buttons.get(2).getText().equals("X") && buttons.get(5).getText().equals("X") && buttons.get(8).getText().equals("X")) {
            status1.setText("WYGRANA X");
            disabler.allButtonsDisable(buttons);

        } else if (buttons.get(0).getText().equals("X") && buttons.get(4).getText().equals("X") && buttons.get(8).getText().equals("X")) {
            status1.setText("WYGRANA X");
            disabler.allButtonsDisable(buttons);

        } else if (buttons.get(2).getText().equals("X") && buttons.get(4).getText().equals("X") && buttons.get(6).getText().equals("X")) {
            status1.setText("WYGRANA X");
            disabler.allButtonsDisable(buttons);

        }
        return false;
    }
}
