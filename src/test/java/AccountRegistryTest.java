import static org.junit.jupiter.api.Assertions.*;
import ParkingSystem.AccountRegistry;
import ParkingSystem.Client;
import ParkingSystem.Manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AccountRegistryTest {
	
	private AccountRegistry registry;

	@BeforeEach
	public void setUp() throws Exception {
		registry = new AccountRegistry();
	}

	@Test
	public void testRegisterClientSuccess() {
		boolean result = registry.registerClient("Alice", "alice123", "pass123", "student", "studentId");
		assertTrue(result);
		String clientId = registry.displayPendingValidations().get(0).getClientId();
		registry.validateClient(clientId);
		assertEquals("student", registry.getClient(clientId).getClientType());
	}
	
	@Test
	public void testDuplicateUsernameRegistration() {
		registry.registerClient("Bob", "bob123", "pass456", "student", "studentId2");
		boolean result = registry.registerClient("AntoherBob",  "bob123", "newpass", "studnet", "studentId3");
		assertFalse(result);
	}

	@Test
	public void testValidateClientRemovedFromPending() {
		registry.registerClient("Carol", "carol123", "pass789", "student", "studentId4");
		Client client = registry.displayPendingValidations().get(0);
		registry.validateClient(client.getClientId());
		assertTrue(registry.displayPendingValidations().stream().noneMatch(c -> c.getClientId().equals(client.getClientId())));	
	}
	
	@Test
	public void testValidateClientAddedToClients() {
		registry.registerClient("Carol", "carol123", "pass789", "student", "studentId4");
		Client client = registry.displayPendingValidations().get(0);
		registry.validateClient(client.getClientId());
		assertNotNull(registry.getClient(client.getClientId()));
	}
	
	@Test
	public void testClientLoginSuccess() {
		registry.registerClient("David", "david123", "password", "faculty", "facultyId");
		Client client = registry.displayPendingValidations().get(0);
		registry.validateClient(client.getClientId());
		Object user = registry.login("david123", "password");
		assertNotNull(user);
		assertTrue(user instanceof Client);
	}
	
	@Test
	public void testLoginWrongPasswordFails() {
		registry.registerClient("Eve", "eve123", "correctpass", "staff", "staffId");
        Client pendingClient = registry.displayPendingValidations().get(0);
        registry.validateClient(pendingClient.getClientId());

        Object user = registry.login("eve123", "wrongpass");
        assertNull(user);
	}
	
	 @Test
	    public void testLoginNonExistentUserFails() {
	        Object user = registry.login("nonexistent", "nopass");
	        assertNull(user);
	    }

    @Test
    public void testDisplayPendingValidations() {
        registry.registerClient("Frank", "frank123", "pass000", "student", "studentId6");
        assertEquals(1, registry.displayPendingValidations().size());
    }

    @Test
    public void testRequiresValidationForStudent() {
        assertTrue(registry.requiresValidation("student"));
    }

    @Test
    public void testRequiresValidationForFaculty() {
        assertTrue(registry.requiresValidation("faculty"));
    }

    @Test
    public void testRequiresValidationForStaff() {
        assertTrue(registry.requiresValidation("staff"));
    }

    @Test
    public void testDoesNotRequireValidationForVisitor() {
        assertFalse(registry.requiresValidation("visitor"));
    }
    
    @Test
    public void testAutoGenerateManagerAddsManager() {
    	int managersBefore = registry.getManagersSize();
    	registry.autoGenerateManager();
    	int managersAfter = registry.getManagersSize();
    	assertTrue(managersBefore < managersAfter);
    }
    
    @Test
    public void testAssignProxyToClient() {
    	registry.registerClient("TestClient", "testuser", "testpass", "student", "studentId7");
    	Client client = registry.displayPendingValidations().get(0);
    	registry.validateClient(client.getClientId());
    	registry.assignProxyToClient(client.getClientId(), null);
    	assertNotNull(registry.getClient(client.getClientId()));
    }
    
    @Test
    public void testAssignProxyToManager() {
    	registry.autoGenerateManager();
	    Manager newManager = registry.getManagers().values().stream().findFirst().orElse(null);
	    assertNotNull(newManager);
	    String managerId = newManager.getManagerId();
	    assertNotNull(managerId);
	    registry.assignProxyToManager(managerId, null);
	    assertNotNull(newManager);
    }
}
