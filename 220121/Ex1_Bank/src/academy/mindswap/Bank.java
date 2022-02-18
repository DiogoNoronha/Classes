package academy.mindswap;

import academy.mindswap.accounts.Account;

public class Bank {

    private Account[] arrayAccounts;
    private int bankSize;

    public Bank(int bankSize) {
        this.bankSize = bankSize;
        this.arrayAccounts = new Account[bankSize];
    }

    public Card createAccount(Bank bank, boolean isAccountCredit, int amount, int clientPIN) {
        for (int i = 0; i < this.bankSize; i++) {
            if (this.arrayAccounts[i] != null) {
                if (this.arrayAccounts[i].getClientPIN() == clientPIN && this.arrayAccounts[i].isAccountCredit() == isAccountCredit) {
                    System.out.println("That account already exists.");
                    return null;
                }
            }
        }
        for (int i = 0; i < this.bankSize; i++) {
            if (this.arrayAccounts[i] == null) {
                Card card = new Card(bank);
                this.arrayAccounts[i] = new Account(amount, card.getCardId(), clientPIN,isAccountCredit);
                System.out.println("Your account was successfully created");
                return card;
            }
        }
        return null;
    }

    public void withdraw(Card card, int amount, int clientPIN) {
        for (int i = 0; i < this.bankSize; i++) {
            if (card.getCardId() == this.arrayAccounts[i].getCardID() && clientPIN == this.arrayAccounts[i].getClientPIN()) {
                if (this.arrayAccounts[i].isAccountCredit()) {
                    System.out.println("You can only withdraw money from a debit account.");
                    return;
                }
                int balance = this.arrayAccounts[i].getBalance();
                if (balance - amount >= 0) {
                    balance -= amount;
                    System.out.println("Your operation was successful. Your current balance is " + balance + "€.");
                    this.arrayAccounts[i].setBalance(balance);
                    return;
                }
                System.out.println("You don't have enough money to make that operation.");
                return;
            }
        }
    }

    public void deposit(Card card, int amount, int clientPIN) {
        for (int i = 0; i < this.bankSize; i++) {
            if (card.getCardId() == this.arrayAccounts[i].getCardID() && clientPIN == this.arrayAccounts[i].getClientPIN()) {
                int balance = this.arrayAccounts[i].getBalance();
                balance += amount;
                System.out.println("Your operation was successful. Your current balance is " + balance + "€.");
                this.arrayAccounts[i].setBalance(balance);
                return;
            }
        }
    }

    public void pay(Card card, int amount, int clientPIN) {
        for (int i = 0; i < this.bankSize; i++) {
            if (card.getCardId() == this.arrayAccounts[i].getCardID() && clientPIN == this.arrayAccounts[i].getClientPIN()) {
                int balance = this.arrayAccounts[i].getBalance();
                if (this.arrayAccounts[i].isAccountCredit()) {
                    if (balance - amount >= -100) {
                        if (balance - amount < 0) {
                            balance -= amount;
                            balance -= 10;
                            this.arrayAccounts[i].setBalance(balance);
                            System.out.println("Your operation was successful. Your current balance is " + balance + "€.");
                            return;
                        }
                        balance -= amount;
                        this.arrayAccounts[i].setBalance(balance);
                        System.out.println("Your operation was successful. Your current balance is " + balance + "€.");
                        return;
                    }
                    System.out.println("You don't have enough money to make that operation.");
                    return;
                }
                if (balance - amount >= 0) {
                    balance -= amount;
                    System.out.println("Your operation was successful. Your current balance is " + balance + "€.");
                    this.arrayAccounts[i].setBalance(balance);
                    return;
                }
                System.out.println("You don't have enough money to make that operation.");
                return;
            }
        }
    }
    public void info(Card card, int clientPIN) {
        for (int i = 0; i < this.bankSize; i++) {
            if (card.getCardId() == this.arrayAccounts[i].getCardID() && clientPIN == this.arrayAccounts[i].getClientPIN()) {
                int balance = this.arrayAccounts[i].getBalance();
                if (this.arrayAccounts[i].isAccountCredit()){
                    System.out.println("Your credit account has a balance of " + balance + "€.");
                    return;
                }
                System.out.println("Your debit account has a balance of " + balance + "€.");
                return;
            }
        }
    }
}




/*
    public String deposit(int amount){
        this.balance += amount;
        return String.format("Your operation was successful. Your current balance is %s€.", this.balance);
    }

    //withdraw do debit
    public String withdraw(int amount){
        if (this.balance - amount >= 0){
            this.balance -= amount;
            return String.format("Your operation was successful. Your current balance is %s€.", this.balance);
        }
        return "You don't have enough money to make that operation.";
    }

    public String pay(int amount){
        if (this.balance - amount >= 0){
            this.balance -= amount;
            return String.format("Your operation was successful. Your current balance is %s€.", this.balance);
        }
        return "You don't have enough money to make that operation.";
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
}

*/