package Components;

import Interfaces.ICost;

public class ElectricMotor implements ICost {

    private int batteryCapacity;

    public ElectricMotor(int batteryCapacity){
        this.batteryCapacity = batteryCapacity;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public double cost() {
        return 1200 + batteryCapacity*150;
    }
}
