import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ParkingSystem.ParkingSpace;
import ParkingSystem.Booking;

public class ParkingSpaceTest {
    private ParkingSpace parkingSpace;
    private Booking testBooking;

    @BeforeEach
    public void setUp() {
        parkingSpace = new ParkingSpace(1);
        testBooking = new Booking("client1", "lotA", 1, "10:00", 2, "ABC123", 15.00);
    }

    @Test
    public void newSpaceHasCorrectId() {
        assertEquals(1, parkingSpace.getSpaceId());
    }

    @Test
    public void initialStateIsEnabled() {
        assertTrue(parkingSpace.getState() instanceof ParkingSystem.Enabled);
    }

    @Test
    public void isAvailableReturnsTrueWhenEnabledAndEmpty() {
        assertTrue(parkingSpace.isAvailable());
    }

    @Test
    public void assignBookingSucceedsWhenAvailable() {
        assertTrue(parkingSpace.assignBooking(testBooking));
        assertEquals(testBooking, parkingSpace.getCurrentBooking());
    }

    @Test
    public void assignBookingFailsWhenDisabled() {
        parkingSpace.setState(new ParkingSystem.Disabled());
        assertFalse(parkingSpace.assignBooking(testBooking));
    }

    @Test
    public void removeBookingClearsCurrentBooking() {
        parkingSpace.assignBooking(testBooking);
        parkingSpace.removeBooking();
        assertNull(parkingSpace.getCurrentBooking());
    }

    @Test
    public void scanSpaceReturnsEmptyWhenEmptyAndEnabled() {
        assertEquals("empty", parkingSpace.scanSpace());
    }
    
    @Test
    public void scanSpaceReturnsLicensePlateWhenEnabledAndFull() {
        parkingSpace.assignBooking(testBooking);
    	assertEquals("ABC123", parkingSpace.scanSpace());
    }

    @Test
    public void scanSpaceReturnsDisabledWhenDisabled() {
        parkingSpace.setState(new ParkingSystem.Disabled());
        assertEquals("disabled", parkingSpace.scanSpace());
    }

    @Test
    public void cannotAssignBookingWhenAlreadyOccupied() {
        parkingSpace.assignBooking(testBooking);
        Booking anotherBooking = new Booking("client2", "lotA", 1, "12:00", 1, "XYZ789", 10.00);
        assertFalse(parkingSpace.assignBooking(anotherBooking));
    }

    @Test
    public void stateChangeAffectsAvailability() {
        parkingSpace.setState(new ParkingSystem.Disabled());
        assertFalse(parkingSpace.isAvailable());
        parkingSpace.setState(new ParkingSystem.Enabled());
        assertTrue(parkingSpace.isAvailable());
    }
}