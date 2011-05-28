package item23.generics;

import java.util.Set;
import java.util.HashSet;

/**
 * Created by IntelliJ IDEA.
 * User: shivprb
 * Date: Oct 27, 2009
 * Time: 11:47:28 AM
 */
public class UnboundedGenerics {

    public static int common(Set<?> set1,Set<?> set2){
        int common = 0;
        for(Object s : set1){
            if(set2.contains(s))
                common++;
        }
// wont work
//         set1.add(common);
        return common;
    }


    public static void main(String[] args) {
        Set<String> s1 = new HashSet<String>();
        Set<String> s2 = new HashSet<String>();

        s1.add("A");
        s1.add("B");
        s1.add("C");
        s1.add("D");
        s1.add("E");

        s2.add("B");
        s2.add("C");
        s2.add("D");

        Set<Integer> s3 = new HashSet<Integer>();

        s3.add(1);
        s3.add(2);
        s3.add(3);

        System.out.println("Common elements - "+common(s1, s3));

    }

}
