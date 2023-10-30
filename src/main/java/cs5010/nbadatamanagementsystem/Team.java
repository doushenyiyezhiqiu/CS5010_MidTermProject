package cs5010.nbadatamanagementsystem;

/**
 * The file contains the definition of team.
 */
public class Team {

    private String name;
    private int win;
    private int lose;
    private double winLosePercentage;
    private int gameBehind;
    private double pointsScoredPerGame;
    private double pointsAllowedPerGame;
    private double simpleRatingSystem;

    public Team(String name, int win, int lose, double winLosePercentage, int gameBehind, double pointsScoredPerGame, double pointsAllowedPerGame, double simpleRatingSystem) {
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.winLosePercentage = winLosePercentage;
        this.gameBehind = gameBehind;
        this.pointsScoredPerGame = pointsScoredPerGame;
        this.pointsAllowedPerGame = pointsAllowedPerGame;
        this.simpleRatingSystem = simpleRatingSystem;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getLose() {
        return lose;
    }

    public void setLose(int lose) {
        this.lose = lose;
    }

    public double getWinLosePercentage() {
        return winLosePercentage;
    }

    public void setWinLosePercentage(double winLosePercentage) {
        this.winLosePercentage = winLosePercentage;
    }

    public int getGameBehind() {
        return gameBehind;
    }

    public void setGameBehind(int gameBehind) {
        this.gameBehind = gameBehind;
    }

    public double getPointsScoredPerGame() {
        return pointsScoredPerGame;
    }

    public void setPointsScoredPerGame(double pointsScoredPerGame) {
        this.pointsScoredPerGame = pointsScoredPerGame;
    }

    public double getPointsAllowedPerGame() {
        return pointsAllowedPerGame;
    }

    public void setPointsAllowedPerGame(double pointsAllowedPerGame) {
        this.pointsAllowedPerGame = pointsAllowedPerGame;
    }

    public double getSimpleRatingSystem() {
        return simpleRatingSystem;
    }

    public void setSimpleRatingSystem(double simpleRatingSystem) {
        this.simpleRatingSystem = simpleRatingSystem;
    }
}
