package ParkingSystem;

public interface Strategy {
    boolean processPayment(String clientId, double amount, String paymentType, String cardNumber);
}
