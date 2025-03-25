package ParkingSystem;

public class Client {
	private static Client client;
	
	private Client() {}
	
	private String clientId;
	private String name;
	private String username;
	private String password;
	private String clientType;
	private String licensePlate;
	private String extraId;
	private boolean isValidated;
	private ParkingSpaceProxy parkingProxy;
	
	public boolean confirmBooking(String lotId, int spaceId, String startTime, int duration,
					String paymentType, String cardNumber) {
		return parkingProxy.confirmBooking(clientId, clientType, licensePlate, lotId, spaceId, startTime, duration, paymentType, cardNumber);
	}
	
	public boolean checkIn() {
		return parkingProxy.checkIn(clientId);
	}
	
	public boolean cancelBooking() {
		return parkingProxy.cancelBooking(clientId);
	}
	
	public boolean extendBooking(int extraHours) {
		return parkingProxy.extendBooking(clientId, extraHours);
	}
	
	public boolean editBooking(String newStartTime, int newDuration) {
		return parkingProxy.editBooking(clientId, newStartTime, newDuration);
	}
	
    public Booking getBookingDetails() {
        return parkingProxy.getBookingDetails(clientId);
    }
	
	public void assignProxy(ParkingSpaceProxy parkingProxy) {
		this.parkingProxy = parkingProxy;
	}

    public static Client getInstance() {
        if (client == null) {
            synchronized (Client.class) {
                if (client == null) {
                    client = new Client();
                }
            }
        }
        return client;
    }
    
    public String getClientId() { 
    	return clientId; 
    }
    
    public String getName() {
    	return name; 
    }
    
    protected String getUsername() {
		return username;
	}

	protected String getPassword() {
		return password;
	}

	public String getClientType() {
    	return clientType; 
    }
	
	public String getLicensePlate() {
		return licensePlate;
	}
	
	public String getExtraId() {
		return extraId;
	}
    
    public boolean getIsValidated() { 
    	return isValidated;
    }

    protected void setClientId(String id) {
    	this.clientId = id; 
    }
    
    protected void setValidated(boolean validated) { 
    	this.isValidated = validated; 
    }
    
    public void setClientInfo(String clientId, String name, String username, String password, String clientType, String licensePlate, String extraId, boolean isValidated) {
			this.clientId = clientId;
			this.name = name;
			this.username = username;
			this.password = password;
			this.clientType = clientType;
			this.licensePlate = licensePlate;
			this.extraId = extraId;
			this.isValidated = isValidated;
	}

}
