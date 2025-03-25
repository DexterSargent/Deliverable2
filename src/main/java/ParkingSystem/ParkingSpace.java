package ParkingSystem;

public class ParkingSpace {
    private final int spaceId;
    private spaceState state;
    private Booking currentBooking;

    public ParkingSpace(int spaceId) {
        this.spaceId = spaceId;
        this.state = new Disabled();
    }

    public boolean isAvailable() {
        return currentBooking == null && state instanceof Enabled;
    }

    public boolean assignBooking(Booking booking) {
        if (state instanceof Enabled) {
            currentBooking = booking;
            return true;
        }
        return false;
    }

    public void removeBooking() {
        currentBooking = null;
    }

    public String scanSpace() {
        return state.scanSpace(this);
    }

    public void setState(spaceState state) {
        this.state = state;
    }

    Booking getCurrentBooking() {
        return currentBooking;
    }

	public int getSpaceId() {
		return spaceId;
	}

	public spaceState getState() {
		return state;
	}
}