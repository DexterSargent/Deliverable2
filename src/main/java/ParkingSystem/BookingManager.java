package ParkingSystem;

import java.util.HashMap;
import java.util.Map;

public class BookingManager {
    
    private PaymentManager paymentManager = new PaymentManager();
    private SpaceManager spaceManager = new SpaceManager();
    private Map<String, Booking> activeBookings = new HashMap<>();
    
    public boolean confirmBooking(String clientId, String clientType, String licensePlate,
        String lotId, int spaceId, String startTime, int duration,
        String paymentType, String cardNumber) {
		double hourlyRate = getHourlyRate(clientType);
		double totalCost = (hourlyRate * duration) + hourlyRate; // Deposit + cost
		
		paymentManager.setStrategy(getPaymentStrategy(paymentType));
		
		if (paymentManager.processPayment(clientId, totalCost, paymentType, cardNumber)) {
			Booking booking = new Booking(clientId, lotId, spaceId, startTime, duration,  licensePlate, totalCost);
			activeBookings.put(clientId, booking);
			return true;
		}
	return false;
	}
    
    public double getHourlyRate(String clientType) {
        switch(clientType.toLowerCase()) {
            case "student": return 5.0;
            case "faculty": return 8.0;
            case "staff": return 10.0;
            default: return 15.0; 
        }
    }
    
    public Booking getBooking(String clientId) {
        return activeBookings.get(clientId);
    }

    public void removeBooking(String clientId) {
        activeBookings.remove(clientId);
    }
}
