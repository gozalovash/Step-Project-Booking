package Booking;

public interface BookingDao<T> {
    void cancel(T id);

    default void search(T flight) {

    }

    void book(T ticket ,T data,T amounts);
}
