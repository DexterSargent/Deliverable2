package ParkingSystem;

public class PaymentManager {
    private Strategy strategy;
    public String refundMessage = "";
    public String paymentMessage = "";
    
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public boolean processPayment(String clientId, double amount, String paymentType, String cardNumber) {
    	if (!processPayment(clientId, amount, paymentType, cardNumber)) {
    		return false;
    	}
    	paymentMessage = strategy.getPaymentMessage();
        return true;
    }

    public boolean refundDeposit(double depositAmount) {
    	refundMessage = "Refunded deposit of $" + depositAmount;
    	return true;
    }

    public boolean refundWithoutDeposit(double totalAmount, double depositAmount) {
       double amount = totalAmount - depositAmount;
       refundMessage = "Refunded without deposit ($" + amount + ")";
       return true;
    }
    
    public boolean refundTotalCost(double totalAmount) {
    	refundMessage = "Refunded total cost of $" + totalAmount;
    	return true;
    }  
}
