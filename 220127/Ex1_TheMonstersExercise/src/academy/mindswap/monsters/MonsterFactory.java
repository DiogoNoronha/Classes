package academy.mindswap.monsters;

public class MonsterFactory {

    public static Monster randomMonsterGenerator() {
        MonstersENUM monstersENUM[] = MonstersENUM.values();
        int min = 0;
        int max = monstersENUM.length - 1;
        int randomInt = (int) (Math.random() * (max - min + 1) + min);
        switch (monstersENUM[randomInt]){
            case MUMMY:
                return new Mummy();
            case VAMPIRE:
                return new Vampire();
            default:
                return new Werewolf();
        }
    }
}
