package academy.mindswap;

public class Card {
    private static int numberOfCards;
    private int cardId;
    private Bank bank;

    public Card(Bank bank){
        numberOfCards++;
        this.cardId = numberOfCards;
        this.bank = bank;
    }

    public int getCardId() {
        return cardId;
    }

    public Bank getBank(){
        return bank;
    }
}
