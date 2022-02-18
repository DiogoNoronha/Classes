package academy.mindswap;

public class Client {

    private static int personalPINgenerator;
    private int personalPIN;
    private Card[] cards;
    private int cardIndex;

    public Client(){
        this.personalPIN = ++personalPINgenerator;
        this.cards = new Card[10];
    }

    public void createAccount(Bank bank, boolean isAccountCredit, int amount) {
        this.cards[cardIndex] = bank.createAccount(bank, isAccountCredit, amount, personalPIN);
        cardIndex++;
    }

    public void withdraw(int cardNumber, int amount){
        if (cardNumber >= this.cards.length){
            System.out.println("You do not have a card with that number.");
            return;
        }
        if (cards[cardNumber] == null){
            System.out.println("You do not have a card with that number.");
            return;
        }
        this.cards[cardNumber].getBank().withdraw(this.cards[cardNumber], amount, personalPIN);
    }

    public void pay(int cardNumber, int amount){
        if (cardNumber >= this.cards.length){
            System.out.println("You do not have a card with that number.");
            return;
        }
        if (cards[cardNumber] == null){
            System.out.println("You do not have a card with that number.");
            return;
        }
        this.cards[cardNumber].getBank().pay(this.cards[cardNumber], amount, personalPIN);
    }

    public void deposit(int cardNumber, int amount){
        if (cardNumber >= this.cards.length){
            System.out.println("You do not have a card with that number.");
            return;
        }
        if (cards[cardNumber] == null){
            System.out.println("You do not have a card with that number.");
            return;
        }
        this.cards[cardNumber].getBank().deposit(this.cards[cardNumber], amount, personalPIN);
    }

    public void info(int cardNumber){
        if (cardNumber >= this.cards.length){
            System.out.println("You do not have a card with that number.");
            return;
        }
        if (cards[cardNumber] == null){
            System.out.println("You do not have a card with that number.");
            return;
        }
        this.cards[cardNumber].getBank().info(this.cards[cardNumber], personalPIN);
    }
}