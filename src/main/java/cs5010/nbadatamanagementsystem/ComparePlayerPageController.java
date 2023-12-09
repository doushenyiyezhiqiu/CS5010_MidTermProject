package cs5010.nbadatamanagementsystem;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ComparePlayerPageController {

    @FXML
    private Button backToMainPageButton;

    @FXML
    private Button compareButton;

    @FXML
    private TextField firstPlayerTextField;

    @FXML
    private TextField secondPlayerTextField;

    @FXML
    private Label resultLabel;

    @FXML
    private void handleBackToMainPageButtonClick() throws Exception {
        OpenNewWindow.openNewWindowAndClosePreviousWindow(backToMainPageButton, "main-page.fxml");
    }

    @FXML
    private void handleCompareButtonClick() {
        Player player1 = PlayerList.getPlayerByName(firstPlayerTextField.getText());
        if (player1 == null) {
            resultLabel.setText("No such player: " + firstPlayerTextField.getText());
            return;
        }
        Player player2 = PlayerList.getPlayerByName(secondPlayerTextField.getText());
        if (player2 == null) {
            resultLabel.setText("No such player: " + secondPlayerTextField.getText());
            return;
        }
        if (ComparisonModel.compareTwoPlayers(player1, player2)) {
            resultLabel.setText(player1.getName() + " is the better player!");
        } else {
            resultLabel.setText(player2.getName() + " is the better player!");
        }

    }
}
