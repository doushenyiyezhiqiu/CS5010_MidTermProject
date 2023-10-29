package cs5010.nbadatamanagementsystem;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class MainController {
    @FXML
    private Button eastern;

    @FXML
    private Button western;

    @FXML
    private ImageView nbaImage;

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
}

