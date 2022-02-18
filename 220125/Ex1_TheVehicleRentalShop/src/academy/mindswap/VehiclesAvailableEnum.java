package academy.mindswap;

import academy.mindswap.vehicles.HybridCar;
import academy.mindswap.vehicles.Motorcycle;
import academy.mindswap.vehicles.SimpleCar;
import academy.mindswap.vehicles.Vehicle;

public enum VehiclesAvailableEnum {
    FERRARI(new SimpleCar("Ferrari")),
    SEAT(new SimpleCar("Seat")),
    SMART(new SimpleCar("Smart")),
    TOYOTA(new HybridCar("Toyota")),
    BMW(new HybridCar("BMW")),
    CASAL(new Motorcycle("Casal")),
    YAMAHA(new Motorcycle("Yamaha")),
    KTM(new Motorcycle("KTM"));

    private Vehicle vehicle;

    public Vehicle getVehicle(){
        return vehicle;
    }

    private VehiclesAvailableEnum(Vehicle vehicle){
        this.vehicle = vehicle;
    }
}
