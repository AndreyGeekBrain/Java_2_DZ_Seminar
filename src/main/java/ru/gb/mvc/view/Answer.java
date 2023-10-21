package ru.gb.mvc.view;

import java.util.ArrayList;
import java.util.Arrays;

public class Answer {
    private ArrayList<String> msgException = new ArrayList<> (Arrays.asList (
            "данные введены не по шаблону: ({имя}пробел{фамилия}пробел{телефон}",
            "FileNotFoundException e в методе void importFilePhoneBookUser ()",
            "IOException e в методе void importFilePhoneBookUser ()",
            "IOException e в методе void exportFilePhoneBookUser ()",
            "Вы ввели id не число!  в методе void deletedPhoneBookUser()",
            "Вы ввели id не число!  в методе void updatePhoneBookUser()"
    ));
    private ArrayList<String> stringArrayList = new ArrayList<> (Arrays.asList (
            "Меню создания новой записи в телефонной книге: ",
            "Введите имя контакта: ",
            "Введите фамилию контакта: ",
            "Введите телефонный номер контакта: ",
            "Введите критерий поиска ( имя || фамилия || телефон ||): ",
            "Введите id контакта из списка выше, " +
                    "данные которого вы хотите поменять: ",
            "Введите новое имя контакта",
            "Введите новую фамилию контакта",
            "Введите новый телефон",
            "Введите id контакта из списка выше, " +
                    "данные которого вы хотите удалить: ",
            "Данные в файле должны быть записаны, " +
                    "через пробел по шаблону ({имя}пробел{фамилия}пробел{телефон})",
            "Введите абсолютный путь к импортируемому файлу на диске:  "
            )
    );
    private ArrayList<String> buffer = new ArrayList<> ();


    public ArrayList<String> getMsgException () {
        return msgException;
    }

    public ArrayList<String> getStringArrayList () {
        return stringArrayList;
    }

    public ArrayList<String> getBuffer () {
        return buffer;
    }

    public void viewBufferArrayList(){
        for (String s: this.getBuffer ()) {
            System.out.println (s);
        }
        this.getBuffer ().clear ();
    }
    public void viewStrMsg(int count){
        System.out.println (this.getStringArrayList ().get (count));
    }

    public void viewException(int count){
        System.out.println (this.getMsgException ().get (count));
    }
}
