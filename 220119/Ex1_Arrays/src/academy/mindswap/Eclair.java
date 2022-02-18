package academy.mindswap;

public class Eclair {
    private int quantityEaten;
    private String name;

    public Eclair(int quantityEaten, String name){
        this.quantityEaten = quantityEaten;
        this.name = name;
    }

    public int getQuantityEaten(){
        return quantityEaten;
    }

    public String getName(){
        return name;
    }
}
