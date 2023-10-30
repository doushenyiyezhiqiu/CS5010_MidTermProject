package cs5010.nbadatamanagementsystem;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 * This is the controller class of "player-stats-page.fxml".
 */
public class PlayerStatsPageController {

    @FXML
    private Button backToMainPage;

    @FXML
    private Button addPlayerButton;

    @FXML
    private Button deletePlayerButton;

    @FXML
    private TableView<Player> playerTable;

    @FXML
    private TableColumn<Player, String> playerNameColumn;

    @FXML
    private TableColumn<Player, String> positionColumn;

    @FXML
    private TableColumn<Player, Integer> ageColumn;

    @FXML
    private TableColumn<Player, String> teamColumn;

    @FXML
    private TableColumn<Player, Integer> gamesColumn;

    @FXML
    private TableColumn<Player, Double> pointsColumn;

    @FXML
    private TableColumn<Player, Double> reboundsColumn;

    @FXML
    private TableColumn<Player, Double> assistsColumn;

    @FXML
    private TableColumn<Player, Double> stealsColumn;

    @FXML
    private TableColumn<Player, Double> blocksColumn;

    @FXML
    private TableColumn<Player, Double> fieldGoalPercentageColumn;

    @FXML
    private TableColumn<Player, Double> twoPointPercentageColumn;

    @FXML
    private TableColumn<Player, Double> threePointPercentageColumn;

    @FXML
    private TableColumn<Player, Double> freeThrowPercentageColumn;

    @FXML
    private void handleBackToMainPageClick() throws Exception {
        OpenNewWindow.openNewWindowAndClosePreviousWindow(backToMainPage, "main-page.fxml");
    }

    @FXML
    private void initialize() {

        ObservableList<Player> playerList = FXCollections.observableList(PlayerList.getPlayerList());
        playerTable.setItems(playerList);

        playerNameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        playerNameColumn.setCellFactory(new CenteredCellFactory<>());

        positionColumn.setCellValueFactory(new PropertyValueFactory<>("position"));
        positionColumn.setCellFactory(new CenteredCellFactory<>());

        ageColumn.setCellValueFactory(new PropertyValueFactory<>("age"));
        ageColumn.setCellFactory(new CenteredCellFactory<>());

        teamColumn.setCellValueFactory(new PropertyValueFactory<>("team"));
        teamColumn.setCellFactory(new CenteredCellFactory<>());

        gamesColumn.setCellValueFactory(new PropertyValueFactory<>("games"));
        gamesColumn.setCellFactory(new CenteredCellFactory<>());

        pointsColumn.setCellValueFactory(new PropertyValueFactory<>("points"));
        pointsColumn.setCellFactory(new CenteredCellFactory<>());

        reboundsColumn.setCellValueFactory(new PropertyValueFactory<>("rebounds"));
        reboundsColumn.setCellFactory(new CenteredCellFactory<>());

        assistsColumn.setCellValueFactory(new PropertyValueFactory<>("assists"));
        assistsColumn.setCellFactory(new CenteredCellFactory<>());

        stealsColumn.setCellValueFactory(new PropertyValueFactory<>("steals"));
        stealsColumn.setCellFactory(new CenteredCellFactory<>());

        blocksColumn.setCellValueFactory(new PropertyValueFactory<>("blocks"));
        blocksColumn.setCellFactory(new CenteredCellFactory<>());

        fieldGoalPercentageColumn.setCellValueFactory(new PropertyValueFactory<>("fieldGoalPercentage"));
        fieldGoalPercentageColumn.setCellFactory(new CenteredCellFactory<>());

        twoPointPercentageColumn.setCellValueFactory(new PropertyValueFactory<>("twoPointPercentage"));
        twoPointPercentageColumn.setCellFactory(new CenteredCellFactory<>());

        threePointPercentageColumn.setCellValueFactory(new PropertyValueFactory<>("threePointPercentage"));
        threePointPercentageColumn.setCellFactory(new CenteredCellFactory<>());

        freeThrowPercentageColumn.setCellValueFactory(new PropertyValueFactory<>("freeThrowPercentage"));
        freeThrowPercentageColumn.setCellFactory(new CenteredCellFactory<>());
    }

    @FXML
    private void handleAddPlayerButtonClick() throws Exception {
        OpenNewWindow.openNewWindowAndClosePreviousWindow(addPlayerButton, "add-player-page.fxml");
    }

    @FXML
    private void handleDeletePlayerButtonClick() throws Exception {
        Stage newStage = new Stage();

        // Load the FXML for the new window and set it as the scene
        Parent root = FXMLLoader.load(getClass().getResource("delete-player-page.fxml"));
        Scene scene = new Scene(root);
        newStage.setScene(scene);

        Image image = new Image(getClass().getResourceAsStream("Images/nbaIcon.png"));
        newStage.getIcons().add(image);

        newStage.setResizable(false);

        // Show the new stage
        newStage.show();
    }
}
