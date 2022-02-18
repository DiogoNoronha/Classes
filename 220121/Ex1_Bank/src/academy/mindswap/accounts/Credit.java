/*package academy.mindswap.accounts;

import academy.mindswap.Bank;
import academy.mindswap.Client;

public class Credit extends Account{

    public Credit(int balance){
        super(balance);
    }

    //pay do credit
    public String pay(int amount){
        if (this.balance - amount >= -100){
                if(this.balance - amount < 0){
                    this.balance -= amount;
                    this.balance -= 10;
                    return String.format("Your operation was successful. Your current balance is %s€.", this.balance);
                }
            this.balance -= amount;
            return String.format("Your operation was successful. Your current balance is %s€.", this.balance);
        }
        return "You don't have enough money to make that operation.";
    }

    public String accountInfo(){
        return String.format("Bank: %s. Client: %s. Type of account: Credit. Current balance: %s€", this.bank.toString(), this.owner.toString(), this.balance)
    }
}*/
