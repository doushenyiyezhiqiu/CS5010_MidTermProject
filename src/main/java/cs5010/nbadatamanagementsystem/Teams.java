package cs5010.nbadatamanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Teams {

    private static List<Team> easternTeams;
    private static List<Team> westernTeams;

    public Teams() {
        easternTeams = new ArrayList<>();
        westernTeams = new ArrayList<>();
    }

    public static List<Team> getEasternTeams() {
        return easternTeams;
    }

    public static void setEasternTeams(List<Team> easternTeams) {
        Teams.easternTeams = easternTeams;
    }

    public static List<Team> getWesternTeams() {
        return westernTeams;
    }

    public static void setWesternTeams(List<Team> westernTeams) {
        Teams.westernTeams = westernTeams;
    }
}
