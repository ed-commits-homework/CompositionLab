package Actors;

import Vechicles.Vehicle;

import java.util.ArrayList;

public class Dealership {
    private Double till;
    private ArrayList<Vehicle> stock;

    public Dealership(Double till) {
        this.till = till;
        this.stock = new ArrayList<Vehicle>();
    }

    public Double getTill() {
        return till;
    }

    public ArrayList<Vehicle> getStock() {
        return stock;
    }

    public void stockCar(Vehicle vehicle) {
        stock.add(vehicle);
    }
}
