package cs5010.nbadatamanagementsystem;

public class ComparisonModel {

    public static boolean compareTwoTeams(Team team1, Team team2) {
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

    public static boolean compareTwoPlayers(Player player1, Player player2) {
        // we use a weighted sum of different statistics to compare player
        return calculatePlayerScore(player1) > calculatePlayerScore(player2);
    }

    private static double calculatePlayerScore(Player player) {
        // This method calculates a score for a player based on various stats.
        return player.getPoints() * 2 + player.getRebounds() * 1.5 + player.getAssists() * 1.5 +
                player.getSteals() * 2 + player.getBlocks() * 2 +
                player.getFieldGoalPercentage() * 1 + player.getThreePointPercentage() * 1 +
                player.getFreeThrowPercentage() * 1;
    }
}
