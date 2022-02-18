package academy.mindswap.exceptions;

public class NotEnoughFundsException extends ATMException{
    public NotEnoughFundsException(){
        super("\nNot enough funds!");
    }
}
