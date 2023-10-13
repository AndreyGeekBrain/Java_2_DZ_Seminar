package ru.gb.couses_2;

public class Answer {
    String name;
    int bull;
    int cow;
    int currentNumberOfAttempts;
    GameStatus gameStatus;


    public Answer (String name, int bull, int cow, int currentNumberOfAttempts, GameStatus gameStatus) {
        this.name = name;
        this.bull = bull;
        this.cow = cow;
        this.currentNumberOfAttempts = currentNumberOfAttempts;
        this.gameStatus = gameStatus;
    }

    @Override
    public String toString () {
        return "Answer{" +
                "name='" + name + '\'' +
                ", bull=" + bull +
                ", cow=" + cow +
                ", currentNumberOfAttempts=" + currentNumberOfAttempts +
                ", gameStatus=" + gameStatus +
                '}';
    }

    public int getBull () {
        return bull;
    }

    public void setBull (int bull) {
        this.bull = bull;
    }

    public int getCow () {
        return cow;
    }

    public void setCow (int cow) {
        this.cow = cow;
    }

    public int getCurrentNumberOfAttempts () {
        return currentNumberOfAttempts;
    }

    public void setCurrentNumberOfAttempts (int currentNumberOfAttempts) {
        this.currentNumberOfAttempts = currentNumberOfAttempts;
    }

    public void setGameStatus (GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }
}
