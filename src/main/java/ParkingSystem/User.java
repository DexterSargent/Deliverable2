package ParkingSystem;

public class User {

	public ParkingSpaceProxy parkingProxy;
	
	public void assignProxy(ParkingSpaceProxy parkingProxy) {
		this.parkingProxy = parkingProxy;
	}
	
    public boolean login(String username, String password) {
        return parkingProxy.login(username, password);
    }

    public void register(String name, String username, String password, 
                        String clientType, String licensePlate) {
        parkingProxy.register(name, username, password, clientType, licensePlate);
    }
	
}