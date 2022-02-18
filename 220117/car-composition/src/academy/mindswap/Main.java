package academy.mindswap;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Engine engine1 = new Engine(10);
        Engine engine2 = new Engine(20);

        Car car = new Car("Tata", engine1, new Tyre(), new Radio());

        car.accelerate(20);
        car.accelerate(80);
        car.accelerate(10);
        car.getRefuelled();
        car.accelerate(10);

    }
}
