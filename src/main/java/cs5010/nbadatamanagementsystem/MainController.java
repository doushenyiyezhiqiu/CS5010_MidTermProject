package cs5010.nbadatamanagementsystem;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * This is the controller class of "main-page.fxml".
 */
public class MainController {
    @FXML
    private Button eastern;

    @FXML
    private Button western;

    @FXML
    private Button playerStatsButton;

    @FXML
    private ImageView nbaImage;

    @FXML
    private Button comparePlayerButton;

    @FXML
    private Button compareTeamButton;

    @FXML
    private void handleEasternClick() throws Exception {
        OpenNewWindow.openNewWindowAndClosePreviousWindow(eastern, "eastern-conference-page.fxml");
    }

    @FXML
    private void handleWesternClick() throws Exception {
        OpenNewWindow.openNewWindowAndClosePreviousWindow(western, "western-conference-page.fxml");
    }

    @FXML
    private void initialize() {
        Image image = new Image(getClass().getResourceAsStream("Images/nbaImage.png"));
        nbaImage.setImage(image);
    }

    @FXML
    private void handlePlayerStatsButtonClick() throws Exception {
        OpenNewWindow.openNewWindowAndClosePreviousWindow(playerStatsButton, "player-stats-page.fxml");
    }

    @FXML
    private void handleCompareTeamButtonClick() throws Exception {
        OpenNewWindow.openNewWindowAndClosePreviousWindow(compareTeamButton, "compare-team-page.fxml");
    }

    @FXML
    private void handleCompareplayerButtonClick() throws Exception {
        OpenNewWindow.openNewWindowAndClosePreviousWindow(comparePlayerButton, "compare-player-page.fxml");
    }
}

