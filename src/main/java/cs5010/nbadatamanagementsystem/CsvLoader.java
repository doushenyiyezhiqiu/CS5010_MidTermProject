package cs5010.nbadatamanagementsystem;

import java.io.IOException;
import java.io.InputStreamReader;


public class CsvLoader {

    public void loadEasternTeams() {
        try ( reader = new CSVReader(new InputStreamReader(getClass().getResourceAsStream("/data.csv")))) {

            // Skip the first line (header)
            reader.readNext();

            String[] nextLine;
            while ((nextLine = reader.readNext()) != null) {
                // nextLine[] is an array of values from the current line of the CSV
                System.out.println(Arrays.toString(nextLine));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
