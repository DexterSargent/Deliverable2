package ParkingSystem;

public class ParkingSpaceFacade {
    private final BookingManager bookingManager;
    private final CheckInManager checkInManager;
    private final SpaceManager spaceManager;

    public ParkingSpaceFacade() {
        this.spaceManager = new SpaceManager();
        this.spaceManager.loadParkingLots();
        this.bookingManager = new BookingManager();
        this.checkInManager = new CheckInManager(bookingManager);
    }

	public boolean confirmBooking(String clientId, String clientType, String licensePlate, String lotId, int spaceId, String startTime, int duration, String paymentType, String cardNumber) {
		return bookingManager.confirmBooking(clientId, clientType, licensePlate, lotId, spaceId, startTime, duration, paymentType, cardNumber);
	}
	
    public boolean checkIn(String clientId) {
        return checkInManager.checkIn(clientId);
    }

    public boolean checkOut(String clientId) {
    	return checkInManager.checkOut(clientId);
    }
    
    public boolean cancelBooking(String clientId) {
        bookingManager.cancelBooking(clientId);
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

	public SpaceManager getSpaceManager() {
		return spaceManager;
	}
	
	public BookingManager getBookingManager() {
		return bookingManager;
	}
	
	public CheckInManager getCheckInManager() {
		return checkInManager;
	}
}
