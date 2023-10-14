package ru.gb.couses_2;

public interface Game {
    void start ();

    boolean inputValue (String worldPlayer);

    GameStatus getGameStatus ();


}
