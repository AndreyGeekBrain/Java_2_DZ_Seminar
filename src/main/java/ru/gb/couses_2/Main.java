package ru.gb.couses_2;


import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        boolean flagExternal = true;
        boolean flagInner;
        while (flagExternal) {
            System.out.println ("Добро пожаловать в игру \"Быки и Коровы\"");
            Scanner scanner = new Scanner (System.in);
            System.out.println (
                    "Выберете игру: \n" +
                            "1 - Игра с цифрами \n" +
                            "2 - Игра с русскими буквами \n" +
                            "3 - Игра с английскими буквами \n" +
                            "4 - Вывести записи ранее проведенных игр \n" +
                            "5 - Выход из игры");
            int value = scanner.nextInt ();
            flagInner = true;
            while (flagInner) {
                if (value == 1) {
                    System.out.println ("Вы выбрали \"угадайку\" в числа!");
                    System.out.println ("Введите имя игрока");
                    String name = scanner.next ();
                    System.out.println ("Выберите сколько у Вас попыток ");
                    int maxTry = scanner.nextInt ();
                    System.out.println ("Выберите длину последовательности загадываемых чисел ");
                    int numberSequence = scanner.nextInt ();
                    AbstractGame numberGame = new NumberGame (name, maxTry, numberSequence);
                    numberGame.start ();
                    boolean inputValueFlag = true;
                    for (int i = 0; i < maxTry && inputValueFlag; i++) {
                        System.out.println ("Введите число которое загадал компьютер: ");
                        inputValueFlag = numberGame.inputValue (scanner.next ());
                    }
                    System.out.println ("Если вы хотите повторить игру напишите yes/no");
                    if (scanner.next ().equals ("yes")){
                    }else
                        flagInner = false;
                }

                if (value == 2) {
                    System.out.println ("Вы выбрали \"угадайку\" с русскими буквами!");
                    System.out.println ("Введите имя игрока");
                    String name = scanner.next ();
                    System.out.println ("Выберите сколько у Вас попыток отгадать ");
                    int maxTry = scanner.nextInt ();
                    System.out.println ("Выберите длину загадываемой буквенной последовательности: ");
                    int numberSequence = scanner.nextInt ();
                    AbstractGame rusAlphabetGame = new RusAlphabet (name, maxTry, numberSequence);
                    rusAlphabetGame.start();
                    boolean inputValueFlag = true;
                    for (int i = 0; i < maxTry && inputValueFlag; i++) {
                        System.out.println ("Введите буквенную последовательность, которую загадал компьютер: ");
                        inputValueFlag = rusAlphabetGame.inputValue (scanner.next ());
                    }
                    System.out.println ("Если вы хотите повторить игру напишите yes/no");
                    if(scanner.next ().equals ("yes")){
                    }else
                        break;
                }

                if (value == 3) {
                    System.out.println ("Вы выбрали \"угадайку\" с английскими буквами!");
                    System.out.println ("Введите имя игрока");
                    String name = scanner.next ();
                    System.out.println ("Выберите сколько у Вас попыток отгадать ");
                    int maxTry = scanner.nextInt ();
                    System.out.println ("Выберите длину загадываемой буквенной последовательности: ");
                    int numberSequence = scanner.nextInt ();
                    AbstractGame EnAlphabetGame = new EnAlphabet (name, maxTry, numberSequence);
                    EnAlphabetGame.start ();
                    boolean inputValueFlag = true;
                    for (int i = 0; i < maxTry && inputValueFlag; i++) {
                        System.out.println ("Введите буквенную последовательность, которую загадал компьютер: ");
                        inputValueFlag = EnAlphabetGame.inputValue (scanner.next ());
                    }
                    System.out.println ("Если вы хотите повторить игру напишите yes/no");
                    if (scanner.next ().equals ("yes")) {
                    } else
                        break;
                }
                if (value == 4) {
                    System.out.println ("Чтение данных из файла logGame.txt");
                    new Answer ().getLogGame ();
                    flagInner = false;
                }
                if (value == 5 || value != 1 && value != 2 && value != 3) {
                    flagExternal = false;
                    flagInner = false;
                }
            }

        }

    }
}

