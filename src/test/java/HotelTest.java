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
        bedroom = new Bedroom(420, 69, "Single", 69, true);
        conferanceRoom = new ConferanceRoom("Sinatra", 420);
    }

    @Test
    public void checkIntoHotel(){
        hotel.checkGuestIn(guest);
        assertEquals(1, hotel.checkedInGuestCount());
    }

    @Test
    public void canCheckGuestIntoRoom(){
        bedroom.addGuest(guest);
        assertEquals(1, bedroom.guestCount());
    }

    @Test
    public void canCreateABooking(){
        Booking booking= hotel.bookRoom(bedroom, 5);
        assertEquals(5, booking.getNumberOfNights() );
        assertEquals(420, booking.getBedroom().getRoomNumber() );
    }

    @Test
    public void canReturnBill(){
        Booking booking = hotel.bookRoom(bedroom, 5);
        int roomCost = hotel.roomCost(booking.getNumberOfNights(), bedroom.getRoomRate());
        assertEquals(345, roomCost);
    }
}
