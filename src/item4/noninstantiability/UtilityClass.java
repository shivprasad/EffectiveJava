package item4.noninstantiability;

import java.util.Collections;
import java.util.WeakHashMap;

/**
 * Created by IntelliJ IDEA.
 * User: shivprb
 * Date: Oct 26, 2009
 * Time: 3:42:01 PM
 */
public class UtilityClass {

    private UtilityClass(){
        // This is a utility class and no one should create object of this class or extend from it
        throw new AssertionError();
    }
    
}
