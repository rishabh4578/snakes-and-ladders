package org.demo;

import java.util.HashMap;
import java.util.Map;

public class Game implements IGame {

    private String gameUID;
    private Integer boardSize;
    private Map<String, Player> playerMap = new HashMap<>();
    private Player playing;

    private Map<Integer, Integer> snakes;

    private Map<Integer, Integer> ladders;

    public Game(Integer boardSize) {
        this.boardSize = boardSize;
        this.gameUID = Utils.generateGameUID();
    }

    @Override
    public String getUID() {
        return this.gameUID;
    }

    @Override
    public synchronized boolean holdDice(String playerUID) {
        if(playing != null){
            throw new GameException("A player is already awaiting his turn.");
        }
        if (playerMap.containsKey(playerUID)) {
            playing = playerMap.get(playerUID);
            return true;
        }
        return false;
    }

    @Override
    public void rollDiceAndMove() {
        if (this.playing != null) {
            int num = Utils.rollDie();
            int newPosition = playing.getPosition() + num;
            if (newPosition <= (boardSize * boardSize)) {
                //check snakes and ladders
                playing.setPosition(newPosition);
                if (newPosition == (boardSize * boardSize))
                    playing.finishGame();
                resetPlayingPlayer();
            }
        } else {
            throw new GameException(String.format("Playing player is not set for game %s", this.gameUID));
        }
    }

    private void resetPlayingPlayer() {
        this.playing = null;
    }
}
