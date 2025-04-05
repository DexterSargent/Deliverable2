import static org.junit.jupiter.api.Assertions.*;
import ParkingSystem.AccountRegistry;

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
	}
	
	@Test
	public void testDuplicateUsernameRegistration() {
		registry.registerClient("Bob", "bob123", "pass456", "student", "studentId2");
		boolean result = registry.registerClient("AntoherBob",  "bob123", "newpass", "studnet", "studentId3");
		assertFalse(result);
	}

	
}
