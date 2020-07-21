package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class TicTacToe extends Application {

    private ButtonsGridLayout buttonsGridLayout;
    private Label playerTurnLabel;
    private Button restartButton;
    private BorderPane parentLayout;

    @Override
    public void init() throws Exception {
        buttonsGridLayout = new ButtonsGridLayout();
        this.playerTurnLabel = new Label("Turn: X");
        this.restartButton = new Button("Restart");
        this.parentLayout = new BorderPane();
    }

    private Parent getParentLayout() {

        parentLayout.setBackground(new Background(new BackgroundFill(Color.SILVER, CornerRadii.EMPTY, Insets.EMPTY)));
        parentLayout.setPadding(new Insets(20, 20, 20, 20));
        parentLayout.setPrefSize(400, 500);

        playerTurnLabel.setTextFill(Color.RED);
        playerTurnLabel.setFont(new Font("Calibri", 30));
        playerTurnLabel.setTextAlignment(TextAlignment.CENTER);

        restartButton.setVisible(false);
        VBox topPane = new VBox();
        topPane.setAlignment(Pos.CENTER);
        topPane.setSpacing(20);
        topPane.getChildren().addAll(playerTurnLabel, restartButton);
        parentLayout.setTop(topPane);
        parentLayout.setCenter(buttonsGridLayout.getLayout());
        return parentLayout;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Scene scene = new Scene(getParentLayout());
        primaryStage.setScene(scene);
        primaryStage.setTitle("Tic Tac Toe");
        primaryStage.setResizable(false);
        primaryStage.getIcons().add(new Image("icon.png"));
        primaryStage.show();

        restartButton.setOnAction(actionEvent -> {
            restartGame();
        });

        Logic logic = new Logic(buttonsGridLayout, playerTurnLabel, restartButton);
        logic.play();
    }

    private void restartGame() {
        parentLayout.setCenter(buttonsGridLayout.getLayout()); //to retain css properties we re-instantiate
        buttonsGridLayout.getFirstButton().setText("");
        buttonsGridLayout.getFirstButton().setDisable(false);
        buttonsGridLayout.getSecondButton().setText("");
        buttonsGridLayout.getSecondButton().setDisable(false);
        buttonsGridLayout.getThirdButton().setText("");
        buttonsGridLayout.getThirdButton().setDisable(false);
        buttonsGridLayout.getFourthButton().setText("");
        buttonsGridLayout.getFourthButton().setDisable(false);
        buttonsGridLayout.getFifthButton().setText("");
        buttonsGridLayout.getFifthButton().setDisable(false);
        buttonsGridLayout.getSixthButton().setText("");
        buttonsGridLayout.getSixthButton().setDisable(false);
        buttonsGridLayout.getSeventhButton().setText("");
        buttonsGridLayout.getSeventhButton().setDisable(false);
        buttonsGridLayout.getEigthButton().setText("");
        buttonsGridLayout.getEigthButton().setDisable(false);
        buttonsGridLayout.getNinthButton().setText("");
        buttonsGridLayout.getNinthButton().setDisable(false);
        playerTurnLabel.setText("Turn: X");
        playerTurnLabel.setTextFill(Color.RED);
        restartButton.setVisible(false);
    }

    public static void main(String[] args) {
        launch(TicTacToe.class);
    }

}

