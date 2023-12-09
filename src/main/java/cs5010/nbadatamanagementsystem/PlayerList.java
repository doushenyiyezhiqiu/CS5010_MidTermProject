package cs5010.nbadatamanagementsystem;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a list of players in the NBA. This class provides static methods to manage a
 * collection of Player objects, including retrieving the entire list, updating it, and
 * performing operations like adding or removing players based on their names.
 */
public class PlayerList {

    private static List<Player> playerList = new ArrayList<>();

    /**
     * Retrieves the list of players.
     *
     * @return A list of Player objects representing the players.
     */
    public static List<Player> getPlayerList() {
        return playerList;
    }

    /**
     * Sets or updates the list of players.
     *
     * @param playerList The new list of players to be set.
     */
    public static void setPlayerList(List<Player> playerList) {
        PlayerList.playerList = playerList;
    }

    /**
     * Removes a player from the list based on their name.
     *
     * @param name The name of the player to be removed.
     */
    public static void deletePlayerByName(String name) {
        for (int i = 0; i < playerList.size(); i++) {
            Player cur = playerList.get(i);
            if (name.equals(cur.getName())) {
                playerList.remove(i);
                return;
            }
        }
    }

    /**
     * Retrieves a player from the list based on their name.
     *
     * @param playerName The name of the player to be retrieved.
     * @return The Player object if found, or {@code null} if no player with the given name exists.
     */
    public static Player getPlayerByName(String playerName) {
        for (Player player : playerList) {
            if (player.getName().equals(playerName)) {
                return player;
            }
        }
        return null;
    }
}
