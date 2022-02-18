package academy.mindswap;

public class Main {

    public static void main(String[] args) {
	Bank Santander = new Bank(50);
    Bank Totta = new Bank(50);

    Client Maria = new Client();
    Client Manel = new Client();

    Manel.createAccount(Santander, true, 200);
    Manel.createAccount(Santander, false, 200);
    Manel.createAccount(Santander, false, 200);
    Manel.createAccount(Totta, true, 200);
    Maria.createAccount(Santander, false, 200);
    Maria.createAccount(Totta, true, 200);
    Maria.createAccount(Totta, false, 200);

    Manel.info(1);
    Maria.info(2);
    Maria.info(4);

    Manel.pay(0,300);
    Manel.pay(1,300);
    Manel.pay(1,100);

    Manel.deposit(0,500);
    Manel.deposit(1, 300);

    Manel.withdraw(1,100);
    }

}
