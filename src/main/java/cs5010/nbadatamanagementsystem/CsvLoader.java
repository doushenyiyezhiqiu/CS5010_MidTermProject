package cs5010.nbadatamanagementsystem;

import java.io.*;
import java.util.List;

/**
 * This class is responsible for loading initial data from .csv files located in the resources folder.
 * It provides methods to load data for Eastern and Western NBA teams, as well as NBA players, into their respective lists.
 */
public class CsvLoader {

    /**
     * Loads data for Eastern conference teams from a CSV file.
     * Populates the list of Eastern conference teams in the Teams class.
     */
    public static void loadEasternTeams() {
        loadTeamCsvFile("Tables/eastern.csv", Teams.getEasternTeams());
    }

    /**
     * Loads data for Western conference teams from a CSV file.
     * Populates the list of Western conference teams in the Teams class.
     */
    public static void loadWesternTeams() {
        loadTeamCsvFile("Tables/western.csv", Teams.getWesternTeams());
    }

    /**
     * A helper method to load team data from a specified CSV file and populate a given list of Team objects.
     *
     * @param fileName The name of the CSV file to be loaded.
     * @param containers The list of Team objects to be populated with the data.
     */
    private static void loadTeamCsvFile(String fileName, List<Team> containers) {
        InputStream is = CsvLoader.class.getResourceAsStream(fileName);
            try (BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
            br.readLine();
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");

                Team temp = new Team(values[0], Integer.parseInt(values[1]), Integer.parseInt(values[2]), Double.parseDouble(values[3]), Integer.parseInt(values[4]), Double.parseDouble(values[5]), Double.parseDouble(values[6]), Double.parseDouble(values[7]));
                containers.add(temp);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Loads data for NBA players from a CSV file.
     * Populates the list of players in the PlayerList class.
     */
    public static void loadPlayers() {
        InputStream is = CsvLoader.class.getResourceAsStream("Tables/player.csv");
        try (BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
            br.readLine();
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");

                Player temp = new Player(values[0], values[1], Integer.parseInt(values[2]), values[3], Integer.parseInt(values[4]), Double.parseDouble(values[5]), Double.parseDouble(values[6]), Double.parseDouble(values[7]), Double.parseDouble(values[8]), Double.parseDouble(values[9]), Double.parseDouble(values[10]), Double.parseDouble(values[11]), Double.parseDouble(values[12]), Double.parseDouble(values[13]));
                PlayerList.getPlayerList().add(temp);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
