package ru.gb.mvc.models;

/**
 * Принцип подстановки Барбары Лисков, у нас есть родитель User и,
 * мы в классе PhoneBookUser его расширяем. Если где-то в коде, мы
 * вместо User подставим PhoneBookUser мы ничего не сломаем.
 */

public class PhoneBookUser extends User {
    private int idUserBook;
    private String firstName;
    private String lastName;
    private String phoneNumber;

    public PhoneBookUser (String firstName, String lastName, String phoneNumber) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.idUserBook = super.getCountId ();
    }
    public PhoneBookUser () {
        super();
        this.idUserBook = super.getCountId ();
    }

    public String getFirstName () {
        return firstName;
    }

    public void setFirstName (String firstName) {
        this.firstName = firstName;
    }

    public String getLastName () {
        return lastName;
    }

    public void setLastName (String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber () {
        return phoneNumber;
    }

    public void setPhoneNumber (String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getIdUserBook () {
        return idUserBook;
    }

    @Override
    public String toString () {
        return "PhoneBookUser{" +
                "idUserBook=" + idUserBook +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
