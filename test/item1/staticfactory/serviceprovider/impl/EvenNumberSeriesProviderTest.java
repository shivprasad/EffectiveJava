package item1.staticfactory.serviceprovider.impl;

import org.junit.Test;
import org.junit.Assert;
import item1.staticfactory.serviceprovider.api.NumberSeriesProvider;

/**
 * Created by IntelliJ IDEA.
 * User: shivprb
 * Date: Oct 26, 2009
 * Time: 1:02:54 PM
 * To change this template use File | Settings | File Templates.
 */
public class EvenNumberSeriesProviderTest {


    @Test
    public void shouldCreateNewEvenNumberService() {
        NumberSeriesProvider provider = new EvenNumberSeriesProvider();
        Assert.assertEquals(EvenNumberSeriesService.class,provider.newService().getClass());
    }
}
