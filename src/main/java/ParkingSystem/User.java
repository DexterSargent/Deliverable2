package ParkingSystem;

public class User {

	public ParkingSpaceProxy parkingProxy;
	public Object user;
	
	public void assignProxy(ParkingSpaceProxy parkingProxy) {
		this.parkingProxy = parkingProxy;
	}
	
    public Object login(String username, String password) {
        return parkingProxy.login(username, password);
    }

    public void register(String name, String username, String password, String clientType, String extraId) {
        parkingProxy.register(name,username, password, clientType, extraId);
    }
	
}