package ru.gb.mvc.controller;
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
    private ServicePhoneBookImpl servicePhoneBookImpl;

    public ControllerPhoneBookImpl () {
        this.servicePhoneBookImpl = new ServicePhoneBookImpl ();
    }

    public boolean phoneBookEndPoint(int countMenu){
        switch (countMenu){
            case 1:
                servicePhoneBookImpl.allPhoneBookUser ();
                return true;
            case 2:
                servicePhoneBookImpl.addPhoneBookUser ();
                return true;
            case 3:
                servicePhoneBookImpl.findPhoneBookUser ();
                return true;
            case 4:
                servicePhoneBookImpl.updatePhoneBookUser ();
                return true;
            case 5:
                servicePhoneBookImpl.deletedPhoneBookUser ();
                return true;
            case 6:
                servicePhoneBookImpl.importFilePhoneBookUser ();
                return true;
            case 7:
                servicePhoneBookImpl.exportFilePhoneBookUser ();
                return true;
            case 8:
                return false;

        }
        System.out.println ("Вы выбрали не соответствующий пункт меню!\n"+
                "нужно было в вести цифры с 1 - 8");
        return false;
    }

}
