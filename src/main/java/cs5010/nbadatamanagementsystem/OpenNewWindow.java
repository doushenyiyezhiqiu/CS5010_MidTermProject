package cs5010.nbadatamanagementsystem;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class OpenNewWindow {

    public static void openNewWindowAndClosePreviousWindow(Button button, String fileName) throws Exception {
        Stage stage = (Stage) button.getScene().getWindow();
        Parent root = FXMLLoader.load(OpenNewWindow.class.getResource(fileName));
        Scene scene = new Scene(root);
        stage.setScene(scene);

        Image image = new Image(OpenNewWindow.class.getResourceAsStream("Images/nbaIcon.png"));
        stage.getIcons().add(image);

        stage.show();
    }
}
