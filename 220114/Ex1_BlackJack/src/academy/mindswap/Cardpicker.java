package academy.mindswap;

public class Cardpicker {

    //STATE
    private static final int[] deck = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};

    //GET
    public static int getRandomCard() {
        return deck[(int) (Math.random() * (12 + 1))];
    }
}
