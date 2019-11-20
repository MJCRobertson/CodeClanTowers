import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    public Hotel hotel;
    public Guest guest;
    public Bedroom bedroom;
    public ConferanceRoom conferanceRoom;

    @Before
    public void before() {
        hotel = new Hotel("NoBody Inn", 500);
        guest = new Guest("Shaggy");
        bedroom = new Bedroom(420, 69, "Single");
        conferanceRoom = new ConferanceRoom("Sinatra", 420);
    }

//    @Test
//    public void canCheckAGuestIn(){
//        hotel.checkInGuest(guest);
//        assertEquals(1, bedroom.guestCount());
//    }
}
