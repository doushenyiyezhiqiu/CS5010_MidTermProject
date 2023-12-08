package cs5010.nbadatamanagementsystem;

import java.util.ArrayList;
import java.util.List;

/**
 * The file has the list of players.
 */
public class PlayerList {

    private static List<Player> playerList = new ArrayList<>();

    public static List<Player> getPlayerList() {
        return playerList;
    }

    public static void setPlayerList(List<Player> playerList) {
        PlayerList.playerList = playerList;
    }

    public static void deletePlayerByName(String name) {
        for (int i = 0; i < playerList.size(); i++) {
            Player cur = playerList.get(i);
            if (name.equals(cur.getName())) {
                playerList.remove(i);
                return;
            }
        }
    }

    public static Player getPlayerByName(String playerName) {
        for (Player player : playerList) {
            if (player.getName().equals(playerName)) {
                return player;
            }
        }
        return null;
    }
}
