package cs5010.nbadatamanagementsystem;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class PlayerStatsPageController {

    @FXML
    private Button backToMainPage;

    @FXML
    private void handleBackToMainPageClick() throws Exception {
        OpenNewWindow.openNewWindowAndClosePreviousWindow(backToMainPage, "main-page.fxml");
    }

    @FXML
    private void initialize() {

    }
}
