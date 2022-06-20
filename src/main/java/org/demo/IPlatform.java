package org.demo;

public interface IPlatform {

    String createGame(Integer boardSize);

    boolean holdDice(Integer gameUID, String playerUID);

    void rollDiceAndMove(Integer gameUID);

}
