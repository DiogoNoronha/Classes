package academy.mindswap;

public class Calculator {

    public int sum(int number1, int number2) {
        return number1 + number2;
    }

    public int subtract(int number1, int number2) {
        return number1 - number2;
    }

    public int multiply(int number1, int number2) {
        return number1 * number2;
    }

    public int divide(float number1, float number2) {
        return Math.round(number1 / number2);
    }
}
