package academy.mindswap.vehicles;

public abstract class Vehicle {
    protected final String vehicleName;
    protected final int maxVelocity;
    protected final double fuelConsumption;
    protected final double fuelTankCapacity;
    protected double currentFuelLevel;

    public Vehicle(String vehicleName){
        this.vehicleName = vehicleName;
        this.maxVelocity = 120;
        this.fuelConsumption = 5;
        this.fuelTankCapacity = 25;
        this.currentFuelLevel = 25;
    }

    public void drive(double distanceKm, double timeMinutes){

        if (this.maxVelocity < (distanceKm/(timeMinutes/60))){
            System.out.println("Calm down Minister Cabrita!");
            return;
        }

        if (distanceKm * this.fuelConsumption/100 >= currentFuelLevel){
            System.out.println("You don't have fuel to do this trip!");
            return;
        }

        this.currentFuelLevel -= distanceKm * this.fuelConsumption/100;
        System.out.println("You had gone for " + distanceKm + " and your fuel level is " + this.currentFuelLevel);
    }

    public void refuel (int amount){
        if (amount > fuelTankCapacity-currentFuelLevel){
            System.out.printf("%n That's to much fuel, you can only add %d", fuelTankCapacity-currentFuelLevel);
        }
        this.currentFuelLevel += amount;
    }

    public double getCurrentFuelLevel(){
        return this.currentFuelLevel;
    }

    public String getVehicleName(){
        return this.vehicleName;
    }
}
