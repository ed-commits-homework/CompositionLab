package Vechicles;

import Components.Engine;

public class Car extends Vehicle {
    String colour;
    Engine engine;

    public Car(String name, Double price, String colour, Engine engine) {
        super(name, price);
        this.colour = colour;
        this.engine = engine;
    }


}
