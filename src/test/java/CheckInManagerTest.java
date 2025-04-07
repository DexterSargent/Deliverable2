import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalTime;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ParkingSystem.BookingManager;
import ParkingSystem.CheckInManager;
import ParkingSystem.MobilePay;

class CheckInManagerTest {
	
	private static BookingManager bookingManager;
	private static String clientId;
	private CheckInManager checkInManager;
	
	@BeforeAll
	static void setupOnce() {
		bookingManager = new BookingManager();
		bookingManager.setPaymentStrategy(new MobilePay());
		bookingManager.getSpaceManager().addParkingLot("LOT-A");
		bookingManager.getAccountRegistry().registerClient("Test User", "testuser", "password", "student", "studentId123");
		clientId = bookingManager.getAccountRegistry().displayPendingValidations().get(0).getClientId();
		bookingManager.getAccountRegistry().validateClient(clientId);
	}

	@BeforeEach
	void setUp() throws Exception {
		LocalTime futureTime = LocalTime.now().plusHours(1);
	    String formattedTime = String.format("%02d:00", futureTime.getHour());
		bookingManager.confirmBooking(clientId, bookingManager.getAccountRegistry().getClient(clientId).getClientType(), "ABC123", "LOT-A", 1, formattedTime, 5, "mobile", "anyCard");
		checkInManager = new CheckInManager(bookingManager);
	}

	@Test
	void testCheckInSuccess() {
		boolean checkedIn = checkInManager.checkIn(clientId);
		assertTrue(checkedIn);
		assertTrue(bookingManager.getBooking(clientId).isCheckedIn());
	}
	
	@Test
	void testCheckInFailIfAlreadyCheckedIn() {
		checkInManager.checkIn(clientId);
		boolean secondCheck = checkInManager.checkIn(clientId);
		assertFalse(secondCheck);
		assertTrue(bookingManager.getBooking(clientId).isCheckedIn());
	}
	
	@Test
	void testCheckOutSuccess() {
		checkInManager.checkIn(clientId);
		boolean checkOut = checkInManager.checkOut(clientId);
		assertTrue(checkOut);
		assertNull(bookingManager.getBooking(clientId));
	}
	
	@Test
	void testCheckOutFailsIfNotCheckedIn() {
		boolean checkOut = checkInManager.checkOut(clientId);
		assertFalse(checkOut);
	}

	@Test
	void testCheckOutFailsAfterCheckingOutTwice() {
		checkInManager.checkIn(clientId);
		checkInManager.checkOut(clientId);
		boolean secondCheckOut = checkInManager.checkOut(clientId);
		assertFalse(secondCheckOut);
		assertNull(bookingManager.getBooking(clientId));
	}
	
	@Test
	void testRefundMessage() {
		checkInManager.checkIn(clientId);
		checkInManager.checkOut(clientId);
		String message = checkInManager.refundMessage;
		assertEquals(message, "You have been refunded your deposit of $5.0");
	}
	
	@Test
	void testCheckInFailsForNonexistentClient() {
		boolean checkIn = checkInManager.checkIn("INVALID-ID");
		assertFalse(checkIn);
	}
	
	@Test
	void testCheckOutFailsForNonexistentClient() {
		boolean checkOut = checkInManager.checkOut("INVALID-ID");
		assertFalse(checkOut);
	}
	
	@Test
	void testCheckInFailsWhenBookingCancelled() {
		bookingManager.cancelBooking(clientId);
		boolean checkIn = checkInManager.checkIn(clientId);
		assertFalse(checkIn);
	}
	
	@Test
	void testCheckOutFailsWhenBookingCancelled() {
		bookingManager.cancelBooking(clientId);
		boolean checkOut = checkInManager.checkOut(clientId);
		assertFalse(checkOut);
	}
}
