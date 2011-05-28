package item1.staticfactory.serviceprovider.api;

import item1.staticfactory.serviceprovider.api.NumberSeriesProvider;
import item1.staticfactory.serviceprovider.api.NumberSeriesService;
import item1.staticfactory.ParameterizedTypeInstances;

import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: shivprb
 * Date: Oct 3, 2009
 * Time: 10:05:21 AM
 * To change this template use File | Settings | File Templates.
 */
public class NumberSeriesServices {

    private NumberSeriesServices(){}

    private static final Map<NumberSeries, NumberSeriesProvider> providers = ParameterizedTypeInstances.createMap();

    public static NumberSeriesService newInstance(NumberSeries name){
        return providers.get(name).newService();
    }

    public static void registerProvider(NumberSeries name, NumberSeriesProvider provider){
        providers.put(name,provider);
    }
    
}
