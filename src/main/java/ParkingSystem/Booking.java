package ParkingSystem;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Booking {
    private final String clientId;
    private final String lotId;
    private final int spaceId;
    private String startTime;
    private int duration;
    private final String licensePlate;
    private final double totalCost;
    private boolean checkedIn;

    public Booking(String clientId, String lotId, int spaceId, String startTime, int duration, String licensePlate, double totalCost) {
        this.clientId = clientId;
        this.lotId = lotId;
        this.spaceId = spaceId;
        this.startTime = startTime;
        this.duration = duration;
        this.licensePlate = licensePlate;
        this.totalCost = totalCost;
        this.checkedIn = false;
    }

    public LocalTime getCheckedInDeadline() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime start = LocalTime.parse(startTime, formatter);
        return start.plusHours(1);
    }

    public String getClientId() {
    	return clientId; 
    }
    public String getLotId() { 
    	return lotId; 
    }
    public int getSpaceId() { 
    	return spaceId; 
    }
    public String getStartTime() { 
    	return startTime; 
    }
    public int getDuration() { 
    	return duration; 
    }
    public String getLicensePlate() { 
    	return licensePlate; 
    }
    public double getTotalCost() { 
    	return totalCost; 
    }
    public boolean isCheckedIn() { 
    	return checkedIn; 
    }

    void setStartTime(String newStartTime) {
    	this.startTime = newStartTime; 
    }
    void setDuration(int newDuration) { 
    	this.duration = newDuration;
    }
    void setCheckedIn(boolean checkedIn) { 
    	this.checkedIn = checkedIn; 
    }
}