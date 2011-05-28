package item30.enums;

/**
 * Created by IntelliJ IDEA.
 * User: shivprb
 * Date: Oct 27, 2009
 * Time: 4:34:14 PM
 */
public class Calculator {
    public enum Operations {
        ADD{double apply(double first, double second) {return first+second;}},
        SUBTRACT{double apply(double first, double second) {return first-second;}};

        abstract  double apply(double first, double second);
    }
}
