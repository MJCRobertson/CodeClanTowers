import java.util.ArrayList;

public class Bedroom {

    private Integer roomNumber;
    private Integer capacity;
    private String typeOfRoom;
    private ArrayList<Guest> guestsInRoom;

    public Bedroom(Integer roomNumber, Integer capacity, String typeOfRoom) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.typeOfRoom = typeOfRoom;
        this.guestsInRoom = new ArrayList<Guest>();
    }


    public int guestCount() {
        return guestsInRoom.size();
    }

    public void addGuest(Guest guest) {
        if(this.guestsInRoom.size() < this.capacity) {
            this.guestsInRoom.add(guest);
        }
    }

    public void removeGuest() {
        this.guestsInRoom.remove(0);
    }
}
