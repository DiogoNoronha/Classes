package academy.mindswap;

import academy.mindswap.exceptions.NotEnoughFundsException;
import academy.mindswap.exceptions.NotHavingCard;
import academy.mindswap.exceptions.NotHavingPin;

public class ATM {

    private int[] arrayIds;
    private int[] arrayPins;
    private int[] arrayBalance;
    static int idGenerator = 1;
    private int numberOfCards;

    public ATM(int numberOfClients){
        this.arrayIds = new int[numberOfClients];
        this.arrayPins = new int[numberOfClients];
        this.arrayBalance = new int[numberOfClients];
    }

    public Card generateAccount(int pin, int amount){
        Card card = new Card(idGenerator);
        this.arrayIds[numberOfCards] = idGenerator;
        this.arrayPins[numberOfCards] = pin;
        this.arrayBalance[numberOfCards] = amount;
        idGenerator++;
        numberOfCards++;
        System.out.println("Account successfully created");
        return card;
    }

    public void withdraw(Card card, int pin, int amount) throws NotHavingCard, NotHavingPin, NotEnoughFundsException {
        cardTest(card);
        for (int i = 0; i < arrayIds.length; i++) {
            if (card.getCardId() == arrayIds[i]){
                pinTest(pin, arrayPins[i]);
                amountTest(this.arrayBalance[i], amount);
                this.arrayBalance[i] -= amount;
                System.out.printf("You have withdrawn %s.\nYou now have %s.", amount, this.arrayBalance[i]);
            }
        }
    }

    public void deposit(Card card, int pin, int amount) throws NotHavingCard, NotHavingPin {
        cardTest(card);
        for (int i = 0; i < arrayIds.length; i++) {
            if (card.getCardId() == arrayIds[i]){
                pinTest(pin, arrayPins[i]);
                this.arrayBalance[i] += amount;
                System.out.printf("You have deposited %s.\nYou now have %s.", amount, this.arrayBalance[i]);
                return;
            }
        }
    }

    private void cardTest(Card card) throws NotHavingCard{
        if (card == null){
            throw new NotHavingCard();
        }
    }
    private void pinTest(int pinClient, int pinAccount) throws NotHavingPin{
        if (pinClient != pinAccount){
            throw new NotHavingPin();
        }
    }

    private void amountTest(int currentBalance, int moneyToWithdraw) throws NotEnoughFundsException{
        if (currentBalance < moneyToWithdraw){
            throw new NotEnoughFundsException();
        }
    }
}
