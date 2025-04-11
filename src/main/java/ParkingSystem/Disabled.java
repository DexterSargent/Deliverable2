package ParkingSystem;

public class Disabled implements SpaceState {
	
    @Override
    public String scanSpace(ParkingSpace space) {
        return "disabled";
    }
}
