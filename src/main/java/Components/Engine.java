package Components;

public class Engine {

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
}
