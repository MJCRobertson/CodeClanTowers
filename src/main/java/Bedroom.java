import java.util.ArrayList;

public class Bedroom {

    private Integer roomNumber;
    private Integer capacity;
    private String typeOfRoom;
    private ArrayList<Guest> guestsInRoom;
    private Integer roomRate;
    private Boolean roomVacant;

    public Bedroom(Integer roomNumber, Integer capacity, String typeOfRoom, Integer roomRate, Boolean roomVacant ) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.typeOfRoom = typeOfRoom;
        this.guestsInRoom = new ArrayList<Guest>();
        this.roomRate = roomRate;
        this.roomVacant = roomVacant;
    }

    public int getRoomNumber(){
        return this.roomNumber;
    }


    public int guestCount() {
        return guestsInRoom.size();
    }

    public void addGuest(Guest guest) {
        if(this.guestsInRoom.size() < this.capacity && this.roomVacant == true) {
            this.guestsInRoom.add(guest);
        }
    }

    public void removeGuest() {
        this.guestsInRoom.remove(0);
    }

    public int getRoomRate() {
        return this.roomRate;
    }
}
