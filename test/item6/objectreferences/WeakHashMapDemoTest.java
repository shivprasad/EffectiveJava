package item6.objectreferences;

import junit.framework.TestCase;
import org.junit.Test;
import item2.builder.Person;

/**
 * Created by IntelliJ IDEA.
 * User: shivprb
 * Date: Oct 26, 2009
 * Time: 3:54:38 PM
 */
public class WeakHashMapDemoTest {

    @Test
    public void shouldTestWeakHashMap(){
        Person key = new Person.Builder().firstName("Shivprasad").build();
        WeakHashMapDemo.INSTANCE.put(key,29);

        System.out.println("Size of Map - "+WeakHashMapDemo.INSTANCE.size());

        key = null;

        System.gc();

        System.out.println("Size of Map - "+WeakHashMapDemo.INSTANCE.size());
    }

}
