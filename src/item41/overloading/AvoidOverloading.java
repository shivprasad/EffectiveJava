package item41.overloading;

import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: shivprb
 * Date: Oct 27, 2009
 * Time: 5:42:48 PM
 */
public class AvoidOverloading {

    public static String classify(Set s){
        return "Set";
    }

    public static String classify(List s){
        return "List";
    }

    public static String classify(Collection s){
        return "Collection";        
    }

    public static void main(String[] args) {
        Collection[] collection = {new HashSet(),new ArrayList(),new HashMap().values()};

        for (Collection c : collection){
            System.out.println(classify(c));
        }
    }

}
