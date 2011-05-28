package item1.staticfactory;

import java.util.Map;
import java.util.HashMap;

/**
 * Created by IntelliJ IDEA.
 * User: shivprb
 * Date: Oct 26, 2009
 * Time: 12:43:03 PM
 * To change this template use File | Settings | File Templates.
 */
public class ParameterizedTypeInstances {

    public static void main(String[] args) {
        Map<String,Integer> myTestMap = createMap();

        myTestMap.put("Test1",1);
        myTestMap.put("Test2",2);
        myTestMap.put("Test3",3);
        myTestMap.put("Test4",4);

        System.out.println("Getting from map value for key Test2 - "+myTestMap.get("Test2"));

        Map<Integer,String> myAnotherMap = createMap();

        myAnotherMap.put(2,"Test2");

        System.out.println("Getting from map value for key 2 - "+myAnotherMap.get(2));

    }

    public static <K,V> Map<K, V> createMap() {
        return new HashMap<K,V>();
    }

}
