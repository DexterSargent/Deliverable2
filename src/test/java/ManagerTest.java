import static org.junit.jupiter.api.Assertions.*;  // ✅ JUnit 5 assertions

import java.lang.reflect.Field;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ParkingSystem.*;

public class ManagerTest {

    private AccountRegistry registry;
    private Manager manager;
    private ParkingSpaceProxy proxy;

    @BeforeEach
    public void setUp() throws Exception {
        manager = Manager.getInstance();
        proxy = new ParkingSpaceProxy();
        
        // Hook them properly
        registry = proxy.getRegistry();  // fine for now
        
        manager.assignProxy(proxy);
        manager.setManagerInfo("1234", "Test", "5678");
    }

    @Test
    public void testDisplayPendingValidations() {
        registry.registerClient("Tester", "Test", "123", "student", "someID");
        registry.registerClient("Tester2", "Test2", "123", "student", "someID2");
        registry.registerClient("Tester3", "Test3", "123", "student", "someID3");

        assertEquals(3, registry.displayPendingValidations().size());
    }

    @Test
    public void testDisplayPendingValidationsEmpty() {
        assertEquals(0, registry.displayPendingValidations().size());
    }

    @Test
    public void testValidateClient() {
        registry.registerClient("Tester", "Test", "123", "student", "someID");
        assertEquals(1, registry.displayPendingValidations().size());
        String clientId = registry.displayPendingValidations().get(0).getClientId();
        manager.validateClient(clientId);
        assertEquals(0, registry.displayPendingValidations().size());
    }

    @Test
    public void testManagerID() {
        assertEquals("1234", manager.getManagerId());
    }

    @Test
    public void testGetManagerName() {
        assertEquals("Test", manager.getName());
    }

    @Test
    public void testGetManagerPass() {
        assertEquals("5678", manager.getPassword());
    }

    @Test
    public void assignProxyTest() throws Exception {
        ParkingSpaceProxy proxy = new ParkingSpaceProxy();
        manager.assignProxy(proxy);

        Field proxyField = Manager.class.getDeclaredField("parkingProxy");
        proxyField.setAccessible(true);
        ParkingSpaceProxy retrievedProxy = (ParkingSpaceProxy) proxyField.get(manager);
        assertEquals(proxy, retrievedProxy);
    }

    // ❌ REMOVE the intentionally wrong fail tests
}
