package cs5010.nbadatamanagementsystem;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("main-page.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);

        Image image = new Image(getClass().getResourceAsStream("Images/nbaIcon.png"));
        stage.getIcons().add(image);

        stage.show();
    }

    public static void main(String[] args) {

        CsvLoader.loadEasternTeams();
        CsvLoader.loadWesternTeams();
        CsvLoader.loadPlayers();

        launch();
    }
}