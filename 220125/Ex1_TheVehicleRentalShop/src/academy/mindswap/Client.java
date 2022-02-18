package academy.mindswap;

import academy.mindswap.vehicles.HybridCar;
import academy.mindswap.vehicles.Vehicle;

public class Client {

    private String name;
    private Vehicle vehicle;

    public Client(String name){
        this.name = name;
        this.vehicle = null;
    }

    public void getVehicle(){
        System.out.println(this.vehicle);
    }

    public void rentVehicle(RentalShop rentalShop, VehiclesAvailableEnum vehicle){
        this.vehicle = rentalShop.rentVehicle(vehicle, this.name);
    }

    public void returnVehicle(RentalShop rentalShop){
        rentalShop.returnVehicle(this.vehicle, this.name);
    }

    public void drive(double distanceKm, int timeMinutes){
        if (this.vehicle == null){
            System.out.println("You should rent a vehicle first, or go by foot.");
            return;
        }
        this.vehicle.drive(distanceKm,timeMinutes);
    }

    public void refuel(int amount){
        this.vehicle.refuel(amount);
    }

    public void recharge(){
        if (this.vehicle.getClass() == HybridCar.class){
            ((HybridCar)this.vehicle).recharge();
        }
    }

    public void checkFuel(){
        System.out.println(this.vehicle.getCurrentFuelLevel());
    }
}
