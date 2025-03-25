package ParkingSystem;

public class ParkingSpace {
    private final int spaceId;
    private spaceState state;
    private Booking currentBooking;

    public ParkingSpace(int spaceId) {
        this.spaceId = spaceId;
        this.state = new Disabled();
    }

    public void assignBooking(Booking booking) {
        if (state instanceof Enabled) {
            currentBooking = booking;
        }
    }

    public void removeBooking() {
        currentBooking = null;
    }

    public void checkIn() {
        if (currentBooking != null) {
            currentBooking.setCheckedIn(true);
        }
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
}




