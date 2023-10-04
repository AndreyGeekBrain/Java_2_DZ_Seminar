package ru.gb.java.courses_2.step_1;

import java.util.Arrays;

public class Basket {
private Products[] purchasedGoods;

    public Basket (Products[] purchasedGoods) {
        this.purchasedGoods = purchasedGoods;
    }

    public Products[] getPurchasedGoods () {
        return purchasedGoods;
    }

    public void setPurchasedGoods (Products[] purchasedGoods) {
        this.purchasedGoods = purchasedGoods;
    }

    @Override
    public String toString () {
        return "Basket{" +
                "purchasedGoods=" + Arrays.toString (purchasedGoods) +
                '}';
    }
}
