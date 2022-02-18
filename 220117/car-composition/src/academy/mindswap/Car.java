package academy.mindswap;

public class Car {
    private static int numberOfCars = 0;

    private String brand;
    private Engine engine;
    private Tyre tyre;
    private Radio radio;
    private static int count;

    public Car(String brand, Engine engine, Tyre tyre, Radio radio){
        this.brand = brand;
        this.engine = engine;
        this.tyre = tyre;
        this.radio = radio;
        Car.numberOfCars++;
    }

    public void accelerate(int fuel){
        int distance = engine.generateEnergy(fuel);
        tyre.tyreIntegraty(distance);

        if (!tyre.getTyreIntegrety()) {
            Radio.playMusic();
            return;
        }
        if (distance > 0) {
            System.out.println("Vrum, vrum for " + distance + "km.");
            return;
        }
        System.out.println("No vrum, vrum for you!");
    }

    public void getRefuelled(){
        engine.setFuelLevel(100);
    }


    public String getBrand(String brand){
        return this.brand;
    }
}
