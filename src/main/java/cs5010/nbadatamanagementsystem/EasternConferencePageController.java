package cs5010.nbadatamanagementsystem;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class EasternConferencePageController {

    @FXML
    private Button backToMainPage;

    @FXML
    private TableView<Team> easternTable;

    @FXML
    private TableColumn<Team, String> teamNameColumn;

    @FXML
    private TableColumn<Team, Integer> winColumn;

    @FXML
    private TableColumn<Team, Integer> loseColumn;

    @FXML
    private TableColumn<Team, Double> winLosePercentageColumn;

    @FXML
    private TableColumn<Team, Integer> gameBehindColumn;

    @FXML
    private TableColumn<Team, Double> pointsScorePerGameColumn;

    @FXML
    private TableColumn<Team, Double> pointsAllowedPerGameColumn;

    @FXML
    private TableColumn<Team, Double> simpleRatingSystemColumn;

    @FXML
    private void handleBackToMainPageClick() throws Exception {
        OpenNewWindow.openNewWindowAndClosePreviousWindow(backToMainPage, "main-page.fxml");
    }

    @FXML
    private void initialize() {

        ObservableList<Team> easternTeams = FXCollections.observableList(Teams.getEasternTeams());
        easternTable.setItems(easternTeams);

        teamNameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        teamNameColumn.setCellFactory(new CenteredCellFactory<>());

        winColumn.setCellValueFactory(new PropertyValueFactory<>("win"));
        winColumn.setCellFactory(new CenteredCellFactory<>());

        loseColumn.setCellValueFactory(new PropertyValueFactory<>("lose"));
        loseColumn.setCellFactory(new CenteredCellFactory<>());

        winLosePercentageColumn.setCellValueFactory(new PropertyValueFactory<>("winLosePercentage"));
        winLosePercentageColumn.setCellFactory(new CenteredCellFactory<>());

        gameBehindColumn.setCellValueFactory(new PropertyValueFactory<>("gameBehind"));
        gameBehindColumn.setCellFactory(new CenteredCellFactory<>());

        pointsScorePerGameColumn.setCellValueFactory(new PropertyValueFactory<>("pointsScoredPerGame"));
        pointsScorePerGameColumn.setCellFactory(new CenteredCellFactory<>());

        pointsAllowedPerGameColumn.setCellValueFactory(new PropertyValueFactory<>("pointsAllowedPerGame"));
        pointsAllowedPerGameColumn.setCellFactory(new CenteredCellFactory<>());

        simpleRatingSystemColumn.setCellValueFactory(new PropertyValueFactory<>("simpleRatingSystem"));
        simpleRatingSystemColumn.setCellFactory(new CenteredCellFactory<>());

    }
}
