import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalTime;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ParkingSystem.Booking;
import ParkingSystem.BookingManager;
import ParkingSystem.MobilePay;
import ParkingSystem.SpaceManager;

class BookingManagerTest {

	private static BookingManager bookingManager;
	private static String clientId;
	
	@BeforeAll
    static void setupOnce() {
        bookingManager = new BookingManager();
        bookingManager.setPaymentStrategy(new MobilePay());

        SpaceManager spaceManager = bookingManager.getSpaceManager();
        spaceManager.addParkingLot("LOT-A");

        bookingManager.getAccountRegistry().registerClient(
            "Test User", "testuser", "password", "student", "studentId123"
        );
        clientId = bookingManager.getAccountRegistry().displayPendingValidations().get(0).getClientId();
        bookingManager.getAccountRegistry().validateClient(clientId);
    }

	@BeforeEach
    void setUp() throws Exception {
        LocalTime futureTime = LocalTime.now().plusHours(1);
        String formattedTime = String.format("%02d:00", futureTime.getHour());

        bookingManager.confirmBooking(
            clientId,
            "student",
            "ABC123",
            "LOT-A",
            1,
            formattedTime,
            2,
            "mobile",
            "anyCard"
        );
    }

	@Test
	void testConfirmBookingSuccess() {
		boolean confirmed = bookingManager.confirmBooking("CLT-001", "student", "ABC123", "LOT-A", 1, "12:00", 2, "mobile", "anyCard");
		assertTrue(confirmed);
		assertNotNull(bookingManager.getBooking("CLT-001"));
	}

	@Test
	void testCancelBookingSuccess() {
        boolean cancelled = bookingManager.cancelBooking(clientId);
        assertTrue(cancelled);
        assertNull(bookingManager.getBooking(clientId));
	}
	
	@Test
	void testExtendBookingSuccess() {
	    boolean extended = bookingManager.extendBooking(clientId, 2, "mobile", "anycard");
	    assertTrue(extended);
	    assertEquals(4, bookingManager.getBooking(clientId).getDuration());
	}

	@Test
	void testEditBookingSuccess() {
	    boolean edited = bookingManager.editBooking(clientId, "15:00", 3);
	    assertTrue(edited);
	    assertEquals("15:00", bookingManager.getBooking(clientId).getStartTime());
	    assertEquals(3, bookingManager.getBooking(clientId).getDuration());
	}

	@Test
	void testGetBookingReturnsCorrectBooking() {
	    Booking booking = bookingManager.getBooking(clientId);
	    assertNotNull(booking);
	    assertEquals("LOT-A", booking.getLotId());
	}

	@Test
	void testCalculateCostCorrect() {
	    double cost = bookingManager.calculateCost("student", 2);
	    assertEquals(15.0, cost); // $5 an hour plus 1 hour deposit
	}

	@Test
	void testGetDepositForStudent() {
	    double deposit = bookingManager.getDeposit("student");
	    assertEquals(5.0, deposit);
	}

	@Test
	void testGetDepositForFaculty() {
	    double deposit = bookingManager.getDeposit("faculty");
	    assertEquals(8.0, deposit);
	}

	@Test
	void testGetDepositForStaff() {
	    double deposit = bookingManager.getDeposit("staff");
	    assertEquals(10.0, deposit);
	}
	
	@Test
	void testGetDepositForVisitor() {
	    double deposit = bookingManager.getDeposit("visitor");
	    assertEquals(15.0, deposit);
	}


}
