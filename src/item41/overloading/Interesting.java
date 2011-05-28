package item41.overloading;

import java.util.TreeSet;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: shivprb
 * Date: Oct 27, 2009
 * Time: 5:50:41 PM
 */
public class Interesting {

    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<Integer>();
        List<Integer> list = new ArrayList<Integer>();

        for(int i=-3;i<4;i++){
            set.add(i);
            list.add(i);
        }

        System.out.println("Set - "+set);
        System.out.println("List - "+list);

        for(int i=0;i<4;i++){
            set.remove(i);
            list.remove(i);
        }

        System.out.println("Set - "+set);
        System.out.println("List - "+list);

    }

}
