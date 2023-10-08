package ru.gb.dz_2.Participants;

import ru.gb.dz_2.Equipment.SportsEquipment;
import ru.gb.dz_2.Equipment.Treadmill;
import ru.gb.dz_2.Equipment.Wall;

public class Human extends Alive {

    private int humanCount = 0;

    public Human () {
        this.humanCount = Alive.getCount();
    }

    private boolean flag = true;

    @Override
    public void run (SportsEquipment obj) {
        if (obj instanceof Treadmill&& flag) {
            if (this.getRangeRun () > ((Treadmill) obj).getRangeTreadmill ()) {
                System.out.printf ("Успешно пробежал участник с номером %d класс: %s \n", getHumanCount(),getClass ());
            } else {
                flag = false;
                System.out.printf ("НЕ пробежал участник с номером %d класс: %s \n ",getHumanCount(),getClass ());
            }
        }
    }

    @Override
    public void jump (SportsEquipment obj) {
        if (obj instanceof Wall&& flag) {
            if (this.getRangeRun () > ((Wall) obj).getHeightWall ()) {
                System.out.printf ("Успешно прыгнул участник с номером %d класс: %s \n", getHumanCount(),getClass ());
            } else {
                flag = false;
                System.out.printf ("НЕ прыгнул участник с номером %d класс: %s \n ",getHumanCount(),getClass ());
            }
        }
    }

    public int getHumanCount() {
        return humanCount;
    }
}
