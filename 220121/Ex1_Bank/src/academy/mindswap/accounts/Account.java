package academy.mindswap.accounts;

public class Account {

    private int balance;
    private int cardID;
    private int clientPIN;
    private boolean isAccountCredit;

    public Account(int balance, int cardID, int clientPIN, boolean isAccountCredit) {
        this.balance = balance;
        this.cardID = cardID;
        this.clientPIN = clientPIN;
        this.isAccountCredit = isAccountCredit;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }
    public boolean isAccountCredit() {
        return isAccountCredit;
    }

    public int getCardID() {
        return cardID;
    }

    public int getClientPIN() {
        return clientPIN;
    }
}


/*    public String pay(int amount){
        if (this.balance - amount >= 0){
            this.balance -= amount;
            return String.format("Your operation was successful. Your current balance is %s€.", this.balance);
        }
        return "You don't have enough money to make that operation.";
    }

    public String deposit(int amount){
        this.balance += amount;
        return String.format("Your operation was successful. Your current balance is %s€.", this.balance);
    }

    public abstract String accountInfo();
}*/
