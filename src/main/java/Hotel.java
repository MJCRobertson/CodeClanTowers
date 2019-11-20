import java.util.ArrayList;

public class Hotel {

    private String name;
    private Integer capacity;
    private ArrayList<Guest> guestList;
    private ArrayList<Bedroom> bedroomList;
    private ArrayList<ConferanceRoom> conferanceRoomList;
    private ArrayList<Booking> booking;

    public Hotel(String name, Integer capacity){
        this.name = name;
        this.capacity = capacity;
        this.guestList = new ArrayList<Guest>();
        this.bedroomList = new ArrayList<Bedroom>();
        this.conferanceRoomList = new ArrayList<ConferanceRoom>();
        this.booking = new ArrayList<Booking>();
    }

    public int checkedInGuestCount() {
        return this.guestList.size();
    }

    public void checkGuestIn(Guest guest) {
        if(this.guestList.size() < this.capacity){
            this.guestList.add(guest);
        }
    }

    public Booking bookRoom(Bedroom bedroom, int numberOfNights) {
        Booking newBooking = new Booking(bedroom, numberOfNights);
        return newBooking;
    }

    public int roomCost(int numberOfNights, int roomRate) {
        return numberOfNights * roomRate;
    }

}
