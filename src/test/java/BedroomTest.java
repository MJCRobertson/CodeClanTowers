import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

   private Bedroom bedroom;
   private Guest guest;

   @Before
    public void before(){
       bedroom = new Bedroom(420, 69,  "Single");
   }

   @Test
    public void guestCount(){
       assertEquals(0, bedroom.guestCount());
   }

   @Test
    public void canAddGuestToARoom(){
       bedroom.addGuest(guest);
       assertEquals(1, bedroom.guestCount());
   }

   @Test
    public void canRemoveAGuest(){
       bedroom.addGuest(guest);
       bedroom.removeGuest();
       assertEquals(0, bedroom.guestCount());
   }
}
