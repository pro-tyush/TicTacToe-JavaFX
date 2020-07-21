package sample;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

public class Logic {

    private ButtonsGridLayout buttonsGridLayout;
    private boolean xTurnFlag;
    private Label playerTurnLabel;
    private Button restartButton;

    public Logic(ButtonsGridLayout buttonsGridLayout, Label playerTurnLabel, Button restartButton) {
        this.buttonsGridLayout = buttonsGridLayout;
        this.xTurnFlag = true;
        this.playerTurnLabel = playerTurnLabel;
        this.restartButton = restartButton;
    }
    
    /*The following methods deals with press of all 9 buttons
    keeps track of boolean xTurnFlag
    if its true let "X" Play and otherwise lets "O" play 
    also updates the xTurnFlag after every turn
    also calls checkWinner() after every button pressed*/

    public void play() {
        buttonsGridLayout.getFirstButton().setOnAction(actionEvent -> {
            if (xTurnFlag) {
                playerTurnLabel.setText("Turn: O"); //sets label for next turn
                playerTurnLabel.setTextFill(Color.GREEN); //sets label for next turn
                buttonsGridLayout.getFirstButton().setText("X"); //marks X on that button
                buttonsGridLayout.getFirstButton().setStyle("-fx-text-fill: red"); //change "X" to red
                xTurnFlag = false;
            } else {
                playerTurnLabel.setText("Turn: X");
                playerTurnLabel.setTextFill(Color.RED);
                buttonsGridLayout.getFirstButton().setText("O");
                buttonsGridLayout.getFirstButton().setStyle("-fx-text-fill: green");
                xTurnFlag = true;
            }
            buttonsGridLayout.getFirstButton().setDisable(true);
            buttonsGridLayout.getFirstButton().setOpacity(1);
            checkWinner();
        });

        buttonsGridLayout.getSecondButton().setOnAction(actionEvent -> {
            if (xTurnFlag) {
                playerTurnLabel.setText("Turn: O");
                playerTurnLabel.setTextFill(Color.GREEN);
                buttonsGridLayout.getSecondButton().setText("X");
                buttonsGridLayout.getSecondButton().setStyle("-fx-text-fill: red");
                xTurnFlag = false;
            } else {
                playerTurnLabel.setText("Turn: X");
                playerTurnLabel.setTextFill(Color.RED);
                buttonsGridLayout.getSecondButton().setText("O");
                buttonsGridLayout.getSecondButton().setStyle("-fx-text-fill: green");
                xTurnFlag = true;
            }
            buttonsGridLayout.getSecondButton().setDisable(true);
            buttonsGridLayout.getSecondButton().setOpacity(1);
            checkWinner();
        });

        buttonsGridLayout.getThirdButton().setOnAction(actionEvent -> {
            if (xTurnFlag) {
                playerTurnLabel.setText("Turn: O");
                playerTurnLabel.setTextFill(Color.GREEN);
                buttonsGridLayout.getThirdButton().setText("X");
                buttonsGridLayout.getThirdButton().setStyle("-fx-text-fill: red");
                xTurnFlag = false;
            } else {
                playerTurnLabel.setText("Turn: X");
                playerTurnLabel.setTextFill(Color.RED);
                buttonsGridLayout.getThirdButton().setText("O");
                buttonsGridLayout.getThirdButton().setStyle("-fx-text-fill: green");
                xTurnFlag = true;
            }
            buttonsGridLayout.getThirdButton().setDisable(true);
            buttonsGridLayout.getThirdButton().setOpacity(1);
            checkWinner();
        });

        buttonsGridLayout.getFourthButton().setOnAction(actionEvent -> {
            if (xTurnFlag) {
                playerTurnLabel.setText("Turn: O");
                playerTurnLabel.setTextFill(Color.GREEN);
                buttonsGridLayout.getFourthButton().setText("X");
                buttonsGridLayout.getFourthButton().setStyle("-fx-text-fill: red");
                xTurnFlag = false;
            } else {
                playerTurnLabel.setText("Turn: X");
                playerTurnLabel.setTextFill(Color.RED);
                buttonsGridLayout.getFourthButton().setText("O");
                buttonsGridLayout.getFourthButton().setStyle("-fx-text-fill: green");
                xTurnFlag = true;
            }
            buttonsGridLayout.getFourthButton().setDisable(true);
            buttonsGridLayout.getFourthButton().setOpacity(1);
            checkWinner();
        });

        buttonsGridLayout.getFifthButton().setOnAction(actionEvent -> {
            if (xTurnFlag) {
                playerTurnLabel.setText("Turn: O");
                playerTurnLabel.setTextFill(Color.GREEN);
                buttonsGridLayout.getFifthButton().setText("X");
                buttonsGridLayout.getFifthButton().setStyle("-fx-text-fill: red");
                xTurnFlag = false;
            } else {
                playerTurnLabel.setText("Turn: X");
                playerTurnLabel.setTextFill(Color.RED);
                buttonsGridLayout.getFifthButton().setText("O");
                buttonsGridLayout.getFifthButton().setStyle("-fx-text-fill: green");
                xTurnFlag = true;
            }
            buttonsGridLayout.getFifthButton().setDisable(true);
            buttonsGridLayout.getFifthButton().setOpacity(1);
            checkWinner();
        });

        buttonsGridLayout.getSixthButton().setOnAction(actionEvent -> {
            if (xTurnFlag) {
                playerTurnLabel.setText("Turn: O");
                playerTurnLabel.setTextFill(Color.GREEN);
                buttonsGridLayout.getSixthButton().setText("X");
                buttonsGridLayout.getSixthButton().setStyle("-fx-text-fill: red");
                xTurnFlag = false;
            } else {
                playerTurnLabel.setText("Turn: X");
                playerTurnLabel.setTextFill(Color.RED);
                buttonsGridLayout.getSixthButton().setText("O");
                buttonsGridLayout.getSixthButton().setStyle("-fx-text-fill: green");
                xTurnFlag = true;
            }
            buttonsGridLayout.getSixthButton().setDisable(true);
            buttonsGridLayout.getSixthButton().setOpacity(1);
            checkWinner();
        });

        buttonsGridLayout.getSeventhButton().setOnAction(actionEvent -> {
            if (xTurnFlag) {
                playerTurnLabel.setText("Turn: O");
                playerTurnLabel.setTextFill(Color.GREEN);
                buttonsGridLayout.getSeventhButton().setText("X");
                buttonsGridLayout.getSeventhButton().setStyle("-fx-text-fill: red");
                xTurnFlag = false;
            } else {
                playerTurnLabel.setText("Turn: X");
                playerTurnLabel.setTextFill(Color.RED);
                buttonsGridLayout.getSeventhButton().setText("O");
                buttonsGridLayout.getSeventhButton().setStyle("-fx-text-fill: green");
                xTurnFlag = true;
            }
            buttonsGridLayout.getSeventhButton().setDisable(true);
            buttonsGridLayout.getSeventhButton().setOpacity(1);
            checkWinner();
        });

        buttonsGridLayout.getEigthButton().setOnAction(actionEvent -> {
            if (xTurnFlag) {
                playerTurnLabel.setText("Turn: O");
                playerTurnLabel.setTextFill(Color.GREEN);
                buttonsGridLayout.getEigthButton().setText("X");
                buttonsGridLayout.getEigthButton().setStyle("-fx-text-fill: red");
                xTurnFlag = false;
            } else {
                playerTurnLabel.setText("Turn: X");
                playerTurnLabel.setTextFill(Color.RED);
                buttonsGridLayout.getEigthButton().setText("O");
                buttonsGridLayout.getEigthButton().setStyle("-fx-text-fill: green");
                xTurnFlag = true;
            }
            buttonsGridLayout.getEigthButton().setDisable(true);
            buttonsGridLayout.getEigthButton().setOpacity(1);
            checkWinner();
        });

        buttonsGridLayout.getNinthButton().setOnAction(actionEvent -> {
            if (xTurnFlag) {
                playerTurnLabel.setText("Turn: O");
                playerTurnLabel.setTextFill(Color.GREEN);
                buttonsGridLayout.getNinthButton().setText("X");
                buttonsGridLayout.getNinthButton().setStyle("-fx-text-fill: red");
                xTurnFlag = false;
            } else {
                playerTurnLabel.setText("Turn: X");
                playerTurnLabel.setTextFill(Color.RED);
                buttonsGridLayout.getNinthButton().setText("O");
                buttonsGridLayout.getNinthButton().setStyle("-fx-text-fill: green");
                xTurnFlag = true;
            }
            buttonsGridLayout.getNinthButton().setDisable(true);
            buttonsGridLayout.getNinthButton().setOpacity(1);
            checkWinner();
        });
    }

