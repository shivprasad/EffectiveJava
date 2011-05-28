package item1.staticfactory.serviceprovider.impl;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import item1.staticfactory.serviceprovider.api.NumberSeriesService;
import item1.staticfactory.serviceprovider.api.NumberSeriesServices;
import item1.staticfactory.serviceprovider.api.NumberSeries;

/**
 * Created by IntelliJ IDEA.
 * User: shivprb
 * Date: Oct 26, 2009
 * Time: 1:35:35 PM
 * To change this template use File | Settings | File Templates.
 */
public class NumberSeriesTest {

    @Test
    public void shouldProvideEvenNumbers(){

        NumberSeriesServices.registerProvider(NumberSeries.EVEN, new EvenNumberSeriesProvider());

        NumberSeriesService numberSeriesService = NumberSeriesServices.newInstance(NumberSeries.EVEN);

        assertEquals(2,numberSeriesService.nextNumber());
        assertEquals(4,numberSeriesService.nextNumber());
        assertEquals(6,numberSeriesService.nextNumber());
        assertEquals(8,numberSeriesService.nextNumber());
    }

    @Test
    public void shouldProvideOddNumbers(){

        NumberSeriesServices.registerProvider(NumberSeries.ODD, new OddNumberSeriesProvider());

        NumberSeriesService numberSeriesService = NumberSeriesServices.newInstance(NumberSeries.ODD);

        assertEquals(1,numberSeriesService.nextNumber());
        assertEquals(3,numberSeriesService.nextNumber());
        assertEquals(5,numberSeriesService.nextNumber());
        assertEquals(7,numberSeriesService.nextNumber());


    }

    
}
