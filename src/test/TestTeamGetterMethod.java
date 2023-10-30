import cs5010.nbadatamanagementsystem.Team;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TestTeamGetterMethod {

    @Test
    public void testGetWin() {
        Team team = new Team("Boston Celtics", 54, 28, 0.659, 2, 100.2, 96.2, 4.0);
        int result = team.getWin();
        Assertions.assertEquals(54, result);
    }

    @Test
    public void testGetLose() {
        Team team = new Team("Boston Celtics", 54, 28, 0.659, 2, 100.2, 96.2, 4.0);
        int result = team.getLose();
        Assertions.assertEquals(28, result);
    }

    @Test
    public void testGetGameBehind() {
        Team team = new Team("Boston Celtics", 54, 28, 0.659, 2, 100.2, 96.2, 4.0);
        int result = team.getGameBehind();
        Assertions.assertEquals(2, result);
    }
}
