package Booking;

public class CancelBooking {
    private final int bookingID;

    public CancelBooking(int bookingId) {
        this.bookingID = bookingId;
    }

    public int getBookingID() {
        return bookingID;
    }
}
