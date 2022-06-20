package org.demo;

import java.util.HashMap;
import java.util.Map;

public class Platform implements IPlatform {

    private Map<String, Game> gameMap = new HashMap<>();

    @Override
    public String createGame(Integer boardSize) {
        Game game = new Game(boardSize);
        gameMap.put(game.getUID(), game);
        return game.getUID();
    }

    @Override
    public boolean holdDice(Integer gameUID, String playerUID) {
        if (gameMap.containsKey(gameUID)) {
            return gameMap.get(gameUID).holdDice(playerUID);
        }
        return false;
    }

    @Override
    public void rollDiceAndMove(Integer gameUID) {
        if (gameMap.containsKey(gameUID)) {
            gameMap.get(gameUID).rollDiceAndMove();
        }
    }
}
