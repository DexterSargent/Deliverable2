package ParkingSystem;

public class Manager {
    private static Manager instance;
    private String managerId;
    private String name;
    private ParkingSpaceProxy parkingProxy;

    protected Manager() {} 
    
    public static Manager getInstance() {
        if (instance == null) {
            instance = new Manager();
        }
        return instance;
    }

    // Rest of the class remains unchanged
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

    void setManagerInfo(String managerId, String name) {
        this.managerId = managerId;
        this.name = name;
    }
}