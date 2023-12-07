package cs5010.nbadatamanagementsystem;

import java.io.*;
import java.util.List;

/**
 * This class help me to load initial data from .csv files in the resources folder.
 */
public class CsvLoader {

    public static void loadEasternTeams() {
        loadTeamCsvFile("Tables/eastern.csv", Teams.getEasternTeams());
    }

    public static void loadWesternTeams() {
        loadTeamCsvFile("Tables/western.csv", Teams.getWesternTeams());
    }

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
