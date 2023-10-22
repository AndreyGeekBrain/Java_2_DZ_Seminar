package ru.gb.mvc.controller;
import ru.gb.mvc.service.DataBooksService;
import ru.gb.mvc.service.ServicePhoneBookImpl;

/*
 * Single Responsibility Principle
 * Данный класс функционально отвечает только за
 * принятие дынных от пользователя с front и на основании полученного числа
 * вызвать соответствующий метод с уровня service.
 *
 * Принцип инверсии зависимостей (Dependency Inversion Principle)
 * ServicePhoneBookImpl servicePhoneBookImpl -  мы инжектим класс, который
 * реализует функциональные интерфейсы
 *
 * */

public class ControllerPhoneBookImpl {
    private DataBooksService dataBooksService;

    public ControllerPhoneBookImpl () {
        this.dataBooksService = new ServicePhoneBookImpl ();
    }

    public boolean phoneBookEndPoint(int countMenu){
        switch (countMenu){
            case 1:
                dataBooksService.allPhoneBookUser ();
                return true;
            case 2:
                dataBooksService.addPhoneBookUser ();
                return true;
            case 3:
                dataBooksService.findPhoneBookUser ();
                return true;
            case 4:
                dataBooksService.updatePhoneBookUser ();
                return true;
            case 5:
                dataBooksService.deletedPhoneBookUser ();
                return true;
            case 6:
                dataBooksService.importFilePhoneBookUser ();
                return true;
            case 7:
                dataBooksService.exportFilePhoneBookUser ();
                return true;
            case 8:
                return false;

        }
        System.out.println ("Вы выбрали не соответствующий пункт меню!\n"+
                "нужно было в вести цифры с 1 - 8");
        return false;
    }

}
