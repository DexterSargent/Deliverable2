import ParkingSystem.*;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

class SpaceManagerTest {
    private SpaceManager spaceManager;
    private Booking testBooking;

    @BeforeEach
    void setUp() {
        spaceManager = new SpaceManager();
        spaceManager.addParkingLot("LOT1");
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        String startTime = LocalTime.now().plusHours(1).format(formatter);
        
        testBooking = new Booking(
            "CLIENT123", 
            "LOT1", 
            1, 
            startTime, 
            2, 
            "ABC123", 
            20.0
        );
    }

    @Test
    void testAddParkingLot() {
        spaceManager.addParkingLot("LOT2");
        assertTrue(spaceManager.getParkingLots().containsKey("LOT2"));
    }

    @Test
    void testNewSpaceAvailability() {
        assertTrue(spaceManager.isSpaceAvailable("LOT1", 1));
    }

    @Test
    void testAssignBooking() {
        boolean result = spaceManager.assignBooking("LOT1", 1, testBooking);
        assertTrue(result);
        assertFalse(spaceManager.isSpaceAvailable("LOT1", 1));
    }

    @Test
    void testRemoveBooking() {
        spaceManager.assignBooking("LOT1", 1, testBooking);
        spaceManager.removeBooking("LOT1", 1);
        assertTrue(spaceManager.isSpaceAvailable("LOT1", 1));
    }

    @Test
    void testDisableEntireLot() {
        spaceManager.toggleLot("LOT1", false);
        assertFalse(spaceManager.assignBooking("LOT1", 1, testBooking));
    }

    @Test
    void testReEnableLot() {
        spaceManager.toggleLot("LOT1", false);
        spaceManager.toggleLot("LOT1", true);
        assertTrue(spaceManager.assignBooking("LOT1", 1, testBooking));
    }

    @Test
    void testDisableSingleSpace() {
        spaceManager.toggleSpace("LOT1", "1", false);
        assertFalse(spaceManager.isSpaceAvailable("LOT1", 1));
    }

    @Test
    void testReEnableSingleSpace() {
        spaceManager.toggleSpace("LOT1", "1", false);
        spaceManager.toggleSpace("LOT1", "1", true);
        assertTrue(spaceManager.isSpaceAvailable("LOT1", 1));
    }

    @Test
    void testScanEmptySpace() {
        assertEquals("empty", spaceManager.scanSpace("LOT1", "1"));
    }

    @Test
    void testScanDisabledSpace() {
        spaceManager.toggleSpace("LOT1", "1", false);
        assertEquals("disabled", spaceManager.scanSpace("LOT1", "1"));
    }
}