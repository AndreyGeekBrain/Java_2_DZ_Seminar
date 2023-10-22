package ru.gb.mvc.models;

public abstract class User {
    private static int countId = 0;

    public User () {
        User.countId++;
    }

    public int getCountId () {
        return countId;
    }
}
