package ParkingSystem;

public class Enabled implements SpaceState {
	
    @Override
    public String scanSpace(ParkingSpace space) {
        return space.getCurrentBooking() != null ? 
            space.getCurrentBooking().getLicensePlate() : "empty";
    }
}
