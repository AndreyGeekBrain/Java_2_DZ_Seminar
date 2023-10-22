package ru.gb.mvc.service;

/**
 * Принцип разделения интерфейса (Interface Segregation Principle),
 * все интерфейсы тонкие нет пустых заглушек.
 * */

public interface BookUpdateUser {
    void updatePhoneBookUser();
}
