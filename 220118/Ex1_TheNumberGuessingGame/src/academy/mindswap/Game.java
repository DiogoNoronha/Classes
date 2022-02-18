package academy.mindswap;

public class Game {

    private Players playerA;
    private Players playerB;
    private String player1;
    private String player2;
    private int maxNumber;
    private int minNumber;
    private int secretNumber;
    private boolean isPlayer1Winner;
    private boolean isPlayer2Winner;


    public Game (String player1, String player2, int maxNumber, int minNumber){
        this.player1 = player1;
        this.player2 = player2;
        this.maxNumber = maxNumber;
        this.minNumber = minNumber;
        this.playerA = new Players(this.player1, maxNumber, minNumber);
        this.playerB = new Players(this.player2, maxNumber, minNumber);
        this.secretNumber = getRandom();
        System.out.println(playerA.getNumberChosen());
        System.out.println(playerB.getNumberChosen());
        System.out.println(secretNumber);

    }



    public void round(){

        int playerAChoice = getRandom();
        int playerBChoice = getRandom();


        if (playerA.getNumberChosen() == secretNumber) {
            isPlayer1Winner = true;
        }
        if (playerB.getNumberChosen() == secretNumber){
            isPlayer2Winner = true;
        }
    }

    public void result(){
        if (isPlayer1Winner && isPlayer2Winner){
            System.out.println("Both players got the number right!");
            return;
        }
        if (!isPlayer1Winner && isPlayer2Winner){
            System.out.println(playerB.getName() + " is the winner!");
            return;
        }
        if (isPlayer1Winner){
            System.out.println(playerA.getName() + " is the winner!");
            return;
        }
        System.out.println("Both players missed the number.");
    }

    private int getRandom(){
        return RandomNumber.getRandomNumber(maxNumber, minNumber);
    }
    public int getMaxNumber(){
        return maxNumber;
    }
    public int getMinNumber(){
        return minNumber;
    }
}
