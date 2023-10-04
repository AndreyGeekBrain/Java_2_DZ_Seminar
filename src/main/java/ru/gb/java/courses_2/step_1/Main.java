package ru.gb.java.courses_2.step_1;

public class Main {

    public static void main (String[] args) {

        Category categoryOne = new Category ("Game",new Products[]{
                new Products ("Zorro",100,5),
                new Products ("Superman",150,4),
                new Products ("MK1",90,5),
        });

        Category categoryTwo = new Category ("Food",new Products[]{
                new Products ("Fish",100,5),
                new Products ("Bread",150,4),
                new Products ("Milk",90,5),
        });

        Magazine magazine = new Magazine (new Category[]{categoryOne,categoryTwo});

        User user1 = new User ("no_name1","123",new Basket (new Products[3]));
        User user2 = new User ("no_name2","456",new Basket (new Products[3]));

        magazine.showProducts ();
        user1.buyGoods (magazine.getCategories ()[0],1);
        user2.buyGoods (magazine.getCategories ()[1],2);

        magazine.showProducts ();

        user1.showBuyGoods ();
        user2.showBuyGoods ();


    }

}
