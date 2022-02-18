package academy.mindswap.monsters;

import academy.mindswap.Messages;

public class Mummy extends Monster{

    private int attackCounter;
    static int idMummy;

    public Mummy(){
        super();
        this.attackCounter = 0;
        ++idMummy;
    }

    @Override
    public int getAttack() {
        if (++this.attackCounter == 3){
            this.attackCounter = 0;
            this.health -= 3;
            System.out.printf(Messages.MUMMY_UNROLLS);
            return 0;
        } else {
            return this.attack;
        }
    }


    @Override
    public String toString(){
        return "Mummy " + idMummy;
    }
}