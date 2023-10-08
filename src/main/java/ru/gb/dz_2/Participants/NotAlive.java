package ru.gb.dz_2.Participants;

public abstract class NotAlive extends Model {
    private static int count = 0;

    public NotAlive () {
        count++;
    }

    public static int getCount () {
        return count;
    }
}
