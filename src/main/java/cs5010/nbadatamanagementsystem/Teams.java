package cs5010.nbadatamanagementsystem;

import java.util.ArrayList;
import java.util.List;

/**
 * Manages lists of NBA teams, divided into Eastern and Western conferences.
 * Provides methods to retrieve and set the lists of teams for each conference,
 * and to find a specific team by name across both conferences.
 */
public class Teams {

    private static List<Team> easternTeams = new ArrayList<>();
    private static List<Team> westernTeams = new ArrayList<>();

    /**
     * Retrieves the list of teams in the Eastern conference.
     *
     * @return A list of Team objects representing the teams in the Eastern conference.
     */
    public static List<Team> getEasternTeams() {
        return easternTeams;
    }

    /**
     * Sets or updates the list of teams in the Eastern conference.
     *
     * @param easternTeams The new list of Eastern conference teams to be set.
     */
    public static void setEasternTeams(List<Team> easternTeams) {
        Teams.easternTeams = easternTeams;
    }

    /**
     * Retrieves the list of teams in the Western conference.
     *
     * @return A list of Team objects representing the teams in the Western conference.
     */
    public static List<Team> getWesternTeams() {
        return westernTeams;
    }

    /**
     * Sets or updates the list of teams in the Western conference.
     *
     * @param westernTeams The new list of Western conference teams to be set.
     */
    public static void setWesternTeams(List<Team> westernTeams) {
        Teams.westernTeams = westernTeams;
    }

    /**
     * Retrieves a team by its name from either the Eastern or Western conference.
     *
     * @param teamName The name of the team to be retrieved.
     * @return The Team object if found, or {@code null} if no team with the given name exists.
     */
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
