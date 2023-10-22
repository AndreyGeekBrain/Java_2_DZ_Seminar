package ru.gb.mvc.front;

import ru.gb.mvc.controller.ControllerPhoneBookImpl;
import java.util.Scanner;

public class FrontUser {

    public FrontUser () {
        startUI ();
    }
    void startUI (){
        boolean flag = true;
        int countMenu = -1;
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Меню телефонного справочника:\n"+
                "1. Посмотреть телефонную книгу.\n"+
                "2. Добавить контакт в телефонную книгу.\n"+
                "3. Найти контакт в телефонной книге.\n"+
                "4. Отредактировать существующий контакт в телефонной книге.\n"+
                "5. Удалить контакт в телефонной книге.\n"+
                "6. Импортировать контакты в телефонную книгу из файла.\n"+
                "7. Экспортировать контакты из файла контакты в телефонную книгу.\n"+
                "8. Выход из программы.\n"+
                "Введите цифру меню: \n");
        if (scanner.hasNextInt ()){
            ControllerPhoneBookImpl controllerPhoneBookImpl = new ControllerPhoneBookImpl ();
            while (flag){
                countMenu = scanner.nextInt ();
                flag = controllerPhoneBookImpl.phoneBookEndPoint (countMenu);
                System.out.println ("Введите цифру меню: ");
            }
        }
    }
}
