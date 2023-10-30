package cs5010.nbadatamanagementsystem;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * This is the controller class of "add-player-page.fxml".
 */
public class AddPlayerPageController {

    @FXML
    private Button addPlayerButton;

    @FXML
    private TextField playerNameText;

    @FXML
    private TextField positionText;

    @FXML
    private TextField ageText;

    @FXML
    private TextField teamText;

    @FXML
    private TextField gamesText;

    @FXML
    private TextField pointsText;

    @FXML
    private TextField reboundsText;

    @FXML
    private TextField assistsText;

    @FXML
    private TextField stealsText;

    @FXML
    private TextField blocksText;

    @FXML
    private TextField fieldGoalPercentageText;

    @FXML
    private TextField twoPointPercentageText;

    @FXML
    private TextField threePointPercentageText;

    @FXML
    private TextField freeThrowPercentageText;

    @FXML
    private void handleAddPlayerClick() throws Exception {
        Player addedPlayer = new Player(playerNameText.getText(), positionText.getText(), Integer.parseInt(ageText.getText()), teamText.getText(), Integer.parseInt(gamesText.getText()), Double.parseDouble(pointsText.getText()), Double.parseDouble(reboundsText.getText()), Double.parseDouble(assistsText.getText()), Double.parseDouble(stealsText.getText()), Double.parseDouble(blocksText.getText()), Double.parseDouble(fieldGoalPercentageText.getText()), Double.parseDouble(twoPointPercentageText.getText()), Double.parseDouble(threePointPercentageText.getText()), Double.parseDouble(freeThrowPercentageText.getText()));
        PlayerList.getPlayerList().add(addedPlayer);

        OpenNewWindow.openNewWindowAndClosePreviousWindow(addPlayerButton, "player-stats-page.fxml");
    }
}
