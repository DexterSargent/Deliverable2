import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ParkingSystem.*;
import java.util.Iterator;
import java.util.Collection;

public class ParkingLotIteratTest {
	
private ParkingLot parkingLot;
	
	@BeforeEach
	public void setUp() throws Exception {
		
		parkingLot = new ParkingLot("LotID");
	}
	
	@Test
	public void testIterator()
	{	
		int count = 0;
		parkingLot.isSpaceAvailable(0);
		parkingLot.isSpaceAvailable(1);
		parkingLot.isSpaceAvailable(2);
		parkingLot.isSpaceAvailable(3);
		parkingLot.isSpaceAvailable(4);
		parkingLot.isSpaceAvailable(5);
		
		Iterator<ParkingSpace> iterator = parkingLot.getIterator();
		
		while(iterator.hasNext())
		{
			count++;
		}
		
		assertEquals(6, count);
		

	}
	
	public void testIterator2()
	{	
		
		
		Iterator<ParkingSpace> iterator = parkingLot.getIterator();
		
		
		
		assertFalse(iterator.hasNext());

	}

}
