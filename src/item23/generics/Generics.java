package item23.generics;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by IntelliJ IDEA.
 * User: shivprb
 * Date: Oct 27, 2009
 * Time: 11:27:08 AM
 */
public class Generics {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        unsafeAdd(list,"A");
        unsafeAdd(list,"B");
        unsafeAdd(list,"C");
        unsafeAdd(list,"D");
        //unsafeAdd(list,10);

        for(String s : list){
            System.out.println(s);
        }

        for (Iterator<String> stringIterator = list.iterator(); stringIterator.hasNext();) {
            String s = stringIterator.next();
            System.out.println(s);
        }
    }

    private static void unsafeAdd(List list, Object s) {
        list.add(s);
    }

}
