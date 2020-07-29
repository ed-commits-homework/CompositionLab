package Actors;

import Vechicles.Vehicle;

import java.util.ArrayList;

public class Customer {
    private Double wallet;
    private ArrayList<Vehicle> garage;

    public Customer(Double wallet) {
        this.wallet = wallet;
        this.garage = new ArrayList<Vehicle>();
    }

    public Double getWallet() {
        return wallet;
    }

    public ArrayList<Vehicle> getGarage() {
        return garage;
    }

    public void purchaseCar(Vehicle vehicle) {
        garage.add(vehicle);
    }
}
