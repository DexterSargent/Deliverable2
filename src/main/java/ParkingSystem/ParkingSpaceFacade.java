package ParkingSystem;

public class ParkingSpaceFacade {

	private BookingManager bookingManager = new BookingManager();
	private CheckInManager checkInManager = new CheckInManager(bookingManager);
	private SpaceManager spaceManager = new SpaceManager();
	
	public boolean confirmBooking(String clientId, String clientType, String licensePlate, String lotId, int spaceId, String startTime, int duration, String paymentType, String cardNumber) {
		return bookingManager.confirmBooking(clientId, clientType, licensePlate, lotId, spaceId, startTime, duration, paymentType, cardNumber);
	}
	
    public boolean checkIn(String clientId) {
        return checkInManager.checkIn(clientId);
    }

    public boolean cancelBooking(String clientId) {
        bookingManager.removeBooking(clientId);
        return true;
    }

    public boolean extendBooking(String clientId, int extraHours) {
        Booking booking = bookingManager.getBooking(clientId);
        if (booking != null) {
            return true;
        }
        return false;
    }
    
    public boolean editBooking(String clientId, String newStartTime, int newDuration) {
        Booking booking = bookingManager.getBooking(clientId);
        if (booking != null) {
            booking.setStartTime(newStartTime);
            booking.setDuration(newDuration);
            return true;
        }
        return false;
    }
    
    public Booking getBookingDetails(String clientId) {
        return bookingManager.getBooking(clientId);
    }

    public void toggleLot(String lotId, boolean enabled) {
        spaceManager.toggleLot(lotId, enabled);
    }

    public void toggleSpace(String lotId, String spaceId, boolean enabled) {
        spaceManager.toggleSpace(lotId, spaceId, enabled);
    }

    public String scanSpace(String lotId, String spaceId) {
        return spaceManager.scanSpace(lotId, spaceId);
    }

    public void addParkingLot(String lotId) {
        spaceManager.addParkingLot(lotId);
    }
}
