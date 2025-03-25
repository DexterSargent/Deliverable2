package ParkingSystem;

public class User {

	public ParkingSpaceProxy parkingProxy;
	
	public void assignProxy(ParkingSpaceProxy parkingProxy) {
		this.parkingProxy = parkingProxy;
	}
	
    public boolean login(String username, String password) {
        return parkingProxy.login(username, password);
    }

    public void register(Client client) {
        parkingProxy.register(client);
    }
	
}