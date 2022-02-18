package academy.mindswap;

public class Blackjack {

    private static boolean isWinner = false;
    private static boolean isPlayerPlaying = true;
    private static boolean isDealerPlaying = true;
    private static int scorePlayer;
    private static int scoreDealer;

    private final Player player;
    private int riscLevel;
    private String name;

    public Blackjack(Player player) {
        this.player = player;
        this.riscLevel = player.getRiscLevel();
        this.name = player.getName();
    }

    public void game() {
        while (!isWinner) {
            if (isPlayerPlaying) {
                scorePlayer += Cardpicker.getRandomCard();
                if (scorePlayer >= (11 + player.getRiscLevel())) {
                    isPlayerPlaying = false;
                }
                if (scorePlayer > 21) {
                    isWinner = true;
                    System.out.println(scorePlayer);
                    System.out.println((scoreDealer));
                    System.out.println(("Dealer wins"));
                    return;
                }
            }
            if (isDealerPlaying) {
                scoreDealer += Cardpicker.getRandomCard();
                if (!isPlayerPlaying && scorePlayer < scoreDealer){
                    isDealerPlaying = false;
                }
                if(scoreDealer > 21) {
                    isWinner = true;
                    System.out.println(scorePlayer);
                    System.out.println((scoreDealer));
                    System.out.println((player.getName() + " wins"));
                    return;
                }
            }
            if (!isDealerPlaying && !isPlayerPlaying) {
                if (scoreDealer >= scorePlayer){
                    isWinner = true;
                    System.out.println(scorePlayer);
                    System.out.println((scoreDealer));
                    System.out.println(("Dealer wins"));
                    return;
                } else {
                    isWinner = true;
                    System.out.println(scorePlayer);
                    System.out.println((scoreDealer));
                    System.out.println((player.getName() + " wins"));
                    return;
                }
            }
        }
    }
}