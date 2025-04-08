package ParkingSystem;

public class SuperManager extends Manager {
    private static SuperManager instance;
    public AccountRegistry registry;

    private SuperManager(String managerId, String name, String password, AccountRegistry registry) { 
        setManagerInfo(managerId, name, password);
        this.registry = registry;
    }

    public static SuperManager createFromCSV(String managerId, String name, String password, AccountRegistry registry) {
        if (instance == null) {
            instance = new SuperManager(managerId, name, password, registry);
        }
        return instance;
    }

    public Manager autoGenerateManager() {
        return registry.autoGenerateManager();
    }
    
    public AccountRegistry getRegistry() {
    	return this.registry;
    }
    
    public static synchronized void reset() {
        instance = null;
    }
    
    public static void main(String[] args) {
 
        AccountRegistry registry1 = new AccountRegistry();
        SuperManager superManager1 = SuperManager.createFromCSV("SM-123", "SuperAdmin", "securePass123", registry1);
        Manager manager = superManager1.autoGenerateManager();
        
        System.out.print(registry1.getManagers());
        System.out.print(registry1.getManagers().containsValue(manager));
    }
}