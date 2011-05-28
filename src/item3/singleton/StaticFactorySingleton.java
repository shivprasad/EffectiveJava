package item3.singleton;

/**
 * Created by IntelliJ IDEA.
 * User: shivprb
 * Date: Oct 26, 2009
 * Time: 3:34:50 PM
 */
public class StaticFactorySingleton {

    private static final StaticFactorySingleton INSTANCE = new StaticFactorySingleton(); 

    public static StaticFactorySingleton getInstance(){
        return INSTANCE;
    }

    private StaticFactorySingleton(){ /* using reflection one can make this contructor public and create another instance */ }

    public void doSomething(){ }
    
}
