package collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Stack;
import java.util.ArrayDeque;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: shivprb
 * Date: Oct 28, 2009
 * Time: 12:09:28 PM
 */
public class Demo {


    public static void main(String[] args) {
        List<Integer> elements = new CopyOnWriteArrayList<Integer>();

        elements.add(1);
        elements.add(2);
        elements.add(3);
        elements.add(4);
        elements.add(5);
        elements.add(6);
        elements.add(7);
        elements.add(8);


        
        for(Integer o:elements){
            if(o%2==0)
                elements.remove(o);
        }

    }

}
