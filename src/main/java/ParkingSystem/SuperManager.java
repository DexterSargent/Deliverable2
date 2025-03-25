package ParkingSystem;

public class SuperManager extends Manager {
    private static SuperManager instance;
    private AccountRegistry registry;

    // Explicitly call super() since we're extending a non-private constructor
    private SuperManager(String managerId, String name, AccountRegistry registry) {
        super(); // Now accessible due to protected constructor
        setManagerInfo(managerId, name);
        this.registry = registry;
    }

    public static SuperManager createFromCSV(String managerId, String name, AccountRegistry registry) {
        if (instance == null) {
            instance = new SuperManager(managerId, name, registry);
        }
        return instance;
    }

    public void autoGenerateManager() {
        registry.autoGenerateManager();
    }
}