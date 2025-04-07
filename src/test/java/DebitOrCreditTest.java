import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ParkingSystem.DebitOrCredit;

class DebitOrCreditTest {

	DebitOrCredit paymentMethod = new DebitOrCredit();
	
	@BeforeEach
	void setUp() throws Exception {
		paymentMethod = new DebitOrCredit();
	}

	@Test
	void testValidPaymentSuccess() {
		boolean result = paymentMethod.processPayment("clientId", 15.0, "debitOrCredit", "1234567890123456");
		assertTrue(result);
	}
	
	@Test
	void testInvalidPaymentCardTooShort() {
		boolean result = paymentMethod.processPayment("clientId", 15.0, "debitOrCredit", "1234");
		assertFalse(result);
	}

	@Test
	void testInvalidPaymentCardTooLong() {
		boolean result = paymentMethod.processPayment("clientId", 15.0, "debitOrCredit", "123456789012345567");
		assertFalse(result);
	}
	
	@Test
    void testPaymentMessageOnSuccess() {
        paymentMethod.processPayment("CLT-004", 20.0, "debit", "1111222233334444");
        assertEquals("Paid $20.0 with Debit/Credit", paymentMethod.getPaymentMessage());
    }

    @Test
    void testPaymentMessageOnFailure() {
    	paymentMethod.processPayment("CLT-005", 40.0, "debit", "444433332222111");
        assertEquals("Card number should be 16 digits", paymentMethod.getPaymentMessage());
    }

    @Test
    void testValidateCardSuccess() {
        boolean result = paymentMethod.validateCard("9999888877776666", 10.0);
        assertTrue(result);
    }

    @Test
    void testValidateCardFailure() {
        boolean result = paymentMethod.validateCard("987654321", 10.0);
        assertFalse(result);
    }

    @Test
    void testMultiplePaymentsSuccessThenFail() {
        boolean firstResult = paymentMethod.processPayment("CLT-006", 25.0, "credit", "1111222233334444");
        boolean secondResult = paymentMethod.processPayment("CLT-007", 25.0, "credit", "1111");
        assertTrue(firstResult);
        assertFalse(secondResult);
    }

    @Test
    void testEmptyCardNumberFails() {
        boolean result = paymentMethod.processPayment("CLT-008", 15.0, "debit", "");
        assertFalse(result);
        assertEquals("Card number should be 16 digits", paymentMethod.getPaymentMessage());
    }
    
    @Test
    void testAmountIsIntInstead() {
    	boolean result = paymentMethod.processPayment("clientId", 15, "debit", "1111222233334444");
    	assertTrue(result);
    }
}
