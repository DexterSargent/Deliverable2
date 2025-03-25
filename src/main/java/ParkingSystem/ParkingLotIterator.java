package ParkingSystem;

import java.util.Iterator;
import java.util.Collection;

public class ParkingLotIterator implements Iterator<ParkingSpace> {
    private final Iterator<ParkingSpace> iterator;

    ParkingLotIterator(Collection<ParkingSpace> spaces) {
        this.iterator = spaces.iterator();
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    @Override
    public ParkingSpace next() {
        return iterator.next();
    }
}