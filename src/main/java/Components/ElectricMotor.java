package Components;

public class ElectricMotor {

    private int batteryCapacity;

    public ElectricMotor(int batteryCapacity){
        this.batteryCapacity = batteryCapacity;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }
}
