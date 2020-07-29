import Actors.Customer;
import Actors.Dealership;
import Components.Engine;
import Components.ElectricMotor;

import Components.FuelType;
import Components.Tyre;
import Components.TyreType;
import Vehicles.Car;
import Vehicles.ElectricCar;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Runner {
    Car car1, car2, car3;
    ElectricCar electricCar1;
    ElectricMotor motor;
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
        motor = new ElectricMotor(100);

        customer1 = new Customer(12000.00);
        dealer1 = new Dealership(130000.00);

        car1 = new Car("Toyota", 6130.00, "blue", engine);
        car2 = new Car("Ferrari", 16000.00, "red", engine);
        car3 = new Car("Ford", 3030.00, "hot pink", engine);

        electricCar1 = new ElectricCar("Tesla", 17000.00, "silver", motor);

    }

    @Test
    public void test() {

    }

    @Test
    public void testCarGetName() {
        assertEquals("Toyota", car1.getName());
    }

    @Test
    public void testCarGetPrice() {
        assertEquals(6130.00, car1.getPrice(), 0.00001);
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
        dealer1.stockCar(car1);
        dealer1.stockCar(car2);
        dealer1.stockCar(electricCar1);
        customer1.purchaseCar(dealer1, car1);
        assertEquals(1, customer1.getGarage().size());
        assertEquals(2, dealer1.getStock().size());
    }
    @Test
    public void testCheckStock() {
        dealer1.stockCar(car1);
        dealer1.stockCar(car2);
        dealer1.stockCar(car3);
        assertEquals(3, dealer1.getStock().size());
    }

    @Test
    public void testCostCar1() {
        assertEquals(9220.0, car1.cost(), 0.000001);
    }

    @Test
    public void testCostElectricCar1() {
        assertEquals(33200.0, electricCar1.cost(), 0.000001);
    }
}
