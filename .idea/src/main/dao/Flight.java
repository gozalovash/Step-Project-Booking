package dao;

import java.sql.Time;
import java.util.Date;

public class Flight {
    private final int id;
    private final String destination;
    private final Date date;
    private final Time departure_time;
    private final Time arrival_time;
    private int seats;

    public Flight(int id, String destination, Date date, Time departure_time, Time arrival_time, int seats) {
        this.id = id;
        this.destination = destination;
        this.date = date;
        this.departure_time = departure_time;
        this.arrival_time = arrival_time;
        this.seats = seats;
    }
    public int getId(){ return id; }
    public String getDestination() { return destination; }
    public Date getDate(){ return date; }
    public Time getDeparture_time() { return departure_time; }
    public Time getArrival_time() { return arrival_time; }
    public int getSeats(){ return seats; }

    @Override
    public String toString() {
        return "Flight id: " +id
                +"destination- "+ destination
                +"date- "+ date
                +"departure time- "+departure_time
                +"arrival time- "+ arrival_time
                +"free seats- "+seats;
    }
}
