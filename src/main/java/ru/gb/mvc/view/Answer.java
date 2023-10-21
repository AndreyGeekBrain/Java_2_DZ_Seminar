package ru.gb.mvc.view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Answer {
    private ArrayList<String> msgException = new ArrayList<> (Arrays.asList (
            "данные введены не по шаблону: ({имя}пробел{фамилия}пробел{телефон}",
            "FileNotFoundException e в методе void importFilePhoneBookUser ()",
            "IOException e в методе void importFilePhoneBookUser ()",
            "IOException e в методе void exportFilePhoneBookUser ()",
            "Вы ввели id не число!  в методе void deletedPhoneBookUser()"
    ));
    private ArrayList<String> stringArrayList;

    public Answer (String msgException) {
        this.stringArrayList = new ArrayList<> ();
    }

    public Answer () {
        this.stringArrayList = new ArrayList<> ();
    }

    public ArrayList<String> getStringArrayList () {
        return stringArrayList;
    }

    public void viewAnswer(){
        for (String s: this.getStringArrayList ()) {
            System.out.println (s);
        }
        stringArrayList.clear ();
    }

    public ArrayList<String> getMsgException () {
        return msgException;
    }
}
