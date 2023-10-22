package ru.gb.mvc.models;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    List<PhoneBookUser> phoneBookUserList;

    public PhoneBook () {
        this.phoneBookUserList = new ArrayList<> ();
    }

    public List<PhoneBookUser> getPhoneBookUserList () {
        return phoneBookUserList;
    }

}
