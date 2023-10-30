package cs5010.nbadatamanagementsystem;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class DeletePlayerPageController {

    @FXML
    private TextField playerNameText;

    @FXML
    private Button deletePlayerButton;

    @FXML
    private void handleDeletePlayerButtonClick() {
        PlayerList.deletePlayerByName(playerNameText.getText());

        Stage stage = (Stage) deletePlayerButton.getScene().getWindow();
        stage.close();
    }
}
