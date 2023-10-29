package cs5010.nbadatamanagementsystem;

import java.io.*;

public class CsvLoader {

    public static void loadEasternTeams() {
        InputStream is = CsvLoader.class.getResourceAsStream("Tables/eastern.csv");
        try (BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
            br.readLine();
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");

                Team temp = new Team(values[0], Integer.parseInt(values[1]), Integer.parseInt(values[2]), Double.parseDouble(values[3]), Integer.parseInt(values[4]), Double.parseDouble(values[5]), Double.parseDouble(values[6]), Double.parseDouble(values[7]));
                Teams.getEasternTeams().add(temp);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
