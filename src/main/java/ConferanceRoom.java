import java.util.ArrayList;

public class ConferanceRoom {

    private String name;
    private Integer capacity;
    private ArrayList<Guest> listOfGuests;

    public ConferanceRoom(String name, Integer capacity) {
        this.name = name;
        this.capacity = capacity;
        this.listOfGuests = new ArrayList<Guest>();
    }
}
