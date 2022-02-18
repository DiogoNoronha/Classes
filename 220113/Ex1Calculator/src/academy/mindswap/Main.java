package academy.mindswap;

public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        int sum = calculator.sum(1,2);
        int subtract = calculator.subtract(4,3);
        int multiply = calculator.multiply(2,3);
        int divide = calculator.divide(8,3);

        System.out.println((sum));
        System.out.println(subtract);
        System.out.println(multiply);
        System.out.println(divide);
    }
}
