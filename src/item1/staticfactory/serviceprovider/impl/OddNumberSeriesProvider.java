package item1.staticfactory.serviceprovider.impl;

import item1.staticfactory.serviceprovider.api.NumberSeriesProvider;
import item1.staticfactory.serviceprovider.api.NumberSeriesService;

/**
 * Created by IntelliJ IDEA.
 * User: shivprb
 * Date: Oct 26, 2009
 * Time: 2:57:06 PM
 */
public class OddNumberSeriesProvider implements NumberSeriesProvider {
    public NumberSeriesService newService() {
        return new OddNumberSeriesService();
    }
}
