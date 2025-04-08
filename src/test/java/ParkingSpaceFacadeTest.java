
import ParkingSystem.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class ParkingSpaceFacadeTest {

    private ParkingSpaceFacade parkingSpaceFacade;
    private final String testLotId = "TestLotA";
    private final String testSpaceIdStr = "1";
    private final int testSpaceIdInt = 1;
    private final String nonExistentClientId = "CLT-NONEXISTENT";
    private final String nonExistentLotId = "LotNonExistent";

    @BeforeEach
    void setUp() {
        parkingSpaceFacade = new ParkingSpaceFacade();
    }

    @Test
    void testAddParkingLot() {
        SpaceManager sm = parkingSpaceFacade.getSpaceManager();
        assertNull(sm.getParkingLots().get(testLotId));

        parkingSpaceFacade.addParkingLot(testLotId);

        assertNotNull(sm.getParkingLots().get(testLotId));
        assertTrue(sm.getParkingLots().get(testLotId).isEnabled());
    }

    @Test
    void testToggleLot_Disable() {
        parkingSpaceFacade.addParkingLot(testLotId);
        assertTrue(parkingSpaceFacade.getSpaceManager().getParkingLots().get(testLotId).isEnabled());

        parkingSpaceFacade.toggleLot(testLotId, false);

        assertFalse(parkingSpaceFacade.getSpaceManager().getParkingLots().get(testLotId).isEnabled());
    }

    @Test
    void testToggleLot_Enable() {
        parkingSpaceFacade.addParkingLot(testLotId);
        parkingSpaceFacade.toggleLot(testLotId, false);
        assertFalse(parkingSpaceFacade.getSpaceManager().getParkingLots().get(testLotId).isEnabled());

        parkingSpaceFacade.toggleLot(testLotId, true);

        assertTrue(parkingSpaceFacade.getSpaceManager().getParkingLots().get(testLotId).isEnabled());
    }

    @Test
    void testToggleSpace_Disable() {
        parkingSpaceFacade.addParkingLot(testLotId);
        ParkingSpace space = parkingSpaceFacade.getSpaceManager().getParkingLots().get(testLotId).getParkingSpace(testSpaceIdInt);
        assertTrue(space.getState() instanceof Enabled);

        parkingSpaceFacade.toggleSpace(testLotId, testSpaceIdStr, false);

        ParkingSpace updatedSpace = parkingSpaceFacade.getSpaceManager().getParkingLots().get(testLotId).getParkingSpace(testSpaceIdInt);
        assertTrue(updatedSpace.getState() instanceof Disabled);
    }

     @Test
    void testToggleSpace_Enable() {
        parkingSpaceFacade.addParkingLot(testLotId);
        parkingSpaceFacade.toggleSpace(testLotId, testSpaceIdStr, false);
        ParkingSpace space = parkingSpaceFacade.getSpaceManager().getParkingLots().get(testLotId).getParkingSpace(testSpaceIdInt);
        assertTrue(space.getState() instanceof Disabled);


        parkingSpaceFacade.toggleSpace(testLotId, testSpaceIdStr, true);

        ParkingSpace updatedSpace = parkingSpaceFacade.getSpaceManager().getParkingLots().get(testLotId).getParkingSpace(testSpaceIdInt);
        assertTrue(updatedSpace.getState() instanceof Enabled);
    }


    @Test
    void testScanSpace_Empty() {
        parkingSpaceFacade.addParkingLot(testLotId);
        parkingSpaceFacade.toggleSpace(testLotId, testSpaceIdStr, true);

        String status = parkingSpaceFacade.scanSpace(testLotId, testSpaceIdStr);

        assertEquals("empty", status);
    }

    @Test
    void testScanSpace_Disabled() {
        parkingSpaceFacade.addParkingLot(testLotId);
        parkingSpaceFacade.toggleSpace(testLotId, testSpaceIdStr, false);

        String status = parkingSpaceFacade.scanSpace(testLotId, testSpaceIdStr);

        assertEquals("disabled", status);
    }
     @Test
    void testScanSpace_LotNotFound() {

        String status = parkingSpaceFacade.scanSpace(nonExistentLotId, testSpaceIdStr);

        assertEquals("disabled", status);
    }


    @Test
    void testGetBookingDetails_NotFound() {

        Booking booking = parkingSpaceFacade.getBookingDetails(nonExistentClientId);

        assertNull(booking);
    }

    @Test
    void testExtendBooking_NoBookingFound() {
        int extraHours = 1;

        boolean result = parkingSpaceFacade.extendBooking(nonExistentClientId, extraHours);

        assertFalse(result);
    }
}
