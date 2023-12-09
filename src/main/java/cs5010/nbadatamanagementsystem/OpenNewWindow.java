package cs5010.nbadatamanagementsystem;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 * Provides utility functions to handle window operations in the NBA Data Management System.
 * This class includes a method for closing a current window and opening a new one,
 * which can be utilized across various controller classes.
 */
public class OpenNewWindow {

    /**
     * Closes the current window associated with the given button and opens a new window
     * with the specified FXML file. The method also sets a fixed NBA icon for the new window
     * and prevents it from being resizable.
     *
     * @param button   The button from the current window. It is used to reference the current Stage (window).
     * @param fileName The FXML file name for the new window to be loaded.
     * @throws Exception if the FXML file cannot be loaded or any other issue occurs during the window transition.
     */
    public static void openNewWindowAndClosePreviousWindow(Button button, String fileName) throws Exception {
        Stage stage = (Stage) button.getScene().getWindow();
        Parent root = FXMLLoader.load(OpenNewWindow.class.getResource(fileName));
        Scene scene = new Scene(root);
        stage.setScene(scene);

        Image image = new Image(OpenNewWindow.class.getResourceAsStream("Images/nbaIcon.png"));
        stage.getIcons().add(image);

        stage.setResizable(false);

        stage.show();
    }
}
