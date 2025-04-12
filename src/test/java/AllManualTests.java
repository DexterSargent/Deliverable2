import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
    MobilePayTest.class,
    DebitOrCreditTest.class,
    ParkingSpaceFacadeTest.class,
    BookingTest.class,
    ParkingSpaceTest.class,
    ParkingLotIteratTest.class,
    CSVManagerTest.class,
    SpaceManagerTest.class,
    SuperManagerTest.class,
    CheckInManagerTest.class,
    BookingManagerTest.class,
    ParkingSpaceProxyTest.class,
    ClientTest.class,
    AccountRegistryTest.class,
    ParkingLotTest.class
})
public class AllManualTests {
}
