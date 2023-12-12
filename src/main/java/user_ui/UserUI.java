package user_ui;

import controller.ControllerToyShop;

import java.util.Scanner;

public class UserUI {

    public void start (ControllerToyShop controllerToyShop) {
        Scanner scanner = new Scanner (System.in);
        boolean flagExternal = true;
        boolean flagInner;
        while (flagExternal) {
            flagInner = true;
        System.out.println (
                        "1. Запустить лотерею \"Магазина игрушек\".\n" +
                        "2. Таблица выпавших в розыгрыше лотереи игрушек. \"Магазина игрушек\".\n" +
                        "3. Забрать игрушку победителем розыгрыша лотереи.\n" +
                        "4. Сформировать новый список игрушек участвующих в розыгрыше лотереи " +
                        "из существующей товарной номенклатуры магазина.\n" +
                        "5. Добавить новую игрушку в товарную номенклатуру магазина игрушек.\n" +
                        "6. Удалить существующую игрушку из товарной номенклатуры магазинна.\n" +
                        "7. Поменять приоритет выпадения игрушки при розыгрыше лотереи.\n" +
                        "8. Выход.\n"
        );

            int number = scanner.nextInt ();
            while (flagInner) {
                if (number == 1) {
                    controllerToyShop.toyDraw ();
                    flagInner = false;
                }
                if (number == 2) {
                    controllerToyShop.drawingWinnersTableToys ();
                    flagInner = false;
                }
                if (number == 3) {
                    controllerToyShop.drawingWinnersTableToys ();
                    System.out.println ("===================================================");
                    System.out.println ("Введите Ваше имя и id игрушки bp списка выше, что Вы выиграли: ");
                    System.out.println ("Ваше имя: ");
                    String name = scanner.next ();
                    System.out.println ("id Игрушки, что вы выиграли: ");
                    int id = scanner.nextInt ();
                    controllerToyShop.winnerTakesToy (name,id);
                    flagInner = false;
                }
                if (number == 4) {
                    System.out.println ("============== < Новый Список призов > ==============");
                    controllerToyShop.newListOfParticipatingToys ();
                    flagInner = false;
                }
                if (number == 5) {
                    System.out.println ("===================================================");
                    System.out.println ("Введите имя новой игрушки: ");
                    String name = scanner.next ();
                    System.out.println ("Введите значение priority новой игрушки: ");
                    int priority = scanner.nextInt ();
                    controllerToyShop.addNewToyToStore (name,priority);
                    flagInner = false;
                }
                if (number == 6) {
                    System.out.println ("id Игрушки, что Вы хотите удалить из номенклатуры магазина: ");
                    int id = scanner.nextInt ();
                    controllerToyShop.delToyToStore (id);
                    flagInner = false;
                }
                if (number == 7) {
                    controllerToyShop.changePriorityOfToy ();
                }
                if (number == 8) {
                    controllerToyShop.exitProgrammes ();
                }
            }
        }
    }
}
