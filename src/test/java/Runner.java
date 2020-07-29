import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Runner {
    Car car;
    Tyre tyre1, tyre2;
    Engine engine;

    @Before
    public void setup() {
        System.out.println("Test");

        car = new Car("Toyota", 6130.00);

        tyre1 = new Tyre(TyreType.SPORT);
        tyre2 = new Tyre(TyreType.OFFROAD);

        engine = new Engine(60, FuelType.DIESEL);
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

    @Test
    public void testTyreGetType() {
        assertEquals(TyreType.SPORT, tyre1.getType());
    }

    @Test
    public void testEngineGetCapacity() {
        assertEquals(60, engine.getFuelTankCapacity());
    }
}
