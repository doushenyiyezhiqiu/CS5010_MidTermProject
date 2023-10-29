package cs5010.nbadatamanagementsystem;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class EasternConferencePageController {

    @FXML
    private Button backToMainPage;

    @FXML
    private void handleBackToMainPageClick() throws Exception {
        Stage stage = (Stage) backToMainPage.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("main-page.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);

        Image image = new Image(getClass().getResourceAsStream("Images/nbaIcon.png"));
        stage.getIcons().add(image);

        stage.show();
    }
}
