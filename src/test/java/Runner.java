import Actors.Customer;
import Actors.Dealership;
import Components.Engine;
import Components.FuelType;
import Components.Tyre;
import Components.TyreType;
import Vechicles.Car;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Runner {
    Car car;
    Tyre tyre1, tyre2;
    Engine engine;
    Customer customer1;
    Dealership dealer1;

    @Before
    public void setup() {
        System.out.println("Test");

        tyre1 = new Tyre(TyreType.SPORT);
        tyre2 = new Tyre(TyreType.OFFROAD);

        engine = new Engine(60, FuelType.DIESEL);

        customer1 = new Customer(12000.00);
        dealer1 = new Dealership(130000.00);

        car = new Car("Toyota", 6130.00, "red", engine);
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

    @Test
    public void testGetWallet() {
        assertEquals(12000.00, customer1.getWallet(), 0.01);
    }

    @Test
    public void testGetTill() {
        assertEquals(130000.00, dealer1.getTill(), 0.01);
    }

    @Test
    public void testCheckGarage() {
        customer1.purchaseCar(car);
        assertEquals(1, customer1.getGarage().size());
    }
    @Test
    public void testCheckStock() {
        dealer1.stockCar(car);
        assertEquals(1, dealer1.getStock().size());
    }
}
