package model;

import GlobalEception.ToyWithThisIdWasNotFound;
import model.entity.LotteryToys;
import model.entity.ShopToys;
import model.entity.Toy;
import view.ViewAnswer;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;


public class ModelToyShop {

    private LotteryToys lotteryToys;
    private ShopToys shopToys;
    private Toy toy;
    private ViewAnswer viewAnswer;

    public ModelToyShop () {
        this.lotteryToys = new LotteryToys ();
        this.shopToys = new ShopToys ();
        this.viewAnswer = new ViewAnswer ();
    }

    /*
     * В данном методе происходит розыгрыш самой лотереи, мы формируем список призов вызовом
     * метода newListOfParticipatingToys () при условии, что список призов для розыгрыша равен нулю.
     * Далее рандомно определяем выпавший приз, с последующим занесением в список призов.
     */
    public void toyDrawModel () {
        if (lotteryToys.getToyListLottery ().size () == 0) {
            newListOfParticipatingToys ();
        }
        Random random = new Random ();
        for (int i = 0; i < 1; i++) {
            Toy toy = lotteryToys.getToyListLottery ().get (random.nextInt (lotteryToys.getToyListLottery ().size ()));
            lotteryToys.getToyPrizeList ().add (toy);
            viewAnswer.toyPrize (toy);
        }

    }

    /**
     * Метод выводит список призов со всех ранее проходивших розыгрышей,
     * доступный для получения участником.
     */
    public void prizeListToysLottery () {
        viewAnswer.viewListLotteryToyPrize (lotteryToys.getToyPrizeList ());
    }

    /**
     * Данный метод формирует новый список игрушек участвующих
     * в розыгрыше лотереи от магазина. Принцип следующий у нас есть у
     * каждой игрушки Priority. Чем дороже игрушка тем ниже эта величина.
     * То есть Priority == 1, это самая ценная дорогая игрушка, а
     * Priority == 10, наоборот. При создании нового списка на розыгрыш игрушек
     * мы руководствуемся, что в зависимости от значения Priority, будет рандомно
     * количественно сформирован список на розыгрыш лотереи. То есть будет например, при
     * Priority == 10, десять игрушек данной категории в общем списке на розыгрыш.
     */
    public void newListOfParticipatingToys () {
        lotteryToys.getToyListLottery ().clear ();
        ArrayList<Toy> arrayListToyPriority = new ArrayList<> ();
        Random random = new Random ();
        for (int i = 1; i < shopToys.getValueMaxPriority (); i++) {
            for (Toy toy : shopToys.getArrayListToys ()) {
                if (i == toy.getPriority ()) {
                    arrayListToyPriority.add (toy);
                }
            }
            if (arrayListToyPriority.size () != 0) {
                for (int j = 1; j <= i; j++) {
                    lotteryToys.getToyListLottery ().add (arrayListToyPriority.get (random.nextInt (arrayListToyPriority.size ())));
                }
                arrayListToyPriority.clear ();
            }
        }
        viewAnswer.viewListLotteryToy (lotteryToys.getToyListLottery ());
    }

    /**
     * Данный метод выдает приз победителю и записывает данную выдачу в файл.
     * Выданный приз удаляется из списка хранимых призов.
     *
     * @param nameWinner - метод принимает в параметрах имя победителя забирающего приз.
     * @param id         - метод принимает номер id приза, который забрал победитель.
     */

    public void winnerTakesToyModel (String nameWinner, int id) {
        try (FileWriter fileWriter = new FileWriter ("nameWinner.txt", true)) {
            Toy toy = null;
            for (Toy t : lotteryToys.getToyPrizeList ()) {
                if (t.getId () == id) {
                    toy = t;
                }
            }
            if (toy != null) {
                fileWriter.write (nameWinner + " " + toy.toString () + "\n");
                fileWriter.flush ();
                lotteryToys.getToyPrizeList ().remove (toy);
            } else {
                throw new ToyWithThisIdWasNotFound ();
            }

        } catch (IOException | ToyWithThisIdWasNotFound e) {
            viewAnswer.eror (e.getMessage ());
        }
    }

    /**
     * Метод создает и добавляет новую игрушку в номенклатуру магазина.
     *
     * @param nameToy - в метод передается название создаваемой игрушки.
     * @param priorityToy - в метод передается priority создаваемой игрушки.
     */
    public void addNewToyToStoreModel (String nameToy,int priorityToy) {
        shopToys.getArrayListToys ().add (new Toy (nameToy,priorityToy));
        viewAnswer.viewListShopToys((ArrayList<Toy>) shopToys.getArrayListToys ());
    }

    /**
     * Метод реализует функционал удаления по id игрушки из номенклатуры магазина.
     * @param id - данный параметр обозначает id удаляемой игрушки.
     */
    public void delToyToStore (int id) {
        shopToys.getArrayListToys ().removeIf (toy -> toy.getId () == id);
        viewAnswer.viewListShopToys (shopToys.getArrayListToys ());
    }
}
