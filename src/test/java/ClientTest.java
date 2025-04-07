import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Field;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ParkingSystem.Client;
import ParkingSystem.ParkingSpaceProxy;

class ClientTest {
	
	Client client;

	@BeforeEach
	void setUp() throws Exception {
		client = Client.getInstance();
		client.setClientInfo("CLT-001", "Test User", "testuser", "password123", "student", "student123", false);
	}

	@Test
	void testSetAndGetClientId() {
		assertEquals("CLT-001", client.getClientId());
	}

	@Test
    void testSetAndGetName() {
        assertEquals("Test User", client.getName());
    }

    @Test
    void testSetAndGetUsername() {
        assertEquals("testuser", client.getUsername());
    }

    @Test
    void testSetAndGetPassword() {
        assertEquals("password123", client.getPassword());
    }

    @Test
    void testSetAndGetClientType() {
        assertEquals("student", client.getClientType());
    }

    @Test
    void testSetAndGetExtraId() {
        assertEquals("student123", client.getExtraId());
    }
    
    @Test
    void testClientValidated() {
    	assertFalse(client.getIsValidated());
    }
    
    @Test
    void testValidateClient() {
    	client.setValidated(true);
    	assertTrue(client.getIsValidated());
    }
    
    @Test
    void testAssignProxy() throws Exception {
    	ParkingSpaceProxy proxy = new ParkingSpaceProxy();
    	client.assignProxy(proxy);
    	Field proxyField = Client.class.getDeclaredField("parkingProxy");
    	proxyField.setAccessible(true);
    	ParkingSpaceProxy retrievedProxy = (ParkingSpaceProxy) proxyField.get(client);
    	assertEquals(proxy, retrievedProxy);
    }
    
    @Test
    void testProxyNullInitially() throws Exception {
    	Field proxyField = Client.class.getDeclaredField("parkingProxy");
    	proxyField.setAccessible(true);
    	ParkingSpaceProxy retrievedProxy = (ParkingSpaceProxy) proxyField.get(client);
    	assertNull(retrievedProxy);
    }
}
