import java.util.ArrayList;

public class Booking {

    private Bedroom bedroom;
    private Integer numberOfNights;

    public Booking(Bedroom bedroom, int numberOfNights){
        this.bedroom = bedroom;
        this.numberOfNights = numberOfNights;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }
    public Bedroom getBedroom() {
        return this.bedroom;
    }
}
