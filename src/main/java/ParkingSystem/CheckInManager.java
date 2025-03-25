package ParkingSystem;

public class CheckInManager {
	
	private BookingManager bookingManager;
	public String refundMessage = "";
	
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
    
    public boolean checkOut(String clientId) {
    	Booking booking = bookingManager.getBooking(clientId);
    	if (booking != null && booking.isCheckedIn()) {
    		bookingManager.getSpaceManager().removeBooking(bookingManager.getBooking(clientId).getLotId(), bookingManager.getBooking(clientId).getSpaceId());
    		bookingManager.getActiveBookings().remove(clientId);
    		refundMessage = "You have been refunded your deposit of $" + bookingManager.getDeposit(clientId);
    		return true;
    	}
		return false;
    }
}
