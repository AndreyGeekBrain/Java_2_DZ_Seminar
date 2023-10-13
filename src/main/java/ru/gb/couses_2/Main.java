package ru.gb.couses_2;


import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        boolean flagExternal = true;
        boolean flagInner = true;
        while (flagExternal) {
            System.out.printf ("Добро пожаловать в игру \"Быки и Коровы\"");
            Scanner scanner = new Scanner (System.in);
            System.out.printf (
                    "Выберете игру: \n" +
                            "1 - Игра с цифрами \n" +
                            "2 - Игра с русскими буквами \n" +
                            "3 - Игра с английскими словами \n" +
                            "4 - Выход из игры\n");
            int value = scanner.nextInt ();
            while (flagInner) {
                if (value == 1) {
                    System.out.println ("Вы выбрали угадайку в числа!");
                    System.out.println ("Введите имя игрока");
                    String name = scanner.next ();
                    System.out.println ("Выберите сколько у Вас попыток ");
                    int maxTry = scanner.nextInt ();
                    System.out.println ("Выберите длину последовательности загадываемого слова ");
                    int numberSequence = scanner.nextInt ();
                    NumberGame numberGame = new NumberGame (name, maxTry, numberSequence);
                    numberGame.start ();
                    for (int i = 0; i < maxTry; i++) {
                        System.out.println ("Введите число которое загадал компьютер: ");
                        numberGame.inputValue (scanner.next ());

                    }
                }
            }

        }


    }


}
