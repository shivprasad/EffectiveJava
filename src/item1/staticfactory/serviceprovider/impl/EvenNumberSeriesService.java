package item1.staticfactory.serviceprovider.impl;

import item1.staticfactory.serviceprovider.api.NumberSeriesService;

import java.util.concurrent.atomic.AtomicInteger;

public class EvenNumberSeriesService implements NumberSeriesService {

    private AtomicInteger atomicInteger = new AtomicInteger(1);

    public int nextNumber() {
        while (atomicInteger.incrementAndGet() % 2 != 0)
            continue;
        return atomicInteger.get();
    }
}