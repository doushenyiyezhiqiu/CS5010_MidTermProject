package cs5010.nbadatamanagementsystem;

import java.io.*;
import java.util.List;

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

}
