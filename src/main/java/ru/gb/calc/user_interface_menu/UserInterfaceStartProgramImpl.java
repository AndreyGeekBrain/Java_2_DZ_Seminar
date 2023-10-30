package ru.gb.calc.user_interface_menu;

import ru.gb.calc.controller.Controller;
import ru.gb.calc.user_interface_menu.Abstracts.StartProgramMenuUser;

import java.util.Scanner;

public class UserInterfaceStartProgramImpl implements StartProgramMenuUser {
    private int z1_real;
    private int z1_complex;
    private int z2_real;
    private int z2_complex;
    private int menuCount;

    @Override
    public void startProgramUI(){
        System.out.println ("++++++++++++++++++++++++++++++++++++++ ОПИСАНИЕ РАБОТЫ ПРОГРАММЫ +++++++++++++++++++++++++++++++++++++++++");
        System.out.println ("\nДля работы калькулятора Вам требуется ввести значение выражения комплексного числа \"z\": z = a + bi,\n"+
                            "где \"а\" - это действительная часть выражения комплексного числа,\n"+
                            "а \"bi\" комплексная часть выражения \"z\".\n"+
                            "\n+++++++++++++++++++++++++++++++++++++ ВВОД ДАННЫХ +++++++++++++++++++++++++++++++++++++++++++++++++\n");
        enterComplexNumber ();
        enterActionsComplexNumber ();
        new Controller ().callEndPointCalc (
                z1_real, z1_complex,
                z2_real, z2_complex,
                menuCount);
    }

    private void enterComplexNumber (){
        System.out.println ("Введите значение действительной части первого выражения \"z1\", где \"а:\" целое число");
        this.z1_real = enterTheRealPartOfTheExpression ();
        System.out.println ("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println ("Введите значение комплексной части первого выражения \"z1\", где \"bi:\" целое комплексное число с \"i\"");
        this.z1_complex = enterTheСomplexPartOfTheExpression ();
        System.out.println ("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println ("Введите значение действительной части первого выражения \"z2\", где \"а:\" целое число");
        this.z2_real = enterTheRealPartOfTheExpression ();
        System.out.println ("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println ("Введите значение комплексной части первого выражения \"z2\", где \"bi:\" целое комплексное число с \"i\"");
        this.z2_complex = enterTheСomplexPartOfTheExpression ();
    }

    private void enterActionsComplexNumber(){

        System.out.println ("Выберите действие над комплексными числами из " +
                            "списка приведенных команд ниже:\n"+
                            "* Умножение (multiplication) выберите цифру: 0\n" +
                            "* Сложение (addition) выберите цифру: 1\n" +
                            "* Вычитание (subtraction) выберите цифру: 2 ");
        System.out.println ("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        this.menuCount = Integer.parseInt(new Scanner (System.in).nextLine ().trim ());
    }

    private int enterTheRealPartOfTheExpression () {
        Scanner zRealStr = new Scanner (System.in);
        if(zRealStr.hasNextInt ()){
            return zRealStr.nextInt ();
        }
        return 0;
    }

    private int enterTheСomplexPartOfTheExpression() {
        StringBuilder zComplexStrBilder = new StringBuilder ();
        Scanner zRealStr = new Scanner (System.in);
        char[] zComplexChar = zRealStr.nextLine ().toCharArray ();
        for (int i = 0; i < zComplexChar.length-1; i++) {
            zComplexStrBilder.append (zComplexChar[i]);
        }
        return Integer.parseInt (zComplexStrBilder.toString());
    }
}
