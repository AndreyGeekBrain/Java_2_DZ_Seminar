package model.entity;

import java.util.ArrayList;

public class LotteryToys {

    private ArrayList<Toy> toyListLottery;
    private ArrayList<Toy> toyPrizeList;

    public LotteryToys () {
        this.toyListLottery = new ArrayList<> ();
        this.toyPrizeList = new ArrayList<> ();
    }

    public ArrayList<Toy> getToyListLottery () {
        return toyListLottery;
    }

    public void setToyListLottery (ArrayList<Toy> toyListLottery) {
        this.toyListLottery = toyListLottery;
    }

    public ArrayList<Toy> getToyPrizeList () {
        return toyPrizeList;
    }

    public void setToyPrizeList (ArrayList<Toy> toyPrizeList) {
        this.toyPrizeList = toyPrizeList;
    }

    @Override
    public String toString () {
        return "LotteryToys{" +
                "toyListLottery=" + toyListLottery +
                '}';
    }
}
