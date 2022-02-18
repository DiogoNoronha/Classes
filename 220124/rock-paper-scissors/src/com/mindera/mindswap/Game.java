package com.mindera.mindswap;

public class Game {

    private final String p1;
    private final String p2;
    private final Hands hand;

//    public Game(String p1, String p2) {
//        this.p1 = p1;
//        this.p2 = p2;
//    }

    public Game(String p1, Hands playerHand) {
        this.p1 = p1;
        this.p2 = "Computer";
        this.hand = playerHand;
    }

    public void start(int maxRounds) {
        String p1Hand;
        String p2Hand;
        int p1Wins = 0;
        int p2Wins = 0;
        int roundsPlayed = 0;

        while (roundsPlayed < maxRounds) {

            p1Hand = hand.getPick();
            p2Hand = pickHand();

            printPicks(p1Hand, p2Hand);

            if (p1Hand.equals(p2Hand)) {
                System.out.println("It's a draw!");
                continue;
            }

            String winner = checkWinner(p1Hand, p2Hand);
            roundsPlayed++;

            if (winner.equals(p1)) {
                p1Wins++;
            } else {
                p2Wins++;
            }

            System.out.println(winner + " wins this round!");
        }

        printResults(p1Wins, p2Wins);
    }

    private String pickHand() {
        switch (RandomGenerator.generateRandom()){
            case 1:
                return Hands.PAPER.getPick();
            case 2:
                return Hands.ROCK.getPick();
            default:
                return Hands.SCISSORS.getPick();
        }
    }

    private void printPicks(String p1Hand, String p2Hand) {
        System.out.println(p1 + " picked: " + p1Hand + ".");
        System.out.println(p2 + " picked: " + p2Hand + ".");
    }

    private String checkWinner(String p1Hand, String p2Hand) {
        String winner = p1;

        switch (p1Hand) {
            case "Rock":
                if (p2Hand.equals("Paper")) {
                    winner = p2;
                }
                break;
            case "Paper":
                if (p2Hand.equals("Scissors")) {
                    winner = p2;
                }
                break;
            case "Scissors":
                if (p2Hand.equals("Rock")) {
                    winner = p2;
                }
                break;
        }

        return winner;
    }


    private void printResults(int p1Wins, int p2Wins) {
        String winnersName = p1Wins == p2Wins ? "No one. It's a tie!" :
                p1Wins > p2Wins ? p1 : p2;

        System.out.println("==============================");
        System.out.println("AND THE WINNER OF THE GAME IS: ");
        System.out.println(winnersName);
    }
}
