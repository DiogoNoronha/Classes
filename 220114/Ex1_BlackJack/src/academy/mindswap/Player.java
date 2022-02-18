package academy.mindswap;

public class Player {

    private String name;
    private int riscLevel;

    //CONSTRUCTOR METHOD
    public Player(String name, int riscLevel) {
        this.name = name;
        this.riscLevel = riscLevel;
    }

    public String getName() {
        return name;
    }

    public int getRiscLevel() {
        return riscLevel;
    }
}
