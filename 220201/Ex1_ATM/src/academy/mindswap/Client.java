package academy.mindswap;

import academy.mindswap.exceptions.NotEnoughFundsException;
import academy.mindswap.exceptions.NotHavingCard;
import academy.mindswap.exceptions.NotHavingPin;

public class Client {

    private Card card;

    public Client(){
    }

    public void createAccount(int pin, int amount, ATM atm){
        if(this.card == null){
            this.card = atm.generateAccount(pin, amount);
        }
    }

    public void withdraw(int pin, int amount, ATM atm) throws NotHavingCard, NotHavingPin, NotEnoughFundsException {
        atm.withdraw(this.card, pin, amount);
    }

    public void deposit(int pin, int amount, ATM atm) throws NotHavingCard, NotHavingPin {
        atm.deposit(this.card, pin, amount);
    }
}
