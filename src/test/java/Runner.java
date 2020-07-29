import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Runner {
    Car car;

    @Before
    public void setup() {
        System.out.println("Test");

        car = new Car("Toyota", 6130.00);
    }

    @Test
    public void test() {

    }

    @Test
    public void testCarGetName() {
        assertEquals("Toyota", car.getName());
    }

    @Test
    public void testCarGetPrice() {
        assertEquals(6130.00, car.getPrice(), 0.00001);
    }
}
