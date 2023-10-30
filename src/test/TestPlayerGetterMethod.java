import cs5010.nbadatamanagementsystem.Player;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestPlayerGetterMethod {

    @Test
    public void testGetAge() {
        Player player = new Player("Michael Jordan", "SG", 34, "CHI", 66, 30.4, 5.3, 6.2, 1.5, 1.2, 0.5, 0.6, 0.3, 0.8);
        int result = player.getAge();
        Assertions.assertEquals(34, result);
    }
}
