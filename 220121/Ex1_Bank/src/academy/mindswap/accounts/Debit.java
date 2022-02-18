/*package academy.mindswap.accounts;

import academy.mindswap.Bank;
import academy.mindswap.Client;

public class Debit extends Account{

    public Debit(int balance){
        super(balance);
    }

    //withdraw do debit
    public String withdraw(int amount){
        if (this.balance - amount >= 0){
            this.balance -= amount;
            return String.format("Your operation was successful. Your current balance is %s€.", this.balance);
        }
        return "You don't have enough money to make that operation.";
    }

    public String accountInfo(){
        return String.format("Bank: %s. Client: %s. Type of account: Debit. Current balance: %s€", this.bank.toString(), this.owner.toString(), this.balance)
    }
}*/
