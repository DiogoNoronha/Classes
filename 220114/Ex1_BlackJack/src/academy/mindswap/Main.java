package academy.mindswap;

public class Main {


    public static void main(String[] args) {
        // Escolher o nível de risco entre 0 e 5
        Player player = new Player("Manel", 3);
        Blackjack blackjack = new Blackjack(player);

        blackjack.game();
    }
}
