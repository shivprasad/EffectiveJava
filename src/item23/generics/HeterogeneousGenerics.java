package item23.generics;

import java.util.Map;
import java.util.HashMap;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: shivprb
 * Date: Oct 27, 2009
 * Time: 3:50:25 PM
 */
public class HeterogeneousGenerics {

    private Map<Class<?>,Object> favorites = new HashMap<Class<?>, Object>();

    public <T> void putFavorite(Class<T> clazz,T instance){
        favorites.put(clazz,clazz.cast(instance));        
    }

    public <T> T getFavorite(Class<T> clazz){
        return clazz.cast(favorites.get(clazz));
    }

    public static void main(String[] args) {
        HeterogeneousGenerics heterogeneousGenerics = new HeterogeneousGenerics();

        heterogeneousGenerics.putFavorite(String.class,"String");
        heterogeneousGenerics.putFavorite(Integer.class,1);
        heterogeneousGenerics.putFavorite(Date.class,new Date());

        System.out.println("Getting Time in milli - "+heterogeneousGenerics.getFavorite(Date.class).getTime());
    }

}