    /*The following method is called after every button press in buttonGrid
    and checks if any winning condition is met by fetching values from buttons*/
    private void checkWinner() {
        //DrawGame-
        if (!buttonsGridLayout.getFirstButton().getText().equals("") && !buttonsGridLayout.getSecondButton().getText().equals("") && !buttonsGridLayout.getThirdButton().getText().equals("") && !buttonsGridLayout.getFourthButton().getText().equals("") && !buttonsGridLayout.getFifthButton().getText().equals("") && !buttonsGridLayout.getSixthButton().getText().equals("") && !buttonsGridLayout.getSeventhButton().getText().equals("") && !buttonsGridLayout.getEigthButton().getText().equals("") && !buttonsGridLayout.getNinthButton().getText().equals("")) {
            drawGame();
        }

        //Horizontal-
        if ((buttonsGridLayout.getFirstButton().getText() + buttonsGridLayout.getSecondButton().getText() + buttonsGridLayout.getThirdButton().getText()).equals("OOO")) {
            OWins();
        }
        if ((buttonsGridLayout.getFourthButton().getText() + buttonsGridLayout.getFifthButton().getText() + buttonsGridLayout.getSixthButton().getText()).equals("OOO")) {
            OWins();
        }
        if ((buttonsGridLayout.getSeventhButton().getText() + buttonsGridLayout.getEigthButton().getText() + buttonsGridLayout.getNinthButton().getText()).equals("OOO")) {
            OWins();
        }

        if ((buttonsGridLayout.getFirstButton().getText() + buttonsGridLayout.getSecondButton().getText() + buttonsGridLayout.getThirdButton().getText()).equals("XXX")) {
            XWins();
        }
        if ((buttonsGridLayout.getFourthButton().getText() + buttonsGridLayout.getFifthButton().getText() + buttonsGridLayout.getSixthButton().getText()).equals("XXX")) {
            XWins();
        }
        if ((buttonsGridLayout.getSeventhButton().getText() + buttonsGridLayout.getEigthButton().getText() + buttonsGridLayout.getNinthButton().getText()).equals("XXX")) {
            XWins();
        }

        //Vertical-
        if ((buttonsGridLayout.getFirstButton().getText() + buttonsGridLayout.getFourthButton().getText() + buttonsGridLayout.getSeventhButton().getText()).equals("OOO")) {
            OWins();
        }
        if ((buttonsGridLayout.getSecondButton().getText() + buttonsGridLayout.getFifthButton().getText() + buttonsGridLayout.getEigthButton().getText()).equals("OOO")) {
            OWins();
        }
        if ((buttonsGridLayout.getThirdButton().getText() + buttonsGridLayout.getSixthButton().getText() + buttonsGridLayout.getNinthButton().getText()).equals("OOO")) {
            OWins();
        }

        if ((buttonsGridLayout.getFirstButton().getText() + buttonsGridLayout.getFourthButton().getText() + buttonsGridLayout.getSeventhButton().getText()).equals("XXX")) {
            XWins();
        }
        if ((buttonsGridLayout.getSecondButton().getText() + buttonsGridLayout.getFifthButton().getText() + buttonsGridLayout.getEigthButton().getText()).equals("XXX")) {
            XWins();
        }
        if ((buttonsGridLayout.getThirdButton().getText() + buttonsGridLayout.getSixthButton().getText() + buttonsGridLayout.getNinthButton().getText()).equals("XXX")) {
            XWins();
        }

        //Right Diagonal-
        if ((buttonsGridLayout.getFirstButton().getText() + buttonsGridLayout.getFifthButton().getText() + buttonsGridLayout.getNinthButton().getText()).equals("OOO")) {
            OWins();
        }
        if ((buttonsGridLayout.getFirstButton().getText() + buttonsGridLayout.getFifthButton().getText() + buttonsGridLayout.getNinthButton().getText()).equals("XXX")) {
            XWins();
        }

        //Left Diagonal-
        if ((buttonsGridLayout.getThirdButton().getText() + buttonsGridLayout.getFifthButton().getText() + buttonsGridLayout.getSeventhButton().getText()).equals("OOO")) {
            OWins();
        }
        if ((buttonsGridLayout.getThirdButton().getText() + buttonsGridLayout.getFifthButton().getText() + buttonsGridLayout.getSeventhButton().getText()).equals("XXX")) {
            XWins();
        }

    }

