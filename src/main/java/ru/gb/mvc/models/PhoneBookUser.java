package ru.gb.mvc.models;

public class PhoneBookUser {
    private static int countId = 0;
    private int idUserBook;
    private String firstName;
    private String lastName;
    private String phoneNumber;

    public PhoneBookUser (String firstName, String lastName, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        PhoneBookUser.setCountId (PhoneBookUser.getCountId ()+1);
        this.idUserBook = PhoneBookUser.getCountId ();
    }

    public static int getCountId () {
        return countId;
    }

    public static void setCountId (int countId) {
        PhoneBookUser.countId = countId;
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
