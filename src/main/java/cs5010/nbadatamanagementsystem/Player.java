package cs5010.nbadatamanagementsystem;

public class Player {

    private String name;
    private String position;
    private int age;
    private String team;
    private double points;
    private double rebounds;
    private double assists;
    private double steals;
    private double blocks;
    private double fieldGoalPercentage;
    private double twoPointPercentage;
    private double threePointPercentage;
    private double freeThrowPercentage;

    public Player(String name, String position, int age, String team, double points, double rebounds, double assists, double steals, double blocks, double fieldGoalPercentage, double twoPointPercentage, double threePointPercentage, double freeThrowPercentage) {
        this.name = name;
        this.position = position;
        this.age = age;
        this.team = team;
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
}
