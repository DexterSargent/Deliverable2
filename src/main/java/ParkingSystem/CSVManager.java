package ParkingSystem;

import java.io.*;
import java.util.*;

public class CSVManager {
    private String clientFile = "clients.csv";
    private String managerFile = "managers.csv";
    private String superManagerFile = "super_manager.csv";
    private String parkingLotFile = "parking_lots.csv";

    public List<Client> loadClients() {
        List<String[]> data = readCSV(clientFile);
        List<Client> clients = new ArrayList<>();
        
        for (String[] record : data) {
            Client client = Client.getInstance();
            client.setClientInfo(record[0], record[1], record[2], record[3], 
                               record[4], record[5], record[6], Boolean.parseBoolean(record[7]));
            clients.add(client);
        }
        return clients;
    }

    public List<Manager> loadManagers() {
        return readCSV(managerFile).stream()
            .map(record -> Manager.getInstance())
            .toList();
    }

    public String[] loadSuperManager() {
        List<String[]> data = readCSV(superManagerFile);
        return data.isEmpty() ? new String[0] : data.get(0);
    }

    public void saveClient(Client client) {
        String[] data = {
            client.getClientId(), client.getName(), client.getUsername(), 
            client.getPassword(), client.getClientType(), client.getLicensePlate(), 
            client.getExtraId(), String.valueOf(client.isValidated())
        };
        appendCSV(clientFile, data);
    }

    public void saveManager(Manager manager) {
        String[] data = {manager.getManagerId(), manager.getName()};
        appendCSV(managerFile, data);
    }

    public void updateClientValidation(String clientId, boolean isValidated) {
        List<String[]> records = readCSV(clientFile);
        for (String[] record : records) {
            if (record[0].equals(clientId)) {
                record[7] = String.valueOf(isValidated);
            }
        }
        overwriteCSV(clientFile, records);
    }

    private List<String[]> readCSV(String filePath) {
        List<String[]> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                records.add(line.split(","));
            }
        } catch (IOException e) {
            System.err.println("Error reading CSV: " + e.getMessage());
        }
        return records;
    }

    private void appendCSV(String filePath, String[] data) {
        try (FileWriter fw = new FileWriter(filePath, true);
             BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(String.join(",", data));
            bw.newLine();
        } catch (IOException e) {
            System.err.println("Error appending CSV: " + e.getMessage());
        }
    }

    private void overwriteCSV(String filePath, List<String[]> data) {
        try (FileWriter fw = new FileWriter(filePath);
             BufferedWriter bw = new BufferedWriter(fw)) {
            for (String[] record : data) {
                bw.write(String.join(",", record));
                bw.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error overwriting CSV: " + e.getMessage());
        }
    }
}
