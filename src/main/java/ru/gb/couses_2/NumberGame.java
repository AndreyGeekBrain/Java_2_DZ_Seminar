package ru.gb.couses_2;

import java.util.Random;

public class NumberGame extends AbstractGame {

    public NumberGame (String name, int numberSequence, int maxTry) {
        super (name, numberSequence, maxTry);
    }

    @Override
    protected String generateWord (int numberSequence) {
        return generateCharList (numberSequence);
    }

    @Override
    protected String generateCharList (int numberSequence) {
        StringBuilder stringBuilder = new StringBuilder ();
        for (int i = 0; i < numberSequence; i++) {
            stringBuilder.append (new Random ().nextInt (9));
        }
        return stringBuilder.toString ();
    }
}
