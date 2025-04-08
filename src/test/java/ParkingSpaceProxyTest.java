import ParkingSystem.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;


class ParkingSpaceProxyTest {

    private ParkingSpaceProxy parkingSpaceProxy;
    private final String testLotId = "ProxyTestLotA";
    private final String testSpaceIdStr = "1";
    private final String nonExistentClientId = "CLT-PROXY-NONEXISTENT";
    private final String testClientName = "Test Client";
    private final String testUsername = "testUser" + UUID.randomUUID().toString(); // Unique username
    private final String testPassword = "password";
    private final String testClientType = "visitor"; // Type that doesn't require validation
    private final String testExtraId = "";

    @BeforeEach
    void setUp() {
        parkingSpaceProxy = new ParkingSpaceProxy();
    }

    @Test
    void testRegisterClient_Success() {
        boolean result = parkingSpaceProxy.register(
                testClientName, testUsername, testPassword, testClientType, testExtraId);
        assertTrue(result, "Client registration should succeed for a unique username.");
    }

    @Test
    void testRegisterClient_UsernameExists() {
        parkingSpaceProxy.register(
                testClientName, testUsername, testPassword, testClientType, testExtraId);

        boolean result = parkingSpaceProxy.register(
                "Another Client", testUsername, "pw2", "student", "S123");

        assertFalse(result, "Client registration should fail when username already exists.");
    }

    @Test
    void testLogin_ClientNotFound() {
        Object user = parkingSpaceProxy.login("nonexistentUser", "badpassword");
        assertNull(user, "Login should return null for credentials not found in the registry.");
    }

    @Test
    void testAutoGenerateManager() {
        try {
            parkingSpaceProxy.autoGenerateManager();
        } catch (Exception e) {
            fail("autoGenerateManager should execute without throwing exceptions.", e);
        }
    }

    @Test
    void testValidateClient_ClientNotFound() {
        try {
            parkingSpaceProxy.validateClient(nonExistentClientId);
        } catch (Exception e) {
            fail("validateClient should execute without throwing exceptions for a non-existent client.", e);
        }
    }

    @Test
    void testDisplayPendingValidations_Empty() {
        List<Client> pending = parkingSpaceProxy.getRegistry().displayPendingValidations();
        assertNotNull(pending, "DisplayPendingValidations should return a list.");
        assertTrue(pending.isEmpty(), "Pending validations list should be empty initially.");
    }

    @Test
    void testAddParkingLot_Proxy() {
        SpaceManager sm = parkingSpaceProxy.getFacade().getSpaceManager();
        assertNull(sm.getParkingLots().get(testLotId));

        parkingSpaceProxy.addParkingLot(testLotId);

        assertNotNull(sm.getParkingLots().get(testLotId));
        assertTrue(sm.getParkingLots().get(testLotId).isEnabled());
    }

    @Test
    void testToggleLot_Proxy() {
        parkingSpaceProxy.addParkingLot(testLotId);
        assertTrue(parkingSpaceProxy.getFacade().getSpaceManager().getParkingLots().get(testLotId).isEnabled());

        parkingSpaceProxy.toggleLot(testLotId, false);

        assertFalse(parkingSpaceProxy.getFacade().getSpaceManager().getParkingLots().get(testLotId).isEnabled());
    }

    @Test
    void testScanSpace_Proxy_Empty() {
        parkingSpaceProxy.addParkingLot(testLotId);

        String status = parkingSpaceProxy.scanSpace(testLotId, testSpaceIdStr);

        assertEquals("empty", status, "Scan via proxy should return 'empty' for an available space.");
    }

    @Test
    void testGetBookingDetails_Proxy_NotFound() {
        Booking booking = parkingSpaceProxy.getBookingDetails(nonExistentClientId);
        assertNull(booking, "Get booking details via proxy should return null when no booking exists.");
    }
}
