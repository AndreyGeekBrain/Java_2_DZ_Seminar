package ru.gb.mvc.service;

import ru.gb.mvc.models.PhoneBook;
import ru.gb.mvc.models.PhoneBookUser;
import ru.gb.mvc.view.Answer;

import java.io.*;
import java.util.Iterator;
import java.util.Scanner;

public class ServicePhoneBook {

    PhoneBook phoneBook;
    Answer answer;

    public ServicePhoneBook () {
        this.phoneBook = new PhoneBook();
        phoneBook.getPhoneBookUserList ().add (new PhoneBookUser ("Robin1","Bobin1","123-22-33"));
        phoneBook.getPhoneBookUserList ().add (new PhoneBookUser ("Robin2","Bobin2","123-22-33"));
        phoneBook.getPhoneBookUserList ().add (new PhoneBookUser ("Robin3","Bobin3","123-22-33"));
        phoneBook.getPhoneBookUserList ().add (new PhoneBookUser ("Robin1","Bobin4","123-22-33"));
        phoneBook.getPhoneBookUserList ().add (new PhoneBookUser ("Robin5","Bobin5","123-22-33"));
        this.answer = new Answer ();
    }

    public void viewPhoneBookUser(){
        for (PhoneBookUser phoneBookUser:phoneBook.getPhoneBookUserList ()) {
            answer.getBuffer ().add (phoneBookUser.toString ());
        }
        answer.viewBufferArrayList ();
    }
    public void addPhoneBookUser(){
        answer.viewStrMsg (0);
        Scanner scanner = new Scanner (System.in);
        PhoneBookUser phoneBookUser = new PhoneBookUser ();
        answer.viewStrMsg (1);
        phoneBookUser.setFirstName (scanner.nextLine ());
        answer.viewStrMsg (2);
        phoneBookUser.setLastName (scanner.nextLine ());
        answer.viewStrMsg (3);
        phoneBookUser.setPhoneNumber (scanner.nextLine ());
        phoneBook.getPhoneBookUserList ().add (phoneBookUser);
    }
    public void findPhoneBookUser(){
        answer.viewStrMsg (4);
        Scanner scanner = new Scanner (System.in);
        String msg = scanner.nextLine ();
        for (PhoneBookUser p: phoneBook.getPhoneBookUserList ()) {
            if (p.getFirstName ().equals (msg)){
                answer.getBuffer ().add (p.toString ());
            }
            if (p.getLastName ().equals (msg)){
                answer.getBuffer ().add (p.toString ());
            }
            if (p.getPhoneNumber ().equals (msg)){
                answer.getBuffer ().add (p.toString ());
            }
        }
        answer.viewBufferArrayList ();
    }
    public void updatePhoneBookUser(){
        this.viewPhoneBookUser ();
        answer.viewStrMsg (5);
        Scanner scanner = new Scanner (System.in);
        int idBookUser = -1;
        if(scanner.hasNextInt ()){
            idBookUser = scanner.nextInt ();
            for (int i = 0; i < phoneBook.getPhoneBookUserList ().size () ; i++) {
                if (phoneBook.getPhoneBookUserList ().get (i).getIdUserBook () == idBookUser){
                    answer.viewStrMsg (6);
                    phoneBook.getPhoneBookUserList ().get (i).setFirstName (scanner.nextLine ());
                    answer.viewStrMsg (7);
                    phoneBook.getPhoneBookUserList ().get (i).setLastName (scanner.nextLine ());
                    answer.viewStrMsg (8);
                    phoneBook.getPhoneBookUserList ().get (i).setPhoneNumber (scanner.nextLine ());
                    break;
                }
            }
        }else {
            answer.viewException (5);
            return;}
    }
    public void deletedPhoneBookUser(){
        this.viewPhoneBookUser ();
        answer.viewStrMsg (9);
        Scanner scanner = new Scanner (System.in);
        int idBookUser = -1;
        PhoneBookUser phoneBookUser = null;
        if (scanner.hasNextInt ()) {
            idBookUser = scanner.nextInt ();
            Iterator<PhoneBookUser> iterator = phoneBook.getPhoneBookUserList ().iterator ();
            while (iterator.hasNext ()) {
                PhoneBookUser phoneBookUser1 = iterator.next ();
                if (phoneBookUser1.getIdUserBook () == idBookUser) {
                    phoneBook.getPhoneBookUserList ().remove (phoneBookUser1);
                    break;
                }
            }
        } else {
            answer.viewException (4);
            return;
        }
    }

    public void importFilePhoneBookUser () {
        Scanner scanner = new Scanner (System.in);
        answer.viewStrMsg (11);
        answer.viewStrMsg (10);
        String path = scanner.nextLine ();
        File file = new File (path);
        try (BufferedReader reader = new BufferedReader (new FileReader (file))
        ) {
            String line = null;
            String[] arrayStr = null;
            while ((line = reader.readLine ()) != null) {
                arrayStr = line.split (" ");
                if (arrayStr.length == 3) {
                    phoneBook.getPhoneBookUserList ().
                            add (new PhoneBookUser (arrayStr[0], arrayStr[1], arrayStr[2]));
                } else {
                    answer.viewException (0);

                }
            }
        } catch (FileNotFoundException e) {
            answer.viewException (1);
        } catch (IOException e) {
            answer.viewException (2);
        }
    }

    public void exportFilePhoneBookUser () {
        File file = new File ("contactPhoneBook.txt");
        try (BufferedWriter bufferedWriter = new BufferedWriter (new FileWriter (file))) {
            for (PhoneBookUser phoneBookUser: phoneBook.getPhoneBookUserList ()) {
                bufferedWriter.write (phoneBookUser.toString ()+"\n");
            }
            bufferedWriter.flush ();
            answer.getBuffer ().add ("файл ( contactPhoneBook.txt ) с экспортированными " +
                    "контактами находится в папке:  "+ file.getAbsolutePath ());
            answer.viewBufferArrayList ();
        } catch (IOException e) {
            answer.viewException (3);
        }
    }
}
