package ParkingSystem;

public class SuperManager extends Manager {
    private static SuperManager instance;
    private AccountRegistry registry;

    private SuperManager(String managerId, String name, String password, AccountRegistry registry) {
        super(); 
        setManagerInfo(managerId, name, password);
        this.registry = registry;
    }

    public static SuperManager createFromCSV(String managerId, String name, String password, AccountRegistry registry) {
        if (instance == null) {
            instance = new SuperManager(managerId, name, password, registry);
        }
        return instance;
    }

    public void autoGenerateManager() {
        registry.autoGenerateManager();
    }
}