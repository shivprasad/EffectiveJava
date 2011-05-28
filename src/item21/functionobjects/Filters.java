package item21.functionobjects;

/**
 * Created by IntelliJ IDEA.
 * User: shivprb
 * Date: Oct 27, 2009
 * Time: 11:07:35 AM
 */
public class Filters {

    public static final NumberFilter<Integer> EVEN_NUMBER_FILTER = new NumberFilter<Integer>(){
        public boolean filter(Integer t1) {
            return t1%2==0;
        }
    };

    public static final NumberFilter<Integer> ODD_NUMBER_FILTER = new NumberFilter<Integer>(){
        public boolean filter(Integer t1) {
            return t1%2==1;
        }
    };

}
