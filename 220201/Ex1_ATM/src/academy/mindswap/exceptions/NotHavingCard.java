package academy.mindswap.exceptions;

public class NotHavingCard extends ATMException{
    public NotHavingCard(){
        super("\nYou don't have a valid card.");
    }
}
