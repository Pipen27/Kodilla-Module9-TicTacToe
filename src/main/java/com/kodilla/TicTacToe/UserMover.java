package com.kodilla.TicTacToe;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import java.util.List;

public class UserMover {

    WinXChecker winXChecker = new WinXChecker();
    WinOChecker winOChecker = new WinOChecker();
    TieChecker tieChecker = new TieChecker();
    StatusChecker statusChecker = new StatusChecker();
    ComputerMover computerMover = new ComputerMover();

    public void userMove(List<Button> buttons, Label status1, Label status2, Label status3, Label status4) {

        for (Button userClick : buttons) {

            userClick.setOnAction((ActionEvent e) -> {

                userClick.setText("X");
                winXChecker.checkWinX(buttons, status1);
                userClick.setDisable(true);
                statusChecker.checkStatus(buttons, status1, status2, status3, status4);
                tieChecker.checkTie(buttons, status1, status2, status3);
                computerMover.computerMove(buttons, status1, status4);
                winOChecker.checkWinO(buttons, status2);
                statusChecker.checkStatus(buttons, status1, status2, status3, status4);
            });
        }
    }
}



