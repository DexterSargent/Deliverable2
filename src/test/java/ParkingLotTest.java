import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ParkingSystem.*;
import java.util.Iterator;
import java.util.Collection;

public class ParkingLotTest {
	
	private ParkingLot parkingLot;
	
	@BeforeEach
	public void setUp() throws Exception {
		
		parkingLot = new ParkingLot("LotID");
	}
	
	@Test
	
	public void isAvailableTest()
	{
		boolean result = parkingLot.isSpaceAvailable(0);
		assertTrue(result);
	}
	
	@Test
	public void isAvailableTestFalse()
	{
		parkingLot.isSpaceAvailable(0);
		parkingLot.getParkingSpace(0).setState(new Disabled());
		boolean result = parkingLot.isSpaceAvailable(0);
		assertFalse(result);
	}
	
	@Test
	public void isAvailableTestFalse2()
	{
		Booking book = new Booking("clientID", "0", 0, "1:00", 4, "TestPlate", 15.0);
		parkingLot.isSpaceAvailable(0);
		parkingLot.getParkingSpace(0).assignBooking(book);
		boolean result = parkingLot.isSpaceAvailable(0);
		assertFalse(result);
	}
	
	@Test
	public void assignBookingTest()
	{
		Booking book = new Booking("clientID", "0", 0, "1:00", 4, "TestPlate", 15.0);
		boolean result = parkingLot.assignBooking(0, book);
		assertTrue(result);
	}
	
	@Test
	public void assignBookingTestFail()
	{
		parkingLot.isSpaceAvailable(0);
		parkingLot.getParkingSpace(0).setState(new Disabled());
		Booking book = new Booking("clientID", "0", 0, "1:00", 4, "TestPlate", 15.0);
		boolean result = parkingLot.assignBooking(0, book);
		assertFalse(result);
	}
	
	@Test
	public void assignBookingTestFail2()
	{
		parkingLot.isSpaceAvailable(0);
		parkingLot.getParkingSpace(0).setState(new Disabled());
		Booking book = new Booking("clientID", "0", 0, "1:00", 4, "TestPlate", 15.0);
		parkingLot.setEnabled(false);
		boolean result = parkingLot.assignBooking(0, book);
		assertFalse(result);
	}
	
	
	@Test
	public void removeBookingTest()
	{
		Booking book = new Booking("clientID", "0", 0, "1:00", 4, "TestPlate", 15.0);
		parkingLot.assignBooking(0, book);
		parkingLot.removeBooking(0);
		assertEquals(null, parkingLot.getParkingSpace(0).getCurrentBooking());
	}
	
	@Test
	public void getParkingSpaceIDTest()
	{
		parkingLot.getParkingSpace(0);
		boolean result = parkingLot.getParkingSpace(0).equals(parkingLot.getParkingSpace(0));
		assertTrue(result);
	}
	
	@Test 
	public void isEnabledTest()
	{
		parkingLot.setEnabled(false);
		assertFalse(parkingLot.isEnabled());
	}
	
	@Test
	public void isEnabledTestTrue()
	{
		parkingLot.setEnabled(true);
		assertTrue(parkingLot.isEnabled());
	}
	
	@Test
	public void getLotIDTest()
	{
		assertEquals("LotID",parkingLot.getLotId());
	}
	
	@Test
	public void iteratorTest()
	{
		int count = 0;
		parkingLot.isSpaceAvailable(0);
		parkingLot.isSpaceAvailable(1);
		parkingLot.isSpaceAvailable(2);
		
		Iterator<ParkingSpace> iterator = parkingLot.getIterator();
		
		
		
		while(iterator.hasNext() == true)
		{
			count++;
		}
		
		assertEquals(3, count);
	
	}
	
}
