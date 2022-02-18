package academy.mindswap;

public class Players {

    private String name;
    private int numberChosen;


    public Players (String name, int maxNumber, int minNumber){
        this.name = name;
        this.numberChosen = RandomNumber.getRandomNumber(maxNumber, minNumber);
    }

    public String getName() {
        return name;
    }
    public int getNumberChosen() {
        return numberChosen;
    }
}
