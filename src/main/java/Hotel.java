import java.util.ArrayList;

public class Hotel {

    private String name;
    private Integer capacity;
    private ArrayList<Guest> guestList;
    private ArrayList<Bedroom> bedroomList;
    private ArrayList<ConferanceRoom> conferanceRoomList;

    public Hotel(String name, Integer capacity){
        this.name = name;
        this.capacity = capacity;
        this.guestList = new ArrayList<Guest>();
        this.bedroomList = new ArrayList<Bedroom>();
        this.conferanceRoomList = new ArrayList<ConferanceRoom>();
    }
}
