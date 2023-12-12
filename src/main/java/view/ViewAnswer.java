package view;

import model.entity.Toy;

import java.util.ArrayList;

public class ViewAnswer {

    public void viewListLotteryToy (ArrayList<Toy> arrayListToy) {
        System.out.println ("===================================================");
        System.out.println ("Список участвующих в лотереи игрушек и сладостей!!!");
        System.out.println ("===================================================");
        for (Toy toy : arrayListToy) {
            System.out.println (toy);
        }
    }

    public void viewListLotteryToyPrize (ArrayList<Toy> arrayListToy) {
        System.out.println ("===================================================");
        System.out.println ("Список выпавших в лотереи игрушек и сладостей!!!");
        System.out.println ("===================================================");
        for (Toy toy : arrayListToy) {
            System.out.println (toy);
        }
    }

    public void toyPrize(Toy toy){
        System.out.println ("===================================================");
        System.out.println ("ВЫ ВЫИГРАЛИ!!!");
        System.out.println ("===================================================");
        System.out.println (toy);
        System.out.println ("===================================================");
    }

    public void eror(String eror){
        System.out.println ("===================================================");
        System.out.println ("Ошибка!!!");
        System.out.println (eror);
        System.out.println ("===================================================");
    }

    public void viewListShopToys (ArrayList<Toy> arrayListToy) {
        System.out.println ("===================================================");
        System.out.println ("Список игрушек, который есть в магазине !!!");
        System.out.println ("===================================================");
        for (Toy toy : arrayListToy) {
            System.out.println (toy);
        }
    }

}