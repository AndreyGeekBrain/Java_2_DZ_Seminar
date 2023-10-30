package ru.gb.calc.model.factorymethod.calculator;

import ru.gb.calc.model.factorymethod.calculator.Abstractions.AbstractCalculatorComplex;

public class CalculatorComplexSum extends AbstractCalculatorComplex {

    @Override
    public String calculatingValueOfComplexNumber (int z1_real, int z1_complex,
                                                   int z2_real, int z2_complex) {
        StringBuilder stringBuilder = new StringBuilder ();
        stringBuilder.append (z1_real+z2_real);
        if(z1_complex+z2_complex>0){
            stringBuilder.append ('+');
            stringBuilder.append (z1_complex+z2_complex);
            stringBuilder.append ('i');
        }else {
            stringBuilder.append (z1_complex+z2_complex);
            stringBuilder.append ('i');
        }
        return stringBuilder.toString ();
    }
}
