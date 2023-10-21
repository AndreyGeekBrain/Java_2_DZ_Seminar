package ru.gb.mvc.service;

import ru.gb.mvc.models.PhoneBook;
import ru.gb.mvc.models.PhoneBookUser;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class ServicePhoneBook {

    PhoneBook phoneBook;

    public ServicePhoneBook () {
        this.phoneBook = new PhoneBook();
        phoneBook.getPhoneBookUserList ().add (new PhoneBookUser ("Robin1","Bobin1","123-22-33"));
        phoneBook.getPhoneBookUserList ().add (new PhoneBookUser ("Robin2","Bobin2","123-22-33"));
        phoneBook.getPhoneBookUserList ().add (new PhoneBookUser ("Robin3","Bobin3","123-22-33"));
        phoneBook.getPhoneBookUserList ().add (new PhoneBookUser ("Robin1","Bobin4","123-22-33"));
        phoneBook.getPhoneBookUserList ().add (new PhoneBookUser ("Robin5","Bobin5","123-22-33"));
    }

    public void viewPhoneBookUser(){
        for (PhoneBookUser phoneBookUser:phoneBook.getPhoneBookUserList ()) {
            System.out.println (phoneBookUser);
        }
    }
    public void addPhoneBookUser(){
        System.out.println ("Меню создания новой записи в телефонной книге:");
        Scanner scanner = new Scanner (System.in);
        PhoneBookUser phoneBookUser = new PhoneBookUser ();
        System.out.println ("Введите имя контакта: ");
        phoneBookUser.setFirstName (scanner.nextLine ());
        System.out.println ("Введите фамилию контакта: ");
        phoneBookUser.setLastName (scanner.nextLine ());
        System.out.println ("Введите телефонный номер контакта: ");
        phoneBookUser.setPhoneNumber (scanner.nextLine ());
        phoneBook.getPhoneBookUserList ().add (phoneBookUser);
    }
    public void findPhoneBookUser(){
        System.out.println ("Введите критерий поиска ( имя || фамилия || телефон ||): ");
        Scanner scanner = new Scanner (System.in);
        String msg = scanner.nextLine ();
        for (PhoneBookUser p: phoneBook.getPhoneBookUserList ()) {
            if (p.getFirstName ().equals (msg)){
                System.out.println (p);
            }
            if (p.getLastName ().equals (msg)){
                System.out.println (p);
            }
            if (p.getPhoneNumber ().equals (msg)){
                System.out.println (p);
            }
        }
    }
    public void updatePhoneBookUser(){
        this.viewPhoneBookUser ();
        System.out.println ("Введите id контакта из списка выше, " +
                "данные которого вы хотите поменять: ");
        Scanner scanner = new Scanner (System.in);
        int idBookUser = -1;
        if(scanner.hasNextInt ()){
            idBookUser = scanner.nextInt ();
            for (int i = 0; i < phoneBook.getPhoneBookUserList ().size () ; i++) {
                if (phoneBook.getPhoneBookUserList ().get (i).
                        getIdUserBook () == idBookUser){
                    System.out.println ("Введите новое имя контакта");
                    phoneBook.getPhoneBookUserList ().get (i).setFirstName (scanner.nextLine ());
                    System.out.println ("Введите новую фамилию контакта");
                    phoneBook.getPhoneBookUserList ().get (i).setLastName (scanner.nextLine ());
                    System.out.println ("Введите новый телефон");
                    phoneBook.getPhoneBookUserList ().get (i).setPhoneNumber (scanner.nextLine ());
                    break;
                }
            }
        }else {
            System.out.println ("Вы ввели id не число!");
            return;}
    }
    public void deletedPhoneBookUser(){
        this.viewPhoneBookUser ();
        System.out.println ("Введите id контакта из списка выше, " +
                "данные которого вы хотите удалить: ");
        Scanner scanner = new Scanner (System.in);
        int idBookUser = -1;
        PhoneBookUser phoneBookUser = null;
        if(scanner.hasNextInt ()){
            idBookUser = scanner.nextInt ();
            Iterator<PhoneBookUser> iterator = phoneBook.getPhoneBookUserList ().iterator ();
            while (iterator.hasNext ()){
                PhoneBookUser phoneBookUser1 = iterator.next ();
                if (phoneBookUser1.getIdUserBook () == idBookUser){
                    phoneBook.getPhoneBookUserList ().remove (phoneBookUser1);
                    break;
                }
            }
        }else {
            System.out.println ("Вы ввели id не число!");
            return;
        }
    }

    public void importFilePhoneBookUser(){
        System.out.println ("public void importFilePhoneBookUser()");
    }

    public void exportFilePhoneBookUser(){
        System.out.println ("public void exportFilePhoneBookUser()");
    }

    public void exitFilePhoneBookUser(){
        System.out.println ("public void exitFilePhoneBookUser()");
    }
}
