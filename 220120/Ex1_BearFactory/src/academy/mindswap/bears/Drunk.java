package academy.mindswap.bears;

public class Drunk extends Bear{

    private int battery;

    public Drunk(){
        this.battery = getBattery();
    }

    @Override
    public String talk(){
        if (battery > 0){
            this.battery--;
            int min = 1;
            int max = 5;
            int chance = (int) (Math.random() * (max - min + 1) + min);
            if(chance == 1){
                return "I... love... zzzzzZZZZzzzz...";
            }
            return "I love you!";
        }
        return "Gri gri...";
    }
}
