package ru.gb.mvc.controller;

import ru.gb.mvc.service.ServicePhoneBook;

public class ControllerPhoneBook {
    private ServicePhoneBook servicePhoneBook;

    public ControllerPhoneBook () {
        this.servicePhoneBook = new ServicePhoneBook();
    }

    public void phoneBookEndPoint(int numMenu){
        switch (numMenu){
            case 1:
                servicePhoneBook.createPhoneBookUser ();
                break;
        }
    }

}
