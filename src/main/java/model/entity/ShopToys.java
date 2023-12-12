package model.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShopToys {
    private ArrayList<Toy> arrayListToys;
    private static final String address = "Спб, Гостиный Двор, ИгроГрад";
    private int valueMaxPriority = 10;


    public ShopToys(){
        this.arrayListToys = new ArrayList<> (Arrays.asList (
                new Toy("Лего Робот",1),
                new Toy("Лего Космопорт",1),
                new Toy("Лего Звездные воины",1),
                new Toy("Кукла Барби",2),
                new Toy("Кукла Кен",2),
                new Toy("Кукла Синди",2),
                new Toy("Настольные игры - 1",3),
                new Toy("Настольные игры - 2",3),
                new Toy("Настольные игры - 3",3),
                new Toy("Трансформеры - 1",4),
                new Toy("Трансформеры - 2",4),
                new Toy("Трансформеры - 3",4),
                new Toy("Игрушки - 1",5),
                new Toy("Игрушки - 2",5),
                new Toy("Игрушки - 3",5),
                new Toy("Сладости - 1",6),
                new Toy("Сладости - 2",6),
                new Toy("Сладости - 3",6)
        ));
    }

    public ArrayList<Toy> getArrayListToys () {
        return arrayListToys;
    }

    public void setArrayListToys (ArrayList<Toy> arrayListToys) {
        this.arrayListToys = arrayListToys;
    }

    public static String getAddress () {
        return address;
    }

    public int getValueMaxPriority () {
        return valueMaxPriority;
    }

    public void setValueMaxPriority (int valueMaxPriority) {
        this.valueMaxPriority = valueMaxPriority;
    }
}
