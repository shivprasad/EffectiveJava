package item21.functionobjects;

/**
 * Created by IntelliJ IDEA.
 * User: shivprb
 * Date: Oct 27, 2009
 * Time: 11:10:11 AM
 */
public class Numbers {


    public static void printNumbers(NumberFilter<Integer> passes){
        for(int i=0;i<100;i++){
            if(passes.filter(i))
                System.out.println(i);
        }
    }

    public static void main(String[] args) {
        printNumbers(Filters.EVEN_NUMBER_FILTER);
        printNumbers(Filters.ODD_NUMBER_FILTER);
    }

}
