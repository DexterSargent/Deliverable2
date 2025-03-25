package ParkingSystem;

import java.util.HashMap;
import java.util.Map;

public class SpaceManager {
    private CSVManager csvManager = new CSVManager();
    private Map<String, ParkingLot> parkingLots = new HashMap<>();

    public void loadParkingLots() {
        parkingLots = csvManager.loadParkingLots();
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
            
            if (space == null) {
                space = new ParkingSpace(spaceNum);
                lot.addParkingSpace(spaceNum, space);
            }   
            space.setState(enabled ? new EnabledState() : new DisabledState());
        }
    }

    public String scanSpace(String lotId, String spaceId) {
        ParkingLot lot = parkingLots.get(lotId);
        if (lot != null) {
            ParkingSpace space = lot.getParkingSpace(Integer.parseInt(spaceId));
            return space != null ? space.scanSpace() : "disabled";
        }
        return "disabled";
    }

    public void addParkingLot(String lotId) {
        if (!parkingLots.containsKey(lotId)) {
            parkingLots.put(lotId, new ParkingLot(lotId));
            csvManager.saveParkingLots(parkingLots);
        }
    }
}