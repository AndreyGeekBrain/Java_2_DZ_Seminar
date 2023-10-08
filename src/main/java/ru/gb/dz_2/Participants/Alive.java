package ru.gb.dz_2.Participants;

public abstract class Alive extends Model {
    private static int count = 0;

    public Alive () {
        count++;
    }

    public static int getCount () {
        return count;
    }
}
