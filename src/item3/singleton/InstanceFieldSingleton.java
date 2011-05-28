package item3.singleton;

/**
 * Created by IntelliJ IDEA.
 * User: shivprb
 * Date: Oct 26, 2009
 * Time: 3:30:35 PM
 */
public class InstanceFieldSingleton {

    public static final InstanceFieldSingleton INSTANCE = new InstanceFieldSingleton();

    private InstanceFieldSingleton(){ /* using reflection one can make this contructor public and create another instance */    }

    public void doSomething(){ }
}
