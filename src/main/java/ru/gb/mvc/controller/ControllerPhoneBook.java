package ru.gb.mvc.controller;

import ru.gb.mvc.service.ServicePhoneBook;

public class ControllerPhoneBook {
    private ServicePhoneBook servicePhoneBook;

    public ControllerPhoneBook () {
        this.servicePhoneBook = new ServicePhoneBook();
    }

    public boolean phoneBookEndPoint(int countMenu){
        switch (countMenu){
            case 1:
                servicePhoneBook.viewPhoneBookUser ();
                return true;
            case 2:
                servicePhoneBook.addPhoneBookUser ();
                return true;
            case 3:
                servicePhoneBook.findPhoneBookUser ();
                return true;
            case 4:
                servicePhoneBook.updatePhoneBookUser ();
                return true;
            case 5:
                servicePhoneBook.deletedPhoneBookUser ();
                return true;
            case 6:
                servicePhoneBook.importFilePhoneBookUser ();
                return true;
            case 7:
                servicePhoneBook.exportFilePhoneBookUser ();
                return true;
            case 8:
                servicePhoneBook.exitFilePhoneBookUser ();
                return false;

        }
        System.out.println ("Вы выбрали не соответствующий пункт меню!\n"+
                "нужно было в вести цифры с 1 - 8");
        return false;
    }

}
