package academy.mindswap;

public class Main {

    public static void main(String[] args) {

        Player player1 = new Player("Manuel");
        Player player2 = new Player("Maria");

        Game game1 = new Game(player1, player2, 5);
        game1.runGame();
    }
}
