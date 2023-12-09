package cs5010.nbadatamanagementsystem;

/**
 * The {@code ComparisonModel} class provides methods to compare NBA teams and players.
 * It includes methods for comparing two teams based on win-loss percentage and simple rating system,
 * as well as comparing two players based on a weighted score calculated from various statistics.
 */
public class ComparisonModel {

    /**
     * Compares two NBA teams based on their win-loss percentage and simple rating system.
     *
     * @param team1 The first team to compare.
     * @param team2 The second team to compare.
     * @return {@code true} if team1 is considered better than team2 based on the comparison criteria;
     *         {@code false} otherwise.
     */
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

    /**
     * Compares two NBA players based on a calculated score from various statistics.
     * The score is a weighted sum of points, rebounds, assists, steals, blocks,
     * field goal percentage, three-point percentage, and free throw percentage.
     *
     * @param player1 The first player to compare.
     * @param player2 The second player to compare.
     * @return {@code true} if player1 is considered better than player2 based on the calculated score;
     *         {@code false} otherwise.
     */
    public static boolean compareTwoPlayers(Player player1, Player player2) {
        // we use a weighted sum of different statistics to compare players
        return calculatePlayerScore(player1) > calculatePlayerScore(player2);
    }

    /**
     * Calculates a score for a player based on various statistics.
     * The score is a weighted sum of points, rebounds, assists, steals, blocks,
     * field goal percentage, three-point percentage, and free throw percentage.
     *
     * @param player The player for whom the score is to be calculated.
     * @return The calculated score based on the player's statistics.
     */
    private static double calculatePlayerScore(Player player) {
        // This method calculates a score for a player based on various stats.
        return player.getPoints() * 2 + player.getRebounds() * 1.5 + player.getAssists() * 1.5 +
                player.getSteals() * 2 + player.getBlocks() * 2 +
                player.getFieldGoalPercentage() * 1 + player.getThreePointPercentage() * 1 +
                player.getFreeThrowPercentage() * 1;
    }
}
