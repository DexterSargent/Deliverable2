package ParkingSystem;

public class PaymentManager {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public boolean processPayment(String clientId, double amount, 
                                 String paymentType, String cardNumber) {
        return strategy.processPayment(clientId, amount, paymentType, cardNumber);
    }

    public boolean refundDeposit(String clientId, double depositAmount, 
                                String paymentType, String cardNumber) {
        return strategy.processPayment(clientId, depositAmount, paymentType, cardNumber);
    }

    public boolean refundWithoutDeposit(String clientId, double totalAmount, 
                                       double depositAmount, String paymentType, 
                                       String cardNumber) {
        return strategy.processPayment(clientId, totalAmount - depositAmount, 
                                      paymentType, cardNumber);
    }
}
