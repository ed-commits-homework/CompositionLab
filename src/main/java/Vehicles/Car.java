package Vehicles;

import Components.Engine;
import Interfaces.ICost;

public class Car extends Vehicles.Vehicle {
    String colour;
    Engine engine;

    public Car(String name, Double price, String colour, Engine engine) {
        super(name, price ,0);
        this.colour = colour;
        this.engine = engine;
    }

    public double cost() {
        return this.getPrice() + engine.cost();
    }
}
