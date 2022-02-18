package academy.mindswap;

public class PasswordGenerator {

    public static void main(String[] args) {
        generatePassword("Peter Gabriel");
        generatePassword("Brian Adams");
    }
    public static void generatePassword(String musicianName) {
        for (int i = 0; i < musicianName.length(); i++){
            if(musicianName.charAt(i) == ' '){
                String lastName = musicianName.substring(i + 1);
                String result = lastName.replace("a","@").replace("i","!");
                System.out.println(result);
            }

        }

    }

}
