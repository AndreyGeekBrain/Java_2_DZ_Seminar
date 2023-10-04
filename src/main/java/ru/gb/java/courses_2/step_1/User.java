package ru.gb.java.courses_2.step_1;

public class User {
    private String login;
    private String password;
    private Basket basketUser;

    public User (String login, String password, Basket basketUser) {
        this.login = login;
        this.password = password;
        this.basketUser = basketUser;
    }

    public void buyGoods (Category magazine, int numberCount) {
        this.basketUser.getPurchasedGoods ()[numberCount] = magazine.getProducts ()[numberCount];
        magazine.getProducts ()[numberCount] = null;
    }

    public void showBuyGoods () {
        for (Products good : basketUser.getPurchasedGoods ()) {
            if (good != null) {
                System.out.println (login + " купил " + good);
            }
        }
    }


    public String getLogin () {
        return login;
    }

    public void setLogin (String login) {
        this.login = login;
    }

    public String getPassword () {
        return password;
    }

    public void setPassword (String password) {
        this.password = password;
    }

    public Basket getBasketUser () {
        return basketUser;
    }

    public void setBasketUser (Basket basketUser) {
        this.basketUser = basketUser;
    }

    @Override
    public String toString () {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", basketUser=" + basketUser +
                '}';
    }
}