    /*Following 3 functions
    declare the winner name and
    sets restart button to visible
    and calls endgame()*/
    private void OWins() {
        playerTurnLabel.setText("O Wins");
        playerTurnLabel.setTextFill(Color.web("green"));
        endGame();
        restartButton.setVisible(true);
    }
    private void XWins() {
        playerTurnLabel.setText("X Wins");
        playerTurnLabel.setTextFill(Color.RED);
        endGame();
        restartButton.setVisible(true);
    }
    private void drawGame() {
        playerTurnLabel.setText("Draw");
        playerTurnLabel.setTextFill(Color.BLACK);
        endGame();
        restartButton.setVisible(true);
    }

    /*sets layout in such a way that
    it appears game has ended
    by disabling buttons snd reducing opacity until restart button is pressed*/
    private void endGame() {
        this.xTurnFlag = true;
        buttonsGridLayout.getFirstButton().setDisable(true);
        buttonsGridLayout.getFirstButton().setOpacity(0.5);
        buttonsGridLayout.getSecondButton().setDisable(true);
        buttonsGridLayout.getSecondButton().setOpacity(0.5);
        buttonsGridLayout.getThirdButton().setDisable(true);
        buttonsGridLayout.getThirdButton().setOpacity(0.5);
        buttonsGridLayout.getFourthButton().setDisable(true);
        buttonsGridLayout.getFourthButton().setOpacity(0.5);
        buttonsGridLayout.getFifthButton().setDisable(true);
        buttonsGridLayout.getFifthButton().setOpacity(0.5);
        buttonsGridLayout.getSixthButton().setDisable(true);
        buttonsGridLayout.getSixthButton().setOpacity(0.5);
        buttonsGridLayout.getSeventhButton().setDisable(true);
        buttonsGridLayout.getSeventhButton().setOpacity(0.5);
        buttonsGridLayout.getEigthButton().setDisable(true);
        buttonsGridLayout.getEigthButton().setOpacity(0.5);
        buttonsGridLayout.getNinthButton().setDisable(true);
        buttonsGridLayout.getNinthButton().setOpacity(0.5);
    }

}
