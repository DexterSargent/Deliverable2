package ParkingSystem;

public class ParkingSpace {
    private final int spaceId;
    private SpaceState state;
    private Booking currentBooking;

    public ParkingSpace(int spaceId) {
        this.spaceId = spaceId;
        this.state = new Enabled();
    }

    public boolean isAvailable() {
        return currentBooking == null && state instanceof Enabled;
    }

    public boolean assignBooking(Booking booking) {
        if (state instanceof Enabled && currentBooking == null) {
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

    public void setState(SpaceState state) {
        this.state = state;
    }

    public Booking getCurrentBooking() {
        return currentBooking;
    }

	public int getSpaceId() {
		return spaceId;
	}

	public SpaceState getState() {
		return state;
	}
}