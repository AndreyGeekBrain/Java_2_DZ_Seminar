package ru.gb.calc.model;

import ru.gb.calc.model.factorymethod.calculator.Abstractions.AbstractCalculatorComplex;
import ru.gb.calc.model.factorymethod.creatorcalculate.CalculatorFactory;

public class Model {
    private CalculatorFactory factory;

    public Model () {
        this.factory = new CalculatorFactory ();
    }

    public String complexNumberModelCalculation(int z1_real, int z1_complex,
                                              int z2_real, int z2_complex,
                                              int menuCount){
        AbstractCalculatorComplex calculatorComplex = factory.calculatorComplexCreator (menuCount);
        return calculatorComplex.calculatingValueOfComplexNumber (z1_real,z1_complex,
                                                                  z2_real,z2_complex);

    }

}
