package ru.gb.dz_2.Participants;

import ru.gb.dz_2.Equipment.SportsEquipment;

import java.util.Random;

public abstract class Model {
    protected int heightJump;
    protected int rangeRun;

    public Model () {
        this.heightJump = new Random ().nextInt (100);
        this.rangeRun = new Random ().nextInt (100);
    }

    protected abstract void run (SportsEquipment obj);

    protected abstract void jump (SportsEquipment obj);

    public int getHeightJump () {
        return heightJump;
    }

    public int getRangeRun () {
        return rangeRun;
    }
}
