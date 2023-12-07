package cs5010.nbadatamanagementsystem;

public class ComparisonModel {

    public static boolean compareTwoTeam(Team team1, Team team2) {
        if (team1.getWinLosePercentage() > team2.getWinLosePercentage()) {
            return true;
        } else if (team1.getWinLosePercentage() < team2.getWinLosePercentage()) {
            return false;
        }

        if (team1.getSimpleRatingSystem() > team2.getSimpleRatingSystem()) {
            return true;
        } else if (team1.getSimpleRatingSystem() < team2.getSimpleRatingSystem()) {
            return false;
        }

        return false;
    }
}
