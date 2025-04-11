import static org.junit.Assert.*;

import java.lang.reflect.Field;

import org.junit.Test;

import BookingTest.BookingForTest;
import ParkingSystem.*;
public class ManagerTest {
	
	private AccountRegistry registry;
	private Manager manager;
	
	@BeforeEach
	public void setUp() throws Exception {
		
		manager.setManagerInfo("1234", "Test", "5678");
		registry = new AccountRegistry();
	}
		
		
		@Test
		public void testDisplayPendingValidations()
		{
			registry.registerClient("Tester", "Test", "123", "student", "someID");
			registry.registerClient("Tester2", "Test2", "123", "student", "someID2");
			registry.registerClient("Tester3", "Test3", "123", "student", "someID3");
			
			 assertEquals(3, registry.displayPendingValidations().size());
		}
		
		@Test
		public void testDisplayPendingValidationsEmpty()
		{
			assertEquals(0, registry.displayPendingValidations().size());

		}
		
		@Test
		public void testValidateClient()
		{
			registry.registerClient("Tester", "Test", "123", "student", "someID");
			assertEquals(1, registry.displayPendingValidations().size());
			manager.validateClient("someID");
			assertEquals(0, registry.displayPendingValidations().size());
			
		}
		
		@Test 
		public void testManagerID()
		{
			assertEquals("1234", manager.getManagerId());
			
		}
		
		@Test 
		public void testGetManagerName()
		{
			assertEquals("Test", manager.getName());
		}

		@Test 
		public void testGetManagerPass()
		{
			assertEquals("5678", manager.getPassword());
		}
		
		@Test
		public void assignPrxiyTest()
		{
			ParkingSpaceProxy proxy = new ParkingSpaceProxy();
	    	manager.assignProxy(proxy);
	    	Field proxyField = Manager.class.getDeclaredField("parkingProxy");
	    	proxyField.setAccessible(true);
	    	ParkingSpaceProxy retrievedProxy = (ParkingSpaceProxy) proxyField.get(manager);
	    	assertEquals(proxy, retrievedProxy);
		}
		
		//The next cases should fail
		
		public void testManagerIDFail()
		{
			assertEquals("567", manager.getManagerId());
			
		}
		
		@Test 
		public void testGetManagerNameFail()
		{
			assertEquals("Fail", manager.getName());
		}

		@Test 
		public void testGetManagerPassFail()
		{
			assertEquals("1234", manager.getPassword());
		}
		
	
		

}
