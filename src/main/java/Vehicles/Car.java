package Vehicles;

import Components.Engine;
import Interfaces.ICost;

public class Car extends Vehicle implements ICost {
    String colour;
    Engine engine;

    public Car(String name, Double price, String colour, Engine engine) {
        super(name, price);
        this.colour = colour;
        this.engine = engine;
    }

    public double cost() {
        return this.getPrice() + engine.cost();
    }
}
