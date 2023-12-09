package cs5010.nbadatamanagementsystem;

/**
 * Represents a player in the NBA. This class stores various statistics and personal details
 * of an NBA player, such as their name, position, age, team, and performance metrics.
 */

public class Player {

    private String name;
    private String position;
    private int age;
    private String team;
    private int games;
    private double points;
    private double rebounds;
    private double assists;
    private double steals;
    private double blocks;
    private double fieldGoalPercentage;
    private double twoPointPercentage;
    private double threePointPercentage;
    private double freeThrowPercentage;

    /**
     * Constructs a new Player with the specified details and statistics.
     *
     * @param name                 The player's name.
     * @param position             The player's position on the team.
     * @param age                  The player's age.
     * @param team                 The name of the team the player belongs to.
     * @param games                The number of games played.
     * @param points               The average points scored per game.
     * @param rebounds             The average number of rebounds per game.
     * @param assists              The average number of assists per game.
     * @param steals               The average number of steals per game.
     * @param blocks               The average number of blocks per game.
     * @param fieldGoalPercentage  The player's field goal percentage.
     * @param twoPointPercentage   The player's two-point field goal percentage.
     * @param threePointPercentage The player's three-point field goal percentage.
     * @param freeThrowPercentage  The player's free throw percentage.
     */
    public Player(String name, String position, int age, String team, int games, double points, double rebounds, double assists, double steals, double blocks, double fieldGoalPercentage, double twoPointPercentage, double threePointPercentage, double freeThrowPercentage) {
        this.name = name;
        this.position = position;
        this.age = age;
        this.team = team;
        this.games = games;
        this.points = points;
        this.rebounds = rebounds;
        this.assists = assists;
        this.steals = steals;
        this.blocks = blocks;
        this.fieldGoalPercentage = fieldGoalPercentage;
        this.twoPointPercentage = twoPointPercentage;
        this.threePointPercentage = threePointPercentage;
        this.freeThrowPercentage = freeThrowPercentage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public double getPoints() {
        return points;
    }

    public void setPoints(double points) {
        this.points = points;
    }

    public double getRebounds() {
        return rebounds;
    }

    public void setRebounds(double rebounds) {
        this.rebounds = rebounds;
    }

    public double getAssists() {
        return assists;
    }

    public void setAssists(double assists) {
        this.assists = assists;
    }

    public double getSteals() {
        return steals;
    }

    public void setSteals(double steals) {
        this.steals = steals;
    }

    public double getBlocks() {
        return blocks;
    }

    public void setBlocks(double blocks) {
        this.blocks = blocks;
    }

    public double getFieldGoalPercentage() {
        return fieldGoalPercentage;
    }

    public void setFieldGoalPercentage(double fieldGoalPercentage) {
        this.fieldGoalPercentage = fieldGoalPercentage;
    }

    public double getTwoPointPercentage() {
        return twoPointPercentage;
    }

    public void setTwoPointPercentage(double twoPointPercentage) {
        this.twoPointPercentage = twoPointPercentage;
    }

    public double getThreePointPercentage() {
        return threePointPercentage;
    }

    public void setThreePointPercentage(double threePointPercentage) {
        this.threePointPercentage = threePointPercentage;
    }

    public double getFreeThrowPercentage() {
        return freeThrowPercentage;
    }

    public void setFreeThrowPercentage(double freeThrowPercentage) {
        this.freeThrowPercentage = freeThrowPercentage;
    }

    public int getGames() {
        return games;
    }

    public void setGames(int games) {
        this.games = games;
    }
}
