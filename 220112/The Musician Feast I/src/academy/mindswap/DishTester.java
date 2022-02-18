package academy.mindswap;

import java.util.Locale;

public class DishTester {

    public static void main(String[] args) {
        testDish("Bob Dylan", "beef wellington");
        testDish("Mick jagger", "mushroom soup");
    }

    public static void testDish(String musicianName, String dish){
        String singer = musicianName.toLowerCase();
        System.out.println(singer.charAt(0) == dish.charAt(0) && singer
                .charAt(singer.length() -1) == dish.charAt(dish.length()-1));

    }

}
