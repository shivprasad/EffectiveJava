package item6.objectreferences;

import item2.builder.Person;

import java.util.Map;
import java.util.WeakHashMap;

/**
 * Created by IntelliJ IDEA.
 * User: shivprb
 * Date: Oct 26, 2009
 * Time: 3:50:39 PM
 */
public enum WeakHashMapDemo {
    INSTANCE;

    private Map<Person,Integer> map = new WeakHashMap<Person,Integer>();

    public void put(Person key, Integer value){
        map.put(key,value);
    }

    public int size(){
        return map.size();
    }

}
