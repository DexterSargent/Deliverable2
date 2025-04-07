import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ParkingSystem.Booking;
import ParkingSystem.CSVManager;
import ParkingSystem.Client;
import ParkingSystem.Enabled;
import ParkingSystem.Manager;
import ParkingSystem.ParkingLot;
import ParkingSystem.ParkingSpace;

class CSVManagerTest {

	CSVManager csvManager;
	
	private static final String TEST_CLIENT_FILE = "test_clients.csv";
	private static final String TEST_MANAGER_FILE = "test_managers.csv";
	private static final String TEST_SUPERMANAGER_FILE = "test_super_manager.csv";
	private static final String TEST_PARKINGLOT_FILE = "test_parking_lots.csv";
	
	@BeforeEach
	void setUp() throws Exception {
		csvManager = new CSVManager();
		
		setPrivateField(csvManager, "clientFile", TEST_CLIENT_FILE);
	    setPrivateField(csvManager, "managerFile", TEST_MANAGER_FILE);
	    setPrivateField(csvManager, "superManagerfile", TEST_SUPERMANAGER_FILE);
	    setPrivateField(csvManager, "parkingLotFile", TEST_PARKINGLOT_FILE);
	}
	
	private void setPrivateField(Object object, String fieldName, String value) throws Exception {
		Field field = object.getClass().getDeclaredField(fieldName);
		field.setAccessible(true);
		field.set(object, value);
	}
	
	@AfterEach
	void tearDown() {
		new File(TEST_CLIENT_FILE).delete();
		new File(TEST_MANAGER_FILE).delete();
		new File(TEST_SUPERMANAGER_FILE).delete();
		new File(TEST_PARKINGLOT_FILE).delete();
	}

	@Test
	void testSaveAndLoadClient() {
		Client client = Client.getInstance();
		client.setClientInfo("CLT-001", "Alice", "alice123", "pass123", "student", "studentId123", false);
		csvManager.saveClient(client);
		List<Client> loadedClients = csvManager.loadClients();
		assertEquals(1, loadedClients.size());
		
		Client loadedClient = loadedClients.get(0);
		assertEquals("CLT-001", loadedClient.getClientId());
		assertEquals("Alice", loadedClient.getName());
	    assertEquals("alice123", loadedClient.getUsername());
	    assertEquals("pass123", loadedClient.getPassword());
	    assertEquals("student", loadedClient.getClientType());
	    assertEquals("studentId123", loadedClient.getExtraId());
	    assertFalse(loadedClient.getIsValidated());
	}
	
	@Test
    void testSaveAndLoadManager() {
        Manager manager = Manager.getInstance();
        manager.setManagerInfo("MGR-001", "Manager One", "password");

        csvManager.saveManager(manager);

        List<Manager> loadedManagers = csvManager.loadManagers();
        assertEquals(1, loadedManagers.size());

        Manager loadedManager = loadedManagers.get(0);
        assertEquals("MGR-001", loadedManager.getManagerId());
        assertEquals("Manager One", loadedManager.getName());
    }

    @Test
    void testLoadSuperManager() throws Exception {
        // Manually write a super manager record
        try (java.io.FileWriter writer = new java.io.FileWriter(TEST_SUPERMANAGER_FILE)) {
            writer.write("admin,adminpass\n");
        }
        String[] superManager = csvManager.loadSuperManager();
        assertArrayEquals(new String[]{"admin", "adminpass"}, superManager);
    }
    
    @Test
    void testUpdateClientValidation() {
        Client client = Client.getInstance();
        client.setClientInfo("CLT-002", "Bob", "bob123", "pass456", "faculty", "facultyId123", false);

        csvManager.saveClient(client);

        csvManager.updateClientValidation("CLT-002", true);

        List<Client> loadedClients = csvManager.loadClients();
        assertTrue(loadedClients.get(0).getIsValidated());
    }
        
    @Test
    void testSaveAndLoadParkingLots() {
        Map<String, ParkingLot> lots = new HashMap<>();
        ParkingLot lot = new ParkingLot("LOT-A");
        ParkingSpace space = lot.getParkingSpace(1);

        Booking booking = new Booking("CLT-003", "LOT-A", 1, "12:00", 2, "ABC123", 30.0);
        space.assignBooking(booking);

        lots.put("LOT-A", lot);

        csvManager.saveParkingLots(lots);

        Map<String, ParkingLot> loadedLots = new HashMap<>();
        csvManager.loadParkingLots(loadedLots);

        assertTrue(loadedLots.containsKey("LOT-A"));
        assertTrue(loadedLots.get("LOT-A").isEnabled());
        assertNotNull(loadedLots.get("LOT-A").getParkingSpace(1).getCurrentBooking());
    }
    
    @Test
    void testReadCSVCreatesFileIfMissing() {
        File missingFile = new File("nonexistent.csv");
        if (missingFile.exists()) missingFile.delete();

        List<String[]> data = csvManager.readCSV("nonexistent.csv");
        assertTrue(missingFile.exists());
        assertTrue(data.isEmpty());

        missingFile.delete();
    }
    
    @Test
    void testAppendCSVAppendsCorrectly() throws Exception {
        String[] data1 = {"id1", "Alice"};
        String[] data2 = {"id2", "Bob"};

        Method appendMethod = CSVManager.class.getDeclaredMethod("appendCSV", String.class, String[].class);
        appendMethod.setAccessible(true);

        appendMethod.invoke(csvManager, TEST_CLIENT_FILE, data1);
        appendMethod.invoke(csvManager, TEST_CLIENT_FILE, data2);

        List<String[]> records = csvManager.readCSV(TEST_CLIENT_FILE);
        assertEquals(2, records.size());
        assertArrayEquals(new String[]{"id1", "Alice"}, records.get(0));
        assertArrayEquals(new String[]{"id2", "Bob"}, records.get(1));
    }
    
    @Test
    void testOverwriteCSVOverwritesCorrectly() throws Exception {
        String[] data1 = {"id1", "Alice"};
        String[] data2 = {"id2", "Bob"};

        List<String[]> dataList2 = new ArrayList<>();
        dataList2.add(data2);
        
        Method appendMethod = CSVManager.class.getDeclaredMethod("appendCSV", String.class, String[].class);
        appendMethod.setAccessible(true);

        appendMethod.invoke(csvManager, TEST_CLIENT_FILE, data1);

        Method overwriteMethod = CSVManager.class.getDeclaredMethod("overwriteCSV", String.class, List.class);
        overwriteMethod.setAccessible(true);

        overwriteMethod.invoke(csvManager, TEST_CLIENT_FILE, dataList2);

        List<String[]> records = csvManager.readCSV(TEST_CLIENT_FILE);
        assertEquals(1, records.size());
        assertArrayEquals(new String[]{"id2", "Bob"}, records.get(0));
    }

    @Test
    void testLoadParkingLotSkipsInvalidRecords() throws Exception {
        // Write invalid record manually
        try (java.io.FileWriter writer = new java.io.FileWriter(TEST_SUPERMANAGER_FILE)) {
            writer.write("invalid,record\n");
        }
        Map<String, ParkingLot> lots = new HashMap<>();
        csvManager.loadParkingLots(lots);
        assertTrue(lots.isEmpty());
    }

    @Test
    void testSaveParkingLotsEmptyLot() {
        Map<String, ParkingLot> emptyLots = new HashMap<>();
        csvManager.saveParkingLots(emptyLots);

        File file = new File(TEST_PARKINGLOT_FILE);
        assertTrue(file.exists());
    }

}
