import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main (String[] args) {
        Calculator<Integer> calculator = new Calculator<Integer>
                (new ArrayList<Integer> (Arrays.asList (1,2,3,4,5)));
        System.out.println (calculator.sum (calculator.gettList ()));
        System.out.println (calculator.multiplication (calculator.gettList ()));
        System.out.println (calculator.division (calculator.gettList ()));

    }

}
