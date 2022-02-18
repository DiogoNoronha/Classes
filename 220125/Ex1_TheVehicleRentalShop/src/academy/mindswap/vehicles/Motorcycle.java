package academy.mindswap.vehicles;


public class Motorcycle extends Vehicle{

    private final int maxVelocity;

    public Motorcycle (String vehicleName){
        super(vehicleName);
        this.maxVelocity = 100;
    }

    @Override
    public void drive(double distanceKm, double timeMinutes){
        if (distanceKm <= 80){
            super.drive(distanceKm,timeMinutes);
            return;
        }
        System.out.println("You can't ride more than 80Km in one go.");
    }
}
