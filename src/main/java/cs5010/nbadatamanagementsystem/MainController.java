package cs5010.nbadatamanagementsystem;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class MainController {
    @FXML
    private Button eastern;

    @FXML
    private ImageView nbaImage;

    @FXML
    private void handleEasternClick() throws Exception {
        Stage stage = (Stage) eastern.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("eastern-conference-page.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);

        Image image = new Image(getClass().getResourceAsStream("Images/nbaIcon.png"));
        stage.getIcons().add(image);

        stage.show();
    }

    @FXML
    private void initialize() {
        Image image = new Image(getClass().getResourceAsStream("Images/nbaImage.png"));
        nbaImage.setImage(image);
    }
}