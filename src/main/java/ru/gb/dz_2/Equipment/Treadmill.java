package ru.gb.dz_2.Equipment;

import java.util.Random;

public class Treadmill extends SportsEquipment {

    private final int rangeTreadmill;

    public Treadmill () {
        this.rangeTreadmill = new Random ().nextInt (100);
    }

    public int getRangeTreadmill () {
        return rangeTreadmill;
    }

    @Override
    public String toString () {
        return "Treadmill{" +
                "rangeTreadmill=" + rangeTreadmill +
                '}';
    }
}
