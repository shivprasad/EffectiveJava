package item42.varargs;

/**
 * Created by IntelliJ IDEA.
 * User: shivprb
 * Date: Oct 27, 2009
 * Time: 5:55:58 PM
 */
public class VarArgsDemo {

    public static int sumOf(int... args){
        int sum=0;
        for(int arg:args){
            sum+=arg;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOf(1,2,3));
        System.out.println(sumOf(1,2,3,4,5,6));
        System.out.println(sumOf());
    }

}
