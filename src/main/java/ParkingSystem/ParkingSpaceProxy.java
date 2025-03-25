package ParkingSystem;

public class ParkingSpaceProxy {

	private ParkingSpaceFacade facade = new ParkingSpaceFacade();
	private AccountRegistry registry = new AccountRegistry();
	
	public boolean confirmBooking(String clientId, String clientType, String licensePlate, String lotId, int spaceId, String startTime, int duration, String paymentType, String cardNumber) {
		return facade.confirmBooking(clientId, clientType, licensePlate, lotId, spaceId, startTime, duration, paymentType, cardNumber);
    }
	
	public boolean checkIn(String clientId) {
        return facade.checkIn(clientId);
    }
	
	public boolean checkOut(String clientId) {
		return facade.checkOut(clientId);
	}

    public boolean cancelBooking(String clientId) {
        return facade.cancelBooking(clientId);
    }

    public boolean extendBooking(String clientId, int extraHours) {
        return facade.extendBooking(clientId, extraHours);
    }

    public boolean editBooking(String clientId, String newStartTime, int newDuration) {
        return facade.editBooking(clientId, newStartTime, newDuration);
    }

    public Booking getBookingDetails(String clientId) {
        return facade.getBookingDetails(clientId);
    }

    public void toggleLot(String lotId, boolean enabled) {
        facade.toggleLot(lotId, enabled);
    }

    public void toggleSpace(String lotId, String spaceId, boolean enabled) {
        facade.toggleSpace(lotId, spaceId, enabled);
    }

    public String scanSpace(String lotId, String spaceId) {
        return facade.scanSpace(lotId, spaceId);
    }

    public void displayPendingValidations() {
        registry.displayPendingValidations();
    }

    public void validateClient(String clientId) {
        registry.validateClient(clientId);
    }

    public void autoGenerateManager() {
        registry.autoGenerateManager();
    }

    public boolean login(String username, String password) {
        return registry.login(username, password);
    }

    public boolean register(Client client) {
        return registry.registerClient(client);
    }

    public void addParkingLot(String lotId) {
        facade.addParkingLot(lotId);
    }
}

