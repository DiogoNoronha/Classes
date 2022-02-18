package academy.mindswap.monsters;

import academy.mindswap.Messages;

public class Vampire extends Monster{

    static int idVampires;

    public Vampire(){
        super();
        ++idVampires;
    }

    @Override
    public int getAttack() {
        int min = 0;
        int max = 4;
        int randomInt = (int) (Math.random() * (max - min + 1) + min);
        if (randomInt == 4){
            this.health += 2;
            System.out.printf(Messages.VAMPIRE_SUCKS);
        }
        return attack;
    }

    @Override
    public String toString(){
        return "Vampire " + idVampires;
    }
}
