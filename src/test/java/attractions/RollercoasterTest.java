package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void getDefaultPrice(){
        assertEquals(8.40, rollerCoaster.defaultPrice(), 0.1);
    }

    @Test
    public void getPriceFor(){
        Visitor visitor = new Visitor(14, 2.1, 40.0);
        assertEquals(16.80, rollerCoaster.priceFor(visitor), 0.1);
    }

    @Test
    public void canRideRollercoaster(){
        Visitor visitor = new Visitor(14, 2.1, 40.0);
        assertEquals(true, rollerCoaster.isAllowedTo(visitor));
    }
}
