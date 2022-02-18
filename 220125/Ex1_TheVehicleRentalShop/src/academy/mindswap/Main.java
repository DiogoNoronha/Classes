package academy.mindswap;

public class Main {

    public static void main(String[] args) {
	Client ze = new Client("Ze");

    RentalShop rent = new RentalShop(10);

    rent.buyVehicle(VehiclesAvailableEnum.CASAL);
    rent.buyVehicle(VehiclesAvailableEnum.FERRARI);
    rent.buyVehicle(VehiclesAvailableEnum.TOYOTA);

    ze.rentVehicle(rent, VehiclesAvailableEnum.BMW);

    rent.availableVehicles();

    ze.rentVehicle(rent, VehiclesAvailableEnum.TOYOTA);

    ze.getVehicle();

    ze.drive(20,60);
    ze.drive(1200,6000);
    ze.drive(900,6000);

    ze.refuel(2);

    rent.availableVehicles();

    ze.returnVehicle(rent);

    rent.availableVehicles();

    ze.rentVehicle(rent, VehiclesAvailableEnum.CASAL);

    ze.drive(100,60);
    ze.drive(80,40);

    }
}
