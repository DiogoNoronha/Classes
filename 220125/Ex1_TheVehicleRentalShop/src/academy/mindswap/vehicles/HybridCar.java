package academy.mindswap.vehicles;

public class HybridCar extends Vehicle {


    private final double batteryConsumption;
    private final double batteryCapacity;
    private double currentBatteryLevel;
    private final int maxVelocityHybrid;

    public HybridCar(String vehicleName) {
        super(vehicleName);
        this.maxVelocityHybrid = 25;
        this.batteryCapacity = 100;
        this.batteryConsumption = 20;
        this.currentBatteryLevel = 100;
    }

    @Override
    public void drive(double distanceKm, double timeMinutes) {

        if (this.maxVelocityHybrid >= (distanceKm / (timeMinutes / 60))) {
            if (distanceKm >= (this.currentFuelLevel / this.fuelConsumption * 100) +
                    (this.currentBatteryLevel / this.batteryConsumption * 100)) {
                System.out.println("You don't have fuel and battery to do this trip!");
                return;
            }

            if (distanceKm <= this.currentBatteryLevel / this.batteryConsumption * 100){
                this.currentBatteryLevel -= (distanceKm * this.batteryConsumption / 100);
                System.out.println("Your battery level is " + this.currentBatteryLevel);
                return;
            }

            distanceKm -= this.currentBatteryLevel / this.batteryConsumption * 100;
            this.currentBatteryLevel = 0;

        }
        super.drive(distanceKm, timeMinutes);
    }

    public void recharge () {
        this.currentBatteryLevel = 100;
    }

    public double getCurrentBatteryLevelLevel () {
        return this.currentBatteryLevel;
    }
}

