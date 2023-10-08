package ru.gb.dz_2.Equipment;

import java.util.Random;

public class Wall extends SportsEquipment {

    private final int heightWall;

    public Wall () {
        this.heightWall = new Random ().nextInt (100);
    }

    public int getHeightWall () {
        return heightWall;
    }

    @Override
    public String toString () {
        return super.toString ();
    }
}
