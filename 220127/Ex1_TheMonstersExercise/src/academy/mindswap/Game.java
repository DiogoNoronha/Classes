package academy.mindswap;

public class Game {

    private Player player1;
    private Player player2;
    private Boolean playerWins;
    private int handSize;



    public Game(Player player1, Player player2, int handSize) {
        this.player1 = player1;
        this.player2 = player2;
        player1.setHandSize(handSize);
        player2.setHandSize(handSize);
        this.playerWins = false;
        this.handSize = handSize;
    }

    public void runGame() {
        System.out.printf(Messages.GAME_STARTS, player1.getName(), player2.getName(), this.handSize);
        while (!this.playerWins) {

            player1.chosenMonster();
            player2.chosenMonster();

            player2.receiveAttack(player1.sendAttack());
            player1.receiveAttack(player2.sendAttack());

            if (player1.checkLooser() && player2.checkLooser()) {
                System.out.printf(Messages.PLAYERS_TIES);
                this.playerWins = true;
                return;
            }
            if (player1.checkLooser()) {
                System.out.printf(Messages.PLAYER_WINS, player2.getName());
                this.playerWins = true;
                return;
            }
            if (player2.checkLooser()) {
                System.out.printf(Messages.PLAYER_WINS, player1.getName());
                this.playerWins = true;
                return;
            }

            System.out.println("");
        }
    }
}