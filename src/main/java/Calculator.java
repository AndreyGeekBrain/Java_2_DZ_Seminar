import java.util.List;

public class Calculator <T extends Number> {

    private List<T> tList;

    public Calculator (List<T> tList) {
        this.tList = tList;
    }

    public List<T> gettList () {
        return tList;
    }

    public void settList (List<T> tList) {
        this.tList = tList;
    }

    public double sum (List<T> tList) {
        double sum = 0.0d;
        for (int i = 0; i < tList.size (); i++) {
            sum += tList.get (i).doubleValue ();
        }
        return sum;
    }

    public double multiplication (List<T> tList) {
        double mul = 1.0d;
        for (int i = 0; i < tList.size (); i++) {
            mul *= tList.get (i).doubleValue ();
        }
        return mul;
    }

    public double division (List<T> tList) {
        double div = 1.0d;
        for (int i = 0; i < tList.size (); i++) {
            div /= tList.get (i).doubleValue ();
        }
        return div;
    }

}
