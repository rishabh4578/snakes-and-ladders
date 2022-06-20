package org.demo;

public interface IGame {
    String getUID();

    boolean holdDice(String playerId);

    void rollDiceAndMove();

}
