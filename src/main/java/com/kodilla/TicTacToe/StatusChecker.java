package com.kodilla.TicTacToe;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import java.util.List;

public class StatusChecker {

    AllButtonsDisabler buttonsDisabler = new AllButtonsDisabler();

    public void checkStatus (List<Button> buttons, Label status1, Label status2, Label status3, Label status4){
        if (status1.getText().equals("WYGRANA X") || status2.getText().equals("WYGRANA O") || status3.getText().equals("REMIS")){

            buttonsDisabler.allButtonsDisable(buttons);
            status4.setMaxWidth(100);
            status4.setWrapText(true);
            status4.setText("END of the game or NO MORE moves");
        }
    }
}
