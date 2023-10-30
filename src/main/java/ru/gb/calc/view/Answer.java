package ru.gb.calc.view;

import ru.gb.calc.model.factorymethod.calculator.Abstractions.AbstractCalculatorComplex;

public class Answer {
    public void printDisplayUser(String str,int menuNumber){
        System.out.printf ("Результат действия %s равен %s",
                ActionsComplexNumber.values ()[menuNumber],str);
    }
}
