package item1.staticfactory.serviceprovider.impl;

import item1.staticfactory.serviceprovider.api.NumberSeriesService;
import item1.staticfactory.serviceprovider.api.NumberSeriesProvider;

/**
 * Created by IntelliJ IDEA.
 * User: shivprb
 * Date: Oct 26, 2009
 * Time: 12:58:36 PM
 * To change this template use File | Settings | File Templates.
 */
public class EvenNumberSeriesProvider implements NumberSeriesProvider{

    public NumberSeriesService newService() {
        return new EvenNumberSeriesService();
    }
}
