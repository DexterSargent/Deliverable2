package ParkingSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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

    public List<Client> displayPendingValidations() {
    	 return new ArrayList<>(pendingValidations.values());
    }

    public void validateClient(String clientId) {
        Client client = pendingValidations.remove(clientId);
        if (client != null) {
            clients.put(clientId, client);
            csvManager.updateClientValidation(clientId, true);
        }
    }

    public Object login(String username, String password) {
        for (Client c : clients.values()) {
            if (c.getUsername().equals(username) && c.getPassword().equals(password)) {
                Client client = Client.getInstance();
                client.setClientInfo(
                    c.getClientId(),
                    c.getName(),
                    c.getUsername(),
                    c.getPassword(),
                    c.getClientType(),
                    c.getLicensePlate(),
                    c.getExtraId(),
                    c.getIsValidated()
                );
                return client;
            }
        }

        for (Manager m : managers.values()) {
            if (m.getName().equals(username) && m.getPassword().equals(password)) {
                Manager manager = Manager.getInstance();
                manager.setManagerInfo(
                    m.getManagerId(),  // or however your manager data is structured
                    m.getName(),
                    m.getPassword()
                );
                return manager;
            }
        }

        if (superManager != null && superManager.getName().equals(username)
            && superManager.getPassword().equals(password)) {
            return superManager;  // assuming superManager is a singleton or already exists
        }

        return null;
    }


    private boolean requiresValidation(String clientType) {
        return clientType.equals("student") || clientType.equals("faculty") || clientType.equals("staff");
    }
    
    public Client getClientType(String clientId) {
        return clients.get(clientId);
    }
}
