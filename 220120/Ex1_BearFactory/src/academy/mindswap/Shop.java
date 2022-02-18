package academy.mindswap;

import academy.mindswap.bears.Bear;
import academy.mindswap.bears.Cranky;
import academy.mindswap.bears.Drunk;
import academy.mindswap.bears.Simple;

public class Shop {

    private int numberOfBearsCreated;

    public Shop(){
        this.numberOfBearsCreated = 0;
    }

    public Bear createBear(){
        this.numberOfBearsCreated++;
        if (numberOfBearsCreated % 5 == 0){
            return new Cranky();
        }
        if (numberOfBearsCreated % 2 == 0){
            return new Simple();
        }
        return new Drunk();
    }

    public int getNumberOfBearsCreated(){
        return numberOfBearsCreated;
    }
}
