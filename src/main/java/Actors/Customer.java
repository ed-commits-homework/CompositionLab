package Actors;

import Vehicles.Vehicle;

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

    public void purchaseCar(Dealership dealer, Vehicle vehicle) {
        dealer.getStock().remove(vehicle);
        garage.add(vehicle);
    }
}
