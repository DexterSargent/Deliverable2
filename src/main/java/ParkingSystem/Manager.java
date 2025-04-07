package ParkingSystem;

public class Manager {
    private static Manager instance;
    private String managerId;
    private String name;
    private String password;
    private ParkingSpaceProxy parkingProxy;

    protected Manager() {} 
    
    public static Manager getInstance() {
        if (instance == null) {
            instance = new Manager();
        }
        return instance;
    }

    public void displayPendingValidations() {
        parkingProxy.displayPendingValidations();
    }

    public void validateClient(String clientId) {
        parkingProxy.validateClient(clientId);
    }

    public void assignProxy(ParkingSpaceProxy proxy) {
        this.parkingProxy = proxy;
    }

    public String getManagerId() { 
        return managerId; 
    }
    
    public String getName() { 
        return name; 
    }
    
    protected String getPassword() {
    	return password;
    }

    public void setManagerInfo(String managerId, String name, String password) {
        this.managerId = managerId;
        this.name = name;
        this.password = password;
    }
}