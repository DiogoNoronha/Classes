package academy.mindswap;

import academy.mindswap.exceptions.NotEnoughFundsException;
import academy.mindswap.exceptions.NotHavingCard;
import academy.mindswap.exceptions.NotHavingPin;

public class Main {

    public static void main(String[] args) {

        ATM atm = new ATM(2);

        Client Manel = new Client();
        Manel.createAccount(10,500, atm);
        Client Maria = new Client();
        Maria.createAccount(15, 500, atm);
        Client Joana = new Client();

        try {
            Manel.deposit(10, 200, atm);
        } catch (NotHavingPin e) {
            System.out.println(e.getMessage());
        } catch (NotHavingCard e) {
            System.out.println(e.getMessage());
        }

        try {
            Manel.withdraw(10, 1000, atm);
        } catch (NotHavingPin e) {
            System.out.println(e.getMessage());
        } catch (NotHavingCard e) {
            System.out.println(e.getMessage());
        } catch (NotEnoughFundsException e) {
            System.out.println(e.getMessage());
        }

        try {
            Maria.deposit(10, 500, atm);
        } catch (NotHavingPin e) {
            System.out.println(e.getMessage());
        } catch (NotHavingCard e) {
            System.out.println(e.getMessage());
        }

        try {
            Maria.deposit(15, 500, atm);
        } catch (NotHavingPin e) {
            System.out.println(e.getMessage());
        } catch (NotHavingCard e) {
            System.out.println(e.getMessage());
        }

        try {
            Joana.deposit(15, 500, atm);
        } catch (NotHavingPin e) {
            System.out.println(e.getMessage());
        } catch (NotHavingCard e) {
            System.out.println(e.getMessage());
        }

    }
}
