package ru.gb.couses_2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public abstract class AbstractGame implements Game {
     private final String name;
     private final int numberSequence;
     private final int maxTry;
     private String hiddenWorld;
     private GameStatus gameStatus;
     private Answer answer;

     public AbstractGame (String name, int numberSequence, int maxTry) {
          this.name = name;
          this.numberSequence = numberSequence;
          this.maxTry = maxTry;
     }

     protected abstract String generateWord (int numberSequence); // Метод получения слова во всех случаях разный

     protected abstract String generateCharList (int numberSequence);

     @Override
     public void start () {
          hiddenWorld = generateWord (numberSequence);
          gameStatus = GameStatus.START;
          this.answer = new Answer (name, 0, 0, maxTry, getGameStatus ());
          System.out.println (answer);
          System.out.println ("Загаданное ПК число " + hiddenWorld);

     }

     @Override
     public boolean inputValue (String worldPlayer) {
          gameStatus = GameStatus.PROGRESS;
          answer.setGameStatus (getGameStatus ());
          for (int i = 0; i < worldPlayer.length (); i++) {
               if (worldPlayer.charAt (i) == hiddenWorld.charAt (i)) {
                    answer.setBull (answer.getBull () + 1);
               }
          }
          Set<Character> charactersBuffer = new HashSet<> ();
          for (int i = 0; i < worldPlayer.length (); i++) {
               charactersBuffer.add (worldPlayer.charAt (i));
          }
          Character[] chars = charactersBuffer.toArray (new Character[charactersBuffer.size ()]);
          for (int i = 0; i < chars.length; i++) {
               for (int j = 0; j < hiddenWorld.length (); j++) {
                    if (chars[i] == hiddenWorld.charAt (j)) {
                         answer.setCow (answer.getCow () + 1);
                    }
               }
          }
          if (answer.getBull () == worldPlayer.length () && answer.getCow () == worldPlayer.length ()) {
               answer.setGameStatus (GameStatus.WINNER);
               System.out.println (answer);
               return false;
          } else {
               answer.setCurrentNumberOfAttempts (answer.getCurrentNumberOfAttempts () - 1);
               answer.setGameStatus (GameStatus.LOST);
               System.out.println (answer);
               answer.setBull(0);
               answer.setCow(0);
               return true;
          }
     }

     @Override
     public GameStatus getGameStatus () {
          return gameStatus;
     }
}

