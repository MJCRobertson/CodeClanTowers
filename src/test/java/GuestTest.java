import org.junit.Before;

public class GuestTest {

    private Guest guest;

    @Before
    public void before() {
        guest = new Guest("Bob");
    }
}
