package ParkingSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

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

    public boolean registerClient(String name, String username, String password, String clientType, String extraId) {
        String clientId;
        do {
            clientId = "CLT-" + UUID.randomUUID().toString();
        } while (clients.containsKey(clientId) || pendingValidations.containsKey(clientId));

        boolean usernameExists = clients.values().stream().anyMatch(c -> c.getUsername().equals(username)) ||
                                  pendingValidations.values().stream().anyMatch(c -> c.getUsername().equals(username));
        if (usernameExists) {
            return false;
        }

        Client client = Client.getInstance();
        client.setClientInfo(
            clientId,
            name,
            username,
            password,
            extraId,
            clientType,
            !requiresValidation(clientType)
        );

        if (proxy != null) {
            client.assignProxy(proxy);
        }

        if (requiresValidation(clientType)) {
            pendingValidations.put(clientId, client);
        } else {
            clients.put(clientId, client);
        }

        csvManager.saveClient(client);
        return true;
    }


    public void autoGenerateManager() {
        String randomName = generateRandomString(8);
        String randomPassword = generateRandomString(10);

        Manager manager = Manager.getInstance();
        manager.setManagerInfo(
            UUID.randomUUID().toString(),
            randomName,
            randomPassword
        );

        managers.put(manager.getManagerId(), manager);
        csvManager.saveManager(manager);

        System.out.println("Generated Manager:");
        System.out.println("Username: " + randomName);
        System.out.println("Password: " + randomPassword);
    }

    private String generateRandomString(int length) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            sb.append(chars.charAt(random.nextInt(chars.length())));
        }
        return sb.toString();
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
                    c.getExtraId(),
                    c.getIsValidated()
                );
                client.assignProxy(proxy);
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
                manager.assignProxy(proxy);
                return manager;
            }
        }

        if (superManager != null && superManager.getName().equals(username)
            && superManager.getPassword().equals(password)) {
        	superManager.assignProxy(proxy);
            return superManager;  // assuming superManager is a singleton or already exists
        }

        return null;
    }


    public boolean requiresValidation(String clientType) {
        return clientType.equals("student") || clientType.equals("faculty") || clientType.equals("staff");
    }
    
    public Client getClient(String clientId) {
        return clients.get(clientId);
    }
    
    public int getManagersSize() {
    	return managers.size();
    }
    
    public Manager getManager(String managerId) {
    	return managers.get(managerId);
    }
}
