package cs5010.nbadatamanagementsystem;

import java.util.ArrayList;
import java.util.List;

/**
 * The file contains eastern and western teams.
 */
public class Teams {

    private static List<Team> easternTeams = new ArrayList<>();
    private static List<Team> westernTeams = new ArrayList<>();

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

    public static Team getTeamByName(String teamName) {
        for(Team team : easternTeams) {
            if(team.getName().equals(teamName)) {
                return team;
            }
        }
        for(Team team : westernTeams) {
            if(team.getName().equals(teamName)) {
                return team;
            }
        }
        return null;
    }
}
