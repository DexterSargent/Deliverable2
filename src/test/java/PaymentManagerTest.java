
import static org.junit.Assert.*;
import org.junit.Test;
import ParkingSystem.*;

public class PaymentManagerTest {

    @Test
    public void testDebitPaymentValidCard() {
        PaymentManager pm = new PaymentManager();
        pm.setStrategy(new DebitOrCredit());
        boolean result = pm.processPayment("client1", 50.0, "debit", "1234567890123456");
        assertTrue(result);
        assertEquals("Paid $50.0 with Debit/Credit", pm.paymentMessage);
    }

    @Test
    public void testDebitPaymentInvalidCard() {
        PaymentManager pm = new PaymentManager();
        pm.setStrategy(new DebitOrCredit());
        boolean result = pm.processPayment("client1", 30.0, "debit", "1234");
        assertFalse(result);
        assertEquals("Card number should be 16 digits", pm.paymentMessage);
    }

    @Test
    public void testMobilePayPayment() {
        PaymentManager pm = new PaymentManager();
        pm.setStrategy(new MobilePay());
        boolean result = pm.processPayment("client2", 25.0, "mobile", "any-number");
        assertTrue(result);
        assertEquals("Paid $25.0 with Mobile Pay", pm.paymentMessage);
    }

    @Test
    public void testRefundDeposit() {
        PaymentManager pm = new PaymentManager();
        boolean result = pm.refundDeposit(5.0);
        assertTrue(result);
        assertEquals("Refunded deposit of $5.0", pm.refundMessage);
    }

    @Test
    public void testRefundWithoutDeposit() {
        PaymentManager pm = new PaymentManager();
        boolean result = pm.refundWithoutDeposit(50.0, 5.0);
        assertTrue(result);
        assertEquals("Refunded without deposit ($45.0)", pm.refundMessage);
    }

    @Test
    public void testRefundTotalCost() {
        PaymentManager pm = new PaymentManager();
        boolean result = pm.refundTotalCost(100.0);
        assertTrue(result);
        assertEquals("Refunded total cost of $100.0", pm.refundMessage);
    }

    @Test
    public void testNoStrategySet() {
        PaymentManager pm = new PaymentManager();
        boolean result = pm.processPayment("client3", 10.0, "debit", "1234567890123456");
        assertFalse(result);
    }

    @Test
    public void testMultipleRefundTypes() {
        PaymentManager pm = new PaymentManager();
        
        pm.refundDeposit(5.0);
        assertEquals("Refunded deposit of $5.0", pm.refundMessage);
        
        pm.refundWithoutDeposit(50.0, 5.0);
        assertEquals("Refunded without deposit ($45.0)", pm.refundMessage);
        
        pm.refundTotalCost(100.0);
        assertEquals("Refunded total cost of $100.0", pm.refundMessage);
    }

    @Test
    public void testDebitPaymentEdgeCases() {
        PaymentManager pm = new PaymentManager();
        pm.setStrategy(new DebitOrCredit());
        
        assertTrue(pm.processPayment("client4", 10.0, "debit", "1234567890123456"));
    }

    @Test
    public void testMobilePayDifferentAmounts() {
        PaymentManager pm = new PaymentManager();
        pm.setStrategy(new MobilePay());
        
        assertTrue(pm.processPayment("client6", 0.0, "mobile", "any"));
        assertEquals("Paid $0.0 with Mobile Pay", pm.paymentMessage);
        
        assertTrue(pm.processPayment("client7", 1000000.0, "mobile", "any"));
        assertEquals("Paid $1000000.0 with Mobile Pay", pm.paymentMessage);
    }
}
