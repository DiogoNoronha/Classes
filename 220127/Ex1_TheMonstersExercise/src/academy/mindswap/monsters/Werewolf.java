package academy.mindswap.monsters;

public class Werewolf extends Monster{

    static int idWerewolf;

    public Werewolf(){
        super();
        ++idWerewolf;
    }

    @Override
    public String toString(){
        return "Werewolf " + idWerewolf;
    }
}