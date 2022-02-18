package academy.mindswap.bears;

public class Bear {

    private int battery;

    public Bear(){
        this.battery = 100;
    }

    public String talk(){
        if (battery > 0){
            this.battery--;
            return "I love you!";
        }
        return "Gri gri...";
    }
    public int getBattery(){
        return battery;
    }
}
