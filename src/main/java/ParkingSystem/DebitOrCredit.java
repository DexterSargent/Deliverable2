package ParkingSystem;

public class DebitOrCredit implements Strategy {

	String paymentMessage = "";
	
	@Override
	public boolean processPayment(String clientId, double amount, String paymentType, String cardNumber) {
		return validateCard(cardNumber, amount);
	
	}
	
	public boolean validateCard(String cardNumber, double amount) {
		if (cardNumber.length() != 15) {
			paymentMessage = "Card Number should be 16 digits";
			return false;
		}
		paymentMessage = "Paid $" + amount + " with Debit/Credit";
		return true;
	}
}
