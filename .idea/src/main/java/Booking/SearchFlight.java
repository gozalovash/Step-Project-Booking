package Booking;

public class SearchFlight {
    private final String destination;
    private final int date;
    private final int Number0fTickets;


    public SearchFlight(String destination,int date,int Number0fTickets) {
        this.destination = destination;
        this.date=date;
        this.Number0fTickets=Number0fTickets;
    }
    public String getDestination(){return destination;}
    public int getDate(){return date;}
    public int getNumber0fTickets(){return Number0fTickets;}

}
