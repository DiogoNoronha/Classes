package academy.mindswap;

public class Main {

    public static void main(String[] args) {

        Eclair[][] whoEatedMore = {{new Eclair(2,"Antonio"), new Eclair(3,"Ricardo"), new Eclair(5,"Luis"), new Eclair(4,"Diogo"), new Eclair(9,"João")},{new Eclair(2,"Jovem 1"),new Eclair(4,"Jovem 2")}};

        for (int i = 0; i < whoEatedMore.length; i++) {
            System.out.println("Pessoal da sala " + i + ":");
            for (int j = 0; j < whoEatedMore[i].length; j++) {
                System.out.println(whoEatedMore[i][j].getName() + " comeu " + whoEatedMore[i][j].getQuantityEaten());
            }
            System.out.println("");

        }
    }
}
