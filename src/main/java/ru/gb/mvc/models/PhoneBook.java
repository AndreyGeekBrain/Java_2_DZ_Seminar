package ru.gb.mvc.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Принцип подстановки Барбары Лисков, у нас есть родитель Books и,
 * мы в классе PhoneBooK его расширяем. Если где-то в коде, мы
 * вместо Books подставим PhoneBooK мы ничего не сломаем.
 */

public class PhoneBook extends Books {
    List<PhoneBookUser> phoneBookUserList;

    public PhoneBook () {
        this.phoneBookUserList = new ArrayList<> ();
    }

    public List<PhoneBookUser> getPhoneBookUserList () {
        return phoneBookUserList;
    }

}
