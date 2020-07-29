package Vechicles;

import Components.ElectricMotor;

public class ElectricCar extends Vehicle {
    String colour;
    ElectricMotor electricMotor;

    public ElectricCar(String name, Double price, String colour, ElectricMotor electricMotor) {
        super(name, price);
        this.colour = colour;
        this.electricMotor = electricMotor;
    }
}
