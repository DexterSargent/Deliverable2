import ParkingSystem.*;

import static org.junit.Assert.*;
import org.junit.Test;
import java.lang.reflect.Field;
import java.util.Map;

public class UserTest {

    @Test
    public void testSuccessfulClientRegistration() {
        User user = new User();
        ParkingSpaceProxy proxy = new ParkingSpaceProxy();
        user.assignProxy(proxy);

        user.register("John Doe", "johndoe", "password123", "visitor", "");
        
        Object loggedIn = proxy.login("johndoe", "password123");
        assertTrue(loggedIn instanceof Client);
    }

    @Test
    public void testDuplicateUsernameRegistration() {
        ParkingSpaceProxy proxy = new ParkingSpaceProxy();
        User user1 = new User();
        user1.assignProxy(proxy);
        user1.register("John Doe", "johndoe", "password123", "visitor", "");

        User user2 = new User();
        user2.assignProxy(proxy);
        user2.register("Jane Doe", "johndoe", "password456", "visitor", "");

        Object firstLogin = proxy.login("johndoe", "password123");
        Object secondLogin = proxy.login("johndoe", "password456");
        
        assertNotNull(firstLogin);
        assertNull(secondLogin);
    }

    @Test
    public void testInvalidPasswordLogin() {
        ParkingSpaceProxy proxy = new ParkingSpaceProxy();
        User user = new User();
        user.assignProxy(proxy);
        user.register("John Doe", "johndoe", "password123", "visitor", "");

        Object loggedIn = proxy.login("johndoe", "wrongpassword");
        assertNull(loggedIn);
    }

    @Test
    public void testManagerLogin() throws Exception {
        ParkingSpaceProxy proxy = new ParkingSpaceProxy();
        AccountRegistry registry = proxy.getRegistry();

        Manager manager = Manager.getInstance();
        manager.setManagerInfo("MGR-1", "managerUser", "managerPass");
        
        Field managersField = AccountRegistry.class.getDeclaredField("managers");
        managersField.setAccessible(true);
        ((Map<String, Manager>) managersField.get(registry)).put(manager.getManagerId(), manager);

        Object loggedIn = proxy.login("managerUser", "managerPass");
        assertTrue(loggedIn instanceof Manager);
    }

    @Test
    public void testSuperManagerLogin() throws Exception {
        ParkingSpaceProxy proxy = new ParkingSpaceProxy();
        AccountRegistry registry = proxy.getRegistry();

        SuperManager superManager = SuperManager.createFromCSV(
            "SM-1", "superUser", "superPass", registry
        );
        
        Field superManagerField = AccountRegistry.class.getDeclaredField("superManager");
        superManagerField.setAccessible(true);
        superManagerField.set(registry, superManager);

        Object loggedIn = proxy.login("superUser", "superPass");
        assertTrue(loggedIn instanceof SuperManager);
    }

    @Test
    public void testClientRegistrationNeedsValidation() throws Exception {
        ParkingSpaceProxy proxy = new ParkingSpaceProxy();
        User user = new User();
        user.assignProxy(proxy);
        user.register("Student", "studentUser", "pass123", "student", "STU-001");

        Field pendingField = AccountRegistry.class.getDeclaredField("pendingValidations");
        pendingField.setAccessible(true);
        Map<?, ?> pending = (Map<?, ?>) pendingField.get(proxy.getRegistry());

        assertFalse(pending.isEmpty());
    }

    @Test
    public void testValidateClient() throws Exception {
        ParkingSpaceProxy proxy = new ParkingSpaceProxy();
        AccountRegistry registry = proxy.getRegistry();
        User user = new User();
        user.assignProxy(proxy);
        user.register("Staff", "staffUser", "pass123", "staff", "STAFF-001");

        Field pendingField = AccountRegistry.class.getDeclaredField("pendingValidations");
        pendingField.setAccessible(true);
        Map<String, Client> pending = (Map<String, Client>) pendingField.get(registry);
        String clientId = pending.keySet().iterator().next();

        registry.validateClient(clientId);

        Field clientsField = AccountRegistry.class.getDeclaredField("clients");
        clientsField.setAccessible(true);
        Map<?, ?> clients = (Map<?, ?>) clientsField.get(registry);
        
        assertTrue(clients.containsKey(clientId));
    }
}

