package item1.staticfactory.serviceprovider.impl;

import item1.staticfactory.serviceprovider.api.NumberSeriesService;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by IntelliJ IDEA.
 * User: shivprb
 * Date: Oct 26, 2009
 * Time: 3:07:32 PM
 */
public class OddNumberSeriesService implements NumberSeriesService {

    private AtomicInteger atomicInteger = new AtomicInteger(0);

    public int nextNumber() {
        while (atomicInteger.incrementAndGet() % 2 != 1)
            continue;
        return atomicInteger.get();
    }
}
