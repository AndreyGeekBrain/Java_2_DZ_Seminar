package ru.gb.dz_2;

import ru.gb.dz_2.Equipment.SportsEquipment;
import ru.gb.dz_2.Equipment.Treadmill;
import ru.gb.dz_2.Equipment.Wall;
import ru.gb.dz_2.Participants.Cat;
import ru.gb.dz_2.Participants.Human;
import ru.gb.dz_2.Participants.Model;
import ru.gb.dz_2.Participants.Robot;

/**
 *
 * Домашнее задание на закрепление :
 *
 * 1) Создайте три класса: Человек, Кот, Робот, которые не наследуются от одного класса
 * но есть общий класс родитель.
 * Эти классы должны уметь бегать и прыгать, все также с выводом информации о
 * действии в консоль.
 * 2) Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники
 * должны выполнять соответствующие действия (бежать или прыгать), результат выполнения
 * печатаем в консоль (успешно пробежал, не смог пробежать и т.д.). У препятствий есть длина
 * (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
 * 3) Создайте два массива: с участниками и препятствиями, и заставьте всех участников
 * пройти
 * этот набор препятствий. Если участник не смог пройти одно из препятствий, то дальше по
 * списку он препятствий не идет.
 *
 * Формат сдачи: ссылка на гитхаб проект
 *
 * */

public class Main {

    public static void main (String[] args) {
        SportsEquipment[] sportsEquipment = new SportsEquipment[]{new Wall (),new Treadmill ()};
        Model[] model  = new Model[]{new Cat (),new Human (),new Robot ()};

        for (int i = 0; i < model.length ; i++) {
            for (int j = 0; j < sportsEquipment.length ; j++) {
                if (model[i] instanceof Cat){
                    ((Cat) model[i]).run (sportsEquipment[j]);
                    ((Cat) model[i]).jump (sportsEquipment[j]);
                }
                if (model[i] instanceof Human){
                    ((Human) model[i]).run (sportsEquipment[j]);
                    ((Human) model[i]).jump (sportsEquipment[j]);
                }
                if (model[i] instanceof Robot){
                    ((Robot) model[i]).run (sportsEquipment[j]);
                    ((Robot) model[i]).jump (sportsEquipment[j]);
                }
                }

            }

        }

    }

