package ParkingSystem;

import java.util.HashMap;
import java.util.Map;

public class SpaceManager {
    private final CSVManager csvManager = new CSVManager();
    private final Map<String, ParkingLot> parkingLots = new HashMap<>();

    public void loadParkingLots() {
        csvManager.loadParkingLots(parkingLots);
    }

    public boolean isSpaceAvailable(String lotId, int spaceId) {
        ParkingLot lot = parkingLots.get(lotId);
        return lot != null && lot.isSpaceAvailable(spaceId);
    }

    public boolean assignBooking(String lotId, int spaceId, Booking booking) {
        ParkingLot lot = parkingLots.get(lotId);
        return lot != null && lot.assignBooking(spaceId, booking);
    }

    public void removeBooking(String lotId, int spaceId) {
        ParkingLot lot = parkingLots.get(lotId);
        if (lot != null) {
            lot.removeBooking(spaceId);
        }
    }

    public void toggleLot(String lotId, boolean enabled) {
        ParkingLot lot = parkingLots.get(lotId);
        if (lot != null) {
            lot.setEnabled(enabled);
            csvManager.saveParkingLots(parkingLots);
        }
    }

    public void toggleSpace(String lotId, String spaceId, boolean enabled) {
        ParkingLot lot = parkingLots.get(lotId);
        if (lot != null) {
            int spaceNum = Integer.parseInt(spaceId);
            ParkingSpace space = lot.getParkingSpace(spaceNum);
            space.setState(enabled ? new Enabled() : new Disabled());
            csvManager.saveParkingLots(parkingLots);
        }
    }

    public String scanSpace(String lotId, String spaceId) {
        ParkingLot lot = parkingLots.get(lotId);
        if (lot != null) {
            return lot.getParkingSpace(Integer.parseInt(spaceId)).scanSpace();
        }
        return "disabled";
    }

    public void addParkingLot(String lotId) {
        parkingLots.putIfAbsent(lotId, new ParkingLot(lotId));
        csvManager.saveParkingLots(parkingLots);
    }

    Map<String, ParkingLot> getParkingLots() {
        return parkingLots;
    }
}