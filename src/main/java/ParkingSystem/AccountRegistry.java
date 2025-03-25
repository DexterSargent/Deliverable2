package ParkingSystem;

import java.util.HashMap;
import java.util.Map;

public class AccountRegistry {
    private final Map<String, Client> clients = new HashMap<>();
    private final Map<String, Client> pendingValidations = new HashMap<>();
    private final Map<String, Manager> managers = new HashMap<>();
    private SuperManager superManager;
    private final CSVManager csvManager = new CSVManager();
    private ParkingSpaceProxy proxy;

    public void loadClientsFromCSV() {
        clients.clear();
        for (Client client : csvManager.loadClients()) {
            clients.put(client.getClientId(), client);
            assignProxyToClient(client.getClientId(), proxy);
        }
    }

    public void loadManagersFromCSV() {
        managers.clear();
        for (Manager manager : csvManager.loadManagers()) {
            managers.put(manager.getManagerId(), manager);
            assignProxyToManager(manager.getManagerId(), proxy);
        }
    }

    public void loadSuperManagerFromCSV() {
        superManager = SuperManager.createFromCSV(
            csvManager.loadSuperManager()[0],
            csvManager.loadSuperManager()[1],
            csvManager.loadSuperManager()[2],
            this
        );
    }

    public void assignProxyToClient(String clientId, ParkingSpaceProxy proxy) {
        Client client = clients.get(clientId);
        if (client != null) {
            client.assignProxy(proxy);
        }
    }

    public void assignProxyToManager(String managerId, ParkingSpaceProxy proxy) {
        Manager manager = managers.get(managerId);
        if (manager != null) {
            manager.assignProxy(proxy);
        }
    }

    public boolean registerClient(Client client) {
        if (!clients.containsKey(client.getClientId())) {
            if (requiresValidation(client.getClientType())) {
                pendingValidations.put(client.getClientId(), client);
            } else {
                clients.put(client.getClientId(), client);
            }
            csvManager.saveClient(client);
            return true;
        }
        return false;
    }

    public void autoGenerateManager() {
        Manager manager = Manager.getInstance();
        managers.put(manager.getManagerId(), manager);
        csvManager.saveManager(manager);
    }

    public void displayPendingValidations() {
        pendingValidations.values().forEach(client -> 
            System.out.println(client.getClientId() + " - " + client.getClientType()));
    }

    public void validateClient(String clientId) {
        Client client = pendingValidations.remove(clientId);
        if (client != null) {
            clients.put(clientId, client);
            csvManager.updateClientValidation(clientId, true);
        }
    }

    public boolean login(String username, String password) {
        return clients.values().stream().anyMatch(c -> c.getUsername().equals(username) && c.getPassword().equals(password)) ||
               managers.values().stream().anyMatch(m -> m.getName().equals(username) && m.getPassword().equals(password)) ||
               (superManager != null && superManager.getName().equals(username) && superManager.getPassword().equals(password));
    }

    private boolean requiresValidation(String clientType) {
        return clientType.equals("student") || clientType.equals("faculty") || clientType.equals("staff");
    }
    
    public Client getClient(String clientId) {
        return clients.get(clientId);
    }
}
