package Components;

import Interfaces.ICost;

public class Engine implements ICost {

    private int fuelTankCapacity;
    private FuelType fuelType;

    public Engine(int fuelTankCapacity, FuelType fuelType){
        this.fuelTankCapacity = fuelTankCapacity;
        this.fuelType = fuelType;
    }

    public int getFuelTankCapacity() {
        return fuelTankCapacity;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public double cost() {
        return 990 + fuelTankCapacity*35;
    }
}
