package ParkingSystem;

import java.util.HashMap;
import java.util.Map;

public class ParkingLot {
    private final String lotId;
    private final Map<Integer, ParkingSpace> parkingSpaces;
    private boolean isEnabled;

    public ParkingLot(String lotId) {
        this.lotId = lotId;
        this.parkingSpaces = new HashMap<>();
        this.isEnabled = true;
    }

    public boolean isSpaceAvailable(int spaceId) {
        ParkingSpace space = parkingSpaces.get(spaceId);
        return space != null && space.isAvailable() && isEnabled;
    }

    public boolean assignBooking(int spaceId, Booking booking) {
        if (!isEnabled) return false;
        else {
        	ParkingSpace space = parkingSpaces.computeIfAbsent(spaceId, k -> new ParkingSpace(spaceId));
        	return space.assignBooking(booking);
        }
    }

    public void removeBooking(int spaceId) {
        ParkingSpace space = parkingSpaces.get(spaceId);
        if (space != null) {
            space.removeBooking();
        }
    }

    public ParkingSpace getParkingSpace(int spaceId) {
        return parkingSpaces.computeIfAbsent(spaceId, k -> new ParkingSpace(spaceId));
    }

    void setEnabled(boolean enabled) {
        this.isEnabled = enabled;
    }

    public ParkingLotIterator getIterator() {
        return new ParkingLotIterator(parkingSpaces.values());
    }

    String getLotId() {
        return lotId;
    }

    boolean isEnabled() {
        return isEnabled;
    }
}