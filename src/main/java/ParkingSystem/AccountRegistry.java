package ParkingSystem;

import java.util.Map;

public class AccountRegistry {

	private Map<Integer, String> clients;
	private Map<Integer, String> pendingValidations;
	private Map<Integer, String> managers;
	private SuperManager superManager;
	private CSVManager csvManager;
}
