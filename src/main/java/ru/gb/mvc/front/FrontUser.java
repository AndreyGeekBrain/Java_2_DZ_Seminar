package ru.gb.mvc.front;

import ru.gb.mvc.controller.ControllerPhoneBook;
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
                "1. Посмотреть просмотреть телефонную книгу.\n"+
                "2. Добавить контакт в телефонную книгу.\n"+
                "3. Найти контакт в телефонной книге.\n"+
                "4. Отредактировать существующий контакт в телефонной книге.\n"+
                "5. Удалить контакт в телефонной книге.\n"+
                "6. Импортировать контакты телефонной книги в файл.\n"+
                "7. Экспортировать контакты из файла контакты в телефонную книгу.\n"+
                "8. Выход из программы.\n"+
                "Введите цифру меню: \n");
        if (scanner.hasNextInt ()){
            ControllerPhoneBook controllerPhoneBook = new ControllerPhoneBook ();
            while (flag){
                countMenu = scanner.nextInt ();
                flag = controllerPhoneBook.phoneBookEndPoint (countMenu);
                System.out.println ("Введите цифру меню: ");
            }
        }
    }

}
