package academy.mindswap;

public class MusicianHell {

    public static void main(String[] args) {
        String[] musicians = {"Steve Tyler", "Erykah Badu", "Mick Jagger",
                "Paul McCartney", "Brandon Flowers", "Alex Turner"};
        String musician = pickMusician(musicians);
        System.out.println(musician);
    }

    public static String pickMusician(String[] musicians){

        int min = 10;
        int max = 15;

        for (int i = 0; i < musicians.length; i++){
            int numberOfLetters = musicians[i].length() -1;
            int randomNumber = (int) (Math.random() * (max - min + 1) + min);
            if (numberOfLetters > randomNumber) {
                return (musicians[i]);
            }

        }
        return ("No one will stay to help.");

    }

}