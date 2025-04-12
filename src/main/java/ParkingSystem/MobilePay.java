package ParkingSystem;

public class MobilePay implements Strategy {
	
	String paymentMessage = "";
	
    @Override
    public boolean processPayment(String clientId, double amount, String paymentType, String cardNumber) {
    	paymentMessage = "Paid $" + amount + " with Mobile Pay";
        return true; 
    }
    
    public String getPaymentMessage() {
    	return paymentMessage;
    }
}
