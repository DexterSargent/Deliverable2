package ParkingSystem;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class BookingManager {
    private final PaymentManager paymentManager = new PaymentManager();
    private final SpaceManager spaceManager = new SpaceManager();
    private final Map<String, Booking> activeBookings = new HashMap<>();
    private final AccountRegistry accountRegistry = new AccountRegistry(); 

    public BookingManager() {}
    
    public boolean confirmBooking(String clientId, String clientType, String licensePlate, String lotId, int spaceId, String startTime, int duration, String paymentType, String cardNumber) {
        if (!spaceManager.isSpaceAvailable(lotId, spaceId)) {
            return false;
        }

        double hourlyRate = getHourlyRate(clientType);
        double deposit = hourlyRate;
        double totalCost = (hourlyRate * duration) + deposit;
        
        paymentManager.setStrategy(getPaymentStrategy(paymentType));
        if (!paymentManager.processPayment(clientId, totalCost, paymentType, cardNumber)) {
            return false;
        }

        Booking booking = new Booking(clientId, lotId, spaceId, startTime, duration, licensePlate, totalCost);
        
        if (!spaceManager.assignBooking(lotId, spaceId, booking)) {
            paymentManager.refundDeposit(clientId, totalCost, paymentType, cardNumber);
            return false;
        }

        activeBookings.put(clientId, booking);
        return true;
    }

    public boolean extendBooking(String clientId, int extraHours, String paymentType, String cardNumber) {
        Booking booking = activeBookings.get(clientId);
        if (booking == null || !isBeforeStartTime(booking.getStartTime())) {
            return false;
        }

        Client client = accountRegistry.getClientType(clientId);
        if (client == null) return false;
        
        double additionalCost = getHourlyRate(client.getClientType()) * extraHours;
        paymentManager.setStrategy(getPaymentStrategy(paymentType));
        
        if (paymentManager.processPayment(clientId, additionalCost, paymentType, cardNumber)) {
            booking.setDuration(booking.getDuration() + extraHours);
            return true;
        }
        return false;
    }

    public boolean cancelBooking(String clientId) {
        Booking booking = activeBookings.get(clientId);
        if (booking == null || !isBeforeStartTime(booking.getStartTime())) {
            return false;
        }

        Client client = accountRegistry.getClientType(clientId);
        if (client == null) return false;
        
        double hourlyRate = getHourlyRate(client.getClientType());
        double refundAmount = booking.getTotalCost();
        
        if (!LocalTime.now().isBefore(booking.getCheckedInDeadline())) {
            refundAmount -= hourlyRate;
        }

        paymentManager.refundWithoutDeposit(clientId, booking.getTotalCost(), 
                                         hourlyRate, "original", booking.getLicensePlate());
        
        spaceManager.removeBooking(booking.getLotId(), booking.getSpaceId());
        activeBookings.remove(clientId);
        return true;
    }

    private boolean isBeforeStartTime(String startTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime start = LocalTime.parse(startTime, formatter);
        return LocalTime.now().isBefore(start);
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

    private Strategy getPaymentStrategy(String paymentType) {
        return paymentType.equalsIgnoreCase("mobile") 
            ? new MobilePay() 
            : new DebitOrCredit();
    }
}