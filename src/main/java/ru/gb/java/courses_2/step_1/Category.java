package ru.gb.java.courses_2.step_1;

import java.util.Arrays;

public class Category {

    private String name;
    private Products[] products;

    public Category (String name, Products[] products) {
        this.name = name;
        this.products = products;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    @Override
    public String toString () {
        return "Category{" +
                "name='" + name + '\'' +
                ", products=" + Arrays.toString (products) +
                '}';
    }

    public Products[] getProducts () {
        return products;
    }

    public void setProducts (Products[] products) {
        this.products = products;
    }
}
