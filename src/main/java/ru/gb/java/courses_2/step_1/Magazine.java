package ru.gb.java.courses_2.step_1;

import java.util.Arrays;

public class Magazine {
    private Category[] categories;

    public Magazine (Category[] categories) {
        this.categories = categories;
    }

    public void showProducts(){
        for (Category category : categories) {
            System.out.println (category);
        }
    }

    public Category[] getCategories () {
        return categories;
    }

    public void setCategories (Category[] categories) {
        this.categories = categories;
    }

    @Override
    public String toString () {
        return "Magazine{" +
                "categories=" + Arrays.toString (categories) +
                '}';
    }
}
