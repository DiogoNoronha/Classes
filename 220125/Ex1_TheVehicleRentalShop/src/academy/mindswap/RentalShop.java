package academy.mindswap;

import academy.mindswap.vehicles.Vehicle;

public class RentalShop {
    private Vehicle[] arrayVehicles;
    private int numberOfVehicles;
    private String[] arrayClients;

    public RentalShop(int rentalShopSize){
        this.arrayVehicles = new Vehicle[rentalShopSize];
        this.arrayClients = new String[rentalShopSize];
    }

    public void buyVehicle(VehiclesAvailableEnum vehicle){
        if (numberOfVehicles < arrayVehicles.length){
            arrayVehicles[numberOfVehicles] = vehicle.getVehicle();
            numberOfVehicles++;
            return;
        }
        System.out.println("You don't have slots left in your garage.");
    }

    public void availableVehicles(){
        for (int i = 0; i < numberOfVehicles; i++) {
            if (arrayVehicles[i] == null) {
                continue;
            }
            System.out.println(arrayVehicles[i].getVehicleName());
        }
    }

    public Vehicle rentVehicle(VehiclesAvailableEnum vehicle, String clientName){
        for (int i = 0; i < arrayVehicles.length; i++) {
            if (arrayVehicles[i] == null){
                continue;
            }
            if (arrayVehicles[i].getVehicleName().equals(vehicle.getVehicle().getVehicleName())){
                Vehicle toRent = arrayVehicles[i];
                arrayVehicles[i] = null;
                for (int j = 0; j < arrayClients.length; j++) {
                    if (arrayClients[i] == null){
                        arrayClients[i] = clientName;
                        break;
                    }
                }
                return toRent;
            }
        }
        System.out.println("We don't have the vehicle you are looking for.");
        return null;
    }

    public void returnVehicle(Vehicle vehicle, String clientName){
        for (int i = 0; i < arrayClients.length; i++) {
            if (arrayClients[i] == null){
                continue;
            }
            if (arrayClients[i].equals(clientName)){
                arrayClients[i] = null;
                if (vehicle.getCurrentFuelLevel() < 20){
                    System.out.println("You will have to pay " + ((20-vehicle.getCurrentFuelLevel())*1.5) + "€ for the missing fuel.");
                }
                for (int j = 0; j < arrayVehicles.length; j++) {
                    if (arrayVehicles[i] == null){
                        arrayVehicles[i] = vehicle;
                        break;
                    }
                }
                return;
            }
        }
        System.out.println("Are you drunk? You don't have any of our vehicles...");
    }
}
