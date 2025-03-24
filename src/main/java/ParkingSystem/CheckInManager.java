package ParkingSystem;

public class CheckInManager {

	private BookingManager bookingManager;
	
	public CheckInManager(BookingManager bookingManager) {
        this.bookingManager = bookingManager;
    }
	
    public boolean checkIn(String clientId) {
        Booking booking = bookingManager.getBooking(clientId);
        if (booking != null && !booking.isCheckedIn()) {
            booking.setCheckedIn(true);
            return true;
        }
        return false;
    }
}
