package cs5010.nbadatamanagementsystem;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CompareTeamPageController {

    @FXML
    private Button backToMainPageButton;

    @FXML
    private Button compareButton;

    @FXML
    private TextField firstTeamTextField;

    @FXML
    private TextField secondTeamTextField;

    @FXML
    private Label resultLabel;

    @FXML
    private void handleBackToMainPageButtonClick() throws Exception {
        OpenNewWindow.openNewWindowAndClosePreviousWindow(backToMainPageButton, "main-page.fxml");
    }

    @FXML
    private void handleCompareButtonClick() {
        Team team1 = Teams.getTeamByName(firstTeamTextField.getText());
        if (team1 == null) {
            resultLabel.setText("No such team: " + firstTeamTextField.getText());
            return;
        }
        Team team2 = Teams.getTeamByName(secondTeamTextField.getText());
        if (team2 == null) {
            resultLabel.setText("No such team: " + secondTeamTextField.getText());
            return;
        }
        if (ComparisonModel.compareTwoTeams(team1, team2)) {
            resultLabel.setText(team1.getName() + " is the better team!");
        } else {
            resultLabel.setText(team2.getName() + " is the better team!");
        }

    }
}
