package ParkingSystem;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class CSVManager {
    private String clientFile = "clients.csv";
    private String managerFile = "managers.csv";
    private String superManagerfile = "super_manager.csv"; // Note lowercase 'f' per diagram
    private String parkingLotFile = "parking_lots.csv";

    public List<Client> loadClients() {
        List<String[]> records = readCSV(clientFile);
        List<Client> clients = new ArrayList<>();
        
        for (String[] record : records) {
            Client client = Client.getInstance();
            client.setClientInfo(
                record[0], record[1], record[2], record[3], 
                record[4], record[5], Boolean.parseBoolean(record[6])
            );
            clients.add(client);
        }
        return clients;
    }

    public List<Manager> loadManagers() {
        List<String[]> records = readCSV(managerFile);
        List<Manager> managers = new ArrayList<>();
        
        for (String[] record : records) {
            Manager manager = Manager.getInstance();
            manager.setManagerInfo(record[0], record[1], record[2]);
            managers.add(manager);
        }
        return managers;
    }

    public String[] loadSuperManager() {
        List<String[]> records = readCSV(superManagerfile);
        return records.isEmpty() ? new String[0] : records.get(0);
    }

    public void saveClient(Client client) {
        String[] data = {
            client.getClientId(), client.getName(), client.getUsername(), 
            client.getPassword(), client.getClientType(), 
            client.getExtraId(), String.valueOf(client.getIsValidated())
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
                break;
            }
        }
        overwriteCSV(clientFile, records);
    }

    public void loadParkingLots(Map<String, ParkingLot> parkingLots) {
        List<String[]> records = readCSV(parkingLotFile);
        for (String[] record : records) {
            String lotId = record[0];
            boolean isEnabled = Boolean.parseBoolean(record[1]);
            int spaceId = Integer.parseInt(record[2]);
            String state = record[3];
            
            ParkingLot lot = parkingLots.computeIfAbsent(lotId, k -> new ParkingLot(lotId));
            lot.setEnabled(isEnabled);
            
            ParkingSpace space = lot.getParkingSpace(spaceId);
            space.setState(state.equals("ENABLED") ? new Enabled() : new Disabled());
            
            if (!record[4].isEmpty()) {
                Booking booking = new Booking(record[4], lotId, spaceId, record[5], Integer.parseInt(record[6]), record[7], 0.0 );
                booking.setCheckedIn(Boolean.parseBoolean(record[8]));
                space.assignBooking(booking);
            }
        }
    }

    public void saveParkingLots(Map<String, ParkingLot> parkingLots) {
        List<String[]> records = new ArrayList<>();
        for (ParkingLot lot : parkingLots.values()) {
            ParkingLotIterator iterator = lot.getIterator();
            while (iterator.hasNext()) {
                ParkingSpace space = iterator.next();
                String[] record = new String[9];
                record[0] = lot.getLotId();
                record[1] = String.valueOf(lot.isEnabled());
                record[2] = String.valueOf(space.getSpaceId());
                record[3] = (space.getState() instanceof Enabled) ? "ENABLED" : "DISABLED";
                
                if (space.getCurrentBooking() != null) {
                    Booking booking = space.getCurrentBooking();
                    record[4] = booking.getClientId();
                    record[5] = booking.getStartTime();
                    record[6] = String.valueOf(booking.getDuration());
                    record[7] = booking.getLicensePlate();
                    record[8] = String.valueOf(booking.isCheckedIn());
                } else {
                    Arrays.fill(record, 4, 9, "");
                }
                records.add(record);
            }
        }
        overwriteCSV(parkingLotFile, records);
    }

    private List<String[]> readCSV(String filePath) {
        List<String[]> records = new ArrayList<>();
        try {
            Files.createDirectories(Paths.get(filePath).getParent());
            if (!Files.exists(Paths.get(filePath))) {
                Files.createFile(Paths.get(filePath));
            }
            
            try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
                String line;
                while ((line = br.readLine()) != null) {
                    records.add(line.split(","));
                }
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