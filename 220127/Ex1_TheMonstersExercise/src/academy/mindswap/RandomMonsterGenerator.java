/*package academy.mindswap;

import academy.mindswap.monsters.Monster;
import academy.mindswap.monsters.Mummy;
import academy.mindswap.monsters.Vampire;
import academy.mindswap.monsters.Werewolf;

public class RandomMonsterGenerator {

    public static Monster randomMonsterGenerato(){
        int min = 0;
        int max = 2;
        int randomInt = (int) (Math.random() * (max - min + 1) + min);
        switch (randomInt){
            case 0: return new Mummy();
            case 1: return new Vampire();
            default: return new Werewolf();
        }
    }
    /*private String pickHand() {
        switch (RandomGenerator.generateRandom()){
            case 1:
                return Hands.PAPER.getPick();
            case 2:
                return Hands.ROCK.getPick();
            default:
                return Hands.SCISSORS.getPick();
        }
    }

}*/
