package ru.gb.couses_2;

import java.util.Random;

public class RusAlphabet extends AbstractGame {

    public RusAlphabet (String name, int numberSequence, int maxTry) {
        super (name, numberSequence, maxTry);
    }

    @Override
    protected String generateWord (int numberSequence) {
        return generateCharList (numberSequence);

    }

    @Override
    protected String generateCharList (int numberSequence) {
        int numberRandom = -1;
        StringBuilder stringBuilder = new StringBuilder ();
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        for (int i = 0; i < numberSequence; i++) {
            numberRandom =  new Random ().nextInt (numberSequence);
            stringBuilder.append (abc.charAt (numberRandom));
        }
        return stringBuilder.toString ();    }
}
