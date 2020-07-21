package sample;

import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;

public class ButtonsGridLayout {
    private Button firstButton;
    private Button secondButton;
    private Button thirdButton;
    private Button fourthButton;
    private Button fifthButton;
    private Button sixthButton;
    private Button seventhButton;
    private Button eigthButton;
    private Button ninthButton;

    public ButtonsGridLayout() {
        this.firstButton = new Button();
        this.secondButton = new Button();
        this.thirdButton = new Button();
        this.fourthButton = new Button();
        this.fifthButton = new Button();
        this.sixthButton = new Button();
        this.seventhButton = new Button();
        this.eigthButton = new Button();
        this.ninthButton = new Button();
    }

    public Parent getLayout() {
        GridPane buttonsGridPane = new GridPane();

        firstButton.setPrefSize(100, 100);
        firstButton.setFont(new Font("Calibri", 50));
        firstButton.setStyle("-fx-focus-color: transparent; -fx-faint-focus-color: transparent;");

        secondButton.setPrefSize(100, 100);
        secondButton.setFont(new Font("Calibri", 50));
        secondButton.setStyle("-fx-focus-color: transparent; -fx-faint-focus-color: transparent;");

        thirdButton.setPrefSize(100, 100);
        thirdButton.setFont(new Font("Calibri", 50));
        thirdButton.setStyle("-fx-focus-color: transparent; -fx-faint-focus-color: transparent;");

        fourthButton.setPrefSize(100, 100);
        fourthButton.setFont(new Font("Calibri", 50));
        fourthButton.setStyle("-fx-focus-color: transparent; -fx-faint-focus-color: transparent;");

        fifthButton.setPrefSize(100, 100);
        fifthButton.setFont(new Font("Calibri", 50));
        fifthButton.setStyle("-fx-focus-color: transparent; -fx-faint-focus-color: transparent;");

        sixthButton.setPrefSize(100, 100);
        sixthButton.setFont(new Font("Calibri", 50));
        sixthButton.setStyle("-fx-focus-color: transparent; -fx-faint-focus-color: transparent;");

        seventhButton.setPrefSize(100, 100);
        seventhButton.setFont(new Font("Calibri", 50));
        seventhButton.setStyle("-fx-focus-color: transparent; -fx-faint-focus-color: transparent;");

        eigthButton.setPrefSize(100, 100);
        eigthButton.setFont(new Font("Calibri", 50));
        eigthButton.setStyle("-fx-focus-color: transparent; -fx-faint-focus-color: transparent;-fx-faint-focus-color: transparent;");

        ninthButton.setPrefSize(100, 100);
        ninthButton.setFont(new Font("Calibri", 50));
        ninthButton.setStyle("-fx-focus-color: transparent; -fx-faint-focus-color: transparent;");

        buttonsGridPane.add(firstButton, 0, 0);
        buttonsGridPane.add(secondButton, 1, 0);
        buttonsGridPane.add(thirdButton, 2, 0);
        buttonsGridPane.add(fourthButton, 0, 1);
        buttonsGridPane.add(fifthButton, 1, 1);
        buttonsGridPane.add(sixthButton, 2, 1);
        buttonsGridPane.add(seventhButton, 0, 2);
        buttonsGridPane.add(eigthButton, 1, 2);
        buttonsGridPane.add(ninthButton, 2, 2);
        buttonsGridPane.setAlignment(Pos.CENTER);

        return buttonsGridPane;
    }

    public Button getFirstButton() {
        return firstButton;
    }

    public Button getSecondButton() {
        return secondButton;
    }

    public Button getThirdButton() {
        return thirdButton;
    }

    public Button getFourthButton() {
        return fourthButton;
    }

    public Button getFifthButton() {
        return fifthButton;
    }

    public Button getSixthButton() {
        return sixthButton;
    }

    public Button getSeventhButton() {
        return seventhButton;
    }

    public Button getEigthButton() {
        return eigthButton;
    }

    public Button getNinthButton() {
        return ninthButton;
    }
}
