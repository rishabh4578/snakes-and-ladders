package org.demo;

public interface IPlayer {

    String getPlayerUID();
    void setPosition(int position);

    Integer getPosition();

    void finishGame();

    boolean isFinished();

}
