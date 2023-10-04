package ru.gb.java.courses_2.step_1;

public class Products {
    private String name;
    private long cost;
    private int rating;

    public Products (String name, long cost, int rating) {
        this.name = name;
        this.cost = cost;
        this.rating = rating;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public long getCost () {
        return cost;
    }

    public void setCost (long cost) {
        this.cost = cost;
    }

    public int getRating () {
        return rating;
    }

    public void setRating (int rating) {
        this.rating = rating;
    }

    @Override
    public String toString () {
        return "Products{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", rating=" + rating +
                '}';
    }
}
