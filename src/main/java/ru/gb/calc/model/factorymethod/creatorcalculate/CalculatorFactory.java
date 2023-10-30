package ru.gb.calc.model.factorymethod.creatorcalculate;


import ru.gb.calc.model.factorymethod.calculator.Abstractions.AbstractCalculatorComplex;
import ru.gb.calc.model.factorymethod.calculator.CalculatorComplexDev;
import ru.gb.calc.model.factorymethod.calculator.CalculatorComplexMod;
import ru.gb.calc.model.factorymethod.calculator.CalculatorComplexSum;

public class CalculatorFactory {

    public AbstractCalculatorComplex calculatorComplexCreator (int menuNumber){
        AbstractCalculatorComplex calculatorComplex = null;
        switch (menuNumber){
            case 0:
                calculatorComplex = new CalculatorComplexMod ();
                break;
            case 1:
                calculatorComplex = new CalculatorComplexSum ();
                break;
            case 2:
                calculatorComplex = new CalculatorComplexDev ();
                break;
        }
        return calculatorComplex;
    }
}
