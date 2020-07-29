package Vehicles;

import Interfaces.ICost;

public abstract class Vehicle implements ICost {

    private String name;
    private Double price;
    private int damage;

    public Vehicle(String name, Double price, int damage){
        this.name = name;
        this.price = price;
        this.damage = damage;
    }


    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public int getDamage() {
        return damage;
    }

    public double charges() {
        return cost() - damage;
    }

    public void causeDamage() {
        damage += 150;
    }
}
