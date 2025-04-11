import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ParkingSystem.*;
public class MobilePayTest {
	
	MobilePay  payment = new MobilePay();
	
	@BeforeEach
	void setUp() throws Exception {
		payment = new MobilePay();
	}
	
	@Test
	public void testPaymentSuccess()
	{
		boolean result = payment.processPayment("someID", 15.0, "MobilePay", "1234567890123456");
		assertTrue(result);
	}
	
	@Test
	public void testPaymentMessage()
	{
		payment.processPayment("someID", 15.0, "MobilePay", "1234567890123456");
		 assertEquals("Paid $15.0 with Mobile Pay", payment.getPaymentMessage());
	}
	

}
