package academy.mindswap.exceptions;

public class NotHavingPin extends ATMException{
    public NotHavingPin(){
        super("\nYou have the wrong PIN.");
    }
}
