package Vehicles;

import Components.ElectricMotor;
import Components.Engine;

public class HybridCar extends Vehicle {
    String colour;
    Engine engine;
    ElectricMotor motor;

    public HybridCar(String name, Double price, String colour, Engine engine, ElectricMotor motor) {
        super(name, price);
        this.colour = colour;
        this.engine = engine;
        this.motor = motor;
    }
}

