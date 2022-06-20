package org.demo;

public class Player implements IPlayer {
private String playerUID;
    private Integer position;
    private boolean isFinished;

    public Player() {
        this.playerUID = Utils.generatePlayerUID();
    }

    @Override
    public String getPlayerUID() {
        return this.playerUID;
    }

    @Override
    public void setPosition(int position) {
        this.position = position;
    }

    @Override
    public Integer getPosition() {
        return this.position;
    }

    @Override
    public void finishGame() {
        this.isFinished = true;
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
