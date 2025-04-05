import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ParkingSystem.Booking;

public class BookingTest {
	
	private BookingForTest booking;
	
	private static class BookingForTest extends Booking {
		public BookingForTest(String clientId, String lotId, int spaceId, String startTime, int duration, String licensePlate, double totalCost) {
			super(clientId, lotId, spaceId, startTime, duration, licensePlate, totalCost);
		}
		
		public void callSetStartTime(String newStartTime) {
			super.setStartTime(newStartTime);
		}
		
		public void callSetDuration(int newDuration) {
			super.setDuration(newDuration);
		}
		
		public void callSetCheckedIn(boolean checkedIn) {
			super.setCheckedIn(checkedIn);
		}
	}

	@BeforeEach
	public void setUp() throws Exception {
		booking = new BookingForTest("CLT-001", "LOT-A", 1, "12:00", 2, "ABC123", 30.0);
	}

    @Test
    public void testInitialClientId() {
        assertEquals("CLT-001", booking.getClientId());
    }

    @Test
    public void testInitialLotId() {
        assertEquals("LOT-A", booking.getLotId());
    }

    @Test
    public void testInitialSpaceId() {
        assertEquals(1, booking.getSpaceId());
    }

    @Test
    public void testInitialStartTime() {
        assertEquals("12:00", booking.getStartTime());
    }

    @Test
    public void testInitialDuration() {
        assertEquals(2, booking.getDuration());
    }

    @Test
    public void testInitialLicensePlate() {
        assertEquals("ABC123", booking.getLicensePlate());
    }

    @Test
    public void testInitialTotalCost() {
        assertEquals(30.0, booking.getTotalCost());
    }

    @Test
    public void testInitialCheckedInStatus() {
        assertFalse(booking.isCheckedIn());
    }

    @Test
    public void testSetStartTime() {
        booking.callSetStartTime("14:30");
        assertEquals("14:30", booking.getStartTime());
    }

    @Test
    public void testSetDuration() {
        booking.callSetDuration(5);
        assertEquals(5, booking.getDuration());
    }

    @Test
    public void testSetCheckedIn() {
        booking.callSetCheckedIn(true);
        assertTrue(booking.isCheckedIn());
    }

    @Test
    public void testCheckInDeadlineCalculation() {
        assertEquals(LocalTime.of(13, 0), booking.getCheckedInDeadline());
    }

}
