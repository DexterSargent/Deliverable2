package ParkingSystem;

public class Disabled implements spaceState {
	
    @Override
    public String scanSpace(ParkingSpace space) {
        return "disabled";
    }
}
