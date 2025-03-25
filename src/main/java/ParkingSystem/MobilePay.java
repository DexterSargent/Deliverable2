package ParkingSystem;

public class MobilePay implements Strategy {
    @Override
    public boolean processPayment(String clientId, double amount, String paymentType, String cardNumber) {
        return true; 
    }
}
