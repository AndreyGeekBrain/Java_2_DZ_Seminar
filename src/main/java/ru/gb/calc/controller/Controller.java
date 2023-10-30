package ru.gb.calc.controller;


import ru.gb.calc.model.Model;
import ru.gb.calc.view.Answer;

public class Controller {
   private Model model;
   private Answer answer;

    public Controller () {
        this.model = new Model ();
        this.answer = new Answer ();
    }

    public void callEndPointCalc(int z1_real, int z1_complex,
                                 int z2_real, int z2_complex,
                                 int menuCount){

        answer.printDisplayUser (model.complexNumberModelCalculation (z1_real,z1_complex,
                z2_real,z2_complex,
                menuCount),menuCount);
    }

}
