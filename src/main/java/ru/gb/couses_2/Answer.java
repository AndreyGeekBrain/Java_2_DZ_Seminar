package ru.gb.couses_2;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Answer {
    private String name;
    private int bull;
    private int cow;
    private int currentNumberOfAttempts;
    private GameStatus gameStatus;
    private File logGame;
    private FileWriter fileWriter;

    public Answer () {
        this.logGame = new File ("logGame.txt");
    }

    public Answer (String name, int bull, int cow, int currentNumberOfAttempts, GameStatus gameStatus) {
        this.name = name;
        this.bull = bull;
        this.cow = cow;
        this.currentNumberOfAttempts = currentNumberOfAttempts;
        this.gameStatus = gameStatus;
        this.logGame = new File ("logGame.txt");
        try {
            this.fileWriter = new FileWriter (this.logGame,true);
        } catch (IOException e) {
            e.printStackTrace ();
            System.out.println ("Ошибка создания файла!");
        }
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

    public void setLogGame (String filelog) {
        try {
            this.fileWriter.write (filelog);
            this.fileWriter.append ('\n');
            this.fileWriter.flush ();
        } catch (IOException e) {
            e.printStackTrace ();
            System.out.println ("Ошибка записи в файл!");
        }
    }

    public void getLogGame () {
        try (FileReader reader = new FileReader (this.logGame)) {
            System.out.println (logGame.isFile ());
            int c;
            while ((c = reader.read ()) != - 1) {
                System.out.print ((char) c);
            }
        } catch (IOException ex) {
            System.out.println ("Ошибка чтения из файла!");
            System.out.println (ex.getMessage ());
        }
    }

    public void setGameStatus (GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }
}
