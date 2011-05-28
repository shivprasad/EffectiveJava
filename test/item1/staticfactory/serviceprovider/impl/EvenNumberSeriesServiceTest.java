package item1.staticfactory.serviceprovider.impl;

import org.junit.Test;
import org.junit.Assert;
import item1.staticfactory.serviceprovider.api.NumberSeriesService;

/**
 * Created by IntelliJ IDEA.
 * User: shivprb
 * Date: Oct 26, 2009
 * Time: 1:21:33 PM
 * To change this template use File | Settings | File Templates.
 */
public class EvenNumberSeriesServiceTest {

    @Test
    public void shouldReturnNextEvenNumberOnExecution(){
        NumberSeriesService evenNumberService = new EvenNumberSeriesService();
        Assert.assertEquals(2,evenNumberService.nextNumber());
        Assert.assertEquals(4,evenNumberService.nextNumber());
        Assert.assertEquals(6,evenNumberService.nextNumber());
    }
    
}
